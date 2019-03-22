<%--
  User: TJL Date: 2019/3/22  Time: 14:13
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ include file="header.jsp"%>

<body>
<div class="col-md-12">
    <div class="form-group">
        <label class="col-sm-2 control-label">添加方式：</label>
        <div class="col-sm-10">
            <p class="form-control-static">通过excle表格批量上传教师信息：使用前先下载excle文件，填写数据后上传到网页</p>
        </div>
    </div>
    <div class="form-group">
        <div class="col-sm-12 col-sm-offset-2">
            <a href="/admin/teacher/downloadTeaTemplate"class="btn btn-primary" type="submit">下载Excle模板</a>
            <a class="btn btn-primary" type="submit">上传Excle</a>
        </div>
    </div>
</div>aa



</body>
</html>
