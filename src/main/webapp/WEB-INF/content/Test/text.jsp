<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: 郑晓辉
  Date: 2016/5/24
  Time: 15:20
  To change this template use File | Settings | File Templates.
--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" type="text/css" href="../../../css/bootstrap.min.css"/>
</head>
<body>
<table class="table table-hover table-bordered table-striped table-condensed">
    <s:iterator value="#attr.descIndicatorArrayList" status="st" id="indicator">
        <tr>
            <th><s:property value="#st.count"/></th>
            <th><s:property value="FieldName"/></th>
            <th><s:property value="Description"/></th>
        </tr>
    </s:iterator>
</table>
</body>
</html>
