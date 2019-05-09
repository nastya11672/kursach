<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<h1 class="my-4"  >
    <small>Регистрация</small>
</h1>

    <!-- Blog Post -->
    <div class="card mb-4">
        <div class="card-body">
            <form action="/reg" method="post">

                <div class="form-group">
                    <label for="exampleInputEmail1"><b>Логин</b></label>
                    <input type="text" class="form-control" id="exampleInputLogin" aria-describedby="loginHelp" placeholder="Введите логин" name="login" minlength="4" maxlength="16" required>
                </div>
                <div class="form-group">
                    <label for="exampleInputEmail1"><b>Email</b></label>
                    <input type="email" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" placeholder="Введите Email" name="email" required>
                </div>
                <div class="form-group">
                    <label for="exampleInputPassword1"><b>Пароль</b></label>
                    <input type="password" class="form-control" id="exampleInputPassword1" placeholder="Введите пароль" name="password" minlength="6" maxlength="16" required>
                    <small class="form-text text-muted">Пароль должен быть не менее 6 символов!</small>

                </div>

                <div class="text-center">
                    <button type="submit" class="btn btn-primary">Регистрация</button>
                </div>
            </form>
        </div>

    </div>
<br><br><br>


