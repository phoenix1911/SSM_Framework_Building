<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>

<%@ include file="header.jsp"%>
<body class="gray-bg">
<div class="wrapper wrapper-content animated fadeInRight">
    <div class="row">
        <div class="col-sm-12">
            <div class="ibox float-e-margins">
                <div class="ibox-title">
                    <h5>用户-角色信息</h5>
                </div>
                <div class="ibox-content">

                    <table class="table table-striped table-bordered table-hover dataTables-example">
                        <thead>
                        <tr>
                            <th>ID</th>
                            <th>角色</th>
                            <th>用户</th>
                            <th>密码（仅作为毕设演示）</th>
                            <th>状态</th>
                        </tr>
                        </thead>
                        <tbody>
                        <c:forEach var="ur" items="${requestScope.get('ur')}" varStatus="status">
                            <tr class="gradeX">
                                <th>${ur.id}</th>
                                <th>${ur.role.roleNameZh}</th>
                                <th>${ur.users.username}</th>
                                <th>${ur.users.password}</th>
                                <th>
                                    <c:choose>
                                        <c:when test="${ur.users.enabled}">
                                           正常
                                        </c:when>
                                        <c:when test="${!ur.users.enabled}">
                                            不可用
                                        </c:when>
                                    </c:choose>

                                </th>
                            </tr>
                        </c:forEach>
                        </tbody>

                    </table>

                </div>
            </div>
        </div>
    </div>

</div>

<!-- 全局js -->
<script src="${path}/js/jquery.min.js?v=2.1.4"></script>
<script src="${path}/js/bootstrap.min.js?v=3.3.6"></script>



<script src="${path}/js/plugins/jeditable/jquery.jeditable.js"></script>

<!-- Data Tables -->
<script src="${path}/js/plugins/dataTables/jquery.dataTables.js"></script>
<script src="${path}/js/plugins/dataTables/dataTables.bootstrap.js"></script>

<!-- 自定义js -->
<script src="${path}/js/content.js?v=1.0.0"></script>

<%--layer插件--%>
<%--<script src="${path}/js/plugins/layer/layer.min.js"></script>--%>
<%--<script>--%>
<%--$('#upload').on('click', function(){--%>
<%--layer.open({--%>
<%--type: 2,--%>
<%--title: '添加学生',--%>
<%--maxmin: true,--%>
<%--shadeClose: true, //点击遮罩关闭层--%>
<%--area : ['800px' , '520px'],--%>
<%--content: '${path}/admin_v2_add.jsp'--%>
<%--});--%>
<%--});--%>
<%--</script>--%>
<!-- 分页插件 -->
<script>
    $(document).ready(function () {
        $('.dataTables-example').dataTable();

        /* Init DataTables */
        var oTable = $('#editable').dataTable();

        /* Apply the jEditable handlers to the table */
        oTable.$('td').editable('../example_ajax.php', {
            "callback": function (sValue, y) {
                var aPos = oTable.fnGetPosition(this);
                oTable.fnUpdate(sValue, aPos[0], aPos[1]);
            },
            "submitdata": function (value, settings) {
                return {
                    "row_id": this.parentNode.getAttribute('id'),
                    "column": oTable.fnGetPosition(this)[2]
                };
            },
            "width": "90%",
            "height": "100%"
        });
    });
</script>

</body>

</html>