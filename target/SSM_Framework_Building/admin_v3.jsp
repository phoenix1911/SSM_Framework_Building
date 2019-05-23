<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>

<%@ include file="header.jsp"%>
<body class="gray-bg">
<div class="wrapper wrapper-content animated fadeInRight">
    <div class="row">
        <div class="col-sm-12">
            <div class="ibox float-e-margins">
                <div class="ibox-title">
                    <h5>教师基本信息</h5>
                    <div class="ibox-tools">
                        <a class="collapse-link">
                            <i class="fa fa-chevron-up"></i>
                        </a>
                        <a class="dropdown-toggle" data-toggle="dropdown" href="table_data_tables.html#">
                            <i class="fa fa-wrench"></i>
                        </a>
                        <ul class="dropdown-menu dropdown-user">
                            <li><a href="table_data_tables.html#">选项1</a>
                            </li>
                            <li><a href="table_data_tables.html#">选项2</a>
                            </li>
                        </ul>
                        <a class="close-link">
                            <i class="fa fa-times"></i>
                        </a>
                    </div>
                </div>
                <div class="ibox-content">
                    <div class="">
                        <a href="${path}/admin_v3_add.jsp" class="btn btn-info" id="upload">添加教师</a>
                    </div>
                    <table class="table table-striped table-bordered table-hover dataTables-example">
                        <thead>
                        <tr>
                            <th>教师编号</th>
                            <th>姓名</th>
                            <th>电话</th>
                            <th>办公地址</th>
                            <th>教师类型</th>
                            <th>是否上传题目</th>
                            <th>编辑</th>

                        </tr>
                        </thead>
                        <tbody>
                        <c:forEach var="teacher" items="${requestScope.get('list')}" varStatus="status">
                        <tr class="gradeX">
                            <th>${teacher.tid}</th>
                            <th>${teacher.tname}</th>
                            <th>${teacher.tphonenumber}</th>
                            <th>${teacher.address}</th>
                            <th>${teacher.type==0?"校内老师":"校外老师"}</th>
                            <th>${empty teacher.isuploadtopic?"未上传":"已上传"}</th>
                            <th>
                                <a href="${path}/admin/teacher/toUpdate?tid=${teacher.tid}" class="btn">修改</a>
                                <a href="${path}/admin/teacher/del?tid=${teacher.tid}" class="btn">删除</a>
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
            <%--title: '添加教师',--%>
            <%--maxmin: true,--%>
            <%--shadeClose: true, //点击遮罩关闭层--%>
            <%--area : ['800px' , '520px'],--%>
            <%--content: '${path}/admin_v3_add.jsp'--%>
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
<script>
    <c:if test="${message!=''}">
    alert("${message}");
    </c:if>
</script>
</body>

</html>