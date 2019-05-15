<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>

<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8" />
    <title>日历</title>

    <link href="${path}/css/bootstrap.min.css?v=3.3.6" rel="stylesheet">
    <link href="${path}/css/font-awesome.css?v=4.4.0" rel="stylesheet">
    <link href="${path}/css/animate.css" rel="stylesheet">
    <link href="${path}/css/style.css?v=4.1.0" rel="stylesheet">

    <script src="${path}/js/jquery.min.js"></script>
    <script src="${path}/js/calendar.js"></script>

    <style>
        html, body {
            width: 100%;
            height: 100%;
            padding: 0;
            margin: 0;
        }

        ul, li {
            padding: 0;
            margin: 0;
            list-style: none;
        }

        #calendar {
            width: 100%;
        }

        .calendar {
            position: relative;
            font-family: "Chinese Quote", "Microsoft YaHei";
            font-size: 14px;
        }


        .calendar-header {
            padding: 11px 16px 11px 0;
            text-align: right;
        }

        .calendar-select {
            line-height: 1.5;
            color: rgba(0, 0, 0, 0.65);
            -webkit-box-sizing: border-box;
            box-sizing: border-box;
            margin: 0;
            padding: 0;
            list-style: none;
            display: inline-block;
            position: relative;
            outline: 0;
        }

        .calendar-table {
            width: 100%;
            height: 100%;
        }

        .calendar-column-header,
        .calendar-cell {
            width: 14%
        }

        .calendar-column-header {
            font-weight: 400;
            text-align: right;
            padding-right: 12px;
        }

        .calendar-table {
            table-layout: fixed;
        }

        .calendar-cell {
            color: rgba(0, 0, 0, 0.65);
        }



        .calendar-cell.calendar-last-month-cell,
        .calendar-cell.calendar-next-month-cell {
            color: rgba(0, 0, 0, 0.25);
        }

        .calendar-date {
            padding: 4px 8px;
            margin: 0 4px;
            border-top: 2px solid #e8e8e8;
        }

        .calendar-cell.calendar-thisMonth .calendar-date,
        .calendar-cell.calendar-today .calendar-date {
            border-top-color: #1890ff;
            background-color: #e6f7ff;
        }

        .calendar-date:hover {
            background: #e6f7ff;
        }


        .calendar-value {
            text-align: center;
        }

        .calendar-content {
            height: 80px;
            overflow-x: hidden;
            overflow-y: auto;
            position: static;
            width: auto;
            left: auto;
            bottom: auto;
        }




        .calendar-select {
            font-size: 13px;
            vertical-align: middle;
        }

        .btn.calendar-select-active {
            border-color: #40a9ff;
            z-index: 2;
        }

        .calendar-select:first-child {
            margin-right: 10px;
        }

        .calendar-year-select,
        .calendar-month-select {
            border-radius: 4px;
            border: 1px solid #d9d9d9;
        }

        .calendar-year-select:hover,
        .calendar-month-select:hover {
            border-color: #40a9ff;
        }

        .calendar-year-text,
        .calendar-month-text {
            margin: 0 10px;
            line-height: 28px;
        }

        .calendar-icon {
            margin: 0 10px 0 0;
        }

        .calendar-icon * {
            color: rgba(0, 0, 0, 0.25);
        }

        .btn {
            float: left;
            padding: 5px 10px;
            border: 1px solid #d9d9d9;
            border-radius: 4px;
        }

        .btn-group {
            float: left;
            display: inline;
            padding: 0 8px;
        }

        .btn-group > .btn {
            position: relative;
            float: left;
        }

        .btn-group > .btn:hover {
            z-index: 2;
            border-color: #40a9ff;
        }

        .btn-group .btn + .btn {
            margin-left: -1px;
        }

        .btn-group > .btn:first-child {
            border-top-right-radius: 0;
            border-bottom-right-radius: 0;
        }

        .btn-group > .btn:last-child:not(:first-child) {
            border-top-left-radius: 0;
            border-bottom-left-radius: 0;
        }


        /*dropdown-menu*/
        ul.dropdown-month, .dropdown-month li,
        ul.dropdown-year, .dropdown-year li {
            list-style: none;
            text-align: center;
            padding: 0;
            margin: 0;
        }

        .dropdown-month.open,
        .dropdown-year.open {
            display: inline-block;
            margin-top: 1px;
            width: 100%;
        }

        .dropdown-month,
        .dropdown-year {
            height: 250px;
            overflow-y: auto;
            overflow-x: hidden;
            display: none;
            position: absolute;
            left: 0;
            top: 100%;
            background: #fff;
            width: 50px;
            border: 1px solid #eee;
            box-shadow: 0px 6px 12px rgba(0,0,0,0.175);
            -webkit-box-shadow: 0 6px 12px rgba(0, 0, 0, 0.175)
        }

        .dropdown-month .month-item{
            font-size: 12px;
            position: relative;
            display: block;
            padding: 5px 2px;
            line-height: 20px;
            font-weight: normal;
            color: rgba(0, 0, 0, 0.65);
            white-space: nowrap;
            cursor: pointer;
            overflow: hidden;
            text-overflow: ellipsis;
            -webkit-transition: background 0.3s ease;
            transition: background 0.3s ease;
        }
        .dropdown-year .year-item {
            font-size: 12px;
            position: relative;
            display: block;
            padding: 5px 2px;
            line-height: 50px;
            font-weight: normal;
            color: rgba(0, 0, 0, 0.65);
            white-space: nowrap;
            cursor: pointer;
            overflow: hidden;
            text-overflow: ellipsis;
            -webkit-transition: background 0.3s ease;
            transition: background 0.3s ease;
        }

        .month-item:hover,
        .year-item:hover {
            background: #e6f7ff;
        }

        .year-item.active {
            background-color: #fafafa;
            font-weight: 600;
            color: rgba(0, 0, 0, 0.65);
        }
        /*自定义事件样式*/
        ul.events li {
            white-space: nowrap;
            font-size: 13px;
            padding: 1px 2px;
        }

        ul.events li span {
            margin-left: 5px;
        }



        /*scrollbar*/
        *::-webkit-scrollbar {
            width: 8px;
            background-color: #fff;
        }

        *::-webkit-scrollbar-thumb {
            background-color: #ddd;
            border-radius: 8px;
            -webkit-box-shadow: inset 0 0 6px rgba(255, 255, 255, .3);
        }
    </style>

