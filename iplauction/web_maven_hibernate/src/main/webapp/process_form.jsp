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
<jsp:useBean id="player" class="pojos.Player" scope="session"></jsp:useBean>
<jsp:setProperty property="*" name="player"/>
<body>
<h1>Player insertion successful</h1>
<h1>${SessionScope.player}</h1>
</body>
</html>