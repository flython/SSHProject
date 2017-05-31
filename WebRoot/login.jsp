<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html lang="en">

	<head>
		<meta charset="utf-8">
		<meta http-equiv="X-UA-Compatible" content="IE=edge">
		<meta name="viewport" content="width=device-width, initial-scale=1">

		<title>Bootstrap 3, from LayoutIt!</title>

		<meta name="description" content="Source code generated using layoutit.com">
		<meta name="author" content="LayoutIt!">

		<link href="css/bootstrap.min.css" rel="stylesheet">
		<link href="css/style.css" rel="stylesheet">

	</head>

	<body>

		<div class="container-fluid">
			<div class="row">
				<div class="col-md-3">
				</div>
				<div class="col-md-6">
					<form role="form">
						<div class="form-group">

							<label for="exampleInputEmail1">
						账户
					</label>
							<input type="email" class="form-control" id="exampleInputEmail1">
						</div>
						<div class="form-group">

							<label for="exampleInputPassword1">
						密码 
					</label>
							<input type="password" class="form-control" id="exampleInputPassword1">
						</div>
						
						<div class="checkbox">

							<label>
						<input type="checkbox"> 记住密码 
					</label>
						</div>
						<button type="submit" class="btn btn-default">
					登录
				</button>
					</form>
				</div>
				<div class="col-md-3">
				</div>
			</div>
		</div>

		<script src="js/jquery.min.js"></script>
		<script src="js/bootstrap.min.js"></script>
		<script src="js/scripts.js"></script>
	</body>

</html>