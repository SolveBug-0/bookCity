<%@ page language="java" contentType="text/html; charset=GB18030" pageEncoding="GB18030"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>���ﳵ</title>
	<%@ include file="/pages/common/head.jsp"%>
</head>
<body>
	
	<div id="header">
			<img class="logo_img" alt="" src="static/img/logo.gif" >
			<span class="wel_word">���ﳵ</span>

		<%@ include file="/pages/common/loginSuccesscom.jsp"%>

	</div>
	
	<div id="main">
	
		<table>
			<tr>
				<td>��Ʒ����</td>
				<td>����</td>
				<td>����</td>
				<td>���</td>
				<td>����</td>
			</tr>		
			<tr>
				<td>ʱ���ʷ</td>
				<td>2</td>
				<td>30.00</td>
				<td>60.00</td>
				<td><a href="#">ɾ��</a></td>
			</tr>	
			
			<tr>
				<td>ĸ��Ĳ�����</td>
				<td>1</td>
				<td>10.00</td>
				<td>10.00</td>
				<td><a href="#">ɾ��</a></td>
			</tr>	
			
			<tr>
				<td>����¶�</td>
				<td>1</td>
				<td>20.00</td>
				<td>20.00</td>
				<td><a href="#">ɾ��</a></td>
			</tr>		
			
		</table>
		
		<div class="cart_info">
			<span class="cart_span">���ﳵ�й���<span class="b_count">4</span>����Ʒ</span>
			<span class="cart_span">�ܽ��<span class="b_price">90.00</span>Ԫ</span>
			<span class="cart_span"><a href="#">��չ��ﳵ</a></span>
			<span class="cart_span"><a href="pages/cart/checkout.jsp">ȥ����</a></span>
		</div>
	
	</div>

	<%@include file="/pages/common/pageDown.jsp"%>
</body>
</html>