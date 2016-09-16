<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: 郑晓辉
  Date: 2016/7/20
  Time: 15:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>upLoadFile_test</title>
</head>
<body>
    <s:form action="uploadFile" enctype="multipart/form-data">
        <s:textfield name="uploadfileinfo.title" label="title"/>
        <s:textfield name="uploadfileinfo.fileDataSource" label="fileDataSource"/>
        <s:textfield name="uploadfileinfo.fileDataYear" label="fileDataYear"/>
        <s:textfield name="uploadfileinfo.fileDataCategory" label="fileDataCategory"/>
        <s:textfield name="uploadfileinfo.fileDataMainClass" label="fileDataMainClass"/>
        <s:textfield name="uploadfileinfo.fileDataSubClass" label="fileDataSubClass"/>
        <s:file name="upload" lable="choose file" />
        <s:submit value="submit"/>
    </s:form>
</body>
</html>
