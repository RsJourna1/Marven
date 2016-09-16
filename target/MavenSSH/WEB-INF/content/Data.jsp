<%--
  Created by IntelliJ IDEA.
  User: 郑晓辉
  Date: 2016/5/21
  Time: 22:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>

<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="renderer" content="webkit">

    <title>DataBrowse</title>

    <!--[if lt IE 9]>
    <meta http-equiv="refresh" content="0;ie.html" />
    <![endif]-->
    <link rel="stylesheet" type="text/css" href="../../css/navStyle.css" />
    <link rel="shortcut icon" href="favicon.ico">
    <link href="../../css/bootstrap.min.css?v=3.3.6" rel="stylesheet">
    <link href="../../css/font-awesome.min.css" rel="stylesheet">
    <link href="../../css/animate.css" rel="stylesheet">
    <link href="../../css/style.css" rel="stylesheet">
    <style type="text/css">
        .section {
            text-align: center;
            font: 50px "Microsoft Yahei";
            color: #fff;
        }
        .a：focus, a:hover
        {
            color:#FFFFFF
        }
        .cd-main-nav {
            margin: 1px;
        }

        .cd-main-nav li {
            display: inline-block;
            float: left;
            height: 100%;
            padding: 1.22em 0.4em;
        }

        .my-small-navbar {
            border-radius: 0px;
            margin: 0!important;
            background-color: rgb(51, 53, 69)!important;
            border: 0;
        }

        .my-fa-bar {
            width: 44px;
            height: 40px;
            line-height: 3;
        }
    </style>
</head>

<body class="fixed-sidebar full-height-layout gray-bg skin-1" style="overflow:hidden">
<header class="cd-main-header animate-search">
    <a class="navbar-minimalize minimalize-styl-2 btn btn-primary my-small-navbar" href="#">
        <i class="fa fa-bars my-fa-bar"></i> </a>
    <nav class="cd-main-nav-wrapper">
        <a href="../../Search.html" class="cd-search-trigger cd-text-replace">Search</a>

        <ul class="cd-main-nav">
            <li><a href="../../Home.html">Home</a></li>
            <li><a href="../../Data.html">Data</a></li>
            <li><a href="../../Analysis.html">Analysis</a></li>
            <li><a href="Contact">Contact</a></li>
        </ul>
        <!-- .cd-main-nav -->
    </nav>

