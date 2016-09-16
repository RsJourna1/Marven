package com.entity;

import net.sf.json.JSONArray;

/**
 * 浏览中用于处理分页时的页码信息
 */
public class PagerModel {
    //第几页
    private int pageNo;
    //每页多少条记录
    private int pageSize;
    //总共多少条记录
    private long totalRecords;
    //查询到的记录
    private JSONArray resultData;

    //getter和setter方法

    public JSONArray getResultData() {
        return resultData;
    }

    public void setResultData(JSONArray resultData) {
        this.resultData = resultData;
    }

    public long getTotalRecords() {
        return totalRecords;
    }

    public void setTotalRecords(long totalRecords) {
        this.totalRecords = totalRecords;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public int getPageNo() {
        return pageNo;
    }

    public void setPageNo(int pageNo) {
        this.pageNo = pageNo;
    }

    /**
     * 获取总页数
     *
     * @return
     */
    public int getTotalPages() {
        return ((int)totalRecords + pageSize - 1) / pageSize;
    }

    /**
     * 获取首页
     *
     * @return
     */
    public int getTopPageNo() {
        return 1;
    }

    /**
     * 获取尾页
     *
     * @return
     */
    public int getBottomPageNo() {
        return getTotalPages();
    }

    /**
     * 获取上一页
     *
     * @return
     */
    public int getPreviousPageNo() {
        if (pageNo <= 1) {
            return 1;
        }
        return pageNo - 1;
    }

    /**
     * 获取下一页
     *
     * @return
     */
    public int getNextPageNo() {
        if (pageNo >= getBottomPageNo()) {
            return getBottomPageNo();
        }
        return pageNo + 1;
    }

}
