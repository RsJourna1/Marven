<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: 郑晓辉
  Date: 2016/5/31
  Time: 14:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>

<head>
    <meta charset="UTF-8">
    <title>childData</title>
    <link rel="stylesheet" type="text/css" href="../../css/tabs.css"/>
    <link rel="stylesheet" type="text/css" href="../../css/tabstyles.css"/>
    <link rel="stylesheet" type="text/css" href="../../css/bootstrap.min.css"/>
    <script src="../../js/modernizr.custom.js"></script>

    <!--
        作者：415860408@qq.com
        时间：2016-04-15
        描述：section 3

    -->

    <link href="../../css/style.css" rel="stylesheet">
    <script src="../../js/jquery.min.js"></script>
    <link href="../../css/font-awesome.css" rel="stylesheet">

    <link href="../../css/animate.css" rel="stylesheet">

    <!--
        作者：415860408@qq.com
        时间：2016-04-15
        描述：section 1

    -->

    <link rel="stylesheet" type="text/css" href="../../css/default.css">
    <link rel="stylesheet" type="text/css" href="../../css/styles.css">
</head>

<body>
<div class="container">
    <section>
        <div class="tabs tabs-style-bar">
            <nav>
                <ul>
                    <li><a href="#section-bar-1" class="icon icon-home"><span>MetaData</span></a></li>
                    <li><a href="#section-bar-2" class="icon icon-box"><span>Data</span></a></li>
                    <li><a href="#section-bar-3" class="icon icon-display"><span>Visualization</span></a></li>
                </ul>
            </nav>
            <div class="content-wrap">
                <!-description-->
                <section id="section-bar-1">
                    <div class='container'>
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
                    </div>
                </section>
                <section id="section-bar-2">
                    <div class="span9" style="overflow-x: scroll;overflow-y: scroll; width: 100%">
                        <table class="table">
                            <thead>
                            <tr>
                                <th>
                                    B_TlPop
                                </th>
                                <th>
                                    B_TlPop
                                </th>
                                <th>
                                    B_Age0_4Pop
                                </th>
                                <th>
                                    B_Age10_14Pop
                                </th>
                                <th>
                                    B_Age15Pop
                                </th>
                                <th>
                                    B_Age15_19Pop
                                </th>
                                <th>
                                    B_Age16Pop
                                </th>
                                <th>
                                    B_Age17Pop
                                </th>
                                <th>
                                    B_Age18Pop
                                </th>
                                <th>
                                    B_Age19Pop
                                </th>
                                <th>
                                    B_Age20_24Pop
                                </th>
                                <th>
                                    B_Age25_29Pop
                                </th>
                                <th>
                                    B_Age30_34Pop
                                </th>
                                <th>
                                    B_Age35_39Pop
                                </th>
                                <th>
                                    B_Age40_44Pop
                                </th>
                                <th>
                                    B_Age45_49Pop
                                </th>
                                <th>
                                    B_Age50_54Pop
                                </th>
                                <th>
                                    B_Age55_59Pop
                                </th>
                                <th>
                                    B_Age5_9Pop
                                </th>
                                <th>
                                    B_Age60_64Pop
                                </th>
                                <th>
                                    B_Age65_69Pop
                                </th>
                                <th>
                                    B_Age70_74Pop
                                </th>
                                <th>
                                    B_Age75_79Pop
                                </th>
                                <th>
                                    B_Age80_84Pop
                                </th>
                                <th>
                                    B_AgeOver85Pop
                                </th>
                                <th>
                                    F_Age0_4Pop
                                </th>
                                <th>
                                    F_Age10_14Pop
                                </th>
                                <th>
                                    F_Age15_19Pop
                                </th>
                                <th>
                                    F_Age20_24Pop
                                </th>
                                <th>
                                    F_Age25_29Pop
                                </th>
                                <th>
                                    F_Age30_34Pop
                                </th>
                                <th>
                                    F_Age35_39Pop
                                </th>
                                <th>
                                    F_Age40_44Pop
                                </th>
                                <th>
                                    F_Age45_49Pop
                                </th>
                                <th>
                                    F_Age50_54Pop
                                </th>
                                <th>
                                    F_Age55_59Pop
                                </th>
                                <th>
                                    F_Age5_9Pop
                                </th>
                                <th>
                                    F_Age60_64Pop
                                </th>
                                <th>
                                    F_Age65_69Pop
                                </th>
                                <th>
                                    F_Age70_74Pop
                                </th>
                                <th>
                                    F_Age75_79Pop
                                </th>
                                <th>
                                    F_Age80_84Pop
                                </th>
                                <th>
                                    F_AgeOver85Pop
                                </th>
                                <th>
                                    M_Age0_4Pop
                                </th>
                                <th>
                                    M_Age10_14Pop
                                </th>
                                <th>
                                    M_Age15_19Pop
                                </th>
                                <th>
                                    M_Age20_24Pop
                                </th>
                                <th>
                                    M_Age25_29Pop
                                </th>
                                <th>
                                    M_Age30_34Pop
                                </th>
                                <th>
                                    M_Age35_39Pop
                                </th>
                                <th>
                                    M_Age40_44Pop
                                </th>
                                <th>
                                    M_Age45_49Pop
                                </th>
                                <th>
                                    M_Age50_54Pop
                                </th>
                                <th>
                                    M_Age55_59Pop
                                </th>
                                <th>
                                    M_Age5_9Pop
                                </th>
                                <th>
                                    M_Age60_64Pop
                                </th>
                                <th>
                                    M_Age65_69Pop
                                </th>
                                <th>
                                    M_Age70_74Pop
                                </th>
                                <th>
                                    M_Age75_79Pop
                                </th>
                                <th>
                                    M_Age80_84Pop
                                </th>
                                <th>
                                    M_AgeOver85Pop
                                </th>
                            </tr>
                            </thead>
                            <tbody>
                            <s:iterator value="#attr.browseCTPopulationArrayList" id="browseCTPopulationArrayList"
                                        status="st">
                                <tr <s:if test="#st.odd"> style="background-color: rgba(144, 178, 167, 0.34)"</s:if>>
                                    <td>
                                        <s:property value="B_TlPop"/>
                                    </td>
                                    <td>
                                        <s:property value="B_TlPop"/>
                                    </td>
                                    <td>
                                        <s:property value="B_Age0_4Pop"/>
                                    </td>
                                    <td>
                                        <s:property value="B_Age10_14Pop"/>
                                    </td>
                                    <td>
                                        <s:property value="B_Age15Pop"/>
                                    </td>
                                    <td>
                                        <s:property value="B_Age15_19Pop"/>
                                    </td>
                                    <td>
                                        <s:property value="B_Age16Pop"/>
                                    </td>
                                    <td>
                                        <s:property value="B_Age17Pop"/>
                                    </td>
                                    <td>
                                        <s:property value="B_Age18Pop"/>
                                    </td>
                                    <td>
                                        <s:property value="B_Age19Pop"/>
                                    </td>
                                    <td>
                                        <s:property value="B_Age20_24Pop"/>
                                    </td>
                                    <td>
                                        <s:property value="B_Age25_29Pop"/>
                                    </td>
                                    <td>
                                        <s:property value="B_Age30_34Pop"/>
                                    </td>
                                    <td>
                                        <s:property value="B_Age35_39Pop"/>
                                    </td>
                                    <td>
                                        <s:property value="B_Age40_44Pop"/>
                                    </td>
                                    <td>
                                        <s:property value="B_Age45_49Pop"/>
                                    </td>
                                    <td>
                                        <s:property value="B_Age50_54Pop"/>
                                    </td>
                                    <td>
                                        <s:property value="B_Age55_59Pop"/>
                                    </td>
                                    <td>
                                        <s:property value="B_Age5_9Pop"/>
                                    </td>
                                    <td>
                                        <s:property value="B_Age60_64Pop"/>
                                    </td>
                                    <td>
                                        <s:property value="B_Age65_69Pop"/>
                                    </td>
                                    <td>
                                        <s:property value="B_Age70_74Pop"/>
                                    </td>
                                    <td>
                                        <s:property value="B_Age75_79Pop"/>
                                    </td>
                                    <td>
                                        <s:property value="B_Age80_84Pop"/>
                                    </td>
                                    <td>
                                        <s:property value="B_AgeOver85Pop"/>
                                    </td>
                                    <td>
                                        <s:property value="F_Age0_4Pop"/>
                                    </td>
                                    <td>
                                        <s:property value="F_Age10_14Pop"/>
                                    </td>
                                    <td>
                                        <s:property value="F_Age15_19Pop"/>
                                    </td>
                                    <td>
                                        <s:property value="F_Age20_24Pop"/>
                                    </td>
                                    <td>
                                        <s:property value="F_Age25_29Pop"/>
                                    </td>
                                    <td>
                                        <s:property value="F_Age30_34Pop"/>
                                    </td>
                                    <td>
                                        <s:property value="F_Age35_39Pop"/>
                                    </td>
                                    <td>
                                        <s:property value="F_Age40_44Pop"/>
                                    </td>
                                    <td>
                                        <s:property value="F_Age45_49Pop"/>
                                    </td>
                                    <td>
                                        <s:property value="F_Age50_54Pop"/>
                                    </td>
                                    <td>
                                        <s:property value="F_Age55_59Pop"/>
                                    </td>
                                    <td>
                                        <s:property value="F_Age5_9Pop"/>
                                    </td>
                                    <td>
                                        <s:property value="F_Age60_64Pop"/>
                                    </td>
                                    <td>
                                        <s:property value="F_Age65_69Pop"/>
                                    </td>
                                    <td>
                                        <s:property value="F_Age70_74Pop"/>
                                    </td>
                                    <td>
                                        <s:property value="F_Age75_79Pop"/>
                                    </td>
                                    <td>
                                        <s:property value="F_Age80_84Pop"/>
                                    </td>
                                    <td>
                                        <s:property value="F_AgeOver85Pop"/>
                                    </td>
                                    <td>
                                        <s:property value="M_Age0_4Pop"/>
                                    </td>
                                    <td>
                                        <s:property value="M_Age10_14Pop"/>
                                    </td>
                                    <td>
                                        <s:property value="M_Age15_19Pop"/>
                                    </td>
                                    <td>
                                        <s:property value="M_Age20_24Pop"/>
                                    </td>
                                    <td>
                                        <s:property value="M_Age25_29Pop"/>
                                    </td>
                                    <td>
                                        <s:property value="M_Age30_34Pop"/>
                                    </td>
                                    <td>
                                        <s:property value="M_Age35_39Pop"/>
                                    </td>
                                    <td>
                                        <s:property value="M_Age40_44Pop"/>
                                    </td>
                                    <td>
                                        <s:property value="M_Age45_49Pop"/>
                                    </td>
                                    <td>
                                        <s:property value="M_Age50_54Pop"/>
                                    </td>
                                    <td>
                                        <s:property value="M_Age55_59Pop"/>
                                    </td>
                                    <td>
                                        <s:property value="M_Age5_9Pop"/>
                                    </td>
                                    <td>
                                        <s:property value="M_Age60_64Pop"/>
                                    </td>
                                    <td>
                                        <s:property value="M_Age65_69Pop"/>
                                    </td>
                                    <td>
                                        <s:property value="M_Age70_74Pop"/>
                                    </td>
                                    <td>
                                        <s:property value="M_Age75_79Pop"/>
                                    </td>
                                    <td>
                                        <s:property value="M_Age80_84Pop"/>
                                    </td>
                                    <td>
                                        <s:property value="M_AgeOver85Pop"/>
                                    </td>

                                </tr>
                            </s:iterator>
                            </tbody>
                        </table>
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
<script src="../../js/bootstrap.min.js"></script>
<!-- ECharts -->
<!--<script src="js/echarts-all.js"></script>-->
<script src="ec" type="text/javascript" charset="utf-8"></script>
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
    $(document).ready(Function()
    {
        $(".zr-element").Style()
    }
    )
