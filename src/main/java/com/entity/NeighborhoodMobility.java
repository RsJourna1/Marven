package com.entity;

/**
 * Created by 郑晓辉 on 2016/8/27.
 */
public class NeighborhoodMobility {
    private short ctYear;
    private short ndId;
    private Integer tlMobilityNdPop;
    private Integer nonMoversNdPop;
    private Integer moversNdPop;
    private Integer tlRecImmiNdPop;
    private Integer recImmiNdPop;
    private Integer southerAsiaImmiNdPop;
    private Integer southEastAsiaImmiNdPop;
    private Integer easternAsiaImmiNdPop;
    private Integer westAsiaMiddleEastImmiNdPop;
    private Integer africaImmiNdPop;
    private Integer europeImmiNdPop;
    private Integer caribbeCentralSAmericaImmiNdPop;

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

    public Integer getTlMobilityNdPop() {
        return tlMobilityNdPop;
    }

    public void setTlMobilityNdPop(Integer tlMobilityNdPop) {
        this.tlMobilityNdPop = tlMobilityNdPop;
    }

    public Integer getNonMoversNdPop() {
        return nonMoversNdPop;
    }

    public void setNonMoversNdPop(Integer nonMoversNdPop) {
        this.nonMoversNdPop = nonMoversNdPop;
    }

    public Integer getMoversNdPop() {
        return moversNdPop;
    }

    public void setMoversNdPop(Integer moversNdPop) {
        this.moversNdPop = moversNdPop;
    }

    public Integer getTlRecImmiNdPop() {
        return tlRecImmiNdPop;
    }

    public void setTlRecImmiNdPop(Integer tlRecImmiNdPop) {
        this.tlRecImmiNdPop = tlRecImmiNdPop;
    }

    public Integer getRecImmiNdPop() {
        return recImmiNdPop;
    }

    public void setRecImmiNdPop(Integer recImmiNdPop) {
        this.recImmiNdPop = recImmiNdPop;
    }

    public Integer getSoutherAsiaImmiNdPop() {
        return southerAsiaImmiNdPop;
    }

    public void setSoutherAsiaImmiNdPop(Integer southerAsiaImmiNdPop) {
        this.southerAsiaImmiNdPop = southerAsiaImmiNdPop;
    }

    public Integer getSouthEastAsiaImmiNdPop() {
        return southEastAsiaImmiNdPop;
    }

    public void setSouthEastAsiaImmiNdPop(Integer southEastAsiaImmiNdPop) {
        this.southEastAsiaImmiNdPop = southEastAsiaImmiNdPop;
    }

    public Integer getEasternAsiaImmiNdPop() {
        return easternAsiaImmiNdPop;
    }

    public void setEasternAsiaImmiNdPop(Integer easternAsiaImmiNdPop) {
        this.easternAsiaImmiNdPop = easternAsiaImmiNdPop;
    }

    public Integer getWestAsiaMiddleEastImmiNdPop() {
        return westAsiaMiddleEastImmiNdPop;
    }

    public void setWestAsiaMiddleEastImmiNdPop(Integer westAsiaMiddleEastImmiNdPop) {
        this.westAsiaMiddleEastImmiNdPop = westAsiaMiddleEastImmiNdPop;
    }

    public Integer getAfricaImmiNdPop() {
        return africaImmiNdPop;
    }

    public void setAfricaImmiNdPop(Integer africaImmiNdPop) {
        this.africaImmiNdPop = africaImmiNdPop;
    }

    public Integer getEuropeImmiNdPop() {
        return europeImmiNdPop;
    }

    public void setEuropeImmiNdPop(Integer europeImmiNdPop) {
        this.europeImmiNdPop = europeImmiNdPop;
    }

    public Integer getCaribbeCentralSAmericaImmiNdPop() {
        return caribbeCentralSAmericaImmiNdPop;
    }

