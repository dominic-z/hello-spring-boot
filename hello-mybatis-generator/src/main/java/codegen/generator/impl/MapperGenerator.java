package codegen.generator.impl;

import codegen.config.CodeGeneratorConfig;
import codegen.generator.CodeGenerator;
import codegen.model.TableInfo;
import codegen.util.FreemarkerUtil;
import freemarker.template.Configuration;
import lombok.extern.slf4j.Slf4j;

import java.io.FileWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Map;

/**
 * Mapper 代码生成器
 */
@Slf4j
public class MapperGenerator  implements CodeGenerator {

    @Override
    public boolean genCode(TableInfo tableInfo) {
        Configuration cfg = FreemarkerUtil.getFreemarkerConfiguration();

        Map<String, Object> data = FreemarkerUtil.getDataMapInit(tableInfo);
        data.put("insertColumnsList", tableInfo.getInsertColumnsList());
        data.put("insertPropList", tableInfo.getInsertPropList());
        data.put("columnInfoList", tableInfo.getColumnInfoList());
        data.put("columnAndPropList", tableInfo.getColumnAndPropList());
        data.put("updateColumnInfoList", tableInfo.getUpdateColumnInfoList());
        data.put("domainColumnInfoList", tableInfo.getDomainColumnInfoList());
        data.put("pkColumn", tableInfo.getPkColumn());

        try {

            Path xmlPath = Paths.get(CodeGeneratorConfig.PROJECT_PATH, CodeGeneratorConfig.RESOURCES_PATH,
                     "sqlmap", tableInfo.getTableName() + ".xml");
            // 查看父级目录是否存在, 不存在则创建
            if (!Files.exists(xmlPath.getParent())) {
                Files.createDirectories(xmlPath.getParent());
            }
            cfg.getTemplate("sqlmap.ftl").process(data, new FileWriter(xmlPath.toFile()));

            log.info("{}.xml 生成成功!", tableInfo.getTableName());
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("Service 生成失败!", e);
        }

    }


}
