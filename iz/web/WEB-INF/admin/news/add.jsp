<%@ page contentType="text/html;charset=utf-8" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<h1 class="my-4"  >
    <small>Добавление новости</small>
</h1>

<div class="card mb-4">
    <div class="card-body">
        <form action="/admin/news" method="post" enctype="multipart/form-data">
            <input type="hidden" name="action" value="add"/>
            <div class="form-group">
                <label>Название новости</label>
                <input type="text" class="form-control" name="title" >
            </div>
            <label>Текст новости</label>
            <textarea class="form-control" rows="5" name="story" id="story"></textarea>
            <br>
            <div class="form-group">
                <label >Загрузка изображения: </label>
                <input type="file" name="img">
            </div>

            <div class="form-group">
                <button class="btn btn-primary" id="submit" type="submit">Добавить</button>
            </div>


        </form>
    </div>
</div>