    public void setCaribbeCentralSAmericaImmiNdPop(Integer caribbeCentralSAmericaImmiNdPop) {
        this.caribbeCentralSAmericaImmiNdPop = caribbeCentralSAmericaImmiNdPop;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        NeighborhoodMobility that = (NeighborhoodMobility) o;

        if (ctYear != that.ctYear) return false;
        if (ndId != that.ndId) return false;
        if (tlMobilityNdPop != null ? !tlMobilityNdPop.equals(that.tlMobilityNdPop) : that.tlMobilityNdPop != null)
            return false;
        if (nonMoversNdPop != null ? !nonMoversNdPop.equals(that.nonMoversNdPop) : that.nonMoversNdPop != null)
            return false;
        if (moversNdPop != null ? !moversNdPop.equals(that.moversNdPop) : that.moversNdPop != null) return false;
        if (tlRecImmiNdPop != null ? !tlRecImmiNdPop.equals(that.tlRecImmiNdPop) : that.tlRecImmiNdPop != null)
            return false;
        if (recImmiNdPop != null ? !recImmiNdPop.equals(that.recImmiNdPop) : that.recImmiNdPop != null) return false;
        if (southerAsiaImmiNdPop != null ? !southerAsiaImmiNdPop.equals(that.southerAsiaImmiNdPop) : that.southerAsiaImmiNdPop != null)
            return false;
        if (southEastAsiaImmiNdPop != null ? !southEastAsiaImmiNdPop.equals(that.southEastAsiaImmiNdPop) : that.southEastAsiaImmiNdPop != null)
            return false;
        if (easternAsiaImmiNdPop != null ? !easternAsiaImmiNdPop.equals(that.easternAsiaImmiNdPop) : that.easternAsiaImmiNdPop != null)
            return false;
        if (westAsiaMiddleEastImmiNdPop != null ? !westAsiaMiddleEastImmiNdPop.equals(that.westAsiaMiddleEastImmiNdPop) : that.westAsiaMiddleEastImmiNdPop != null)
            return false;
        if (africaImmiNdPop != null ? !africaImmiNdPop.equals(that.africaImmiNdPop) : that.africaImmiNdPop != null)
            return false;
        if (europeImmiNdPop != null ? !europeImmiNdPop.equals(that.europeImmiNdPop) : that.europeImmiNdPop != null)
            return false;
        if (caribbeCentralSAmericaImmiNdPop != null ? !caribbeCentralSAmericaImmiNdPop.equals(that.caribbeCentralSAmericaImmiNdPop) : that.caribbeCentralSAmericaImmiNdPop != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) ctYear;
        result = 31 * result + (int) ndId;
        result = 31 * result + (tlMobilityNdPop != null ? tlMobilityNdPop.hashCode() : 0);
        result = 31 * result + (nonMoversNdPop != null ? nonMoversNdPop.hashCode() : 0);
        result = 31 * result + (moversNdPop != null ? moversNdPop.hashCode() : 0);
        result = 31 * result + (tlRecImmiNdPop != null ? tlRecImmiNdPop.hashCode() : 0);
        result = 31 * result + (recImmiNdPop != null ? recImmiNdPop.hashCode() : 0);
        result = 31 * result + (southerAsiaImmiNdPop != null ? southerAsiaImmiNdPop.hashCode() : 0);
        result = 31 * result + (southEastAsiaImmiNdPop != null ? southEastAsiaImmiNdPop.hashCode() : 0);
        result = 31 * result + (easternAsiaImmiNdPop != null ? easternAsiaImmiNdPop.hashCode() : 0);
        result = 31 * result + (westAsiaMiddleEastImmiNdPop != null ? westAsiaMiddleEastImmiNdPop.hashCode() : 0);
        result = 31 * result + (africaImmiNdPop != null ? africaImmiNdPop.hashCode() : 0);
        result = 31 * result + (europeImmiNdPop != null ? europeImmiNdPop.hashCode() : 0);
        result = 31 * result + (caribbeCentralSAmericaImmiNdPop != null ? caribbeCentralSAmericaImmiNdPop.hashCode() : 0);
        return result;
    }
}
