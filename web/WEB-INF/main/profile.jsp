<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<h1 class="my-4"  >
    <small>Изменение настроек профиля</small>
</h1>

<!-- Blog Post -->
<div class="card mb-4">
    <div class="card-body">
        <form action="/profile" method="post">
            <input type="hidden" name="id" value="${user.id}"/>

            <div class="form-group">
                <label for="exampleInputEmail1"><b>Email</b></label>
                <input type="email" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" placeholder="Введите Email" name="email" value="${user.email}" required>
            </div>
            <div class="form-group">
                <label for="exampleInputPassword1"><b>Пароль</b></label>
                <input type="password" class="form-control" id="exampleInputPassword1" placeholder="Введите пароль" name="password" value=""/>
                <small class="form-text text-muted">Пароль должен быть не менее 6 символов! Для того, чтобы пароль не изминился оставьте это поле пустым!</small>
            </div>

            <div class="text-center">
                <button type="submit" class="btn btn-primary">Измнить настройки профиля</button>
            </div>
        </form>
    </div>

</div>
<br><br><br><br>


