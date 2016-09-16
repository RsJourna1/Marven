<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: 郑晓辉
  Date: 2016/7/20
  Time: 12:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>upLoadFile</title>
</head>
<body>
    <s:form action="upLoad" enctype="multipart/form-data">
        <s:textfield name="upLoadFile.title" lable="File Name"/>
        <s:file name="upLoad" lable="Choose File"/>
        <s:submit value="UpLoad"/>
    </s:form>
</body>
</html>
