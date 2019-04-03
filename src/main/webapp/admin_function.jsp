<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ include file="header.jsp"%>

<body class="gray-bg">
<div class="row  border-bottom white-bg dashboard-header">
    <div class="col-sm-12">
        <div class="ibox float-e-margins">
            <div class="ibox-title">
                <h5>功能管理</h5>
            </div>
            <div class="ibox-content">
                <ul>
                    <li>
                        <span>学生选题功能 状态：${sst==0?"关闭":"开启"}</span>
                        <a href="${path}/function/stuSelectTitleManage?enabled=1" class="btn btn-xs btn-info">启用</a>
                        <a href="${path}/function/stuSelectTitleManage?enabled=0" class="btn btn-xs btn-info">关闭</a>
                    </li>
                </ul>
            </div>
        </div>
    </div>

</div>





<!-- 全局js -->
<script src="js/jquery.min.js?v=2.1.4"></script>
<script src="js/bootstrap.min.js?v=3.3.6"></script>
<script src="js/plugins/layer/layer.min.js"></script>

<!-- 自定义js -->
<script src="js/content.js"></script>

<!-- 欢迎信息 -->
<script src="js/welcome.js"></script>
</body>

</html>
