package service;

/**
 * Created by 郑晓辉 on 2016/7/20.
 */

import com.entity.Uploadfileinfo;

/**
 * @param封装了文件上传时的基本信息
 * @return 成功或失败
 */
public interface UploadFileInfoService {
    public String UpLoadFileInfoSer(Uploadfileinfo uploadfileinfo) ;
}
