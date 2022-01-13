package ${modelPackage}.query;

import ${modelPackage}.pojo.${modelNameUpperCamel};

/**
* @author ${author}
* @date ${date}
*/
public class ${modelNameUpperCamel}Query extends ${modelNameUpperCamel} {

    private int page = 1;

    private int pageSize = 10;

    public ${modelNameUpperCamel}Query() {
    }

    public ${modelNameUpperCamel}Query(int page, int pageSize) {
        this.page = page;
        this.pageSize = pageSize;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

}
