package action;

import com.entity.Uploadfileinfo;
import service.UploadFileInfoService;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Date;

/**
 * Created by 郑晓辉 on 2016/7/20.
 */
public class UpLoadFileAction extends BaseAction{

    private UploadFileInfoService uploadFileInfoService ;
    //封装文件请求参数的成员变量
    private Uploadfileinfo uploadfileinfo ;
    //封装上传文件域的成员变量
    private File upload ;
    //封装上传文件类型的成员变量
    private String uploadContentType ;
    //封装上传文件名的属性
    private String uploadFileName ;
    private String savePath ;

    public void setSavePath(String value) {
        this.savePath = value;
    }

    public String getSavePath() {
        return savePath;
    }
    //Tomcat项目根目录savePath的路径getter
    //    public String getSavePath() throws Exception {
//        return ServletActionContext.getServletContext().getRealPath(savePath);
//    }

    //文件请求参数的getter和setter方法
    public Uploadfileinfo getUploadfileinfo() {
        return uploadfileinfo;
    }

    public void setUploadfileinfo(Uploadfileinfo uploadfileinfo) {
        this.uploadfileinfo = uploadfileinfo;
    }
    //upload的setter和getter方法
    public File getUpload() {
        return (this.upload);
    }

    public void setUpload(File upload) {
        this.upload = upload;
    }
    //uploadContentType的getter和setter方法
    public String getUploadContentType() {
        return (this.uploadContentType);
    }

    public void setUploadContentType(String uploadContentType) {
        this.uploadContentType = uploadContentType;
    }

    //uploadFileName的setter和getter方法

    public String getUploadFileName() {
        return (this.uploadFileName);
    }

    public void setUploadFileName(String uploadFileName) {
        this.uploadFileName = uploadFileName;
    }
    @Override
    public String execute() throws Exception{
        //以服务器的文件保存地址和原文件名建立上传文件输出流
        FileOutputStream fos = new FileOutputStream(getSavePath() + "\\" + getUploadFileName()) ;
        FileInputStream fis = new FileInputStream(getUpload()) ;

        System.out.println("当前上传文件临时保存路径 ："+getUpload());
        System.out.println("当前上传文件SavePath路径为 ："+getSavePath());
        System.out.println("当前上传文件保存路径为 ："+getSavePath() + "\\" + getUploadFileName());
        System.out.println("uploadFileName:  "+getUploadFileName());
        System.out.println("uploadContentType:  "+getUploadContentType());

        uploadfileinfo.setUpLoadFileName(getUploadFileName());
        uploadfileinfo.setUpLoadContentType(getUploadContentType());

        byte[] buffer = new byte[1024*1024] ;
        int len = 0 ;
        while((len = fis.read(buffer))>0){
            fos.write(buffer , 0 , len);
        }

        //设置上传时间
        Date currentDate = new Date() ;
        uploadfileinfo.setFileUploadDate(currentDate);

        if(uploadFileInfoService.UpLoadFileInfoSer(uploadfileinfo).equals("success")){
            return SUCCESS ;
        }
        else{
            System.out.println("upload file information insert ERROR !");
            return "false";
        }
    }

    public UploadFileInfoService getUploadFileInfoService() {
        return uploadFileInfoService;
    }

    public void setUploadFileInfoService(UploadFileInfoService uploadFileInfoService) {
        this.uploadFileInfoService = uploadFileInfoService;
    }

}
