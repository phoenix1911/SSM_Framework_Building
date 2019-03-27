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
                <h5>新增毕业设计说明</h5>
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
                <p>添加说明：</p>
                <ul>
                    <li>上传word</li>
                    <li>-------------</li>
                </ul>

            </div>
        </div>
    </div>
</div>
<div class="row">
    <div class="col-sm-6 ">
        <div class="ibox float-e-margins">
            <div class="ibox-title">
                <h5>新增毕设题目信息</h5>
                <div class="ibox-tools">
                    <a class="collapse-link">
                        <i class="fa fa-chevron-up"></i>
                    </a>
                    <a class="dropdown-toggle" data-toggle="dropdown" href="form_basic.html#">
                        <i class="fa fa-wrench"></i>
                    </a>
                    <ul class="dropdown-menu dropdown-user">
                        <li><a href="form_basic.html#">选项1</a>
                        </li>
                        <li><a href="form_basic.html#">选项2</a>
                        </li>
                    </ul>
                    <a class="close-link">
                        <i class="fa fa-times"></i>
                    </a>
                </div>
            </div>
            <div class="ibox-content">

                <form action="${path}/tea/title/add" method="post" enctype="multipart/form-data" class="form-horizontal m-t" id="commentForm">

                    <div class="form-group">
                        <label class="col-sm-3 control-label">毕业设计题目：</label>
                        <div class="col-sm-8">
                            <input id="cid"  name="title" value="" type="text" class="form-control" required="" aria-required="true">
                        </div>
                    </div>

                    <div class="form-group">
                        <label class="col-sm-3 control-label">选择文件：</label>
                        <div class="col-sm-8">
                            <input  name="uploadfile" type="file" class="form-control" required="" aria-required="true">
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
                <h5>批量添加学生</h5>
                <div class="ibox-tools">
                    <a class="collapse-link">
                        <i class="fa fa-chevron-up"></i>
                    </a>
                    <a class="dropdown-toggle" data-toggle="dropdown" href="form_basic.html#">
                        <i class="fa fa-wrench"></i>
                    </a>
                    <ul class="dropdown-menu dropdown-user">
                        <li><a href="form_basic.html#">选项1</a>
                        </li>
                        <li><a href="form_basic.html#">选项2</a>
                        </li>
                    </ul>
                    <a class="close-link">
                        <i class="fa fa-times"></i>
                    </a>
                </div>
            </div>
            <div class="ibox-content">
                <a href="/admin/student/downloadStuTemplate" class="btn btn-primary" type="submit">下载world模板</a>

                <form action="${path}/admin/student/addmany" method="post" enctype="multipart/form-data" class="form-horizontal m-t" id="commentForm">

                    <div class="form-group">
                        <label class="col-sm-3 control-label">选择文件：</label>
                        <div class="col-sm-8">
                            <input  name="uploadfile" type="file" class="form-control" required="" aria-required="true">
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


</body>
</html>
