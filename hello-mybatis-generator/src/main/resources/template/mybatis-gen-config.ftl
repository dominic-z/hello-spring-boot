<!DOCTYPE generatorConfiguration PUBLIC
        "-//mybatis.org//DTD MyBatis Generator Configuration 1.0//EN"
        "http://mybatis.org/dtd/mybatis-generator-config_1_0.dtd">
<generatorConfiguration>
    <context id="dsql" targetRuntime="MyBatis3">
        <plugin type="org.mybatis.generator.plugins.FluentBuilderMethodsPlugin"/>
        <plugin type="org.mybatis.generator.plugins.ToStringPlugin"/>
        <!--        <plugin type="org.mybatis.generator.plugins.SerializablePlugin"/>-->
        <!--        <plugin type="org.mybatis.generator.plugins.RowBoundsPlugin"/>-->
        <plugin type="org.mybatis.generator.plugins.EqualsHashCodePlugin"/>
        <plugin type="codegen.generator.mbg.plugin.MysqlLimitPlugin"/>
        <plugin type="codegen.generator.mbg.plugin.CloseSelectivePlugin"/>
        <plugin type="codegen.generator.mbg.plugin.DeletedFieldPlugin"/>
        <plugin type="codegen.generator.mbg.plugin.CustomizedSqlPlugin"/>
        <plugin type="codegen.generator.mbg.plugin.CommentPlugin"/>
        <!-- MySQL分页插件 -->

        <commentGenerator>
            <property name="addRemarkComments" value="true"/>
        </commentGenerator>

        <jdbcConnection driverClass="${JDBC_DRIVER}"
                        connectionURL="${JDBC_URL}" userId="${JDBC_USERNAME}" password="${JDBC_PASSWORD}"/>

        <javaModelGenerator targetPackage="${modelPackage}.pojo"
                            targetProject="${JAVA_PATH}">
            <property name="exampleTargetPackage"
                      value="${modelPackage}.query.example"/>
        </javaModelGenerator>

        <sqlMapGenerator targetPackage="sqlmap.mbg"
                         targetProject="${RESOURCES_PATH}"/>

        <javaClientGenerator type="XMLMAPPER"
                             targetPackage="${mbgDaoPackage}"
                             targetProject="${JAVA_PATH}"/>

        <table tableName="${tableName}" enableDeleteByExample="false" enableDeleteByPrimaryKey="false"
               enableUpdateByExample="false" domainObjectName="${modelNameUpperCamel}">
            <property name="rootClass" value="codegen.domain.BaseEntity"/>
            <generatedKey column="id" sqlStatement="MySql" identity="true"/>
            <columnOverride column="id" javaType="long" jdbcType="BIGINT"/>
            <columnOverride column="revision" javaType="int" jdbcType="INTEGER"/>
            <ignoreColumn column="deleted"/>
        </table>


    </context>
</generatorConfiguration>