package com.entity;

/**
 * 浏览功能中用于封装查询参数
 */
public class QueryParam {
    //数据查询参数部分
    private String dataSource ;
    private String category ;
    private String mainClass ;
    private String subClass ;
    private String year ;
    private String fieldName ;
    private String description ;
    private String entityName;

    //数据查询参数的setter和getter方法
    public String getDataSource() {
        return dataSource;
    }

    public void setDataSource(String dataSource) {
        this.dataSource = dataSource;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getMainClass() {
        return mainClass;
    }

    public void setMainClass(String mainClass) {
        this.mainClass = mainClass;
    }

    public String getSubClass() {
        return subClass;
    }

    public void setSubClass(String subClass) {
        this.subClass = subClass;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getFieldName() {
        return fieldName;
    }

    public void setFieldName(String fieldName) {
        this.fieldName = fieldName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getEntityName() {
        return entityName;
    }

    public void setEntityName(String EntityName) {
        this.entityName = EntityName;
    }

}
