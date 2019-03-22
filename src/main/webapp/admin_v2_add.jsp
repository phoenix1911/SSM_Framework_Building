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
                <h5>新增学生方法 简介</h5>
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
                <p>管理员可通过两种方式添加学生：</p>
                <ul>
                    <li>上传excle文件批量添加学生，可先下载excle模板填写后上传</li>
                    <li>直接添加单条学生信息 </li>
                </ul>
                <p>数据库不保存学生身份证号，仅取后6位作为初始密码使用</a>
                </p>
            </div>
        </div>
    </div>
</div>
<div class="row">
    <div class="col-sm-8 col-sm-offset-2">
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
                <a href="/admin/student/downloadStuTemplate"class="btn btn-primary" type="submit">下载Excle模板</a>
                <form action="${path}/admin/student/addmany" class="form-horizontal m-t" id="commentForm">

                    <div class="form-group">
                        <label class="col-sm-3 control-label">选择文件：</label>
                        <div class="col-sm-8">
                            <input id="cid"  name="id" minlength="10" type="text" class="form-control" required="" aria-required="true">
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
<div class="row">
<div class="col-sm-8 col-sm-offset-2">
    <div class="ibox float-e-margins">
        <div class="ibox-title">
            <h5>新增学生信息</h5>
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

            <form action="${path}/admin/student/addone" class="form-horizontal m-t" id="commentForm">

                <div class="form-group">
                    <label class="col-sm-3 control-label">学号：</label>
                    <div class="col-sm-8">
                        <input id="cid"  name="id" minlength="10" type="text" class="form-control" required="" aria-required="true">
                    </div>
                </div>

                <div class="form-group">
                    <label class="col-sm-3 control-label">姓名：</label>
                    <div class="col-sm-8">
                        <input id="cname"  name="name" minlength="2" type="text" class="form-control" required="" aria-required="true">
                    </div>
                </div>

                <div class="form-group">
                    <label class="col-sm-3 control-label">手机号：</label>
                    <div class="col-sm-8">
                        <input id="cphone"  type="text" class="form-control" name="phonenumber" required="" aria-required="true">
                    </div>
                </div>

                <div class="form-group">
                    <label class="col-sm-3 control-label">E-mail：</label>
                    <div class="col-sm-8">
                        <input id="cemail"  type="email" class="form-control" name="email" required="" aria-required="true">
                    </div>
                </div>

                <div class="form-group">
                    <label class="col-sm-3 control-label">身份证号：</label>
                    <div class="col-sm-8">
                        <input id="csfz"  type="text" class="form-control" name="sfz">
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


</body>
</html>
