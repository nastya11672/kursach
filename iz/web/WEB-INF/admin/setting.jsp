<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<h1 class="mt-4">Управление настройками</h1>
    <div class="card mb-4">
    <div class="card-body">
<form method="POST" action="/admin">


    <div class="form-group">
        <label>Заголовок сайта</label>
        <input type="text" class="form-control" name="title" value="${s.title}" required maxlength="255">
    </div>


    <div class="form-group">
        <label>Ключевые слова</label>
        <textarea class="form-control" name="keywords" required>${s.keywords}</textarea>
    </div>

    <div class="form-group">
        <label>Описание сайта</label>
        <textarea class="form-control" name="description" required>${s.description}</textarea>
    </div>
    <div class="form-group">
        <label>Выключить сайт</label>
        <select name="offline" class="form-control">
            <c:if test="${s.offline == 0}">
                <option value="0" selected>нет</option>
                <option value="1">да</option>
            </c:if>

            <c:if test="${s.offline == 1}">
                <option value="0" selected>нет</option>
                <option value="1" selected>да</option>
            </c:if>
        </select>
    </div>
        <div class="form-group text-center">
            <button class="btn btn-primary" id="submit" type="submit">Изминить настройки</button>
        </div>


</form>
    </div>
</div>