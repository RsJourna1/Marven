package dao;

import com.entity.Indicator;
import com.entity.QueryParam;

import java.util.List;

/**
 * Created by 郑晓辉 on 2016/8/17.
 */
public interface IndicatorDescDao extends BaseDao<Indicator> {
    /**
     * 根据DataSource、MainClass、SubClass、Year 构建hql查询语句
     * 查询FieldName和Description
     *
     * @param queryParam
     * @return
     */
    List<Indicator> getIndicatorDesc(QueryParam queryParam) ;
}
