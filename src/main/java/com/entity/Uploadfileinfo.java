package com.entity;

import java.util.Date;

/**
 * Created by 郑晓辉 on 2016/7/30.
 */
public class Uploadfileinfo {
    private Date fileUploadDate;
    private String upLoadFileName;
    private String upLoadContentType;
    private String fileUploadOperator;
    private String title;
    private String fileDataSource;
    private String fileDataYear;
    private String fileDataCategory;
    private String fileDataMainClass;
    private String fileDataSubClass;

    public Date getFileUploadDate() {
        return fileUploadDate;
    }

    public void setFileUploadDate(Date fileUploadDate) {
        this.fileUploadDate = fileUploadDate;
    }

    public String getUpLoadFileName() {
        return upLoadFileName;
    }

    public void setUpLoadFileName(String upLoadFileName) {
        this.upLoadFileName = upLoadFileName;
    }

    public String getUpLoadContentType() {
        return upLoadContentType;
    }

    public void setUpLoadContentType(String upLoadContentType) {
        this.upLoadContentType = upLoadContentType;
    }

    public String getFileUploadOperator() {
        return fileUploadOperator;
    }

    public void setFileUploadOperator(String fileUploadOperator) {
        this.fileUploadOperator = fileUploadOperator;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getFileDataSource() {
        return fileDataSource;
    }

    public void setFileDataSource(String fileDataSource) {
        this.fileDataSource = fileDataSource;
    }

    public String getFileDataYear() {
        return fileDataYear;
    }

    public void setFileDataYear(String fileDataYear) {
        this.fileDataYear = fileDataYear;
    }

    public String getFileDataCategory() {
        return fileDataCategory;
    }

    public void setFileDataCategory(String fileDataCategory) {
        this.fileDataCategory = fileDataCategory;
    }

    public String getFileDataMainClass() {
        return fileDataMainClass;
    }

    public void setFileDataMainClass(String fileDataMainClass) {
        this.fileDataMainClass = fileDataMainClass;
    }

    public String getFileDataSubClass() {
        return fileDataSubClass;
    }

    public void setFileDataSubClass(String fileDataSubClass) {
        this.fileDataSubClass = fileDataSubClass;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Uploadfileinfo that = (Uploadfileinfo) o;

        if (fileUploadDate != null ? !fileUploadDate.equals(that.fileUploadDate) : that.fileUploadDate != null)
            return false;
        if (upLoadFileName != null ? !upLoadFileName.equals(that.upLoadFileName) : that.upLoadFileName != null)
            return false;
        if (upLoadContentType != null ? !upLoadContentType.equals(that.upLoadContentType) : that.upLoadContentType != null)
            return false;
        if (fileUploadOperator != null ? !fileUploadOperator.equals(that.fileUploadOperator) : that.fileUploadOperator != null)
            return false;
        if (title != null ? !title.equals(that.title) : that.title != null) return false;
        if (fileDataSource != null ? !fileDataSource.equals(that.fileDataSource) : that.fileDataSource != null)
            return false;
        if (fileDataYear != null ? !fileDataYear.equals(that.fileDataYear) : that.fileDataYear != null) return false;
        if (fileDataCategory != null ? !fileDataCategory.equals(that.fileDataCategory) : that.fileDataCategory != null)
            return false;
        if (fileDataMainClass != null ? !fileDataMainClass.equals(that.fileDataMainClass) : that.fileDataMainClass != null)
            return false;
        if (fileDataSubClass != null ? !fileDataSubClass.equals(that.fileDataSubClass) : that.fileDataSubClass != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = fileUploadDate != null ? fileUploadDate.hashCode() : 0;
        result = 31 * result + (upLoadFileName != null ? upLoadFileName.hashCode() : 0);
        result = 31 * result + (upLoadContentType != null ? upLoadContentType.hashCode() : 0);
        result = 31 * result + (fileUploadOperator != null ? fileUploadOperator.hashCode() : 0);
        result = 31 * result + (title != null ? title.hashCode() : 0);
        result = 31 * result + (fileDataSource != null ? fileDataSource.hashCode() : 0);
        result = 31 * result + (fileDataYear != null ? fileDataYear.hashCode() : 0);
        result = 31 * result + (fileDataCategory != null ? fileDataCategory.hashCode() : 0);
        result = 31 * result + (fileDataMainClass != null ? fileDataMainClass.hashCode() : 0);
        result = 31 * result + (fileDataSubClass != null ? fileDataSubClass.hashCode() : 0);
        return result;
    }
}