</header>
<div id="wrapper">
    <!--左侧导航开始-->
    <nav class="navbar-default navbar-static-side" role="navigation">
        <div class="nav-close"><i class="fa fa-times-circle"></i>
        </div>
        <div class="sidebar-collapse">
            <ul class="nav" id="side-menu">

                <li>
                    <a href="#">
                        <i class="fa fa-medkit"></i>
                        <span class="nav-label">Chronic disease</span>
                        <span class="fa arrow"></span>
                    </a>
                    <ul class="nav nav-second-level">
                        <li>
                            <a href="#">Diabetes<span class="fa arrow"></span></a>
                            <ul class="nav nav-third-level">
                                <li>
                                    <a href="#">Diabetes prevalence<span class="fa arrow"></span></a>
                                    <ul class="nav nav-forth-level">
                                        <li>
                                            <a href="#"> Toronto public health<span class="fa arrow"></span></a>
                                            <ul class="nav nav-fifth-level">
                                                <li>
                                                    <%--<a class="J_menuItem" href="browseChronic.action?browsechronic.CT_Dia_year='2007'&descIndicatorEntity.Year=2007&descIndicatorEntity.Main_Class='Chronic Disease'&descIndicatorEntity.Sub_Class='Diabetes'">2007</a>--%>
                                                        <a class="J_menuItem" id="diabetesPrevalence">2007-testonclick</a>
                                                </li>
                                                <li><a class="J_menuItem" href="browseChronic.action?browsechronic.CT_Dia_year='2011'&descIndicatorEntity.Year=2011&descIndicatorEntity.Main_Class='Chronic Disease'&descIndicatorEntity.Sub_Class='Diabetes'">2011</a>
                                                </li>
                                                <li><a class="J_menuItem" href="browseChronic.action?browsechronic.CT_Dia_year='2012'&descIndicatorEntity.Year=2012&descIndicatorEntity.Main_Class='Chronic Disease'&descIndicatorEntity.Sub_Class='Diabetes'">2012</a>
                                                </li>
                                            </ul>
                                        </li>
                                    </ul>
                                </li>
                            </ul>
                        </li>
                    </ul>

                </li>

                <li>
                    <a href="#">
                        <i class="fa fa fa-crosshairs"></i>
                        <span class="nav-label">Determinants</span>
                        <span class="fa arrow"></span>
                    </a>
                    <ul class="nav nav-second-level">
                        <li>
                            <a href="#">Demographic profiles<span class="fa arrow"></span></a>
                            <ul class="nav nav-third-level">
                                <li>
                                    <a href="#">Population<span class="fa arrow"></span></a>
                                    <ul class="nav nav-forth-level">
                                        <li>
                                            <a href="#">Canada census<span class="fa arrow"></span></a>
                                            <ul class="nav nav-fifth-level">
                                                <li><a class="J_menuItem" href="browseCTpopulation.action?entity.CT_year='2006'&descIndicatorEntity.Year=2006&descIndicatorEntity.Category='census'&descIndicatorEntity.Main_Class='Demographic profiles'&descIndicatorEntity.Sub_Class='Population'">2006</a>
                                                </li>
                                                <li><a class="J_menuItem" href="browseCTpopulation.action?entity.CT_year='2011'&descIndicatorEntity.Year=2011&descIndicatorEntity.Category='census'&descIndicatorEntity.Main_Class='Demographic profiles'&descIndicatorEntity.Sub_Class='Population'">2011</a>
                                                </li>
                                            </ul>
                                        </li>
                                    </ul>
                                </li>

                                <li>
                                    <a href="#">Age<span class="fa arrow"></span></a>
                                    <ul class="nav nav-forth-level">
                                        <li>
                                            <a href="#">Canada census<span class="fa arrow"></span></a>
                                            <ul class="nav nav-fifth-level">
                                                <li><a class="J_menuItem" href="../../childData.html">2011</a>
                                                </li>
                                                <li><a class="J_menuItem" href="../../childData.html">2006</a>
                                                </li>
                                            </ul>
                                        </li>
                                    </ul>
                                </li>

                                <li>
                                    <a href="#">Sex<span class="fa arrow"></span></a>
                                    <ul class="nav nav-forth-level">
                                        <li>
                                            <a href="#">Canada census<span class="fa arrow"></span></a>
                                            <ul class="nav nav-fifth-level">
                                                <li><a class="J_menuItem" href="../../childData.html">2011</a>
                                                </li>
                                                <li><a class="J_menuItem" href="../../childData.html">2006</a>
                                                </li>
                                            </ul>
                                        </li>
                                    </ul>
                                </li>

                                <li>
                                    <a href="#">Ethnicity<span class="fa arrow"></span></a>
                                    <ul class="nav nav-forth-level">
                                        <li>
                                            <a href="#">Canada census<span class="fa arrow"></span></a>
                                            <ul class="nav nav-fifth-level">
                                                <li><a class="J_menuItem" href="../../childData.html">2011</a>
                                                </li>
                                                <li><a class="J_menuItem" href="../../childData.html">2006</a>
                                                </li>
                                            </ul>
                                        </li>
                                        <li>
                                            <a href="#">Canada national household survey<span class="fa arrow"></span></a>
                                            <ul class="nav nav-fifth-level">
                                                <li><a class="J_menuItem" href="../../childData.html">2011</a>
                                                </li>
                                                <li><a class="J_menuItem" href="../../childData.html">2006</a>
                                                </li>
                                            </ul>
                                        </li>
                                    </ul>
                                </li>
                            </ul>
                        </li>

                        <li>
                            <a href="#">Socio-economic status<span class="fa arrow"></span></a>
                            <ul class="nav nav-third-level">
                                <li>
                                    <a href="#">Immigrant status<span class="fa arrow"></span></a>
                                    <ul class="nav nav-forth-level">
                                        <li>
                                            <a href="#">Canada national household survey<span class="fa arrow"></span></a>
                                            <ul class="nav nav-fifth-level">
                                                <li><a class="J_menuItem" href="../../childData.html">2011</a>
                                                </li>
                                                <li><a class="J_menuItem" href="../../childData.html">2006</a>
                                                </li>
                                            </ul>
                                        </li>
                                    </ul>
                                </li>

                                <li>
                                    <a href="#">Education attainment<span class="fa arrow"></span></a>
                                    <ul class="nav nav-forth-level">
                                        <li>
                                            <a href="#">Canada national household survey<span class="fa arrow"></span></a>
                                            <ul class="nav nav-fifth-level">
                                                <li><a class="J_menuItem" href="../../childData.html">2011</a>
                                                </li>
                                                <li><a class="J_menuItem" href="../../childData.html">2006</a>
                                                </li>
                                            </ul>
                                        </li>
                                    </ul>
                                </li>

                                <li>
                                    <a href="#">Income<span class="fa arrow"></span></a>
                                    <ul class="nav nav-forth-level">
                                        <li>
                                            <a href="#">Canada national household survey<span class="fa arrow"></span></a>
                                            <ul class="nav nav-fifth-level">
                                                <li><a class="J_menuItem" href="../../childData.html">2011</a>
                                                </li>
                                                <li><a class="J_menuItem" href="../../childData.html">2006</a>
                                                </li>
                                            </ul>
                                        </li>
                                        <li>
                                            <a href="#">Urban HEART@Toronto<span class="fa arrow"></span></a>
                                            <ul class="nav nav-fifth-level">
                                                <li><a class="J_menuItem" href="../../childData.html">2011</a>
                                                </li>
                                            </ul>
                                        </li>
                                    </ul>
                                </li>

                                <li>
                                    <a href="#">Occupation<span class="fa arrow"></span></a>
                                    <ul class="nav nav-forth-level">
                                        <li>
                                            <a href="#">Canada national household survey<span class="fa arrow"></span></a>
                                            <ul class="nav nav-fifth-level">
                                                <li><a class="J_menuItem" href="../../childData.html">2011</a>
                                                </li>
                                                <li><a class="J_menuItem" href="../../childData.html">2006</a>
                                                </li>
                                            </ul>
                                        </li>
                                    </ul>
                                </li>
                                <li>
                                    <a href="#">Marital status<span class="fa arrow"></span></a>
                                    <ul class="nav nav-forth-level">
                                        <li>
                                            <a href="#">Canada census<span class="fa arrow"></span></a>
                                            <ul class="nav nav-fifth-level">
                                                <li><a class="J_menuItem" href="../../childData.html">2011</a>
                                                </li>
                                                <li><a class="J_menuItem" href="../../childData.html">2006</a>
                                                </li>
                                            </ul>
                                        </li>
                                    </ul>
                                </li>
                            </ul>
                        </li>

                        <li>
                            <a href="#">Environment<span class="fa arrow"></span></a>
                            <ul class="nav nav-third-level">
                                <li>
                                    <a href="#">Amenities for physical activities<span class="fa arrow"></span></a>
                                    <ul class="nav nav-forth-level">
                                        <li>
                                            <a href="#">Walk Score<span class="fa arrow"></span></a>
                                            <ul class="nav nav-fifth-level">
                                                <li><a class="J_menuItem" href="../../childData.html">2014</a>
                                                </li>
                                            </ul>
                                        </li>
                                    </ul>
                                </li>

                                <li>
                                    <a href="#">Healthy food supply<span class="fa arrow"></span></a>
                                    <ul class="nav nav-forth-level">
                                        <li>
                                            <a href="#">Urban HEART@Toronto<span class="fa arrow"></span></a>
                                            <ul class="nav nav-fifth-level">
                                                <li><a class="J_menuItem" href="../../childData.html">2011</a>
                                                </li>
                                            </ul>
                                        </li>
                                        <li>
                                            <a href="#">	Toronto public health & Toronto food strategy<span class="fa arrow"></span></a>
                                            <ul class="nav nav-fifth-level">
                                                <li><a class="J_menuItem" href="../../childData.html">2012</a>
                                                </li>
                                            </ul>
                                        </li>
                                    </ul>
                                </li>

                                <li>
                                    <a href="#">Air condition & Pollutants<span class="fa arrow"></span></a>
                                    <ul class="nav nav-forth-level">
                                        <li>
                                            <a href="#">City of Toronto<span class="fa arrow"></span></a>
                                            <ul class="nav nav-fifth-level">
                                                <li><a class="J_menuItem" href="../../childData.html">2012</a>
                                                </li>
                                            </ul>
                                        </li>
                                        <li>
                                            <a href="#">ChemTRAC<span class="fa arrow"></span></a>
                                            <ul class="nav nav-fifth-level">
                                                <li><a class="J_menuItem" href="../../childData.html">2012</a>
                                                </li>
                                                <li><a class="J_menuItem" href="../../childData.html">2008</a>
                                                </li>
                                            </ul>
                                        </li>
                                    </ul>
                                </li>

                                <li>
                                    <a href="#">Water<span class="fa arrow"></span></a>
                                    <ul class="nav nav-forth-level">
                                        <li>
                                            <a href="#">CBC Toronto<span class="fa arrow"></span></a>
                                            <ul class="nav nav-fifth-level">
                                                <li><a class="J_menuItem" href="../../childData.html">2014</a>
                                                </li>
                                            </ul>
                                        </li>
                                    </ul>
                                </li>

                                <li>
                                    <a href="#">Weather<span class="fa arrow"></span></a>
                                </li>

                                <li>
                                    <a href="#">Housing & Dwelling<span class="fa arrow"></span></a>
                                    <ul class="nav nav-forth-level">
                                        <li>
                                            <a href="#">Canada census<span class="fa arrow"></span></a>
                                            <ul class="nav nav-fifth-level">
                                                <li><a class="J_menuItem" href="../../childData.html">2011</a>
                                                </li>
                                                <li><a class="J_menuItem" href="../../childData.html">2006</a>
                                                </li>
                                            </ul>
                                        </li>
                                        <li>
                                            <a href="#">Toronto Community Housing Corporation<span class="fa arrow"></span></a>
                                            <ul class="nav nav-fifth-level">
                                                <li><a class="J_menuItem" href="../../childData.html">2008</a>
                                                </li>
                                            </ul>
                                        </li>
                                    </ul>
                                </li>

                                <li>
                                    <a href="#">Soil & Land use<span class="fa arrow"></span></a>
                                    <ul class="nav nav-forth-level">
                                        <li>
                                            <a href="#">Well being<span class="fa arrow"></span></a>
                                            <ul class="nav nav-fifth-level">
                                                <li><a class="J_menuItem" href="../../childData.html">2008</a>
                                                </li>
                                            </ul>
                                        </li>
                                    </ul>
                                </li>

                                <li>
                                    <a href="#">Crime<span class="fa arrow"></span></a>
                                    <ul class="nav nav-forth-level">
                                        <li>
                                            <a href="#">CBC Toronto<span class="fa arrow"></span></a>
                                            <ul class="nav nav-fifth-level">
                                                <li><a class="J_menuItem" href="../../childData.html">2011</a>
                                                </li>
                                            </ul>
                                        </li>
                                    </ul>
                                </li>

                                <li>
                                    <a href="#">Health care<span class="fa arrow"></span></a>
                                    <ul class="nav nav-forth-level">
                                        <li>
                                            <a href="#">Ontario Ministry of Health and Long-Term Care<span class="fa arrow"></span></a>
                                            <ul class="nav nav-fifth-level">
                                                <li><a class="J_menuItem" href="../../childData.html">2014</a>
                                                </li>
                                            </ul>
                                        </li>
                                    </ul>
                                </li>
                            </ul>
                        </li>
                    </ul>
                </li>
                <li>
                    <a href="#">
                        <i class="fa fa fa-glass"></i>
                        <span class="nav-label">Lifestyle</span>
                        <span class="fa arrow"></span>
                    </a>
                    <ul class="nav nav-second-level">
                        <li>
                            <a href="#">Physical activities<span class="fa arrow"></span></a>
                            <ul class="nav nav-third-level">
                                <li>
                                    <a href="#">Commuting<span class="fa arrow"></span></a>
                                    <ul class="nav nav-forth-level">
                                        <li>
                                            <a href="#">Canada national household survey<span class="fa arrow"></span></a>
                                            <ul class="nav nav-fifth-level">
                                                <li><a class="J_menuItem" href="../../childData.html">2011</a>
                                                </li>
                                                <li><a class="J_menuItem" href="../../childData.html">2006</a>
                                                </li>
                                            </ul>
                                        </li>
                                    </ul>
                                </li>

                                <li>
                                    <a href="#">Exercise in leisure time<span class="fa arrow"></span></a>
                                    <ul class="nav nav-forth-level">
                                        <li>
                                            <a href="#">Canada national household survey<span class="fa arrow"></span></a>
                                            <ul class="nav nav-fifth-level">
                                                <li><a class="J_menuItem" href="../../childData.html">2012</a>
                                                </li>
                                                <li><a class="J_menuItem" href="../../childData.html">2011</a>
                                                </li>
                                            </ul>
                                        </li>
                                    </ul>
                                </li>
                            </ul>
                        </li>

                        <li>
                            <a href="#">Diet & Eating<span class="fa arrow"></span></a>
                            <ul class="nav nav-third-level">
                                <li>
                                    <a href="#">Vegetable and fruits intake<span class="fa arrow"></span></a>
                                    <ul class="nav nav-forth-level">
                                        <li>
                                            <a href="#">Canadian community health survey<span class="fa arrow"></span></a>
                                            <ul class="nav nav-fifth-level">
                                                <li><a class="J_menuItem" href="../../childData.html">2011</a>
                                                </li>
                                                <li><a class="J_menuItem" href="../../childData.html">2012</a>
                                                </li>
                                            </ul>
                                        </li>
                                    </ul>
                                </li>
                            </ul>
                        </li>

                        <li>
                            <a href="#">Smoking<span class="fa arrow"></span></a>
                        </li>
                        <li>
                            <a href="#">Drinking<span class="fa arrow"></span></a>
                        </li>
                    </ul>
                </li>
                <li>
                    <a href="#"><i class="fa fa-group"></i> <span class="nav-label">Population health</span><span class="fa arrow"></span></a>
                    <ul class="nav nav-second-level">
                        <li>
                            <a href="#">Mental health<span class="fa arrow"></span></a>
                            <ul class="nav nav-third-level">
                                <li>
                                    <a href="#">Canadian community health survey<span class="fa arrow"></span></a>
                                    <ul class="nav nav-forth-level">
                                        <li><a class="J_menuItem" href="../../childData.html">2011</a>
                                        </li>
                                        <li><a class="J_menuItem" href="../../childData.html">2012</a>
                                        </li>
                                    </ul>
                                </li>
                            </ul>
                        </li>

                        <li>
                            <a href="#">Obesity<span class="fa arrow"></span></a>
                            <ul class="nav nav-third-level">
                                <li>
                                    <a href="#">Canadian community health survey<span class="fa arrow"></span></a>
                                    <ul class="nav nav-forth-level">
                                        <li><a class="J_menuItem" href="../../childData.html">2011</a>
                                        </li>
                                        <li><a class="J_menuItem" href="../../childData.html">2012</a>
                                        </li>
                                    </ul>
                                </li>
                            </ul>
                        </li>
                    </ul>
                </li>
                <li>
                    <a href="#"><i class="fa fa-map"></i> <span class="nav-label">Geographic information</span><span class="fa arrow"></span></a>
                    <ul class="nav nav-second-level">
                        <li>
                            <a href="#">Neighborhood<span class="fa arrow"></span></a>
                            <ul class="nav nav-third-level">
                                <li>
                                    <a href="#">City of Toronto<span class="fa arrow"></span></a>
                                    <ul class="nav nav-forth-level">
                                        <li><a class="J_menuItem" href="../../childData.html">2014</a>
                                        </li>
                                    </ul>
                                </li>
                            </ul>
                        </li>

                        <li>
                            <a href="#">Census tracts<span class="fa arrow"></span></a>
                            <ul class="nav nav-third-level">
                                <li>
                                    <a href="#">Canada census<span class="fa arrow"></span></a>
                                    <ul class="nav nav-forth-level">
                                        <li><a class="J_menuItem" href="../../childData.html">2011</a>
                                        </li>
                                        <li><a class="J_menuItem" href="../../childData.html">2006</a>
                                        </li>
                                    </ul>
                                </li>
                            </ul>
                        </li>
                    </ul>
                </li>

            </ul>
        </div>
    </nav>
    <!--左侧导航结束-->
    <!--右侧部分开始-->
    <div id="page-wrapper" class="gray-bg dashbard-1">

        <div class="row content-tabs">
            <button class="roll-nav roll-left J_tabLeft"><i class="fa fa-backward"></i>
            </button>
            <nav class="page-tabs J_menuTabs">
                <div class="page-tabs-content">
                    <a href="javascript:;" class="active J_menuTab" data-id="index_v1.html">首页</a>
                </div>
            </nav>
            <button class="roll-nav roll-right J_tabRight"><i class="fa fa-forward"></i>
            </button>
            <div class="btn-group roll-nav roll-right">
                <button class="dropdown J_tabClose" data-toggle="dropdown">关闭操作<span class="caret"></span>

                </button>
                <ul role="menu" class="dropdown-menu dropdown-menu-right">
                    <li class="J_tabShowActive"><a>定位当前选项卡</a>
                    </li>
                    <li class="divider"></li>
                    <li class="J_tabCloseAll"><a>关闭全部选项卡</a>
                    </li>
                    <li class="J_tabCloseOther"><a>关闭其他选项卡</a>
                    </li>
                </ul>
            </div>
            <a href="login.html" class="roll-nav roll-right J_tabExit"><i class="fa fa fa-sign-out"></i> 退出</a>
        </div>
        <div class="row J_mainContent" id="content-main">
            <iframe class="J_iframe" name="iframe0" width="100%" height="100%" src="index_v1.html?v=4.0" frameborder="0" data-id="index_v1.html" seamless></iframe>
        </div>

    </div>
    <!--右侧部分结束-->

    <!-- 全局js -->
    <script src="../../js/jquery.min.js?v=2.1.4"></script>
    <script src="../../js/bootstrap.min.js?v=3.3.6"></script>
    <script src="../../js/jquery.metisMenu.js"></script>
    <script src="../../js/jquery.slimscroll.min.js"></script>

    <!-- 自定义js -->
    <script src="../../js/hplus.js?v=4.1.0"></script>
    <script type="text/javascript" src="../../js/contabs.js"></script>

    <!-- 第三方插件 -->
    <script src="../../js/pace.min.js"></script>
</div>
    <script>
        $("#diabetesPrevalence").onclick(
                $.get("browseChronic.action?browsechronic.CT_Dia_year='2007'&descIndicatorEntity.Year=2007&descIndicatorEntity.Main_Class='Chronic Disease'&descIndicatorEntity.Sub_Class='Diabetes'"));
    </script>
</body>

</html>
