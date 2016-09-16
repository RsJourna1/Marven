package com.entity;

import java.math.BigDecimal;

/**
 * Created by 郑晓辉 on 2016/8/16.
 */
public class Neighborhood {
    private short ndId;
    private String ndName;
    private BigDecimal ndArea;
    private BigDecimal ndCenterX;
    private BigDecimal ndCenterY;

    public short getNdId() {
        return ndId;
    }

    public void setNdId(short ndId) {
        this.ndId = ndId;
    }

    public String getNdName() {
        return ndName;
    }

    public void setNdName(String ndName) {
        this.ndName = ndName;
    }

    public BigDecimal getNdArea() {
        return ndArea;
    }

    public void setNdArea(BigDecimal ndArea) {
        this.ndArea = ndArea;
    }

    public BigDecimal getNdCenterX() {
        return ndCenterX;
    }

    public void setNdCenterX(BigDecimal ndCenterX) {
        this.ndCenterX = ndCenterX;
    }

    public BigDecimal getNdCenterY() {
        return ndCenterY;
    }

    public void setNdCenterY(BigDecimal ndCenterY) {
        this.ndCenterY = ndCenterY;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Neighborhood that = (Neighborhood) o;

        if (ndId != that.ndId) return false;
        if (ndName != null ? !ndName.equals(that.ndName) : that.ndName != null) return false;
        if (ndArea != null ? !ndArea.equals(that.ndArea) : that.ndArea != null) return false;
        if (ndCenterX != null ? !ndCenterX.equals(that.ndCenterX) : that.ndCenterX != null) return false;
        if (ndCenterY != null ? !ndCenterY.equals(that.ndCenterY) : that.ndCenterY != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) ndId;
        result = 31 * result + (ndName != null ? ndName.hashCode() : 0);
        result = 31 * result + (ndArea != null ? ndArea.hashCode() : 0);
        result = 31 * result + (ndCenterX != null ? ndCenterX.hashCode() : 0);
        result = 31 * result + (ndCenterY != null ? ndCenterY.hashCode() : 0);
        return result;
    }
}
