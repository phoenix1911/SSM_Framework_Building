<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ include file="header.jsp"%>


<body class="gray-bg">
<div class="row">
    <div class="col-sm-12">
        <div class="wrapper wrapper-content">
            <div class="row animated fadeInRight">
                <div class="col-sm-12">
                    <div class="ibox float-e-margins">

                        <div class="" id="ibox-content">

                            <div id="vertical-timeline" class="vertical-container light-timeline">

                                <div class="vertical-timeline-block">
                                    <div class="vertical-timeline-icon navy-bg">
                                        <i class="fa fa-briefcase"></i>
                                    </div>
                                    <div class="vertical-timeline-content">
                                        <h2>第一时间段 &nbsp;&nbsp;<small> 2018-12-24 至 2018-12-31</small></h2>
                                        <p>
                                            学生选题，确定校内外指导教师，与指导教师联系沟通，明确毕业设计的具体任务和要求。
                                        </p>
                                        <a href="${path}/stu/weekly/toCalendar" class="btn btn-sm btn-primary"> 填写周报</a>
                                    </div>
                                </div>

                                <div class="vertical-timeline-block">
                                    <div class="vertical-timeline-icon navy-bg">
                                        <i class="fa fa-briefcase"></i>
                                    </div>
                                    <div class="vertical-timeline-content">
                                        <h2>第二时间段 &nbsp;&nbsp;<small>2019-01-01 至 2019-01-31</small></h2>
                                        <p>
                                            掌握文献查阅方法，通过查阅资料，完成开题报告。在系统中完成开题报告提交，等待指导教师审核。
                                        </p>
                                        <a href="${path}/stu/weekly/toCalendar" class="btn btn-sm btn-primary"> 填写周报</a>
                                    </div>
                                </div>

                                <div class="vertical-timeline-block">
                                    <div class="vertical-timeline-icon navy-bg">
                                        <i class="fa fa-briefcase"></i>
                                    </div>
                                    <div class="vertical-timeline-content">
                                        <h2>第三时间段 &nbsp;&nbsp;<small>2019-02-01 至 2019-02-17</small></h2>
                                        <p>
                                            技术可行性分析，完善系统需求分析并确认系统功能。数据库设计，确定表之间关系并实现相关数据约束。完成基础数据录入或采集，整理数据关系，绘制e-r图。
                                        </p>
                                        <a href="${path}/stu/weekly/toCalendar" class="btn btn-sm btn-primary"> 填写周报</a>
                                    </div>
                                </div>

                                <div class="vertical-timeline-block">
                                    <div class="vertical-timeline-icon navy-bg">
                                        <i class="fa fa-briefcase"></i>
                                    </div>
                                    <div class="vertical-timeline-content">
                                        <h2>第四时间段 &nbsp;&nbsp;<small>2019-02-18 至 2019-03-31</small></h2>
                                        <p>
                                            完成前台页面设计，并实现系统基本功能。
                                        </p>
                                        <a href="${path}/stu/weekly/toCalendar" class="btn btn-sm btn-primary"> 填写周报</a>
                                    </div>
                                </div>

                                <div class="vertical-timeline-block">
                                    <div class="vertical-timeline-icon navy-bg">
                                        <i class="fa fa-briefcase"></i>
                                    </div>
                                    <div class="vertical-timeline-content">
                                        <h2>第五时间段 &nbsp;&nbsp;<small>2019-04-01 至 2019-04-07</small></h2>
                                        <p>
                                            完成中期检查报告并在系统中提交报告，等待审核。
                                        </p>
                                        <a href="${path}/stu/weekly/toCalendar" class="btn btn-sm btn-primary"> 填写周报</a>
                                    </div>
                                </div>

                                <div class="vertical-timeline-block">
                                    <div class="vertical-timeline-icon navy-bg">
                                        <i class="fa fa-briefcase"></i>
                                    </div>
                                    <div class="vertical-timeline-content">
                                        <h2>第六时间段 &nbsp;&nbsp;<small>2019-04-08 至 2019-05-12</small></h2>
                                        <p>
                                            完成所有编码，系统联调，测试，功能修改与完善。撰写毕业设计说明书。
                                        </p>
                                        <a href="${path}/stu/weekly/toCalendar" class="btn btn-sm btn-primary"> 填写周报</a>
                                    </div>
                                </div>


                                <div class="vertical-timeline-block">
                                    <div class="vertical-timeline-icon navy-bg">
                                        <i class="fa fa-briefcase"></i>
                                    </div>
                                    <div class="vertical-timeline-content">
                                        <h2>第七时间段 &nbsp;&nbsp;<small>2019-05-13 至 2019-06-09</small></h2>
                                        <p>
                                            完成设计说明书,外文翻译，准备答辩材料。
                                        </p>
                                        <a href="${path}/stu/weekly/toCalendar" class="btn btn-sm btn-primary"> 填写周报</a>
                                    </div>
                                </div>


                                <div class="vertical-timeline-block">
                                    <div class="vertical-timeline-icon navy-bg">
                                        <i class="fa fa-briefcase"></i>
                                    </div>
                                    <div class="vertical-timeline-content">
                                        <h2>第八时间段 &nbsp;&nbsp;<small>2019-06-10 至 2019-06-23</small></h2>
                                        <p>
                                            毕业设计答辩，提交归档所需毕业设计资料。
                                        </p>
                                        <a href="${path}/stu/weekly/toCalendar" class="btn btn-sm btn-primary"> 填写周报</a>
                                    </div>
                                </div>




                            </div>

                        </div>
                    </div>
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


<script>
    $(document).ready(function () {

        // Local script for demo purpose only
        $('#lightVersion').click(function (event) {
            event.preventDefault()
            $('#ibox-content').removeClass('ibox-content');
            $('#vertical-timeline').removeClass('dark-timeline');
            $('#vertical-timeline').addClass('light-timeline');
        });

        $('#darkVersion').click(function (event) {
            event.preventDefault()
            $('#ibox-content').addClass('ibox-content');
            $('#vertical-timeline').removeClass('light-timeline');
            $('#vertical-timeline').addClass('dark-timeline');
        });

        $('#leftVersion').click(function (event) {
            event.preventDefault()
            $('#vertical-timeline').toggleClass('center-orientation');
        });


    });
</script>
<%--<script>--%>
<%--    <c:if test="${message!=''}">--%>
<%--    alert("${message}");--%>
<%--    </c:if>--%>
<%--</script>--%>
<script type="text/javascript" src="http://tajs.qq.com/stats?sId=9051096" charset="UTF-8"></script>
<!--统计代码，可删除-->
</body>

</html>
