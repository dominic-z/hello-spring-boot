<?xml version="1.0" encoding="UTF-8"?>
<!DOCTYPE mapper PUBLIC "-//mybatis.org//DTD Mapper 3.0//EN"
        "http://mybatis.org/dtd/mybatis-3-mapper.dtd">

<mapper namespace="${tableName}">

    <sql id="_columns">
        ${columnAndPropList?join(", ")}
    </sql>

    <insert id="insert" parameterType="${modelNameLowerCamel}" useGeneratedKeys="true" keyProperty="id">
        insert ignore into ${tableName}
        ( ${insertColumnsList?join(", ")})
        values
        (${insertPropList?join(", ")})
    </insert>

    <update id="update" parameterType="${modelNameLowerCamel}">
        update ${tableName}
        set
    <#list updateColumnInfoList as col>
        <#if col_has_next && !col.primaryKey>
            ${col.columnName} = ${r"#{"}${col.propertyName}${r"}"},
        </#if>
        <#if !col_has_next && !col.primaryKey>
            ${col.columnName} = ${r"#{"}${col.propertyName}${r"}"}
        </#if>
    </#list>
        where id = ${r"#{"}id${r"}"} and deleted = 0
    </update>

    <update id="update_with_version" parameterType="${modelNameLowerCamel}">
        update ${tableName}
        set
    <#list updateColumnInfoList as col>
        <#if col_has_next && !col.primaryKey>
            ${col.columnName} = ${r"#{"}${modelNameLowerCamel}.${col.propertyName}${r"}"},
        </#if>
        <#if !col_has_next && !col.primaryKey>
            ${col.columnName} = ${r"#{"}${modelNameLowerCamel}.${col.propertyName}${r"}"}
        </#if>
    </#list>
        where id = ${r"#{"}${modelNameLowerCamel}.id${r"}"} and revision = ${r"#{"}oldVersion${r"}"} and deleted = 0
    </update>

    <update id="remove" parameterType="long">
        update ${tableName}
        set
            deleted = null,
        revision = revision + 1
        where id = ${r"#{"}id${r"}"}
    </update>

    <update id="batch_remove">
        update ${tableName}
        set
        deleted = null,
        revision = revision + 1
        where id in <foreach collection="ids" item="id" open="(" separator="," close=")"> ${r"#{"}id${r"}"} </foreach>
    </update>

    <update id="remove_with_revision">
        update ${tableName}
        set
            deleted = null
        where id = ${r"#{"}${modelNameLowerCamel}.id${r"}"} and revision = ${r"#{"}oldVersion${r"}"}
    </update>


    <delete id="delete">
        delete from ${tableName} where id = ${r"#{"}id${r"}"}
    </delete>

    <select id="select_by_id" resultType="${modelNameLowerCamel}">
        select <include refid="_columns"/> from ${tableName} where id = ${r"#{"}id${r"}"} and deleted = 0
    </select>

    <select id="select_by_ids" resultType="${modelNameLowerCamel}">
        select <include refid="_columns"/> from ${tableName}
        where id in <foreach collection="ids" item="id" open="(" separator="," close=")"> ${r"#{"}id${r"}"} </foreach>
        and deleted = 0
    </select>

    <select id="query_count" resultType="int">
        select count(*) from ${tableName} <include refid="_query_cond"/>
    </select>

    <select id="query_ids" resultType="long">
        select id from ${tableName} <include refid="_query_cond"/> order by id desc
        <if test="query.page > 0">limit ${r"#{"}offset${r"}"}, ${r"#{"}maxResult${r"}"} </if>
    </select>

    <sql id="_query_cond">
        <where>
            <if test="true"> <![CDATA[ and deleted = 0 ]]> </if>
    <#list domainColumnInfoList as col>
        <#if !col.primaryKey>
            <if test="query.${col.propertyName} != null"><![CDATA[ and ${col.columnName} = ${r"#{"}query.${col.propertyName}${r"}"} ]]></if>
        </#if>
    </#list>

        </where>
    </sql>

</mapper>
