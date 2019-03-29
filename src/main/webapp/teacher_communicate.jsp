<%--
  User: TJL Date: 2019/3/22  Time: 14:13
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ include file="header.jsp"%>

<body class="gray-bg">
<div class="wrapper wrapper-content animated fadeInRight">
    <div class="row m-t-lg">
        <div class="col-sm-12">
            <div class="ibox float-e-margins">

                <div class="ibox-content">

                    <div>
                        <div class="chat-activity-list">

                            <c:forEach var="weekly" items="${requestScope.get('list')}" varStatus="status">
                                <c:choose>
                                    <c:when test="${weekly.tid!=null}">
                                        <div class="chat-element right">
                                            <a href="widgets.html#" class="pull-right">
                                                <img alt="image" class="img-circle" src="${path}/img/a4.jpg">
                                            </a>
                                            <div class="media-body text-right ">
                                                <small class="pull-left">第${weekly.weeks}周周报</small>
                                                <strong>${weekly.tname}</strong>
                                                <h3 class="m-b-xs">${weekly.describe}</h3>
                                                <small class="text-muted">${weekly.date}</small>

                                                <c:choose>
                                                    <c:when test="${weekly.includepic==0}">
                                                <div class="lightBoxGallery">
                                                    <a href="${path}/img/p_big2.jpg" title="图片" data-gallery=""><img src="${path}/img/p2.jpg"></a>
                                                    <a href="${path}/img/p_big3.jpg" title="图片" data-gallery=""><img src="${path}/img/p3.jpg"></a>
                                                    <a href="${path}/img/p_big1.jpg" title="图片" data-gallery=""><img src="${path}/img/p1.jpg"></a>
                                                    <a href="${path}/img/p_big2.jpg" title="图片" data-gallery=""><img src="${path}/img/p2.jpg"></a>
                                                    <a href="${path}/img/p_big3.jpg" title="图片" data-gallery=""><img src="${path}/img/p3.jpg"></a>

                                                    <div id="blueimp-gallery" class="blueimp-gallery">
                                                        <div class="slides"></div>
                                                        <h3 class="title"></h3>
                                                        <a class="prev">‹</a>
                                                        <a class="next">›</a>
                                                        <a class="close">×</a>
                                                        <a class="play-pause"></a>
                                                        <ol class="indicator"></ol>
                                                    </div>
                                                    </c:when>
                                                </c:choose>
                                            </div>
                                        </div>
                                    </c:when>
                                </c:choose>

                                <c:choose><%--学生--%>
                                    <c:when test="${weekly.sid!=null}">
                                        <div class="chat-element">
                                            <a href="widgets.html#" class="pull-left">
                                                <img alt="image" class="img-circle" src="${path}/img/a2.jpg">
                                            </a>
                                            <div class="media-body ">
                                                <small class="pull-right">第${weekly.weeks}周周报</small>
                                                <strong>${weekly.sname}</strong>
                                                <h3 class="m-b-xs">${weekly.describe}</h3>
                                                <small class="text-muted">${weekly.date}</small>
                                                <c:choose>
                                                    <c:when test="${weekly.includepic==0}">
                                                        <div class="lightBoxGallery">
                                                            <a href="${path}/img/p_big2.jpg" title="图片" data-gallery=""><img src="${path}/img/p2.jpg"></a>
                                                            <a href="${path}/img/p_big3.jpg" title="图片" data-gallery=""><img src="${path}/img/p3.jpg"></a>
                                                            <a href="${path}/img/p_big1.jpg" title="图片" data-gallery=""><img src="${path}/img/p1.jpg"></a>
                                                            <a href="${path}/img/p_big2.jpg" title="图片" data-gallery=""><img src="${path}/img/p2.jpg"></a>
                                                            <a href="${path}/img/p_big3.jpg" title="图片" data-gallery=""><img src="${path}/img/p3.jpg"></a>

                                                        <div id="blueimp-gallery" class="blueimp-gallery">
                                                            <div class="slides"></div>
                                                            <h3 class="title"></h3>
                                                            <a class="prev">‹</a>
                                                            <a class="next">›</a>
                                                            <a class="close">×</a>
                                                            <a class="play-pause"></a>
                                                            <ol class="indicator"></ol>
                                                        </div>
                                                    </c:when>
                                                </c:choose>

                                                </div>
                                            </div>
                                        </div>
                                    </c:when>

                                </c:choose>

                            </c:forEach>
                    </div>
                    <div class="chat-form">
                        <form role="form">
                            <div class="form-group">
                                <textarea class="form-control" placeholder="消息内容…"></textarea>
                            </div>
                            <div class="text-right">
                                <button type="submit" class="btn btn-sm btn-primary m-t-n-xs"><strong>发送消息</strong>
                                </button>
                            </div>
                        </form>
                    </div>
                </div>
            </div>
        </div></div>

</div>
<!-- 全局js -->
<script src="${path}/js/jquery.min.js?v=2.1.4"></script>
<script src="${path}/js/bootstrap.min.js?v=3.3.6"></script>

<!-- 自定义js -->
<script src="${path}/js/content.js?v=1.0.0"></script>

<!-- blueimp gallery -->
<script src="${path}/js/plugins/blueimp/jquery.blueimp-gallery.min.js"></script>
<style>
    .lightBoxGallery img {
        margin: 5px;
        height: 120px;
        width: 120px;

    }
</style>

</body>
</html>
