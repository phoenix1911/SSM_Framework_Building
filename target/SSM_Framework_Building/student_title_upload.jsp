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
                    <h5>毕设题目文件上传 简介</h5>

                </div>
                <div class="ibox-content">
                    <a href="${path}/stu/title/download?type=ktbgtemplate" class="btn btn-info btn-sm">下载开题报告模板</a>
                    <a href="${path}/stu/title/download?type=zqbgtemplate" class="btn btn-info btn-sm">下载中期报告模板</a>
                    <a href="${path}/stu/title/download?type=smstemplate" class="btn btn-info btn-sm">下载说明书模板</a>
                    <ul>
                        <li>任务书命名规则：题目名+开题报告.doc    例： 高校毕业设计选题管理系统开题报告.docx</li>
                        <li>任务书命名规则：题目名+中期报告.doc    例： 高校毕业设计选题管理系统中期报告.docx</li>
                        <li>任务书命名规则：题目名+说明书.doc      例： 高校毕业设计选题管理系统说明书.docx</li>
                    </ul>
                </div>
            </div>
        </div>
    </div>
    <div class="row">
        <div class="col-sm-4 ">
        <div class="ibox float-e-margins">
            <div class="ibox-title">
                <h5>毕设开题报告  状态: ${title.ktbgstate}</h5>

            </div>
            <div class="ibox-content">

                <form action="${path}/stu/title/upload?type=ktbg" method="post" enctype="multipart/form-data" class="form-horizontal m-t" id="commentForm">



                    <div class="form-group">
                        <label class="col-sm-4 control-label">选择文件：</label>
                        <div class="col-md-8">
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
        <div class="col-sm-4 ">
            <div class="ibox float-e-margins">
                <div class="ibox-title">
                    <h5>毕设中期报告 状态：${title.zqbgstate}</h5>

                </div>
                <div class="ibox-content">

                    <form action="${path}/stu/title/upload?type=zqbg" method="post" enctype="multipart/form-data" class="form-horizontal m-t" id="commentForm">


                        <div class="form-group">
                            <label class="col-sm-4 control-label">选择文件：</label>
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
        <div class="col-sm-4 ">
            <div class="ibox float-e-margins">
                <div class="ibox-title">
                    <h5>毕业设计说明书 状态：${title.smsstate}</h5>

                </div>
                <div class="ibox-content">

                    <form action="${path}/stu/title/upload?type=sms" method="post" enctype="multipart/form-data" class="form-horizontal m-t" id="commentForm">



                        <div class="form-group">
                            <label class="col-sm-4 control-label">选择文件：</label>
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
    </div>
</div>


</body>
</html>
