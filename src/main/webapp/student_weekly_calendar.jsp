<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>

<!DOCTYPE html>
<html>

<head>

    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">


    <title>H+ 后台主题UI框架 - 日历</title>
    <meta name="keywords" content="H+后台主题,后台bootstrap框架,会员中心主题,后台HTML,响应式后台">
    <meta name="description" content="H+是一个完全响应式，基于Bootstrap3最新版本开发的扁平化主题，她采用了主流的左右两栏式布局，使用了Html5+CSS3等现代技术">

    <link rel="shortcut icon" href="${path}/img/favicon.ico">
    <link href="${path}/css/bootstrap.min.css?v=3.3.6" rel="stylesheet">
    <link href="${path}/css/font-awesome.css?v=4.4.0" rel="stylesheet">

    <link href="${path}/css/plugins/iCheck/custom.css" rel="stylesheet">

    <link href="${path}/css/plugins/fullcalendar/fullcalendar.css" rel="stylesheet">
    <link href="${path}/css/plugins/fullcalendar/fullcalendar.print.css" rel="stylesheet">

    <link href="${path}/css/animate.css" rel="stylesheet">
    <link href="${path}/css/style.css?v=4.1.0" rel="stylesheet">

</head>

<body class="gray-bg">
<div class="wrapper wrapper-content">
    <div class="row animated fadeInDown">

        <div class="col-sm-12">
            <div class="ibox float-e-margins">
                <div class="ibox-title">
                    <h5>FullCalendar示例 </h5>

                </div>
                <div class="ibox-content">
                    <div id="calendar"></div>
                </div>
            </div>
        </div>
    </div>
</div>


<!-- 全局js -->
<script src="${path}/js/jquery.min.js?v=2.1.4"></script>
<script src="${path}/js/bootstrap.min.js?v=3.3.6"></script>

<!-- 自定义js -->
<script src="${path}/js/content.js?v=1.0.0"></script>

<script src="${path}/js/jquery-ui.custom.min.js"></script>

<!-- iCheck -->
<script src="${path}/js/plugins/iCheck/icheck.min.js"></script>

<!-- Full Calendar -->
<script src="${path}/js/plugins/fullcalendar/fullcalendar.min.js"></script>

<script>
    $(document).ready(function () {

        $('.i-checks').iCheck({
            checkboxClass: 'icheckbox_square-green',
            radioClass: 'iradio_square-green',
        });

        /* initialize the external events
         -----------------------------------------------------------------*/

        $('#external-events div.external-event').each(function () {

            // create an Event Object (http://arshaw.com/fullcalendar/docs/event_data/Event_Object/)
            // it doesn't need to have a start or end
            var eventObject = {
                title: $.trim($(this).text()) // use the element's text as the event title
            };

            // store the Event Object in the DOM element so we can get to it later
            $(this).data('eventObject', eventObject);

            // make the event draggable using jQuery UI
            $(this).draggable({
                zIndex: 999,
                revert: true, // will cause the event to go back to its
                revertDuration: 0 //  original position after the drag
            });

        });


        /* initialize the calendar
         -----------------------------------------------------------------*/
        var date = new Date();
        var d = date.getDate();
        var m = date.getMonth();
        var y = date.getFullYear();

        $('#calendar').fullCalendar({
            header: {
                left: 'prev,next',
                center: 'title',
                right: 'month,agendaWeek,agendaDay'
            },
            editable: true,
            droppable: true, // this allows things to be dropped onto the calendar !!!
            drop: function (date, allDay) { // this function is called when something is dropped

                // retrieve the dropped element's stored Event Object
                var originalEventObject = $(this).data('eventObject');

                // we need to copy it, so that multiple events don't have a reference to the same object
                var copiedEventObject = $.extend({}, originalEventObject);

                // assign it the date that was reported
                copiedEventObject.start = date;
                copiedEventObject.allDay = allDay;

                // render the event on the calendar
                // the last `true` argument determines if the event "sticks" (http://arshaw.com/fullcalendar/docs/event_rendering/renderEvent/)
                $('#calendar').fullCalendar('renderEvent', copiedEventObject, true);

                // is the "remove after drop" checkbox checked?
                if ($('#drop-remove').is(':checked')) {
                    // if so, remove the element from the "Draggable Events" list
                    $(this).remove();
                }

            },
            events: [
                {
                    title: '日事件',
                    start: new Date(y, m, 1)
                },
                {
                    title: '长事件',
                    start: new Date(y, m, d - 5),
                    end: new Date(y, m, d - 2),
                },
                
                {
                    title: '打开百度',
                    start: new Date(y, m, 28),
                    end: new Date(y, m, 29),
                    url: 'http://baidu.com/'
                }
            ],
        });


    });
</script>


</body>

</html>
