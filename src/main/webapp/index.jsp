<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Insert title here</title>
</head>
<body>
<h1 align="center">整合框架测试</h1>
<hr>
<h3>1.<a href="test/findLessons">课程列表</a></h3>
<br>
<h3>2.<a href="test/lessonType">这是测试哦</a></h3>
<br>
<h3>3.<a href="front/findLessons">课程列表测试</a></h3>
<br>
<h3>4.<a href="front/findLessonById?lid=3">单个课程测试</a></h3>
<br>
<h3>4.<a href="/front/findCircleOfFriends?qid=1">测试朋友圈</a></h3>
<br>
<h3>6.<a href="/front/like?mid=2&nickname=魏翔"> 票圈点赞测试</a></h3>
<br>
<h3>7.<a href="/front/reply?mid=2&nickname=费园园&content=我也不是很清楚">朋友圈评论</a></h3>
<br>
<h3>8.<a href="/front/getImgs?qid=1">首页图片</a></h3>
<br>
<br>
<br>
<br>
<br>
<br>
<br>



<form action="<%=request.getContextPath() %>/front/reply?mid=2&nickname=费园园">
	<input name="content" type="text" placeholder="输入评论">
	<input type="submit" name="submit" value="提交">
</form>
</body>
</html>