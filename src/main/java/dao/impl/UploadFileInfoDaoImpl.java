package dao.impl;

import com.entity.Uploadfileinfo;
import dao.UploadFileInfoDao;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.orm.hibernate4.support.HibernateDaoSupport;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by 郑晓辉 on 2016/7/20.
 */
@Transactional
//@Component("uploadFileInfoDao")
public class UploadFileInfoDaoImpl extends HibernateDaoSupport implements UploadFileInfoDao {
    @Transactional(readOnly = false)
    @Override
    public String SaveUploadFileInfo(Uploadfileinfo uploadfileinfo){
        System.out.println("==============uploadFile DAO Level,uploadFile information :============");
        System.out.println("title: "+ uploadfileinfo.getTitle()+" || ");
        System.out.println("uploadFileName: "+ uploadfileinfo.getUpLoadFileName()+" || ");
        System.out.println("uploadContentType: "+ uploadfileinfo.getUpLoadContentType()+" || ");
        System.out.println("fileUploadDate: "+ uploadfileinfo.getFileUploadDate()+" || ");
        System.out.println("fileUploadOperator: "+ uploadfileinfo.getFileUploadOperator()+" || ");
        System.out.println("fileDataSource: "+ uploadfileinfo.getFileDataSource()+" || ");
        System.out.println("fileDataYear: "+ uploadfileinfo.getFileDataYear()+" || ");
        System.out.println("fileDataCategory: "+ uploadfileinfo.getFileDataCategory()+" || ");
        System.out.println("fileDataMainClass: "+ uploadfileinfo.getFileDataMainClass()+" || ");
        System.out.println("fileDataSubClass: "+ uploadfileinfo.getFileDataSubClass()+" || ");

        //测试
        uploadfileinfo.setFileUploadOperator("ZXH");
        System.out.println("OPERATOR: "+ uploadfileinfo.getFileUploadOperator()+" || ");

        this.getHibernateTemplate().save(uploadfileinfo);
        return "success";
    }
}
 