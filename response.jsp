<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %>
<html>
<head>
    <title>Prog.kiev.ua</title>
</head>
<style>
    body {
        text-align: center;
        padding: 20px;
    }

    #outer {
        margin: 0 auto;
        text-align: center;
        border: 1px solid black;
        background: #fc3;
        width: 800px;
        padding: 20px;
    }

    #inner {
        margin: 0 auto;
        text-align: left;
        border: 1px solid black;
        background: #ac3;
        width: 700px;
        padding: 20px;
    }
</style>
<body>
<% List<String> data = (ArrayList<String>) session.getAttribute("database");%>
<div id="outer">
<h1>All data:</h1><br>
    <hr>
<% int i=1; %>
<% for (String str : data) {%>
    <%= str%><br>
<% } %>
</div>
</body>
</html>
