<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: 郑晓辉
  Date: 2016/8/10
  Time: 11:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html xmlns="http://www.w3.org/1999/xhtml">

<head>
    <title>browse_test_result</title>
    <style>
        #tableAutoAppend table {
            background-color: #ffffff;
            border: 2px solid black;
            color: #565;
            font: 16px arial;
        }

        #tableAutoAppend table, td, th {
            border:1px solid black;
            margin: 0;
            padding: 0;
            vertical-align: middle;
            text-align: left;
        }


    </style>
    <%--<link href="css/plugins/jqueryPagination/pagination.css" rel="stylesheet" type="text/css"/>--%>
    <%--<script type="text/javascript" src="js/jquery-1.9.0.min.js"></script>--%>
    <%--<script type="text/javascript" src="js/plugins/jqueryPagination/jquery.pagination.js"></script>--%>
    <script type="text/javascript">
        var respondArray =${pagerModel.getResultData()};
        var headArray = [];
        function parseHead(oneRow) {
            for (var i in oneRow) {
                headArray[headArray.length] = i;
            }
        }
        function appendTable() {
            parseHead(respondArray[0]);
            var tableAutoAppend = document.getElementById("tableAutoAppend");
            var table = document.createElement("table");
            var thead = document.createElement("tr");
            for (var count = 0; count < headArray.length; count++) {
                var td = document.createElement("td");
                td.innerHTML = headArray[count];
                thead.appendChild(td);
            }
            table.appendChild(thead);
            for (var tableRowNo = 0; tableRowNo < respondArray.length; tableRowNo++) {
                var tr = document.createElement("tr");
                for (var headCount = 0; headCount < headArray.length; headCount++) {
                    var cell = document.createElement("td");
                    cell.innerHTML = respondArray[tableRowNo][headArray[headCount]];
                    tr.appendChild(cell);
                }
                table.appendChild(tr);
            }
            tableAutoAppend.appendChild(table);
        }
    </script>
</head>
<%
    // 获取请求的上下文
    String context = request.getContextPath();
%>
<body onload="appendTable(respondArray);">

<div id="tableAutoAppend"></div>
<div id="pager">
    Total Pages:${pagerModel.getTotalPages()} &nbsp;&nbsp;Current Page: ${pagerModel.pageNo} &nbsp;&nbsp;&nbsp;&nbsp;
    <a href="browse.action?selectedOption=${selectedOption}&dataYear=${dataYear}&pagerModel.pageNo=${pagerModel.getTopPageNo()}&pagerModel.pageSize=${pagerModel.getPageSize()}">Top</a>
    &nbsp;&nbsp;
    <a href="browse.action?selectedOption=${selectedOption}&dataYear=${dataYear}&pagerModel.pageNo=${pagerModel.getPreviousPageNo()}&pagerModel.pageSize=${pagerModel.getPageSize()}">Previous</a>
    &nbsp;&nbsp;
    <a href="browse.action?selectedOption=${selectedOption}&dataYear=${dataYear}&pagerModel.pageNo=${pagerModel.getNextPageNo()}&pagerModel.pageSize=${pagerModel.getPageSize()}">Next</a>
    &nbsp;&nbsp;
    <a href="browse.action?selectedOption=${selectedOption}&dataYear=${dataYear}&pagerModel.pageNo=${pagerModel.getBottomPageNo()}&pagerModel.pageSize=${pagerModel.getPageSize()}">Bottom</a>
</div>

</body>

</html>
