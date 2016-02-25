<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="ko">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Hello</title>
</head>
<body>
	<h2>Login!! </h2>
	<div>JSP version</div>
	<form action="/logout" method="post">
	<input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
            <div><input type="submit" value="Sign Out"/></div>
    </form>
</body>
</html>