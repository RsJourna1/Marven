package com.entity;

/**
 * Created by 郑晓辉 on 2016/8/27.
 */
public class NeighborhoodEduattainment {
    private short ctYear;
    private short ndId;
    private Integer withCollCertificateDiplomaNdPop;
    private Integer withBachelorDegreeHigher;

    public short getCtYear() {
        return ctYear;
    }

    public void setCtYear(short ctYear) {
        this.ctYear = ctYear;
    }

    public short getNdId() {
        return ndId;
    }

    public void setNdId(short ndId) {
        this.ndId = ndId;
    }

    public Integer getWithCollCertificateDiplomaNdPop() {
        return withCollCertificateDiplomaNdPop;
    }

    public void setWithCollCertificateDiplomaNdPop(Integer withCollCertificateDiplomaNdPop) {
        this.withCollCertificateDiplomaNdPop = withCollCertificateDiplomaNdPop;
    }

    public Integer getWithBachelorDegreeHigher() {
        return withBachelorDegreeHigher;
    }

    public void setWithBachelorDegreeHigher(Integer withBachelorDegreeHigher) {
        this.withBachelorDegreeHigher = withBachelorDegreeHigher;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        NeighborhoodEduattainment that = (NeighborhoodEduattainment) o;

        if (ctYear != that.ctYear) return false;
        if (ndId != that.ndId) return false;
        if (withCollCertificateDiplomaNdPop != null ? !withCollCertificateDiplomaNdPop.equals(that.withCollCertificateDiplomaNdPop) : that.withCollCertificateDiplomaNdPop != null)
            return false;
        if (withBachelorDegreeHigher != null ? !withBachelorDegreeHigher.equals(that.withBachelorDegreeHigher) : that.withBachelorDegreeHigher != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) ctYear;
        result = 31 * result + (int) ndId;
        result = 31 * result + (withCollCertificateDiplomaNdPop != null ? withCollCertificateDiplomaNdPop.hashCode() : 0);
        result = 31 * result + (withBachelorDegreeHigher != null ? withBachelorDegreeHigher.hashCode() : 0);
        return result;
    }
}
