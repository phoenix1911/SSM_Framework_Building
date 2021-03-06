<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<% pageContext.setAttribute("path", request.getContextPath());%>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0">

    <title>毕业设计管理系统 - 登录</title>
    <link href="css/bootstrap.min.css" rel="stylesheet">
    <link href="css/font-awesome.css?v=4.4.0" rel="stylesheet">
    <link href="css/animate.css" rel="stylesheet">
    <link href="css/style.css" rel="stylesheet">
    <link href="css/login.css" rel="stylesheet">
    <!--[if lt IE 9]>
    <meta http-equiv="refresh" content="0;ie.html" />
    <![endif]-->
    <script>
        if (window.top !== window.self) {
            window.top.location = window.location;
        }
    </script>

</head>

<body class="signin">
    <div class="signinpanel">
        <div class="row">
            <div class="col-sm-7">
                <div class="signin-info">
                    <div class="logopanel m-b">
                        <h1>[ 毕设管理系统 ]</h1>
                    </div>
                    <div class="m-b"></div>
                    <%--<h4>欢迎登陆 <strong>毕业设计管理系统</strong></h4>--%>
                    <%--<ul class="m-b">--%>
                        <%--<li><i class="fa fa-arrow-circle-o-right m-r-xs"></i> 优势一</li>--%>
                        <%--<li><i class="fa fa-arrow-circle-o-right m-r-xs"></i> 优势二</li>--%>
                        <%--<li><i class="fa fa-arrow-circle-o-right m-r-xs"></i> 优势三</li>--%>
                        <%--<li><i class="fa fa-arrow-circle-o-right m-r-xs"></i> 优势四</li>--%>
                        <%--<li><i class="fa fa-arrow-circle-o-right m-r-xs"></i> 优势五</li>--%>
                    <%--</ul>--%>
                    <%--<strong>还没有账号？ <a href="#">立即注册&raquo;</a></strong>--%>
                </div>
            </div>
            <div class="col-sm-5">
                <form method="post" action="/login">
                    <h4 class="no-margins">登录：</h4>

                    <input type="text" name="username" class="form-control uname" placeholder="用户名" />
                    <input type="password" name="password" class="form-control pword m-b" placeholder="密码" />
                    <button class="btn btn-success btn-block">登录</button>
                </form>
            </div>
        </div>
        <div class="signup-footer">
            <div class="pull-left">
                &copy; jialong
            </div>
        </div>
    </div>
<%--    <script>--%>
<%--        <c:if test="${message!=''}">--%>
<%--        alert("${message}");--%>
<%--        </c:if>--%>
<%--    </script>--%>
</body>
</html>
