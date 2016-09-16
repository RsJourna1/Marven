package service.impl;

import com.entity.Uploadfileinfo;
import dao.UploadFileInfoDao;
import service.UploadFileInfoService;

/**
 * Created by 郑晓辉 on 2016/7/20.
 */
public class UploadFileInfoServiceImpl implements UploadFileInfoService {
    private UploadFileInfoDao uploadFileInfoDao ;
    @Override
    public String UpLoadFileInfoSer(Uploadfileinfo uploadfileinfo){

        System.out.println("uploadFile SERVICE Level,uploadFile information :"+ uploadfileinfo +"  "+
                uploadfileinfo.getUpLoadFileName() + "  " + uploadfileinfo.getFileUploadDate());
        System.out.println(uploadfileinfo.getFileDataCategory()+ " || "
                + uploadfileinfo.getFileDataMainClass()+" || "+uploadfileinfo.getFileDataSubClass());

        if (uploadFileInfoDao.SaveUploadFileInfo(uploadfileinfo).equals("success")){
            return "success" ;
        }
        return "error" ;
    }

    public UploadFileInfoDao getUploadFileInfoDao() {
        return uploadFileInfoDao;
    }

    public void setUploadFileInfoDao(UploadFileInfoDao uploadFileInfoDao) {
        this.uploadFileInfoDao = uploadFileInfoDao;
    }
}
