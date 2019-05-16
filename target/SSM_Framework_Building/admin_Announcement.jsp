<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>

<head>

    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">

    <!--360浏览器优先以webkit内核解析-->


    <title>公告视图</title>

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
                                <a href="${path}/admin/announcement/del?id=${adminAnnouncement.id}">删除</a>
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
                                        <a data-toggle="collapse" data-parent="#version" href="#v${tA.tid+""+tA.id}">${tA.title}</a> <code class="pull-right"> ${tA.date}</code> <a href="${path}/admin/announcement/del?id=${tA.id}" class="btn btn-xs btn-danger">删除</a>
                                    </h5>
                                </div>
                                <div id="v${tA.tid+""+tA.id}" class="panel-collapse collapse ">
                                    <div class="panel-body">

                                        <li>${tA.describe}</li>
                                            <c:choose><c:when test="${tA.f1!=null}"> <a href="${path}/common/download?path=${tA.f1}" >下载附件1</a></c:when></c:choose>
                                            <c:choose><c:when test="${tA.f2!=null}"> <a href="${path}/common/download?path=${tA.f2}" >下载附件2</a></c:when></c:choose>
                                            <c:choose><c:when test="${tA.f3!=null}"> <a href="${path}/common/download?path=${tA.f3}" >下载附件3</a></c:when></c:choose>
                                            <c:choose><c:when test="${tA.f4!=null}"> <a href="${path}/common/download?path=${tA.f4}" >下载附件4</a></c:when></c:choose>

                                        <c:choose>
                                            <c:when test="${tA.includepic!=0}">
                                                <c:choose><c:when test="${tA.p1!=null}"> <a href="${path}/img${tA.p1}" title="图片" data-gallery=""><img src="${path}/img${tA.p1}" style="height: 120px;width: 120px;"></a></c:when></c:choose>
                                                <c:choose><c:when test="${tA.p2!=null}"> <a href="${path}/img${tA.p2}" title="图片" data-gallery=""><img src="${path}/img${tA.p2}" style="height: 120px;width: 120px;"></a></c:when></c:choose>
                                                <c:choose><c:when test="${tA.p3!=null}"> <a href="${path}/img${tA.p3}" title="图片" data-gallery=""><img src="${path}/img${tA.p3}" style="height: 120px;width: 120px;"></a></c:when></c:choose>
                                                <c:choose><c:when test="${tA.p4!=null}"> <a href="${path}/img${tA.p4}" title="图片" data-gallery=""><img src="${path}/img${tA.p4}" style="height: 120px;width: 120px;"></a></c:when></c:choose>
                                                <c:choose><c:when test="${tA.p5!=null}"> <a href="${path}/img${tA.p5}" title="图片" data-gallery=""><img src="${path}/img${tA.p5}" style="height: 120px;width: 120px;"></a></c:when></c:choose>
                                            </c:when>

                                        </c:choose>


                                    </div>
                                </div>
                            </div>

                        </c:forEach>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <div class="col-sm-5">

            <div class="ibox float-e-margins">
                <div class="ibox-title">
                    <h5>标题</h5>
                </div>
                <div class="ibox-content">
                    <p>jlfksdjkljflsdkajlkasdjfklsjadf。</p>
                    <p>sdafsadfsfsdfsdaf：</p>
                    <ol>
                        <li>dfgdfsgdfgdfgdfgdfgfg</li>
                        <li>dfsgdfgdfgdfgdfgsdfg</li>
                        <li>dfjhkldfgjhkdfgjh</li>
                        <li>ghjklfgjhklhgfjhkllhgfjhk</li>
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