<%--
  Created by IntelliJ IDEA.
  User: su
  Date: 2019/3/27
  Time: 15:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:set var="ctx" value="${pageContext.request.contextPath}"></c:set>
<!DOCTYPE html>
<html>

<head>

    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">

    <title>H+ 后台主题UI框架 - 数据表格</title>

    <link rel="shortcut icon" href="favicon.ico">
    <link href="${ctx}/css/bootstrap.min.css?v=3.3.6" rel="stylesheet">
    <link href="${ctx}/css/font-awesome.css?v=4.4.0" rel="stylesheet">

    <!-- Data Tables -->
    <link href="${ctx}/css/plugins/dataTables/dataTables.bootstrap.css" rel="stylesheet">

    <link href="${ctx}/css/animate.css" rel="stylesheet">
    <link href="${ctx}/css/style.css?v=4.1.0" rel="stylesheet">

</head>

<body class="gray-bg">
<div class="wrapper wrapper-content animated fadeInRight">
    <div class="row">
        <div class="col-sm-12">
            <div class="ibox float-e-margins">
                <div class="ibox-title">
                    <button type="button" class="btn btn-primary">添加</button>
                    <button type="button" class="btn btn-warning">修改</button>
                    <button type="button" class="btn btn-danger">删除</button>
                    <div class="ibox-tools">
                        <a class="collapse-link">
                            <i class="fa fa-chevron-up"></i>
                        </a>
                        <a class="dropdown-toggle" data-toggle="dropdown" href="table_data_tables.html#">
                            <i class="fa fa-wrench"></i>
                        </a>
                        <ul class="dropdown-menu dropdown-user">
                            <li><a href="table_data_tables.html#">全选</a>
                            </li>
                            <li><a href="table_data_tables.html#">全不选</a>
                            </li>
                        </ul>
                        <a class="close-link">
                            <i class="fa fa-times"></i>
                        </a>
                    </div>
                </div>
                <div class="ibox-content">
                    <table class="table table-striped table-bordered table-hover dataTables-example">
                        <thead>
                        <tr>
                            <th style="width: 30px;" class="text-center"></th>
                            <th>商品编号</th>
                            <th>商品名称</th>
                            <th>类别</th>
                            <th>单价</th>
                            <th>单位</th>
                            <th>说明</th>
                        </tr>
                        </thead>
                        <tbody>
                        <tr class="gradeX">
                            <td class="text-center"><input type="checkbox"/></td>
                            <td>12001</td>
                            <td>萝卜</td>
                            <td>蔬菜</td>
                            <td class="center">5.8</td>
                            <td class="center">公斤</td>
                            <td class="center">无</td>
                        </tr>
                        <tr class="gradeC">
                            <td><input type="checkbox"/></td>
                            <td>12002</td>
                            <td>黄瓜</td>
                            <td>蔬菜</td>
                            <td class="center">5.8</td>
                            <td class="center">公斤</td>
                            <td class="center">好黄瓜</td>
                        </tr>
                        <tr class="gradeA">
                            <td><input type="checkbox"/></td>
                            <td>12003</td>
                            <td>西红柿</td>
                            <td>蔬菜</td>
                            <td class="center">5.8</td>
                            <td class="center">公斤</td>
                            <td class="center">无</td>
                        </tr>
                        </tbody>
                        <tfoot>
                        <tr>
                            <th></th>
                            <th>商品编号</th>
                            <th>商品名称</th>
                            <th>类别</th>
                            <th>单价</th>
                            <th>单位</th>
                            <th>说明</th>
                        </tr>
                        </tfoot>
                    </table>

                </div>
            </div>
        </div>
    </div>
</div>

<!-- 全局js -->
<script src="${ctx}/js/jquery.min.js?v=2.1.4"></script>
<script src="${ctx}/js/bootstrap.min.js?v=3.3.6"></script>



<script src="${ctx}/js/plugins/jeditable/jquery.jeditable.js"></script>

<!-- Data Tables -->
<script src="${ctx}/js/plugins/dataTables/jquery.dataTables.js"></script>
<script src="${ctx}/js/plugins/dataTables/dataTables.bootstrap.js"></script>

<!-- 自定义js -->
<script src="${ctx}/js/content.js?v=1.0.0"></script>


<!-- Page-Level Scripts -->
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

    function fnClickAddRow() {
        $('#editable').dataTable().fnAddData([
            "Custom row",
            "New row",
            "New row",
            "New row",
            "New row"]);

    }
</script>


</body>

</html>
