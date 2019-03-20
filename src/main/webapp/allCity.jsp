<%--
  User: TJL Date: 2018/12/18  Time: 16:11
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<% String appPath = request.getContextPath(); %>
<html>
<head>
    <title>City列表</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <!-- 引入 Bootstrap -->
    <link href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<div class="container">
    <div class="row clearfix">
        <div class="col-md-12 column">
            <div class="page-header">
                <h1>
                    。${requestScope.username}
                </h1>
            </div>
        </div>
    </div>

    <div class="row clearfix">
        <div class="col-md-12 column">
            <div class="page-header">
                <h1>
                    <small>城市列表 —— 显示所有城市</small>
                </h1>
            </div>
        </div>
    </div>
    <div class="row">
        <div class="col-md-4 column">
            <a class="btn btn-primary" href="<%=appPath%>/city/toInsertCity">新增</a>
        </div>
    </div>
    <div class="row clearfix">
        <div class="col-md-12 column">
            <table class="table table-hover table-striped">
                <thead>
                <tr>
                    <th>城市id</th>
                    <th>城市name</th>
                    <th>城市countrycode</th>
                    <th>城市district</th>
                    <th>城市population</th>
                    <th>操作</th>
                </tr>
                </thead>
                <tbody>
                <c:forEach var="city" items="${requestScope.get('list')}" varStatus="status">
                    <tr>
                        <td>${city.id}</td>
                        <td>${city.name}</td>
                        <td>${city.countrycode}</td>
                        <td>${city.district}</td>
                        <td>${city.population}</td>
                        <td>
                            <a href="<%=appPath%>/city/toUpdateCity?id=${city.id}">更改</a> |
                            <a href="<%=appPath%>/city/del/${city.id}">删除</a>
                        </td>
                    </tr>
                </c:forEach>
                </tbody>
            </table>
            <tr align="left">
                <td>
                    <div style="line-height: 20px;height: 20px;text-align: center;font-size: 18px ">
                        共 [ ${page.pages} ] 条记录,共 [ ${page.pages/page.size} ] 页

                        <c:if test="${ page.pageNum > 1 }">
                            [ <A href="<%=appPath%>/city/allCity?pageNum=${page.pageNum-1}">前一页</A> ]
                        </c:if>
                        <c:if test="${ page.pageNum <=1 }">
                            [ 前一页 ]
                        </c:if>
                        ,当前第 [ ${page.pageNum} ] 页
                        <c:if test="${ page.pageNum < page.pages/page.size }">
                            ,[ <A href="<%=appPath%>/city/allCity?pageNum=${page.pageNum+1}">后一页</A> ]
                        </c:if>
                        <c:if test="${ page.pageNum >= page.pages/page.size }">
                            [ 后一页 ]
                        </c:if>
                    </div>
                    </td>
            </tr>
            <br>
            <br>
            <br>
            
        </div>
    </div>
</div>
</body>
</html>