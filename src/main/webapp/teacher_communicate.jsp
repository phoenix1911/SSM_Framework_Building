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
                                                <c:choose>
                                                    <c:when test="${weekly.weeks!=null}">
                                                        <small class="pull-left">第${weekly.weeks}周周报</small><br>
                                                        <h4 class="pull-left">教师评价：<button class="btn btn-info btn-xs">${weekly.scoregrade}</button></h4>
                                                    </c:when>
                                                </c:choose>

                                                <strong>${weekly.tname}</strong><br>

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
                                                    </c:when>
                                                </c:choose>
                                            </div>
                                        </div>
                                    </c:when>
                                </c:choose>

                                <c:choose><%--学生--%>
                                    <c:when test="${weekly.sid!=null}">
                                        <div class="chat-element">
                                            <a class="pull-left">
                                                <img alt="image" class="img-circle" src="${path}/img/a2.jpg">
                                            </a>
                                            <div class="media-body ">
                                                <c:choose>
                                                    <c:when test="${weekly.weeks!=null}">
                                                        <small class="pull-right">第${weekly.weeks}周周报</small>
                                                    </c:when>
                                                </c:choose>

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
                                                    </c:when>
                                                </c:choose>

                                                </div>
                                            </div>
                                        </div>
                                    </c:when>

                                </c:choose>

                            </c:forEach>
                    </div>
                                <div class="chat-form" style="margin-right: 20px; margin-left:40px">
                                    <form role="form" action="${path}/tea/weekly/add" method="post" enctype="multipart/form-data">
                                        <div class="form-group" style="margin-bottom: 5px">
<%--                                            <input  id="week" name="week"  class="form-control" required="" aria-required="true">--%>
                                            <select name="week" class="form-control m-b">
                                                <option value="1">第1周</option>
                                                <option value="2">第2周</option>
                                                <option value="3">第3周</option>
                                                <option value="4">第4周</option>
                                                <option value="5">第5周</option>
                                                <option value="6">第6周</option>
                                                <option value="7">第7周</option>
                                                <option value="8">第8周</option>
                                                <option value="9">第9周</option>
                                                <option value="10">第10周</option>
                                                <option value="11">第11周</option>
                                                <option value="12">第12周</option>
                                                <option value="13">第13周</option>
                                                <option value="14">第14周</option>
                                                <option value="15">第15周</option>
                                                <option value="16">第16周</option>
                                                <option value="17">第17周</option>
                                            </select>
                                        </div>
                                        <div class="form-group" style="margin-bottom: 5px">
                                            <textarea name="describe" class="form-control" placeholder="消息内容…"></textarea>
                                        </div>
                                        <div class="form-group" style="margin-bottom: 5px">
                                            <input  id="file_input" name="uploadfile" type="file" multiple class="form-control"  aria-required="true">
                                        </div>
                                        <div class="form-group" style="margin-bottom: 5px">
<%--                                            <input  id="scoregrade" name="scoregrade" class="form-control" required="" aria-required="true">--%>
                                            <input type="radio" checked="checked" value="优" id="optionsRadios1" name="scoregrade"><button class="btn btn-info btn-xs">优</button>
                                            <input type="radio"  value="良" id="optionsRadios2" name="scoregrade"><button class="btn btn-info btn-xs">良</button>
                                            <input type="radio"  value="中" id="optionsRadios3" name="scoregrade"><button class="btn btn-info btn-xs">中</button>
                                            <input type="radio"  value="差" id="optionsRadios4" name="scoregrade"><button class="btn btn-info btn-xs">差</button>
                                        </div>
                                            <input  id="sessionid" name="sessionid" value="${sessionid}"  type="hidden" >
                                        <div class="text-right" style="margin-top:10px;align:right">
                                            <button type="submit" class="btn btn-xl btn-primary m-t-n-xs"><strong>发送消息</strong>
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
        height: 80px;
        width: 80px;

    }
</style>

</body>
</html>
