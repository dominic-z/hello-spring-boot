package ${daoPackage};

import ${modelPackage}.pojo.${modelNameUpperCamel};
import ${modelPackage}.query.${modelNameUpperCamel}Query;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.CollectionUtils;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
* @author ${author}
* @date ${date}
*/
@Component
public class ${modelNameUpperCamel}Dao {

    private static final String TABLE = "${tableName}";

    @Autowired
    private SqlSessionTemplate sqlSessionTemplate;

    public boolean insert(${modelNameUpperCamel} ${modelNameLowerCamel}) {
        return sqlSessionTemplate.update(TABLE + ".insert", ${modelNameLowerCamel}) > 0;
    }

    public boolean update(${modelNameUpperCamel} ${modelNameLowerCamel}) {
        return sqlSessionTemplate.update(TABLE + ".update", ${modelNameLowerCamel}) > 0;
    }

    public boolean update(${modelNameUpperCamel} ${modelNameLowerCamel}, int oldVersion) {
        Map<String, Object> params = new HashMap<>();
        params.put("${modelNameLowerCamel}", ${modelNameLowerCamel});
        params.put("oldVersion", oldVersion);

        return sqlSessionTemplate.update(TABLE + ".update_with_version", params) > 0;
    }

    public boolean remove(long id) {
        return sqlSessionTemplate.update(TABLE + ".remove", id) > 0;
    }

    public boolean remove(List<Long> ids) {

        if (CollectionUtils.isEmpty(ids)) {
            return true;
        }

        Map<String, Object> params = new HashMap<>();
        params.put("ids", ids);

        return sqlSessionTemplate.update(TABLE + ".batch_remove", params) > 0;
    }

    public boolean delete(long id) {
        return sqlSessionTemplate.delete(TABLE + ".delete", id) > 0;
    }

    public ${modelNameUpperCamel} findById(long id) {
        return sqlSessionTemplate.selectOne(TABLE + ".select_by_id", id);
    }

    public List<${modelNameUpperCamel}> findByIds(Collection<Long> ids) {

        if (ids.isEmpty()) {
            return new ArrayList<>();
        }

        Map<String, Object> params = new HashMap<>();
        params.put("ids", ids);

        return sqlSessionTemplate.selectList(TABLE + ".select_by_ids", params);
    }

    public int queryCount(${modelNameUpperCamel}Query query) {
        Map<String, Object> params = new HashMap<>();
        params.put("query", query);

        return sqlSessionTemplate.selectOne(TABLE + ".query_count", params);
    }

    public List<Long> queryIds(${modelNameUpperCamel}Query query, int offset, int maxResult) {
        Map<String, Object> params = new HashMap<>();
        params.put("query", query);
        params.put("offset", offset);
        params.put("maxResult", maxResult);

        return sqlSessionTemplate.selectList(TABLE + ".query_ids", params);
    }

}
