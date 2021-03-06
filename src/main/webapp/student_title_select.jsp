<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ include file="header.jsp"%>
<body class="gray-bg">
<div class="wrapper wrapper-content animated fadeInRight">
    <div class="row">
        <div class="col-sm-12">
            <div class="ibox float-e-margins">
                <div class="ibox-title">
                    <h5>毕业设计列表 <p style="text-align: right"><a href="${path}/stu/title/TitleCancelSelect" class=" btn btn-success btn-xl">取消当前选题</a></p></h5>
                </div>

                <div class="ibox-content">

                    <table class="table table-striped table-bordered table-hover dataTables-example">
                        <thead>
                        <tr>
                            <th>ID</th>
                            <th>毕设题目</th>
                            <th>毕设任务书</th>
                            <th>操作</th>
                        </tr>
                        </thead>
                        <tbody>
                        <c:forEach var="title" items="${requestScope.get('list')}" varStatus="status">
                            <tr class="gradeX">
                                <th>${title.id}</th>
                                <th>${title.title}</th>
                                <th><a href="${path}/tea/title/download?id=${title.id}&type=rws" class="btn btn-info btn-xs">查看任务书</a></th>
<%--                                <th>${message}</th>--%>

                                <c:choose>
                                    <c:when test="${selectstatus=='当前已选题目'}">
                                        <th>当前已选题目</th>
                                    </c:when>
                                    <c:when test="${selectstatus=='未选题'}">
                                        <th><a href="${path}/stu/title/TitleSelect?id=${title.id}" class="btn btn-success btn-xs">选题</a></th>
                                    </c:when>
                                </c:choose>


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

<%--<script>--%>
<%--    <c:if test="${message!=null}">--%>
<%--    alert("${message}");--%>
<%--    </c:if>--%>
<%--</script>--%>


<script src="${path}/js/plugins/jeditable/jquery.jeditable.js"></script>

<!-- Data Tables -->
<script src="${path}/js/plugins/dataTables/jquery.dataTables.js"></script>
<script src="${path}/js/plugins/dataTables/dataTables.bootstrap.js"></script>

<!-- 自定义js -->
<script src="${path}/js/content.js?v=1.0.0"></script>

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