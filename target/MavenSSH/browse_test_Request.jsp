<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: 郑晓辉
  Date: 2016/8/19
  Time: 8:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>browseRequest</title>
</head>
<%
    String context = request.getContextPath();
%>
<body>
<%--<s:form action="browse" method="POST">--%>
<%--<s:textfield name="dataYear" label="dataYear"/>--%>
<%--<s:textfield name="selectedOption" label="selectedOption"/>--%>
<%--<s:textfield name="pageNum" label="pageNo"/>--%>
<%--<s:textfield name="pageSize" label="pageSize"/>--%>
<%--<s:submit value="submit"/>--%>
<%--</s:form>--%>

<h2>
    <a href="browse.action?selectedOption=2.1.1.1&dataYear=2006&pagerModel.pageNo=1&pagerModel.pageSize=10"
       type="button">
        TEST(selectedOption=2.1.1.1&dataYear=2006)
    </a>
</h2>

</body>
</html>
