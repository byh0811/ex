<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">
<head>
	<title>ITkey Board</title>
	<meta charset="utf-8">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
	<script>
	$(function(){
		var $map = ${map}
	});
	</script>
</head>
<body>

<div class="container">
	<div class="jumbotron">
		<h1>ITKey 코딩 교육 게시판</h1> 
		<p>현재 화면은 Form 전송 코딩교육을 위한 화면입니다.</p>
	</div>
	<button type="button" style="width:10%; margin-bottom: 20px;" class="btn btn-lg btn-success pull-right">새글 추가</button>
	<table class="table table-hover">
		<thead>
			<tr>
				<th style="width: 10%">순번</th>
				<th style="width: 15%">작성자</th>
				<th>제목</th>
			</tr>
		</thead>
		<tbody >
			
		</tbody>
	</table>
</div>

</body>
</html>
