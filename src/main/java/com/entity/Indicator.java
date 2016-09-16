package com.entity;

/**
 * Created by 郑晓辉 on 2016/8/19.
 */
public class Indicator {
    private String dataSource;
    private String category;
    private String mainClass;
    private String subClass;
    private String year;
    private String fieldName;
    private String description;
    private String entityName;
    private String tablename;
    private String definition;
    private String entityIdentity;
    private String entityAlias;

    public String getEntityAlias() {
        return entityAlias;
    }

    public void setEntityAlias(String entityAlias) {
        this.entityAlias = entityAlias;
    }

    public String getEntityIdentity() {
        return entityIdentity;
    }

    public void setEntityIdentity(String entityIdentity) {
        this.entityIdentity = entityIdentity;
    }

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

    public void setEntityName(String entityName) {
        this.entityName = entityName;
    }

    public String getTablename() {
        return tablename;
    }

    public void setTablename(String tablename) {
        this.tablename = tablename;
    }

    public String getDefinition() {
        return definition;
    }

    public void setDefinition(String definition) {
        this.definition = definition;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Indicator indicator = (Indicator) o;

        if (dataSource != null ? !dataSource.equals(indicator.dataSource) : indicator.dataSource != null) return false;
        if (category != null ? !category.equals(indicator.category) : indicator.category != null) return false;
        if (mainClass != null ? !mainClass.equals(indicator.mainClass) : indicator.mainClass != null) return false;
        if (subClass != null ? !subClass.equals(indicator.subClass) : indicator.subClass != null) return false;
        if (year != null ? !year.equals(indicator.year) : indicator.year != null) return false;
        if (fieldName != null ? !fieldName.equals(indicator.fieldName) : indicator.fieldName != null) return false;
        if (description != null ? !description.equals(indicator.description) : indicator.description != null)
            return false;
        if (entityName != null ? !entityName.equals(indicator.entityName) : indicator.entityName != null) return false;
        if (tablename != null ? !tablename.equals(indicator.tablename) : indicator.tablename != null) return false;
        if (definition != null ? !definition.equals(indicator.definition) : indicator.definition != null) return false;
        if (entityIdentity != null ? !entityIdentity.equals(indicator.entityIdentity) : indicator.entityIdentity != null)
            return false;
        return entityAlias != null ? entityAlias.equals(indicator.entityAlias) : indicator.entityAlias == null;

    }

    @Override
    public int hashCode() {
        int result = dataSource != null ? dataSource.hashCode() : 0;
        result = 31 * result + (category != null ? category.hashCode() : 0);
        result = 31 * result + (mainClass != null ? mainClass.hashCode() : 0);
        result = 31 * result + (subClass != null ? subClass.hashCode() : 0);
        result = 31 * result + (year != null ? year.hashCode() : 0);
        result = 31 * result + (fieldName != null ? fieldName.hashCode() : 0);
        result = 31 * result + (description != null ? description.hashCode() : 0);
        result = 31 * result + (entityName != null ? entityName.hashCode() : 0);
        result = 31 * result + (tablename != null ? tablename.hashCode() : 0);
        result = 31 * result + (definition != null ? definition.hashCode() : 0);
        result = 31 * result + (entityIdentity != null ? entityIdentity.hashCode() : 0);
        result = 31 * result + (entityAlias != null ? entityAlias.hashCode() : 0);
        return result;
    }
}
