package service.impl;

import com.entity.Indicator;
import com.entity.QueryParam;
import dao.IndicatorDescDao;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import org.springframework.transaction.annotation.Transactional;
import service.IndicatorDescService;

import java.util.List;

/**
 * Created by 郑晓辉 on 2016/8/19.
 */
public class IndicatorDescServiceImpl implements IndicatorDescService {
    private IndicatorDescDao indicatorDescDao;

    @Transactional
    public JSONArray getIndicatorSer(QueryParam queryParam) {
        List<Indicator> indicatorList = indicatorDescDao.getIndicatorDesc(queryParam);
        if (indicatorList.size() <= 0) {
            return null;
        }
        JSONArray jsonIndicatorArray = new JSONArray();
        for (Indicator in : indicatorList) {
            JSONObject jsonIndicatorObject = new JSONObject();
            jsonIndicatorObject.put("FieldName", in.getFieldName());
            jsonIndicatorObject.put("Description", in.getDescription());
            jsonIndicatorArray.add(jsonIndicatorObject);
        }
        return jsonIndicatorArray;
    }

    @Transactional
    public List<Indicator> getIndicatorListSer(QueryParam queryParam) {
        List<Indicator> indicatorList = indicatorDescDao.getIndicatorDesc(queryParam);
        if (indicatorList.isEmpty()) {
            return null;
        }
        return indicatorList;
    }

    public IndicatorDescDao getIndicatorDescDao() {
        return indicatorDescDao;
    }

    public void setIndicatorDescDao(IndicatorDescDao indicatorDescDao) {
        this.indicatorDescDao = indicatorDescDao;
    }
}
