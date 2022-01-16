<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<div class="user">
    <header class="user__header">
        <link rel="stylesheet" href="style/basket.css">
        <title>Smacznego</title>
        <h1 class="user__title">Login</h1>
    </header>

    <form class="form">

        <div class="form__group">
            <input type="email" placeholder="Email" class="form__input" />
        </div>

        <div class="form__group">
            <input type="password" placeholder="Password" class="form__input" />

        </div>
        <div>
            <button class="btn" type="button"> Login </button>
        </div>
    </form>

    <form action="main.jsp">
        <button type="submit">Strona Główna</button>
    </form>

    <form action="register.jsp">
        <button type="submit">Rejestracja</button>
    </form>

</div>