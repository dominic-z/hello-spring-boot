package codegen.generator.impl;

import codegen.CodeGeneratorManager;
import codegen.config.CodeGeneratorConfig;
import codegen.generator.CodeGenerator;
import codegen.model.TableInfo;
import codegen.util.FreemarkerUtil;
import codegen.util.StringUtil;
import freemarker.template.Configuration;
import lombok.extern.slf4j.Slf4j;

import java.io.File;
import java.io.FileWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Map;

/**
 * Service层 代码生成器
 */
@Slf4j
public class ServiceGenerator implements CodeGenerator {

    @Override
    public boolean genCode(TableInfo tableInfo) {
        Configuration cfg = FreemarkerUtil.getFreemarkerConfiguration();

        Map<String, Object> data = FreemarkerUtil.getDataMapInit(tableInfo);

        try {
            // 创建 Service 接口

            Path serviceJavaPath = Paths.get(CodeGeneratorConfig.PROJECT_PATH, CodeGeneratorConfig.JAVA_PATH,
                    CodeGeneratorConfig.PACKAGE_PATH_SERVICE,
                    tableInfo.getServiceUpperCamelName() + ".java");
            // 查看父级目录是否存在, 不存在则创建
            if (!Files.exists(serviceJavaPath.getParent())) {
                Files.createDirectories(serviceJavaPath.getParent());
            }
            cfg.getTemplate("service.ftl").process(data, new FileWriter(serviceJavaPath.toFile()));

            log.info("{}.java 生成成功!", tableInfo.getServiceUpperCamelName());
            return true;
        } catch (Exception e) {
            throw new RuntimeException("Service 生成失败!", e);
        }
    }

}
