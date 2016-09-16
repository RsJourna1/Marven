package com.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by 郑晓辉 on 2016/7/30.
 */
public class UploadfileinfoPK implements Serializable {
    private Date fileUploadDate;
    private String upLoadFileName;
    private String upLoadContentType;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        UploadfileinfoPK that = (UploadfileinfoPK) o;

        if (fileUploadDate != null ? !fileUploadDate.equals(that.fileUploadDate) : that.fileUploadDate != null)
            return false;
        if (upLoadFileName != null ? !upLoadFileName.equals(that.upLoadFileName) : that.upLoadFileName != null)
            return false;
        if (upLoadContentType != null ? !upLoadContentType.equals(that.upLoadContentType) : that.upLoadContentType != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = fileUploadDate != null ? fileUploadDate.hashCode() : 0;
        result = 31 * result + (upLoadFileName != null ? upLoadFileName.hashCode() : 0);
        result = 31 * result + (upLoadContentType != null ? upLoadContentType.hashCode() : 0);
        return result;
    }
}
