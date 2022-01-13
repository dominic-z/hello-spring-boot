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
 * domain 代码生成
 */
@Slf4j
public class DomainGenerator implements CodeGenerator {

    private boolean needGenerateDomain;

    public DomainGenerator() {
        new DomainGenerator(true);
    }

    public DomainGenerator(boolean needGenerateDomain) {
        this.needGenerateDomain = needGenerateDomain;
    }

    @Override
    public boolean genCode(TableInfo tableInfo) {
        Configuration cfg = FreemarkerUtil.getFreemarkerConfiguration();

        Map<String, Object> data = FreemarkerUtil.getDataMapInit(tableInfo);
        data.put("columnInfoList", tableInfo.getColumnInfoList());
        data.put("domainColumnInfoList", tableInfo.getDomainColumnInfoList());

        if (needGenerateDomain) {
            //domain
            try {
                Path domainJavaPath = Paths.get(CodeGeneratorConfig.PROJECT_PATH, CodeGeneratorConfig.JAVA_PATH,
                        CodeGeneratorConfig.PACKAGE_PATH_MODEL, "pojo", tableInfo.getDomainUpperCamelName() + ".java");
                // 查看父级目录是否存在, 不存在则创建
                if (!Files.exists(domainJavaPath.getParent())) {
                    Files.createDirectories(domainJavaPath.getParent());
                }
                cfg.getTemplate("domain.ftl").process(data, new FileWriter(domainJavaPath.toFile()));

                log.info("{}.java 生成成功!", tableInfo.getDaoUpperCamelName());
            } catch (Exception e) {
                e.printStackTrace();
                throw new RuntimeException("Service 生成失败!", e);
            }
        }

        // query
        try {
            Path queryJavaPath = Paths.get(CodeGeneratorConfig.PROJECT_PATH, CodeGeneratorConfig.JAVA_PATH,
                    CodeGeneratorConfig.PACKAGE_PATH_MODEL, "query", tableInfo.getQueryUpperCamelName() + ".java");

            // 查看父级目录是否存在, 不存在则创建
            if (!Files.exists(queryJavaPath.getParent())) {
                Files.createDirectories(queryJavaPath.getParent());
            }
            cfg.getTemplate("query.ftl").process(data, new FileWriter(queryJavaPath.toFile()));

            log.info("{}Query.java 生成成功!", tableInfo.getQueryUpperCamelName());
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("Service 生成失败!", e);
        }

    }


}
