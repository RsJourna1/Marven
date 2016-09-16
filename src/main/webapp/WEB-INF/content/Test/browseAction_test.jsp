<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: 郑晓辉
  Date: 2016/8/10
  Time: 11:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>browseaction_test</title>
</head>
<body>
    <s:form action="browse" >
        <s:textfield name="queryParam.year" label="year"/>
        <s:textfield name="queryParam.tableName" label="tableName(CensusDiabetesPrevalence)"/>
        <s:textfield name="pageNo" label="pageNo"/>
        <s:textfield name="pageSize" label="pageSize"/>
        <s:submit value="submit"/>
    </s:form>
</body>
</html>
