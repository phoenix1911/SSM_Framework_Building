<%--
  User: TJL Date: 2019/3/22  Time: 14:13
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ include file="header.jsp"%>

<body class="gray-bg">

<div class="row">
    <div class="col-sm-12">
        <div class="ibox float-e-margins">
            <div class="ibox-title">
                <h5>新增公告 简介</h5>
                <div class="ibox-tools">
                    <a class="collapse-link">
                        <i class="fa fa-chevron-up"></i>
                    </a>
                    <a class="dropdown-toggle" data-toggle="dropdown" href="tabs_panels.html#">
                        <i class="fa fa-wrench"></i>
                    </a>
                    <ul class="dropdown-menu dropdown-user">
                        <li><a href="tabs_panels.html#">选项1</a>
                        </li>
                        <li><a href="tabs_panels.html#">选项2</a>
                        </li>
                    </ul>
                    <a class="close-link">
                        <i class="fa fa-times"></i>
                    </a>
                </div>
            </div>
            <div class="ibox-content">
                <p>管理员可添加两种公告 ：</p>
                <ol>
                    <li>网站概览区 添加标题和内容</li>
                    <li>公告区 可上传图片(5张以内)或文件(4个文件) </li>
                </ol>
            </div>
        </div>
    </div>
</div>
<div class="row">
    <div class="col-sm-6 ">
        <div class="ibox float-e-margins">
            <div class="ibox-title">
                <h5>新增网站概览</h5>

            </div>
            <div class="ibox-content">

                <form action="${path}/admin/announcement/addwzgl" class="form-horizontal m-t" >

                    <div class="form-group">
                        <label class="col-sm-3 control-label">标题：</label>
                        <div class="col-sm-8">
                            <input id="cid"  name="title"  type="text" class="form-control" required="" aria-required="true">
                        </div>
                    </div>

                    <div class="form-group">
                        <label class="col-sm-3 control-label">内容：</label>
                        <div class="col-sm-8">
                            <input id="cname"  name="describe" minlength="2" type="text" class="form-control" required="" aria-required="true">
                        </div>
                    </div>

                    <div class="form-group">
                        <div class="col-sm-4 col-sm-offset-3">
                            <button class="btn btn-primary" type="submit">提交</button>
                        </div>
                    </div>

                </form>
            </div>
        </div>
    </div>
    <div class="col-sm-6 ">
        <div class="ibox float-e-margins">
            <div class="ibox-title">
                <h5>添加公告</h5>

            </div>
            <div class="ibox-content">
                <form action="${path}/admin/announcement/add?type=gg&usertype=admin" method="post" enctype="multipart/form-data" class="form-horizontal m-t" id="commentForm">

                    <div class="form-group">
                        <label class="col-sm-3 control-label">标题：</label>
                        <div class="col-sm-8">
                            <input  id="title" name="title"  type="text" class="form-control" required="" aria-required="true">
                        </div>
                    </div>

                    <div class="form-group">
                        <label class="col-sm-3 control-label">内容：</label>
                        <div class="col-sm-8">
                            <input   name="describe" minlength="2" type="text" class="form-control" required="" aria-required="true">
                        </div>
                    </div>

                    <div class="form-group">
                        <label class="col-sm-3 control-label">选择文件：</label>
                        <div class="col-sm-8">
                            <input  name="uploadfile" type="file"  multiple class="form-control"  aria-required="true">
                        </div>
                    </div>

                    <div class="form-group">
                        <div class="col-sm-4 col-sm-offset-3">
                            <button class="btn btn-primary" type="submit">上传</button>
                        </div>
                    </div>

                </form>
            </div>
        </div>

    </div>
</div>
<script>
    <c:if test="${message!=null}">
    alert("${message}");
    </c:if>
</script>

</body>
</html>
