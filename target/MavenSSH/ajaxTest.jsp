<%--
  Created by IntelliJ IDEA.
  User: 郑晓辉
  Date: 2016/9/16
  Time: 9:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>AjaxTest</title>
    <link href="css/plugins/jqueryPagination/pagination.css" rel="stylesheet" type="text/css"/>
    <script type="text/javascript" src="js/jquery-1.9.0.min.js"></script>
    <script type="text/javascript" src="js/plugins/jqueryPagination/jquery.pagination.js"/>
    <script type="text/javascript"></script>
    <script type="text/javascript">
        $(function () {
            var requestUrl = "Browse/browseAjax.action?selectedOption=2.1.1.1&dataYear=2006&pagerModel.pageNo=1&pagerModel.pageSize=10";
            $.ajax({
                type: "POST",
                url: requestUrl,
                dataType: "json", //ajax返回值设置为text（json格式也可用它返回，可打印出结果，也可设置成json）
                success: function (json) {
                    console.log("json :");console.log(json);
                    var obj = eval(json);  //使用这个方法解析json
                    console.log("obj :");console.log(obj);
                    var pagerModel = obj.pagerModel;  //pagerModel是和action中定义的result变量的get方法对应的
                    console.log("obj.pagerModel :");console.log(pagerModel);

                    console.log("pagerModel.resultData :");console.log(pagerModel.resultData);
                    console.log("pagerModel.pageNo :");console.log(pagerModel.pageNo);
                    console.log("pagerModel.pageSize :");console.log(pagerModel.pageSize);
                    console.log("pagerModel.nextPage :");console.log(pagerModel.nextPageNo);
                },
                error: function (json) {
                    alert("ERROR! json=" + json);
                    return false;
                }
            });
        });
        $(function () {
            var requestUrl = "Browse/browseAjax.action?selectedOption=2.1.1.1&dataYear=2006&pagerModel.pageNo=2&pagerModel.pageSize=10";
            $("#tj").click(function () {
                //提交的参数，name和inch是和struts action中对应的接收变量
//                var params = {
//                    selectedOption: "2.1.1.1",
//                    dataYear: "2006"
//                    pagerModel: {pageNo: 1, pageSize: 10},
//                };
                $.ajax({
                    type: "POST",
                    url: requestUrl,
//                    url: "Browse/browseAjax.action?pagerModel.pageNo=1&pagerModel.pageSize=10&selectedOption=2.1.1.1&dataYear=2006",
//                    data: params,
                    dataType: "json", //ajax返回值设置为text（json格式也可用它返回，可打印出结果，也可设置成json）
                    success: function (json) {
                        console.log("json :");console.log(json);
                        var obj = eval(json);  //使用这个方法解析json
                        console.log("obj :");console.log(obj);
                        var pagerModel = obj.pagerModel;  //pagerModel是和action中定义的result变量的get方法对应的
                        console.log("obj.pagerModel :");console.log(pagerModel);

                        console.log("pagerModel.resultData :");console.log(pagerModel.resultData);
                        console.log("pagerModel.pageNo :");console.log(pagerModel.pageNo);
                        console.log("pagerModel.pageSize :");console.log(pagerModel.pageSize);
                        console.log("pagerModel.nextPage :");console.log(pagerModel.nextPageNo);
                    },
                    error: function (json) {
                        alert("ERROR! json=" + json);
                        return false;
                    }
                });
            });
        });
    </script>
</head>
<%
    String selectedOption = request.getParameter("selectedOption");
    String dataYear = request.getParameter("dataYear");
%>
<body>
<input type="button" value="Page 2" id="tj">
</body>
</html>
