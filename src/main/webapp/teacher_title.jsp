<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>

<%@ include file="header.jsp"%>
<body class="gray-bg">
<div class="wrapper wrapper-content animated fadeInRight">
    <div class="row">
        <div class="col-sm-12">
            <div class="ibox float-e-margins">
                <div class="ibox-title">
                    <h5>毕业设计列表</h5>
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
                        <a href="${path}/tea/title/toAdd" class="btn btn-info" id="upload">添加毕设题目</a>
                    </div>
                    <table class="table table-striped table-bordered table-hover dataTables-example">
                        <thead>
                        <tr>
                            <th>ID</th>
                            <th>毕设题目</th>
                            <th>选题学生</th>
                            <th>毕设任务书</th>
                            <th>毕设开题报告</th>
                            <th>毕设中期报告</th>
                            <th>毕设说明书</th>
                            <th>操作</th>
                        </tr>
                        </thead>
                        <tbody>
                        <c:forEach var="title" items="${requestScope.get('list')}" varStatus="status">
                        <tr class="gradeX">
                            <th>${title.id}</th>
                            <th>${title.title}</th>
                            <th>选题学生</th>
                            <th>${title.isuploadrws==0?"<a>上传</a>":"<a>查看</a><br><a>修改</a>"}</th>
                            <th>${title.isuploadktbg==0?"未上传":"<a>下载</a><br><a>审批</a>"}</th>
                            <th>${title.isuploadzqbg==0?"未上传":"<a>下载</a><br><a>审批</a>"}</th>
                            <th>${title.isuploadsms==0?"未上传":"<a>下载</a><br><a>审批</a>"}</th>
                            <th>
                                <a href="${path}/tea/title/toUpdate?id=${title.id}" class="btn">修改</a>
                                <a href="${path}/tea/title/del?id=${title.id}" class="btn">删除</a>
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