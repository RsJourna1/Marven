<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%--
  Created by IntelliJ IDEA.
  User: 郑晓辉
  Date: 2016/5/31
  Time: 14:23
  To change this template use File | Settings | File Templates.
--%>
<html>

<head>
    <meta charset="UTF-8">
    <title>childData</title>
    <link rel="stylesheet" type="text/css" href="../../css/tabs.css"/>
    <link rel="stylesheet" type="text/css" href="../../css/tabstyles.css"/>
    <link rel="stylesheet" type="text/css" href="../../css/bootstrap.min.css"/>
    <script src="../../js/modernizr.custom.js"></script>

    <!--        描述：section 3    -->

    <link href="../../css/style.css" rel="stylesheet">
    <script src="../../js/jquery.min.js"></script>
    <link href="../../css/font-awesome.css" rel="stylesheet">

    <link href="../../css/animate.css" rel="stylesheet">

    <!--        描述：section 1    -->

    <link rel="stylesheet" type="text/css" href="../../css/default.css">
    <link rel="stylesheet" type="text/css" href="../../css/styles.css">

    <!-- jqgrid-->
    <link href="../../css/plugins/jqgrid/ui.jqgrid.css?0820" rel="stylesheet">

    <style>
        body .container{
            width: auto;
        }
    </style>
</head>

<body>
<div class="container">
    <section>
        <div class="tabs tabs-style-bar">
            <nav class=".navbar-fixed-top">
                <ul>
                    <li><a href="#section-bar-1" class="icon icon-home"><span>MetaData</span></a></li>
                    <li><a href="#section-bar-2" class="icon icon-box"><span>Data</span></a></li>
                    <li><a href="#section-bar-3" class="icon icon-display"><span>Visualization</span></a></li>
                </ul>
            </nav>
            <div class="content-wrap">
                <section id="section-bar-1">
                    <!--<div class="container">-->
                    <table class="table table-hover table-bordered table-striped table-condensed">
                        <thead>
                        <th>#</th>
                        <th>FieldName</th>
                        <th>Description</th>
                        </thead>
                        <tbody>
                        <s:iterator value="#attr.descIndicatorArrayList" status="st" id="indicator">
                            <tr <s:if test="#st.odd">style="background-color: #e5e5e5"</s:if>>
                                <th><s:property value="#st.count"/></th>
                                <th><s:property value="FieldName"/></th>
                                <th><s:property value="Description"/></th>
                            </tr>
                        </s:iterator>
                        </tbody>
                    </table>
                    <!--</div>-->

                </section>

                <section id="section-bar-2">
                    <div class="center-block">
                        <div class="span9">
                            <div class="jqGrid_wrapper">
                                <table id="table_list_1"></table>
                                <div id="pager_list_1"></div>
                            </div>
                        </div>
                    </div>
                </section>

                <section id="section-bar-3">
                    <div class="col-sm-6">
                        <div id="my-echart-line" style="width:500%; height: 300%;"></div>
                    </div>
                    <div class="col-sm-6">
                        <div id="my-echart-pie" style="width:500%; height: 300%;">
                        </div>
                    </div>
                </section>

            </div>
            <!-- /content -->
        </div>
        <!-- /tabs -->
    </section>

</div>
<!-- /container -->
<script src="../../js/cbpFWTabs.js"></script>
<script src="../../js/echarts.min.js" type="text/javascript" charset="utf-8"></script>
<script>
    (function () {
        [].slice.call(document.querySelectorAll('.tabs')).forEach(function (el) {
            new CBPFWTabs(el);
        });
    })();
</script>

<!--
    作者：415860408@qq.com
    时间：2016-04-15
    描述：

-->
<!-- 全局js -->
<script src="../../js/jquery.min.js?v=2.1.4"></script>

<!-- Peity -->
<script src="../../js/plugins/peity/jquery.peity.min.js"></script>

<!-- jqGrid -->
<script src="../../js/plugins/jqgrid/i18n/grid.locale-cn.js?0820"></script>
<script src="../../js/plugins/jqgrid/jquery.jqGrid.min.js?0820"></script>

<!--&lt;!&ndash; 自定义js &ndash;&gt;-->
<!--<script src="js/content.js?v=1.0.0"></script>-->

<script src="../../js/bootstrap.min.js"></script>

<script src="ec" type="text/javascript" charset="utf-8"></script>

