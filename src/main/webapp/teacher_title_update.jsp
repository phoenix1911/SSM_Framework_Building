<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ include file="header.jsp"%>

<body class="gray-bg">
<div class="wrapper wrapper-content animated fadeInRight">
    <div class="row">
        <div class="col-sm-6">
            <div class="ibox float-e-margins">
                <div class="ibox-title">
                    <h5>修改论文信息</h5>
                    <div class="ibox-tools">
                        <a class="collapse-link">
                            <i class="fa fa-chevron-up"></i>
                        </a>
                        <a class="dropdown-toggle" data-toggle="dropdown" href="form_basic.html#">
                            <i class="fa fa-wrench"></i>
                        </a>
                        <ul class="dropdown-menu dropdown-user">
                            <li><a href="form_basic.html#">选项1</a>
                            </li>
                            <li><a href="form_basic.html#">选项2</a>
                            </li>
                        </ul>
                        <a class="close-link">
                            <i class="fa fa-times"></i>
                        </a>
                    </div>
                </div>
                <div class="ibox-content">

                        <form action="${path}/tea/title/update" method="post" enctype="multipart/form-data" class="form-horizontal m-t" id="commentForm">

                            <div class="form-group">
                                <label class="col-sm-3 control-label">论文编号：</label>
                                <div class="col-sm-8">
                                    <input id="id" readonly value="${title.id}" name="id" minlength="10" type="text" class="form-control" required="" aria-required="true">
                                 </div>
                            </div>

                            <div class="form-group">
                                <label class="col-sm-3 control-label">毕业设计题目：</label>
                                <div class="col-sm-8">
                                    <input id="cid"  name="title" value="${title.title}" type="text" class="form-control" required="" aria-required="true">
                                </div>
                            </div>

                            <div class="form-group">
                                <label class="col-sm-3 control-label">选择文件：</label>
                                <div class="col-sm-8">
                                    <input  name="uploadfile" type="file" class="form-control" required="" aria-required="true">
                                </div>
                            </div>

                            <div class="form-group">
                                <div class="col-sm-4 col-sm-offset-3">
                                    <button class="btn btn-primary" type="submit">提交</button>
                                </div>
                            </div>

                        </form>

                </div>
            </div>

        </div>
    </div>

</div>


<!-- 全局js -->
<script src="js/jquery.min.js?v=2.1.4"></script>
<script src="js/bootstrap.min.js?v=3.3.6"></script>

<!-- 自定义js -->
<script src="js/content.js?v=1.0.0"></script>

<!-- jQuery Validation plugin javascript-->
<script src="js/plugins/validate/jquery.validate.min.js"></script>
<script src="js/plugins/validate/messages_zh.min.js"></script>

<script src="js/demo/form-validate-demo.js"></script>



</body>

</html>
