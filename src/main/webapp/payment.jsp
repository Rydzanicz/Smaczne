<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<div class="user">
    <header class="user__header">
        <link rel="stylesheet" href="style/register.css">
        <title>Smacznego</title>
        <h1 class="user__title">Płatność</h1>
    </header>

    <form , method="get", action="payment">

        <div class="form__group">
            <input type="text" placeholder="Nr karty" name="CardNr"/>
        </div>

        <div class="form__group">
            <input type="text" placeholder="CVC" name="CVC"  />
        </div>
        <div class="form__group">
            <input type="date" placeholder="Data" name="Data"  />
        </div>
        <div>
            <button type="submit"> Zapłać </button>
        </div>
    </form>



</div>