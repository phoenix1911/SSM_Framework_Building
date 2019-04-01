<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>

<head>

    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">

    <!--360浏览器优先以webkit内核解析-->


    <title>学生界面</title>

    <link rel="shortcut icon" href="${path}/img/favicon.ico">
    <link href="${path}/css/bootstrap.min.css?v=3.3.6" rel="stylesheet">
    <link href="${path}/css/font-awesome.css?v=4.4.0" rel="stylesheet">

    <link href="${path}/css/animate.css" rel="stylesheet">
    <link href="${path}/css/style.css?v=4.1.0" rel="stylesheet">


</head>

<body class="gray-bg">
<div class="row  border-bottom white-bg dashboard-header">
    <div class="col-sm-12">
        <div class="ibox float-e-margins">
            <div class="ibox-title">
                <h5>网站概览</h5>
            </div>
            <div class="ibox-content">
                <table class="table table-striped table-bordered table-hover dataTables-example">
                    <thead>
                    <tr>
                        <th>标题</th>
                        <th>内容</th>
                        <th>操作</th>
                    </tr>
                    </thead>
                    <tbody>
                    <c:forEach var="adminAnnouncement" items="${requestScope.get('adminAnnouncement')}" varStatus="status">
                        <tr class="gradeX">
                            <th>${adminAnnouncement.title}</th>
                            <th>${adminAnnouncement.describe}</th>
                            <th>
                                -
                            </th>
                        </tr>
                    </c:forEach>
                    </tbody>

                </table>

            </div>
        </div>
    </div>


</div>
<div class="wrapper wrapper-content">
    <div class="row">

        <div class="col-sm-7">
            <div class="ibox float-e-margins">
                <div class="ibox-title">
                    <h5>公告</h5>
                </div>
                <div class="ibox-content no-padding">
                    <div class="panel-body">
                        <div class="panel-group" id="version">
                        <c:forEach var="tA" items="${requestScope.get('teacherAnnouncement')}" varStatus="status">
                            <div class="panel panel-default">
                                <div class="panel-heading">
                                    <h5 class="panel-title">
                                        <a data-toggle="collapse" data-parent="#version" href="#v${tA.tid+""+tA.id}">${tA.title}</a><code class="pull-right">${tA.date}</code>
                                    </h5>
                                </div>
                                <div id="v${tA.tid+""+tA.id}" class="panel-collapse collapse ">
                                    <div class="panel-body">

                                            <li>${tA.describe}</li>

                                        <c:choose>
                                            <c:when test="${tA.includepic!=0}">
                                               <li> <img alt="?" style="width: 140px; height: 140px" src="${path}/img/p1.jpg"/></li>
                                            </c:when>
                                        </c:choose>


                                    </div>
                                </div>
                            </div>
                            <%--<div class="panel panel-default">--%>
                                <%--<div class="panel-heading">--%>
                                    <%--<h5 class="panel-title">--%>
                                        <%--<a data-toggle="collapse" data-parent="#version" href="#v40">v4.1.0</a><code class="pull-right">2015.10.21</code>--%>
                                    <%--</h5>--%>
                                <%--</div>--%>
                                <%--<div id="v40" class="panel-collapse collapse">--%>
                                    <%--<div class="panel-body">--%>
                                        <%--<ol>--%>
                                            <%--<li>升级bootstrap到最新版本3.3.5；</li>--%>
                                            <%--<li>升级jquery版本到最新版本2.1.4；</li>--%>
                                            <%--<li>升级Font Awesome到最新版本4.4.0；</li>--%>
                                            <%--<li>修复了登录页面的一处错误；</li>--%>
                                            <%--<li>修复了主页面出现多个滚动条的问题；</li>--%>
                                            <%--<li>修复了已知的各种浏览器兼容问题；</li>--%>
                                            <%--<li>修复了layphoto和suggest等页面的显示问题；</li>--%>
                                            <%--<li>新增Glyphicons字体图标的预览；</li>--%>
                                            <%--<li>新增对不支持的浏览器的友好提示；</li>--%>
                                            <%--<li>新增视频/音乐播放器的支持；</li>--%>
                                            <%--<li>新增Bootstrap Table(推荐)；</li>--%>
                                            <%--<li>进一步完善了开发文档；</li>--%>
                                            <%--<li>提供了离线支持，开箱即用；</li>--%>
                                            <%--<li>对IE系列的浏览器支持更好。</li>--%>
                                        <%--</ol>--%>
                                    <%--</div>--%>
                                <%--</div>--%>
                            <%--</div>--%>
                        </c:forEach>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <div class="col-sm-5">

            <div class="ibox float-e-margins">
                <div class="ibox-title">
                    <h5>二次开发</h5>
                </div>
                <div class="ibox-content">
                    <p>我们提供基于H+的二次开发服务，具体费用请联系作者。</p>
                    <p>同时，我们也提供以下服务：</p>
                    <ol>
                        <li>基于WordPress的网站建设和主题定制</li>
                        <li>PSD转WordPress主题</li>
                        <li>PSD转XHTML</li>
                        <li>Html页面（CSS+XHTML+jQuery）制作</li>
                    </ol>
                </div>
            </div>
            <div class="ibox float-e-margins">
                <div class="ibox-title">
                    <h5>技术支持</h5>

                </div>
                <div class="ibox-content">
                    <p><i class="fa fa-send-o"></i> 教务处电话：321342314234</p>
                    <p><i class="fa fa-qq"></i>技术支持：3345325345 </p>
                    <p><i class="fa fa fa-envelope-o fa-fw"></i>邮箱：thisistj@outlook.com </p>
                </div>
            </div>
        </div>

    </div>
</div>

<!-- 全局js -->
<script src="${path}/js/jquery.min.js?v=2.1.4"></script>
<script src="${path}/js/bootstrap.min.js?v=3.3.6"></script>
<script src="${path}/js/plugins/layer/layer.min.js"></script>

<!-- 自定义js -->
<script src="${path}/js/content.js"></script>

<!-- 欢迎信息 -->
<script src="${path}/js/welcome.js"></script>
</body>

</html>


</html>
