<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<div class="user">
    <header class="user__header">
        <link rel="stylesheet" href="style/register.css">
        <h1 class="user__title">Rejestracja</h1>
    </header>
    <form method="post"  action="register">
        <div class="form__group">
            <input type="text" name="name" placeholder="Nazwa Użytkownika" class="form__input" />
        </div>

        <div class="form__group">
            <input type="email" name="email" placeholder="Email" class="form__input" />
        </div>

        <div class="form__group">
            <input type="password" name="pass" placeholder="Hasło" class="form__input" />
        </div>

        <div class="form__group">
            <input type="text" placeholder="Numer Telefonu" class="form__input" />
        </div>
        <div class="form__group">
            <input type="text" placeholder="Adres" class="form__input" />
        </div>
        <button type="submit">Zarejestruj</button>
    </form>
    <form action="login.jsp">
        <button type="submit">Logowanie</button>
    </form>
</div>