</script>

</body>

</html>
<%--<input id='message-2' type='checkbox'>--%>
<%--<label for='message-2'>--%>
<%--<div class='container_ui__item'>--%>
<%--<div class='face'>--%>
<%--<img src='img/2.jpg'>--%>

<%--</div>--%>
<%--<h2>INDECATOR</h2>--%>

<%--<h3>subj: Your paper on molecular fusion</h3>--%>

<%--</div>--%>
<%--<div class='container_ui__expand'>--%>
<%--<div class='heading two'>--%>
<%--<div class='heading_head'>--%>
<%--<label for='message-2'>--%>
<%--x--%>
<%--</label>--%>
<%--</div>--%>
<%--</div>--%>
<%--<div class='body'>--%>
<%--<div class='user'>--%>
<%--<div class='face'>--%>
<%--<img src='img/2.jpg'>--%>
<%--</div>--%>
<%--<div class='details'>--%>
<%--<h2>INDECATOR</h2>--%>
<%--<h3>subj: Your paper on molecular</h3>--%>
<%--</div>--%>
<%--</div>--%>
<%--<div class='content'>--%>

<%--</div>--%>
<%--</div>--%>
<%--</div>--%>
<%--</label>--%>
<%--<input id='message-3' type='checkbox'>--%>
<%--<label for='message-3'>--%>
<%--<div class='container_ui__item'>--%>
<%--<div class='face'>--%>
<%--<img src='img/3.jpg'>--%>

<%--</div>--%>
<%--<h2>INDECATOR</h2>--%>

<%--<h3>subj: Your paper on molecular fusion</h3>--%>

<%--</div>--%>
<%--<div class='container_ui__expand'>--%>
<%--<div class='heading third'>--%>
<%--<div class='heading_head'>--%>
<%--<label for='message-3'>--%>
<%--x--%>
<%--</label>--%>
<%--</div>--%>
<%--</div>--%>
<%--<div class='body'>--%>
<%--<div class='user'>--%>
<%--<div class='face'>--%>
<%--<img src='img/3.jpg'>--%>
<%--</div>--%>
<%--<div class='details'>--%>
<%--<h2>INDECATOR</h2>--%>
<%--<h3>subj: Your paper on molecular</h3>--%>
<%--</div>--%>
<%--</div>--%>
<%--<div class='content'>&lt;%&ndash;//3&ndash;%&gt;--%>

<%--</div>--%>
<%--</div>--%>
<%--</div>--%>
<%--</label>--%>