<script>
    $(document).ready(function () {

        $.jgrid.defaults.styleUI = 'Bootstrap';
        // Examle data for jqGrid
        var mydata = [
            {
                id: "1",
                invdate: "2010-05-24",
                name: "test",
                note: "note",
                tax: "10.00",
                total: "2111.00"
            },
            {
                id: "2",
                invdate: "2010-05-25",
                name: "test2",
                note: "note2",
                tax: "20.00",
                total: "320.00"
            },

        ];

        // Configuration for jqGrid Example 1
        $("#table_list_1").jqGrid({
            data: mydata,
            datatype: "local",
            height: 450,
//            autowidth: true,
            width: 1024,
            shrinkToFit: true,
            rowNum: 15,
            rowList: [10, 20, 30],
            colNames: ['序号', '日期', '客户', '金额', '运费', '总额', '备注'],
            colModel: [
                {
                    name: 'id',
                    index: 'id',
                    width: 60,
                    sorttype: "int"
                },
                {
                    name: 'invdate',
                    index: 'invdate',
                    width: 90,
                    sorttype: "date",
                    formatter: "date"
                },
                {
                    name: 'name',
                    index: 'name',
                    width: 100
                },
                {
                    name: 'amount',
                    index: 'amount',
                    width: 80,
                    align: "right",
                    sorttype: "float",
                    formatter: "number"
                },
                {
                    name: 'tax',
                    index: 'tax',
                    width: 80,
                    align: "right",
                    sorttype: "float"
                },
                {
                    name: 'total',
                    index: 'total',
                    width: 80,
                    align: "right",
                    sorttype: "float"
                },
                {
                    name: 'note',
                    index: 'note',
                    width: 150,
                    sortable: false
                }
            ],
            pager: "#pager_list_1",
            viewrecords: true,
//            caption: "jqGrid 示例1",
            hidegrid: false
        });

        // Add responsive to jqGrid
        $(window).bind('resize', function () {
            var width = $('.jqGrid_wrapper').width();
            $('#table_list_1').setGridWidth(width);
            $('#pager_list_1').setGridWidth(width);
//            $('#table_list_2').setGridWidth(width);
        });
    });
</script>

<script type="text/javascript">
    var myLineChart = echarts.init(document.getElementById('my-echart-line'));
    var myPieChart = echarts.init(document.getElementById('my-echart-pie'));
    var lineOption = {
        title: {
            text: '未来一周气温变化'
        },
        tooltip: {
            trigger: 'axis'
        },
        legend: {
            data: ['最高气温', '最低气温']
        },
        grid: {
            x: 40,
            x2: 40,
            y2: 24
        },
        calculable: true,
        xAxis: [{
            type: 'category',
            boundaryGap: false,
            data: ['周一', '周二', '周三', '周四', '周五', '周六', '周日']
        }],
        yAxis: [{
            type: 'value',
            axisLabel: {
                formatter: '{value} °C'
            }
        }],
        series: [{
            name: '最高气温',
            type: 'line',
            data: [11, 11, 15, 13, 12, 13, 10],
            markPoint: {
                data: [{
                    type: 'max',
                    name: '最大值'
                }, {
                    type: 'min',
                    name: '最小值'
                }]
            },
            markLine: {
                data: [{
                    type: 'average',
                    name: '平均值'
                }]
            }
        }, {
            name: '最低气温',
            type: 'line',
            data: [1, -2, 2, 5, 3, 2, 0],
            markPoint: {
                data: [{
                    name: '周最低',
                    value: -2,
                    xAxis: 1,
                    yAxis: -1.5
                }]
            },
            markLine: {
                data: [{
                    type: 'average',
                    name: '平均值'
                }]
            }
        }]
    };
    var pieOption = {
        title: {
            text: '某站点用户访问来源',
            subtext: '纯属虚构',
            x: 'center'
        },
        tooltip: {
            trigger: 'item',
            formatter: "{a} <br/>{b} : {c} ({d}%)"
        },
        legend: {
            orient: 'vertical',
            x: 'left',
            data: ['直接访问', '邮件营销', '联盟广告', '视频广告', '搜索引擎']
        },
        calculable: true,
        series: [{
            name: '访问来源',
            type: 'pie',
            radius: '55%',
            center: ['50%', '60%'],
            data: [{
                value: 335,
                name: '直接访问'
            }, {
                value: 310,
                name: '邮件营销'
            }, {
                value: 234,
                name: '联盟广告'
            }, {
                value: 135,
                name: '视频广告'
            }, {
                value: 1548,
                name: '搜索引擎'
            }]
        }]
    };
    myLineChart.setOption(lineOption);
    myPieChart.setOption(pieOption);
</script>

<script type="text/javascript">
    $(document).ready(function () {
                $(".zr-element").style()
            }
    )
</script>
</body>

</html>