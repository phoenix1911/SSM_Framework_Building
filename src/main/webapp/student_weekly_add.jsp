<%--
  User: TJL Date: 2019/3/22  Time: 14:13
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ include file="header.jsp"%>

<body class="gray-bg">
<div class="wrapper wrapper-content animated fadeInRight">
    <div class="row">
        <div class="col-sm-12">
            <div class="ibox float-e-margins">
                <div class="ibox-title">
                    <h5>填写周报</h5>
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
                    <ul>
                        <li>只有每周五到周日可以填写周报 </li>
                        <li>可插入8张图片</li>
                    </ul>
                </div>
            </div>
        </div>
    </div>
    <div class="row">
        <div class="col-sm-6 ">
            <div class="ibox float-e-margins">
                <div class="ibox-title">
                    <h5>新增周报 第${week}周</h5>

                </div>
                <div class="ibox-content">

                    <form action="${path}/stu/weekly/add" method="post" enctype="multipart/form-data" class="form-horizontal m-t" id="commentForm">

                        <input type="hidden" name="week" value="${week}" >

                        <div class="form-group">
                            <label class="col-sm-3 control-label">周报内容：</label>
                            <div class="col-sm-8">
                                <input id="cid"  name="describe" value="" type="text" class="form-control" required="" aria-required="true">
                            </div>
                        </div>

                        <div class="form-group">
                            <label class="col-sm-3 control-label">选择图片：</label>
                            <div class="col-sm-8">
                                <input  id="file_input" name="uploadfile" type="file" multiple class="form-control" required="" aria-required="true">
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
    </div>
</div>


</body>
</html>
