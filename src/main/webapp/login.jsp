<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<div class="user">
    <header class="user__header">
        <link rel="stylesheet" href="style/register.css">
        <title>Smacznego</title>
        <h1 class="user__title">Login</h1>
    </header>

    <form method="post", action="login">

        <div class="form__group">
         <input type="text" placeholder="Name" name="name"/>
        </div>

        <div class="form__group">
        <input type="password" placeholder="Password" name="pass"  />

        </div>
        <div>
            <button type="submit"> Login </button>
        </div>
    </form>


    <form action="register.jsp">
        <button type="submit">Rejestracja</button>
    </form>

</div>