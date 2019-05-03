<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>

<%
  String path = request.getContextPath();
  String basePath = request.getScheme() + "://"
          + request.getServerName() + ":" + request.getServerPort()
          + path + "/";
%>
<html>
  <head>
    <title>IMS</title>
  </head>
  <body>
    名字：${username}
  </body>
</html>
