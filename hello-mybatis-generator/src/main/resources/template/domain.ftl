package ${modelPackage}.pojo;

import com.tencent.tdms.cloud.common.model.BaseEntity;

import java.util.Date;


/**
* @author ${author}
* @date ${date}
*/
public class ${modelNameUpperCamel} extends BaseEntity {

<#list domainColumnInfoList as column>
    private ${column.propertyType} ${column.propertyName};

</#list>

<#list domainColumnInfoList as column>
    public ${column.propertyType} get${column.propertyName? cap_first}() {
        return ${column.propertyName};
    }

    public void set${column.propertyName? cap_first}(${column.propertyType} ${column.propertyName}) {
        this.${column.propertyName} = ${column.propertyName};
    }

</#list>

}
