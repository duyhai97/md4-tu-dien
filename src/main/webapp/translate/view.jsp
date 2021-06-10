<%--
  Created by IntelliJ IDEA.
  User: TruongDubai
  Date: 6/10/2021
  Time: 5:12 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<h2>Vietnamese Dictionary</h2>
<form method="post">
    <input type="text" name="search" placeholder="Enter your word: "/>
    <input type = "submit" id = "submit" value = "Search"/>
</form>

<p>Result: ${result}</p>

</body>
</html>
