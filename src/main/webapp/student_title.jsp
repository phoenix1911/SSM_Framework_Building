<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>

<%@ include file="header.jsp"%>
<body class="gray-bg">
<div class="wrapper wrapper-content animated fadeInRight">
    <div class="row">
        <div class="col-sm-12">
            <div class="ibox float-e-margins">
                <div class="ibox-title">
                    <h5>毕业设计题目管理</h5>

                </div>
                <div class="ibox-content">

                    <table class="table table-striped table-bordered table-hover dataTables-example">
                        <thead>
                        <tr>
                            <th>毕设题目</th>
                            <th>毕设任务书</th>
                            <th>毕设开题报告</th>
                            <th>毕设中期报告</th>
                            <th>毕设说明书</th>
                            <th>操作</th>
                        </tr>
                        </thead>
                        <tbody>
                        <tr class="gradeX">
                            <th>${title.title}</th>

                            <th>
                                <c:choose>
                                    <c:when test="${title.rwsstate=='已上传'}">
                                        <a href="${path}/stu/title/download?type=rws" class="btn btn-info btn-xs">查看</a>
                                    </c:when>
                                </c:choose>
                            </th>

                            <th>
                                <c:choose>
                                    <c:when test="${title.ktbgstate=='未上传'}">
                                        <a href="${path}/stu/title/toUpload" class="btn btn-info btn-xs">上传</a>
                                    </c:when>
                                    <c:when test="${title.ktbgstate=='已上传'}">
                                        <a href="${path}/stu/title/download?type=ktbg" class="btn btn-info btn-xs">查看</a> &nbsp 状态：待审批
                                    </c:when>
                                    <c:when test="${title.ktbgstate=='审批通过'}">
                                        <a href="${path}/stu/title/download?type=ktbg" class="btn btn-info btn-xs">查看</a> &nbsp 状态：审批通过
                                    </c:when>
                                    <c:when test="${title.ktbgstate=='审批未通过'}">
                                        审批未通过 &nbsp <a href="${path}/stu/title/toUpload" class="btn btn-info btn-xs">重新上传</a>
                                    </c:when>
                            </c:choose>
                            </th>

                            <th>
                                <c:choose>
                                    <c:when test="${title.zqbgstate=='未上传'}">
                                        <a href="${path}/stu/title/toUpload" class="btn btn-info btn-xs">上传</a>
                                    </c:when>
                                    <c:when test="${title.zqbgstate=='已上传'}">
                                        <a href="${path}/stu/title/download?type=zqbg" class="btn btn-info btn-xs">查看</a> &nbsp 状态：待审批
                                    </c:when>
                                    <c:when test="${title.zqbgstate=='审批通过'}">
                                        <a href="${path}/stu/title/download?type=zqbg" class="btn btn-info btn-xs">查看</a> &nbsp 状态：审批通过
                                    </c:when>
                                    <c:when test="${title.zqbgstate=='审批未通过'}">
                                        审批未通过 &nbsp <a href="${path}/stu/titletoUpload" class="btn btn-info btn-xs">重新上传</a>
                                    </c:when>
                                </c:choose>
                            </th>

                            <th>
                                <c:choose>
                                    <c:when test="${title.smsstate=='未上传'}">
                                        <a href="${path}/stu/title/toUpload" class="btn btn-info btn-xs">上传</a>
                                    </c:when>
                                    <c:when test="${title.smsstate=='已上传'}">
                                        <a href="${path}/stu/title/download?type=sms" class="btn btn-info btn-xs">查看</a> &nbsp 状态：待审批
                                    </c:when>
                                    <c:when test="${title.smsstate=='审批通过'}">
                                        <a href="${path}/stu/title/download?type=sms" class="btn btn-info btn-xs">查看</a> &nbsp 状态：审批通过
                                    </c:when>
                                    <c:when test="${title.smsstate=='审批未通过'}">
                                        审批未通过 &nbsp <a href="${path}/stu/title/toUpload" class="btn btn-info btn-xs">重新上传</a>
                                    </c:when>
                                </c:choose>
                            </th>

                            <th>
                                <a href="${path}/stu/weekly/toWeekly" class="btn btn-primary btn-xs">周报管理</a>
                                <a href="${path}/stu/title/toUpload" class="btn btn-primary btn-xs">文件管理</a>
                            </th>
                        </tr>
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



</body>

</html>