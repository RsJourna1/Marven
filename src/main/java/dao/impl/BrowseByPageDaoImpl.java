package dao.impl;

import dao.BrowseByPageDao;

import java.util.List;

/**
 * Created by 郑晓辉 on 2016/8/12.
 */
public class BrowseByPageDaoImpl<T> extends BaseDaoImpl<T> implements BrowseByPageDao<T> {

    @Override
    public List<T> findByPages(String hql, int pageNo, int pageSize) {
        return findByPage(hql, pageNo, pageSize);
    }

}
