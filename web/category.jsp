<%@ page import="by.devilmice.model.CategoryEntity" %>
<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %><%--
  Created by IntelliJ IDEA.
  User: Администратор
  Date: 21.04.2019
  Time: 21:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Category</title>
</head>
<body>
<% if (request.getAttribute("categoryList") != null) {
    ArrayList<CategoryEntity> categoryList = new ArrayList<CategoryEntity>();
    categoryList = (ArrayList<CategoryEntity>) request.getAttribute("categoryList");
    %>
<form method="post" action="/category/delete">


    <% for(int i=0; i<categoryList.size();i++){ %>
        <%= "<p>" + categoryList.get(i).getTitle() +   " <input type=\"checkbox\" name=\"del\" value=\""%><%=categoryList.get(i).getId()+ "\">Удалить?</p>"%>

<%
    }



}%>
    <p><input type="submit" value="Отправить"></p>

    </form>
</body>
</html>
