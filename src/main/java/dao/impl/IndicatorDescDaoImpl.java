package dao.impl;

import com.entity.Indicator;
import com.entity.QueryParam;
import dao.IndicatorDescDao;

import java.util.List;

/**
 * Created by 郑晓辉 on 2016/8/17.
 */
public class IndicatorDescDaoImpl extends BaseDaoImpl<Indicator> implements IndicatorDescDao {

    public List<Indicator> getIndicatorDesc(QueryParam queryParam) {
        StringBuffer hqlBuffer = new StringBuffer();
        hqlBuffer.append("FROM Indicator WHERE 1=1 ");
        if (!queryParam.getDataSource().equals("") && queryParam.getDataSource() != null) {
            hqlBuffer.append("AND dataSource ='" + queryParam.getDataSource() + "' ");
        }
        if (!queryParam.getMainClass().equals("") && queryParam.getMainClass() != null) {
            hqlBuffer.append("AND mainClass LIKE '%" + queryParam.getMainClass() + "%' ");
        }
        if (!queryParam.getSubClass().equals("") && queryParam.getSubClass() != null) {
            hqlBuffer.append("AND subClass LIKE '%" + queryParam.getSubClass() + "%' ");
        }
        if (!queryParam.getYear().equals("") && queryParam.getYear() != null) {
            hqlBuffer.append("AND year LIKE " + "'%" + queryParam.getYear() + "%'");
        }
        String hql = hqlBuffer.toString();
        return find(hql);
    }
}
