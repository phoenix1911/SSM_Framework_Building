<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ include file="header.jsp"%>

<body class="gray-bg">
    <div class="row  border-bottom white-bg dashboard-header">
        <div class="col-sm-5">
            <div class="ibox float-e-margins">
                <div class="ibox-title">
                    <h5>功能介绍</h5>
                </div>
                <div class="ibox-content">
                    <h4>Spring Security安全权限控制</h4>
                    <ul>
                        <li>使用spring security来控制权限有用户-角色-资原三张表及两张关联表，控制用户登陆退出 权限控制 密码加密等操作 </li>
                    </ul>
                    <h4>系统缓存</h4>
                    <ul>
                        <li>
                            使用redis数据库做缓存 具体实现使用spring-data-redis jedis实现 。系统第一次查询结果序列化保存在redis数据库里 第二次查询通过缓存反序列化出对象
                        </li>
                        <li>增加 修改 删除 操作时刷新缓存</li>
                    </ul>
                    <h4>管理员模块</h4>
                    <ul>
                        <li>学生、教师信息维护：对学生 教师进行增删改查操作 ，另外加入excel批量导入功能 使用poi来通过java读取excel文件并生成对象。查找操作使用jquery datatables实现 分页 多条件查询等查询功能</li>
                        <li>文件上传下载：系统多处涉及到文件上传下载 使用spring mvc文件上传解析器实现</li>
                        <li>用户-角色信息查看</li>
                        <li>角色-资源信息查看</li>
                        <li>功能维护：管理系统功能是否开启，例如学生选题功能开启关系</li>
                        <li>公告维护：维护网站概览及公告信息</li>
                    </ul>







                </div>
            </div>
        </div>
        <div class="col-sm-6">
            <div class="ibox float-e-margins">

                <div class="ibox-content">

                    <h4>学生模块</h4>
                    <ul>
                        <li>公告模块：查看消息公告</li>
                        <li>学生选题，取消选题，重新选题 </li>
                        <li>学生查看题目要求，阶段要求等页面</li>
                        <li>学生上传开题报告，中期报告，说明书模块，下载模板</li>
                        <li>周报模块：查看周报，新增周报，查看教师评论</li>
                    </ul>
                    <h4>教师管理</h4>
                    <ul>
                        <li>新增论文题目 修改题目 删除题目</li>
                        <li>查看题目信息 选题学生信息</li>
                        <li>查看学生进度  审核功能 文件下载查看学生上传的文件</li>
                        <li>查看学生周报 评价功能</li>
                    </ul>


                </div>
            </div>
        </div>
    </div>

    <div class="wrapper wrapper-content">
        <div class="row">
            <div class="col-sm-3">
            <div class="ibox float-e-margins">
                <div class="ibox-title">
                    <h5>后台技术列表</h5>
                </div>
                <div class="ibox-content">
                    <ul>
                        <li>Spring</li>
                        <li>SpringMVC</li>
                        <li>Mybatis</li>
                        <li>Mybatis generator 逆向工程</li>
                        <li>spring data redis 做缓存 </li>
                        <li>jedis 缓存</li>
                        <li>spring security 安全验证</li>
                        <li>POI 操作Excle文件</li>
                        <li></li>
                    </ul>
                </div>
            </div>
            </div>
            <div class="col-sm-3">
                <div class="ibox float-e-margins">
                    <div class="ibox-title">
                        <h5>前台技术列表</h5>
                    </div>
                    <div class="ibox-content">
                        <ul>
                            <li>HTML5</li>
                            <li>css</li>
                            <li>bootstrap前端框架</li>
                            <li>layout弹出层</li>
                            <li>dataTables 表插件</li>
                            <li></li>
                        </ul>
                    </div>
                </div>
            </div>
            <div class="col-sm-3">
                <div class="ibox float-e-margins">
                    <div class="ibox-title">
                        <h5>数据库</h5>
                    </div>
                    <div class="ibox-content">
                        <ul>
                            <li>MySQL</li>
                            <li>redis</li>
                        </ul>
                    </div>
                </div>
            </div>
            <div class="col-sm-3">
                <div class="ibox float-e-margins">
                    <div class="ibox-title">
                        <h5>其他</h5>
                    </div>
                    <div class="ibox-content">
                        <h6>版本管理</h6>
                        <ul>
                            <li>github</li>
                        </ul>
                        <h6>开发工具</h6>
                        <ul>
                            <li>IDEA</li>
                            <li>PowerDesigner</li>
                            <li>Navicat</li>
                        </ul>
                        <h6>服务器</h6>
                        <ul>
                            <li>tomcat8</li>
                        </ul>
                    </div>
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
<%--    <script>--%>
<%--        <c:if test="${message!=''}">--%>
<%--        alert("${message}");--%>
<%--        </c:if>--%>
<%--    </script>--%>
    <!-- 欢迎信息 -->
    <script src="js/welcome.js"></script>
</body>

</html>
