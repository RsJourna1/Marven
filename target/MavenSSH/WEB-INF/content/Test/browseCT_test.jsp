<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: 郑晓辉
  Date: 2016/8/9
  Time: 20:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>browse_test</title>
    <link rel="stylesheet" type="text/css" href="../../../css/bootstrap.min.css"/>
</head>
<body>
<s:iterator value="#attr.browseCTPopulationArrayList" status="st" id="indicator">
    <tr <s:if test="#st.odd">style="background-color: #e5e5e5"</s:if>>
        <th><s:property value="#st.count"/></th>
        <th><s:property value="B_Age0_4Pop"/></th>
        <%--<th><s:property value="Description"/></th>--%>
    </tr>
</s:iterator>
</body>
</html>
