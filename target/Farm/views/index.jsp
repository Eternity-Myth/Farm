<%--
Created by IntelliJ IDEA.
User: Eternity-Myth
Date: 2018/5/11
Time: 21:03
To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=gbk" language="java" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html lang="zh">
<head>
    <meta charset="GBK">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Agro农场信息管理系统</title>

    <!-- Bootstrap -->
    <link href="../css/font.css" rel="stylesheet">
    <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
    <script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
    <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->
</head>
<body style="background-image:url(../agro/UIpic/background.jpg);background-repeat:no-repeat;background-attachment:fixed;background-size: 100%">
<div class="container-fluid">
    <div class="row">
        <div class="col-md-8 col-md-offset-2" style="background-color:rgba(0,0,0,0.8);height:60px">
            <p class="col-md-4"
               style="text-align:center;padding-top:15px;height:60px;color:#FFFFFF;font-size:20px;font-family:'Gill Sans', 'Gill Sans MT', 'Myriad Pro', 'DejaVu Sans Condensed', Helvetica, Arial, sans-serif">
                <img src="../agro/UIpic/home.png" style="height:25px">&nbsp;&nbsp;&nbsp;HOME&nbsp;&nbsp;&nbsp;
            </p>
            <p class="col-md-4"
               style="text-align:center;padding-top:15px;height:60px;color:#FFFFFF;font-size:20px;font-family:'Gill Sans', 'Gill Sans MT', 'Myriad Pro', 'DejaVu Sans Condensed', Helvetica, Arial, sans-serif">
                <img src="../agro/UIpic/management.png" style="height:25px">&nbsp;&nbsp;&nbsp;MANAGEMENT
            </p>
            <p1 class="col-md-4"
                style="text-align:center;padding-top:15px;height:60px;color:#FFFFFF;font-size:20px;font-family:'Gill Sans', 'Gill Sans MT', 'Myriad Pro', 'DejaVu Sans Condensed', Helvetica, Arial, sans-serif">
                <img src="../agro/UIpic/sign.png" style="height:25px">&nbsp;&nbsp;&nbsp;SIGN&nbsp;IN&nbsp;/&nbsp;UP
            </p1>
        </div>

    </div>
    <br><br>
    <div class="row">
        <div class="col-md-9 col-md-offset-3">
            <img src="../agro/UIpic/agro logo.png" style="height:100px">
        </div>
    </div>
    <br>
    <div class="row">
        <div class="col-md-6 col-md-offset-3" style="background-color:rgba(255,255,255,0.7)">

            <div id="myCarousel" class="carousel slide" style="margin-top:15px;margin-bottom:15px">
                <!-- 轮播（Carousel）指标 -->
                <ol class="carousel-indicators">
                    <li data-target="#myCarousel" data-slide-to="0" class="active"></li>
                    <li data-target="#myCarousel" data-slide-to="1"></li>
                    <li data-target="#myCarousel" data-slide-to="2"></li>
                </ol>
                <!-- 轮播（Carousel）项目 -->
                <div class="carousel-inner">
                    <div class="item active">
                        <img src="../agro/UIpic/pic1.jpg" alt="First slide">
                    </div>
                    <div class="item">
                        <img src="../agro/UIpic/pic2.jpg" alt="Second slide">
                    </div>
                    <div class="item">
                        <img src="../agro/UIpic/pic3.jpg" alt="Third slide">
                    </div>
                </div>
                <!-- 轮播（Carousel）导航 -->
                <a class="carousel-control left" href="#myCarousel"
                   data-slide="prev"> <span _ngcontent-c3="" aria-hidden="true"
                                            class="glyphicon glyphicon-chevron-left"></span></a>
                <a class="carousel-control right" href="#myCarousel"
                   data-slide="next"><span _ngcontent-c3="" aria-hidden="true"
                                           class="glyphicon glyphicon-chevron-right"></span></a>
            </div>
        </div>
    </div>

    <div class="row">
        <div class="col-md-6 col-md-offset-3"
             style="background-color:rgba(80,77,77,0.9);height:300px;color:#FFFFFF;padding-left:30px">
            <br>Agro农场信息管理系统<br><br>作者：<br>关文聪、许亘成、吴金辰、黄捷敏、王明义<br><br>项目开源地址：<br><a
                href="https://github.com/Eternity-Myth/Farm">https://github.com/Eternity-Myth/Farm</a> <br><br>基本开发环境：JDK
            1.8.0_162、Apache-Tomcat-9.0.6、MySQL 5.7.21 Community Server<br><br>使用框架：Spring+SpringMVC+Mybatis（主要）,Maven（项目依赖管理）,Bootstrap（前端框架）<br><br>逆向工程：MyBatis-Generator
            <br><br><a href="/views/field.jsp">查看菜地信息</a>
            <br><a href="/views/crops.jsp">查看农作物信息</a>
            <br><a href="/views/users.jsp">用户信息管理</a>
            <br><a href="/views/logs.jsp">系统操作日志</a>
        </div>
    </div>
    <div class="row" style="height:80px">
    </div>
    <div class="row">
        <div class="col-md-8 col-md-offset-2" style="background-color:rgba(0,0,0,0.8);height:60px">
            <div class="col-md-4 col-md-offset-4"
                 style="text-align:center;padding-top:15px;height:60px;color:#FFFFFF;font-size:20px;font-family:'Gill Sans', 'Gill Sans MT', 'Myriad Pro', 'DejaVu Sans Condensed', Helvetica, Arial, sans-serif">
                <img src="../agro/UIpic/contact.png" style="height:25px">&nbsp;&nbsp;&nbsp;CONTACT&nbsp;US
            </div>
        </div>
    </div>
</div>

<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
<script src="../js/jquery-1.11.2.min.js"></script>

<!-- Include all compiled plugins (below), or include individual files as needed -->
<script src="../js/bootstrap.js"></script>
</body>
<style type="text/css">
    p {
        border-right: thin solid #FFFFFF;
    }

    p1 {
    }

    nav {
        font-family: bradleyhanditcttbold;
        font-size: 15px;
    }
</style>

</html>