</head>
<body class="gray-bg">
<div class="wrapper wrapper-content animated fadeInRight">
    <div class="row">
        <div class="col-sm-12">
            <div class="ibox float-e-margins">
                <div class="ibox-title">
                    <h5>周报日历</h5>
                </div>
                <div class="ibox-content">

                <div id="calendar"></div>
                </div>
            </div>
        </div>
    </div>
</div>

<script>

    var data = [
        { startDate: "2019-3-2", name: "<a class='btn btn-xs btn-info' href='/stu/weekly/toAdd?week=1'>填写第1周周报</a>" },
        { startDate: "2019-3-9", name: "<a class='btn btn-xs btn-info' href='/stu/weekly/toAdd?week=2'>填写第2周周报</a>" },
        { startDate: "2019-3-16", name: "<a class='btn btn-xs btn-info' href='/stu/weekly/toAdd?week=3'>填写第3周周报</a>" },
        { startDate: "2019-3-23", name: "<a class='btn btn-xs btn-info' href='/stu/weekly/toAdd?week=4'>填写第4周周报</a>"},
        { startDate: "2019-3-30", name: "<a class='btn btn-xs btn-info' href='/stu/weekly/toAdd?week=5'>填写第5周周报</a>"},
        { startDate: "2019-4-1", name: "<a class='btn btn-xs btn-info' href='/stu/title/toTitle'>提交中期报告</a>" },
        { startDate: "2019-4-6", name: "<a class='btn btn-xs btn-info' href='/stu/weekly/toAdd?week=6'>填写第6周周报</a>" },
        { startDate: "2019-4-13", name: "<a class='btn btn-xs btn-info' href='/stu/weekly/toAdd?week=7'>填写第7周周报</a>" },
        { startDate: "2019-4-20", name: "<a class='btn btn-xs btn-info' href='/stu/weekly/toAdd?week=8'>填写第8周周报</a>" },
        { startDate: "2019-4-27", name: "<a class='btn btn-xs btn-info' href='/stu/weekly/toAdd?week=9'>填写第9周周报</a>" },
        { startDate: "2019-5-4", name: "<a class='btn btn-xs btn-info' href='/stu/weekly/toAdd?week=10'>填写第10周周报</a>" },
        { startDate: "2019-5-11", name: "<a class='btn btn-xs btn-info' href='/stu/weekly/toAdd?week=11'>填写第11周周报</a>"},
        { startDate: "2019-5-18", name: "<a class='btn btn-xs btn-info' href='/stu/weekly/toAdd?week=12'>填写第12周周报</a>" },
        { startDate: "2019-5-25", name: "<a class='btn btn-xs btn-info' href='/stu/weekly/toAdd?week=13'>填写第13周周报</a>" },
        { startDate: "2019-6-1", name: "<a class='btn btn-xs btn-info' href='/stu/weekly/toAdd?week=14'>填写第14周周报</a>" },
        { startDate: "2019-6-8", name: "<a class='btn btn-xs btn-info' href='/stu/weekly/toAdd?week=15'>填写第15周周报</a>" },
        { startDate: "2019-6-15", name: "<a class='btn btn-xs btn-info' href='/stu/weekly/toAdd?week=16'>填写第16周周报</a>" },
        { startDate: "2019-6-22", name: "<a class='btn btn-xs btn-info' href='/stu/weekly/toAdd?week=17'>填写第17周周报</a>" },
        { startDate: "2019-6-23", name: "<a class='btn btn-xs btn-info' >毕业设计答辩</a>" },
    ]

    $("#calendar").calendar({
        data: data,
        mode: "month",
        //  maxEvent: 3,
        //showModeBtn: false
        //  newDate: "2019-04-1",
        cellClick: function (events) {
            //viewCell的事件列表
        },
    })
</script>
</body>
</html>