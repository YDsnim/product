<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<style>
	.home_buttons{
		background-color:#f0eec9;
		border-color:white;
		text-align:center;
		font-size:12px;
		height:1.2cm;
		width:3cm;
		box-shadow: 2px 1px;
	}
	fieldset{
	border : 4px solid;
	border-color : f7f7f7;
	width : 500;
	height : 300;
	}
	
</style>
<head>
</head>
<body>
<h1>
	생산관리 시스템  
</h1>

<P>  The time on the server is ${serverTime}. </P>


<fieldset>
	<legend>생산관리 메인메뉴</legend>
	<button class="home_buttons" name="Insert" >제품 입력</button>
	<button class="home_buttons" name="Search">제품 조회</button>
	<button class="home_buttons" name="Priority">우선생산제품</button>
	<button class="home_buttons" name="Rank" >이익 순위</button>
	<button class="home_buttons" name="Stock">그룹별 재고수량</button>
	

</fieldset>

</body>
</html>
