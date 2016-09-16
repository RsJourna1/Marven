package dao;

import com.entity.BrowseChronic;
import com.entity.NeighborhoodDiabetesPrevalence;

import java.util.List;

/**
 * Created by 郑晓辉 on 2016/8/12.
 */
public interface BrowseByPageDao<T> extends BaseDao<T> {

    List<T> findByPages(String hql, int pageNo, int pageSize);
}
