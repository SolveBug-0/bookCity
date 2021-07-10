<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="GBK">
<title>尚硅谷会员注册页面</title>
<!--	写base标签，永远固定相对路径的跳转结果-->
	<%@ include file="/pages/common/head.jsp"%>
<style type="text/css">
	.login_form{
		height:420px;
		margin-top: 25px;
	}
</style>

	<script type="text/javascript">
		$(function () {
			$("#sub_btn").click(function () {
				//用户名验证
					//取得username中的值
					var uname = $("#username").val();
					//创建正则表达式对象
					var unamePatt = /^\w{5,12}$/;
					//使用test方法验证
					if(!(unamePatt.test(uname))){
						//提示信息
						$("span.errorMsg").text("用户名不合法");
						return false;
					}
				//密码验证
					//取得password中的值
					var password = $("#password").val();
					//创建正则表达式对象
					var passwordPatt = /^\w{5,12}$/;
					//使用test方法验证
					if(!(passwordPatt.test(password))){
						//提示信息
						$("span.errorMsg").text("密码不合法");
						return false;
				}
				//验证新密码是否与密码相同
					//取得新密码
					var newPassword = $("#repwd").val();
					//判断与新密码是否相同
				if(password != newPassword){
					//提示信息
					$("span.errorMsg").text("密码不一致");
					return false;
				}

				//邮箱验证
					//取得email中的值
					var email = $("#email").val();
					//创建正则表达式对象
					var emailPatt = /^[a-z\d]+(\.[a-z\d]+)*@([\da-z](-[\da-z])?)+(\.{1,2}[a-z]+)+$/;
					//使用test方法验证
					if(!(emailPatt.test(email))){
						//提示信息
						$("span.errorMsg").text("邮箱地址不合法");
						return false;
					}

				//验证码验证

				$("span.errorMsg").text("");
			});
		});

	</script>
</head>
<body>
		<div id="login_header">
			<img class="logo_img" alt="" src="static/img/logo.gif" >
		</div>
		
			<div class="login_banner">
			
				<div id="l_content">
					<span class="login_word">欢迎注册</span>
				</div>
				
				<div id="content">
					<div class="login_form">
						<div class="login_box">
							<div class="tit">
								<h1>注册尚硅谷会员</h1>
								<span class="errorMsg">${empty requestScope.msg?"请输入用户名或密码":requestScope.msg}</span>
							</div>
							<div class="form">
								<form action="userServlet" method="post" >
									<input type="hidden" name="action" value="regist"/>
									<label>用户名称：</label>
									<input class="itxt" type="text" placeholder="请输入用户名" autocomplete="off" tabindex="1" name="username" id="username"
											value="${requestScope.username}">
									<br />
									<br />
									<label>用户密码：</label>
									<input class="itxt" type="password" placeholder="请输入密码" autocomplete="off" tabindex="1" name="password" id="password" />
									<br />
									<br />
									<label>确认密码：</label>
									<input class="itxt" type="password" placeholder="确认密码" autocomplete="off" tabindex="1" name="repwd" id="repwd" />
									<br />
									<br />
									<label>电子邮件：</label>
									<input class="itxt" type="text" placeholder="请输入邮箱地址" autocomplete="off" tabindex="1" name="email" id="email"
										   value="${requestScope.email}"/>
									<br />
									<br />
									<label>验证码：</label>
									<input class="itxt" type="text" style="width: 150px;" id="code" name="code"/>
									<img alt="" src="static/img/code.bmp" style="float: right; margin-right: 40px">
									<br />
									<br />
									<input type="submit" value="注册" id="sub_btn" />
								</form>
							</div>
							
						</div>
					</div>
				</div>
			</div>
		<%@include file="/pages/common/pageDown.jsp"%>
</body>
</html>