package ${servicePackage};

import ${mbgDaoPackage}.${modelNameUpperCamel}Mapper;
import ${daoPackage}.${modelNameUpperCamel}Dao;
import ${modelPackage}.pojo.${modelNameUpperCamel};
import ${modelPackage}.query.${modelNameUpperCamel}Query;
import ${modelPackage}.query.example.${modelNameUpperCamel}Example;
import com.tencent.tdms.cloud.common.model.JumpingListing;
import com.tencent.tdms.cloud.util.EntityUtil;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.util.Collection;
import java.util.List;
import java.util.Map;

/**
* @author ${author}
* @date ${date}
*/
@Service
public class ${modelNameUpperCamel}Service{

    @Autowired
    private ${modelNameUpperCamel}Dao ${modelNameLowerCamel}Dao;

    @Autowired
    private ${modelNameUpperCamel}Mapper ${modelNameLowerCamel}Mapper;
    
    // 基于${modelNameLowerCamel}Dao
    @Transactional(rollbackFor = Exception.class)
    public boolean create(${modelNameUpperCamel} ${modelNameLowerCamel}) {
        EntityUtil.onCreate(${modelNameLowerCamel});

        return ${modelNameLowerCamel}Dao.insert(${modelNameLowerCamel});
    }

    @Transactional(rollbackFor = Exception.class)
    public boolean update(${modelNameUpperCamel} ${modelNameLowerCamel}) {
        EntityUtil.onModify(${modelNameLowerCamel});

        return ${modelNameLowerCamel}Dao.update(${modelNameLowerCamel});
    }

    @Transactional(rollbackFor = Exception.class)
    public boolean update(${modelNameUpperCamel} ${modelNameLowerCamel}, int oldVersion) {
        EntityUtil.onModify(${modelNameLowerCamel});

        return ${modelNameLowerCamel}Dao.update(${modelNameLowerCamel}, oldVersion);
    }

    @Transactional(rollbackFor = Exception.class)
    public boolean remove(long id) {
        return ${modelNameLowerCamel}Dao.remove(id);
    }

    @Transactional(rollbackFor = Exception.class)
    public boolean remove(List<Long> ids) {
        return ${modelNameLowerCamel}Dao.remove(ids);
    }

    @Transactional(rollbackFor = Exception.class)
    public boolean delete(long id) {
        return ${modelNameLowerCamel}Dao.delete(id);
    }

    public ${modelNameUpperCamel} get(long id) {
        return ${modelNameLowerCamel}Dao.findById(id);
    }

    public Map<Long, ${modelNameUpperCamel}> getMap(Collection<Long> ids) {
        return EntityUtil.getMap(${modelNameLowerCamel}Dao.findByIds(ids));
    }

    public List<${modelNameUpperCamel}> getList(Collection<Long> ids) {
        Map<Long, ${modelNameUpperCamel}> map = getMap(ids);
        return EntityUtil.getList(ids, map);
    }

    public JumpingListing<${modelNameUpperCamel}> queryV2(${modelNameUpperCamel}Query query) {
        int total = ${modelNameLowerCamel}Dao.queryCount(query);
        if (total == 0) {
            return new JumpingListing<>();
        }

        JumpingListing<${modelNameUpperCamel}> listing;
        if (query.getPage() == 0) {
            listing = new JumpingListing<>(1, total, total);
        } else {
            listing = new JumpingListing<>(query.getPage(), query.getPageSize(), total);
        }

        if (listing.getOffset() >= total) {
            return new JumpingListing<>();
        }

        List<Long> ids = ${modelNameLowerCamel}Dao.queryIds(query, listing.getOffset(), listing.getPageSize());
        if (!ids.isEmpty()) {
            listing.setItems(getList(ids));
        }

        return listing;
    }
                
    // 基于${modelNameLowerCamel}Mapper
    @Transactional(rollbackFor = Exception.class)
    public int createBatch(Collection<${modelNameUpperCamel}> records) {
        records.forEach(EntityUtil::onCreate);
        return ${modelNameLowerCamel}Mapper.insertBatch(records);
    }

    @Transactional(rollbackFor = Exception.class) 
    public int removeByPrimaryKey(long id) {
        return ${modelNameLowerCamel}Mapper.removeByPrimaryKey(id);
    }

    @Transactional(rollbackFor = Exception.class)
    public int removeByPrimaryKeys(Collection<Long> ids) {
        return ${modelNameLowerCamel}Mapper.removeByPrimaryKeys(ids);
    }

    @Transactional(rollbackFor = Exception.class)
    public int updateByPrimaryKey(${modelNameUpperCamel} record) {
        EntityUtil.onModify(record);

        return ${modelNameLowerCamel}Mapper.updateByPrimaryKey(record);
    }


    public long countByExample(${modelNameUpperCamel}Example example) { 
        return ${modelNameLowerCamel}Mapper.countByExample(example);
    }

    public List<${modelNameUpperCamel}> selectByExample(${modelNameUpperCamel}Example example) {
        return ${modelNameLowerCamel}Mapper.selectByExample(example);
    }

    public ${modelNameUpperCamel} selectByPrimaryKey(long id) {
        return ${modelNameLowerCamel}Mapper.selectByPrimaryKey(id);
    }
}
