<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<h1 class="my-4"  >
    <small>Добавление новости</small>
</h1>

<div class="card mb-4">
    <div class="card-body">
        <form action="/admin/news/" method="post" enctype="multipart/form-data">
            <div class="form-group">
                <label>Название новости</label>
                <input type="text" class="form-control" name="title" >
            </div>
            <label for="story">Текст новости</label>
            <textarea class="form-control" rows="5" name="story"></textarea>
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