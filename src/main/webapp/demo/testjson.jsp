<%--
  User: TJL Date: 2018/12/18  Time: 16:29
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://"
            + request.getServerName() + ":" + request.getServerPort()
            + path + "/";
%>
<html>
<head>
    <title>testjson</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    </head>
<body>
<div class="container">
    <div class="row clearfix">
        <div class="col-md-12 column">
            <div class="page-header">
                <h1>
                    testjson
                </h1>
            </div>
        </div>
    </div>

    <div class="row clearfix">
        <div class="col-md-12 column">
            <div class="page-header">

                <h5>
                    ${jsonstring}

                </h5>
                <h6>
                    <small>testjson</small>
                    ${json}
                    ${jsonstring}
                    <c:forEach var="city" items="${requestScope.get('citys')}" varStatus="status">
                        <tr>
                            <td>${city}<br></td>
                        </tr>
                    </c:forEach>
                </h6>

            </div>
        </div>
    </div>

</div>
</body>
</html>