<%@ page contentType="text/html;charset=utf-8" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<h1 class="my-4"  >
    <small>Редактирование новости</small>
</h1>

<div class="card mb-4">
    <div class="card-body">
        <form action="/admin/news" method="post" enctype="multipart/form-data">
            <input type="hidden" name="action" value="edit"/>
            <input type="hidden" name="img_old" value="${news.img}"/>
            <input type="hidden" name="id" value="${news.id}"/>

            <div class="form-group">
                <label>Название новости</label>
                <input type="text" class="form-control" name="title" value="${news.title}">
            </div>
            <label>Текст новости</label>
            <textarea class="form-control" rows="5" name="story" id="story">${news.story}</textarea>
            <br>
            <div class="form-group">
                <label>Текущее изображение для новости</label> <br>
                        <img src="${news.img}" width="30%" height="30%">



            </div>
            
            <div class="form-group">
                <label >Загрузка изображения: </label>
                <input type="file" name="img"><br>
                <small>При добавление изображение старое будет заменено!</small>
            </div>

            

            <div class="form-group">
                <button class="btn btn-primary" id="submit" type="submit">Редактировать</button>
            </div>


        </form>
    </div>
</div>
