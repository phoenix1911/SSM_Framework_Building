<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>

<head>

    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">


    <title>H+ 后台主题UI框架 - Blueimp相册</title>
    <meta name="keywords" content="H+后台主题,后台bootstrap框架,会员中心主题,后台HTML,响应式后台">
    <meta name="description" content="H+是一个完全响应式，基于Bootstrap3最新版本开发的扁平化主题，她采用了主流的左右两栏式布局，使用了Html5+CSS3等现代技术">

    <link href="${path}/css/font-awesome.css?v=4.4.0" rel="stylesheet">
    <link href="${path}/css/plugins/blueimp/css/blueimp-gallery.min.css" rel="stylesheet">

    <link href="${path}/css/animate.css" rel="stylesheet">
    <link href="${path}/css/style.css?v=4.1.0" rel="stylesheet">

    <style>
        .lightBoxGallery img {
            margin: 5px;
            width: 80px;
            height: 80px;
        }
    </style>

</head>

<body class="gray-bg">
<div class="wrapper wrapper-content">
    <div class="row">
        <div class="col-lg-12">
            <div class="ibox float-e-margins">

                <div class="ibox-content">

                    <div>
                        <div class="chat-activity-list">

                            <c:forEach var="weekly" items="${requestScope.get('list')}" varStatus="status">
                                <c:choose>
                                    <c:when test="${weekly.tid!=null}">
                                        <div class="chat-element right">
                                            <a class="pull-left">
                                                <img alt="image" class="img-circle" src="${path}/img/a4.jpg">
                                            </a>
                                            <div class="media-body text-left ">
                                                <c:choose>
                                                    <c:when test="${weekly.weeks!=null}">
                                                        <small class="pull-right" style="text-align:right">第${weekly.weeks}周周报</small>

                                                    </c:when>
                                                </c:choose>

                                                <strong>${weekly.tname}</strong><br>

                                                <small class="text-muted">${weekly.date}</small>

                                                <h3 class="m-b-xs">${weekly.describe}</h3>
                                                <h4 class="pull-right" style="text-align:right">教师评价：
                                                    <button class="btn btn-info btn-xs">${weekly.scoregrade}</button>
                                                </h4>

                                                <c:choose>
                                                    <c:when test="${weekly.includepic==1}">
                                                        <div class="lightBoxGallery">
                                                            <c:choose><c:when test="${weekly.p1!=null}"> <a href="${path}/img${weekly.p1}" title="图片" data-gallery=""><img src="${path}/img${weekly.p1}"></a></c:when></c:choose>
                                                            <c:choose><c:when test="${weekly.p2!=null}"> <a href="${path}/img${weekly.p2}" title="图片" data-gallery=""><img src="${path}/img${weekly.p2}"></a></c:when></c:choose>
                                                            <c:choose><c:when test="${weekly.p3!=null}"> <a href="${path}/img${weekly.p3}" title="图片" data-gallery=""><img src="${path}/img${weekly.p3}"></a></c:when></c:choose>
                                                            <c:choose><c:when test="${weekly.p4!=null}"> <a href="${path}/img${weekly.p4}" title="图片" data-gallery=""><img src="${path}/img${weekly.p4}"></a></c:when></c:choose>
                                                            <c:choose><c:when test="${weekly.p5!=null}"> <a href="${path}/img${weekly.p5}" title="图片" data-gallery=""><img src="${path}/img${weekly.p5}"></a></c:when></c:choose>
                                                            <c:choose><c:when test="${weekly.p6!=null}"> <a href="${path}/img${weekly.p6}" title="图片" data-gallery=""><img src="${path}/img${weekly.p6}"></a></c:when></c:choose>
                                                            <c:choose><c:when test="${weekly.p7!=null}"> <a href="${path}/img${weekly.p7}" title="图片" data-gallery=""><img src="${path}/img${weekly.p7}"></a></c:when></c:choose>
                                                            <c:choose><c:when test="${weekly.p8!=null}"> <a href="${path}/img${weekly.p8}" title="图片" data-gallery=""><img src="${path}/img${weekly.p8}"></a></c:when></c:choose>

                                                            <div id="blueimp-gallery" class="blueimp-gallery">
                                                                <div class="slides"></div>
                                                                <h3 class="title"></h3>
                                                                <a class="prev">‹</a>
                                                                <a class="next">›</a>
                                                                <a class="close">×</a>
                                                                <a class="play-pause"></a>
                                                                <ol class="indicator"></ol>
                                                            </div>
                                                        </div>
                                                    </c:when>
                                                </c:choose>
                                            </div>
                                        </div>
                                            </c:when>
                                    <c:when test="${weekly.sid!=null}">
                                                <div class="chat-element">
                                                    <a class="pull-right" style="display:block;margin-left:10px">
                                                        <img alt="image" class="img-circle" src="${path}/img/a2.jpg">
                                                    </a>
                                                        <c:choose>
                                                            <c:when test="${weekly.weeks!=null}">
                                                                <small class="pull-left">第${weekly.weeks}周周报</small>
                                                            </c:when>
                                                        </c:choose>
                                                    <div class="media-body pull-right" style="text-align:right">

                                                        <strong>${weekly.sname}</strong><br>

                                                        <small class="text-muted">${weekly.date}</small>

                                                        <h3 class="m-b-xs">${weekly.describe}</h3>


                                                        <c:choose>
                                                            <c:when test="${weekly.includepic==1}">
                                                                <div class="lightBoxGallery">
                                                                    <c:choose><c:when test="${weekly.p1!=null}"> <a href="${path}/img${weekly.p1}" title="图片" data-gallery=""><img src="${path}/img${weekly.p1}"></a></c:when></c:choose>
                                                                    <c:choose><c:when test="${weekly.p2!=null}"> <a href="${path}/img${weekly.p2}" title="图片" data-gallery=""><img src="${path}/img${weekly.p2}"></a></c:when></c:choose>
                                                                    <c:choose><c:when test="${weekly.p3!=null}"> <a href="${path}/img${weekly.p3}" title="图片" data-gallery=""><img src="${path}/img${weekly.p3}"></a></c:when></c:choose>
                                                                    <c:choose><c:when test="${weekly.p4!=null}"> <a href="${path}/img${weekly.p4}" title="图片" data-gallery=""><img src="${path}/img${weekly.p4}"></a></c:when></c:choose>
                                                                    <c:choose><c:when test="${weekly.p5!=null}"> <a href="${path}/img${weekly.p5}" title="图片" data-gallery=""><img src="${path}/img${weekly.p5}"></a></c:when></c:choose>
                                                                    <c:choose><c:when test="${weekly.p6!=null}"> <a href="${path}/img${weekly.p6}" title="图片" data-gallery=""><img src="${path}/img${weekly.p6}"></a></c:when></c:choose>
                                                                    <c:choose><c:when test="${weekly.p7!=null}"> <a href="${path}/img${weekly.p7}" title="图片" data-gallery=""><img src="${path}/img${weekly.p7}"></a></c:when></c:choose>
                                                                    <c:choose><c:when test="${weekly.p8!=null}"> <a href="${path}/img${weekly.p8}" title="图片" data-gallery=""><img src="${path}/img${weekly.p8}"></a></c:when></c:choose>

                                                                    <div id="blueimp-gallery" class="blueimp-gallery">
                                                                        <div class="slides"></div>
                                                                        <h3 class="title"></h3>
                                                                        <a class="prev">‹</a>
                                                                        <a class="next">›</a>
                                                                        <a class="close">×</a>
                                                                        <a class="play-pause"></a>
                                                                        <ol class="indicator"></ol>
                                                                    </div>
                                                                </div>
                                                            </c:when>
                                                        </c:choose>
                                                    </div>
                                                </div>
                                            </c:when>


                                </c:choose>
                            </c:forEach>
                                                </div>

                        </div>
                    </div>
                </div>


            </div>
        </div>
    </div>
</div>

<!-- 全局js -->
<script src="${path}/js/jquery.min.js?v=2.1.4"></script>
<script src="${path}/js/bootstrap.min.js?v=3.3.6"></script>

<!-- 自定义js -->
<script src="${path}/js/content.js?v=1.0.0"></script>

<!-- blueimp gallery -->
<script src="${path}/js/plugins/blueimp/jquery.blueimp-gallery.min.js"></script>


</body>

</html>

