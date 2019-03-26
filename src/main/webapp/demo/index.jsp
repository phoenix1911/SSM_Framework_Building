<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<% pageContext.setAttribute("path", request.getContextPath());%>

<%--<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags"%>--%>
<!DOCTYPE HTML>
<html>
<head>
    <title>首页</title>
    <style type="text/css">
        a {
            text-decoration: none;
            color: black;
            font-size: 18px;
        }

        h3 {
            width: 180px;
            height: 38px;
            margin: 100px auto;
            text-align: center;
            line-height: 38px;
            background: deepskyblue;
            border-radius: 4px;
        }
    </style>
</head>
<body>
<div class="container">
    <div class="row clearfix">
        <div class="col-md-12 column">
            <div class="page-header">


            </div>
        </div>
    </div>
</div>
<br><br>
<h3>
    <a href="${path }/city/allCity">点击进入管理页面</a>


</h3>
<h3><a href="${path }/city/list3">测试json 序列化 反序列化</a></h3>
</body>
</html>