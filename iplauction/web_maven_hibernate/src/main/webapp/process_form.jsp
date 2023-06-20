<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@page import="org.apache.jasper.tagplugins.jstl.core.ForEach"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Player Inserted</title>
</head>
<jsp:setProperty property="*" name="player"/> 
<body>
<h1>Player inserted</h1>
<h1>Result :${applicationScope.player.validatePlayer()}</h1>
</body>
</html>