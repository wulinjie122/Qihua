<%@page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%@include file="/WEB-INF/pages/console/include/import.jsp"%>

<%@page import="com.qihua.console.user.UserQueryParameter"%>

<!DOCTYPE html>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1" />
<link rel="shortcut icon" href="<%=basePath%>/resources/<%=basePath%>/resources/images/favicon.png">

<title><%=Constants.SYSTEM_NAME%></title>

<!-- libraries -->
<link href="<%=basePath%>/resources/lib/bootstrap/css/bootstrap.css" rel="stylesheet">
<link href="<%=basePath%>/resources/fonts/font-awesome/css/font-awesome.min.css" rel="stylesheet">

<!--[if lt IE 9]>
    <script src="<%=basePath%>/resources/lib/html5shiv.js"></script>
    <script src="<%=basePath%>/resources/lib/respond.min.js"></script>
<![endif]-->

<!-- global styles -->
<link href="<%=basePath%>/resources/css/style.css" rel="stylesheet">

<!-- this page specific styles -->
<style type="text/css">
</style>

<%
    UserQueryParameter queryParam = (UserQueryParameter) request.getAttribute("queryParam");
    List<User> userList = (List<User>) request.getAttribute("userList");
%>

</head>

<body>
    <jsp:include page="/WEB-INF/pages/console/include/nav.jsp" flush="true" />

    <div id="cl-wrapper">
        <div class="container-fluid" id="pcont">
            <div class="page-head">
                <h2>用户管理</h2>
                <ol class="breadcrumb">
                    <li>系统</li>
                    <li class="active">用户管理</li>
                </ol>
            </div>
            <div class="cl-mcont">
                <div class="row">
                    <div class="col-md-12">
                        <div class="block-flat">
                            <div class="content">
                                <form class="form-horizontal" action="<%=basePath%>/console/user" style="margin-bottom: 20px" method="post">
                                    <div class="form-group">
                                        <label class="col-sm-1 col-sm-offset-2 control-label">姓名</label>
                                        <div class="col-sm-3">
                                            <input type="text" class="form-control" name="realName" value="<%=queryParam.getRealName()%>" />
                                        </div>
                                        <label class="col-sm-1 control-label">手机</label>
                                        <div class="col-sm-3">
                                            <input type="text" class="form-control" name="mobile" value="<%=queryParam.getMobile()%>" />
                                        </div>
                                    </div>
                                    <div class="form-group">
                                        <label class="col-sm-1 col-sm-offset-2 control-label">电子邮箱</label>
                                        <div class="col-sm-3">
                                            <input type="text" class="form-control" name="email" value="<%=queryParam.getEmail()%>" />
                                        </div>
                                    </div>
                                    <div class="text-center"><button type="submit" class="btn btn-primary">查询</button></div>
                                </form>
                            </div>
                            <div class="content">
                                <div class="table-responsive">
                                    <table class="table no-border hover">
                                        <thead class="no-border">
                                            <tr>
                                                <th><strong>用户名</strong></th>
                                                <th><strong>姓名</strong></th>
                                                <th><strong>手机</strong></th>
                                                <th><strong>电子邮箱</strong></th>
                                                <th class="text-center" style="width: 15%;"><strong>操作</strong></th>
                                            </tr>
                                        </thead>
                                        <tbody class="no-border-y">
                                            <% for (User user: userList) { 
                                            %>
                                            <tr>
                                                <td><%=user.getUsername()%></td>
                                                <td><%=user.getRealName()%></td>
                                                <td><%=user.getMobile()%></td>
                                                <td><%=user.getEmail()%></td>
                                                <td class="text-center">
                                                    <a href="<%=basePath%>/console/user/display?userId=<%=user.getUserId()%>" class="label label-default"><i class="fa fa-pencil"></i></a>
                                                </td>
                                            </tr>
                                            <% } %>
                                        </tbody>
                                    </table>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>

    <!-- ================== JavaScript ================== -->
    <script src="<%=basePath%>/resources/lib/jquery/jquery.js"></script>
    <script src="<%=basePath%>/resources/lib/bootstrap/js/bootstrap.min.js"></script>

    <script src="<%=basePath%>/resources/js/common.js"></script>


    <script type="text/javascript">
		$(function() {
			'use strict';
	
		});
	</script>
</body>
</html>
