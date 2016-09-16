<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: 郑晓辉
  Date: 2016/5/24
  Time: 12:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Browse</title>
</head>
<body>

<p>indicator description 页面</p>
<s:iterator value="#attr.descIndicatorArrayList" id="descIndicatorArrayList">
    <table width="100px" style="border: 2px solid black">
        <tr>
            <td>
                <s:property value="FieldName"/>
            </td>
            <td>
                <s:property value="Description"/>
            </td>
        </tr>
    </table>
</s:iterator>
</body>
</html>
