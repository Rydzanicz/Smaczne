<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <link rel="stylesheet" href="style/restauracjaPolska.css">

    <title>Smaczne</title>
</head>
<body>

<div class="naglowek">
    <h1 class="nazwa">Smaczne</h1>
</div>

<div class="cialo">
    <div class="pierogi" id="pierogi" name="pierogi">
        <h3>Pierogi</h3>

        <form method="get" action="basket">
            <input type="text" name="pierogi" placeholder="pierogi" VALUE="pierogi"  class="form__input" style="display: none" />
            <button type="submit">Dodaj</button>
        </form>

    </div>

    <div class="schabowy" id="schabowy">
        <h3>Schabowy</h3>
        <form method="get" action="basket">
            <input type="text" name="schabowy" placeholder="Schabowy" VALUE="schabowy"  class="form__input" style="display: none" />
            <button type="submit">Dodaj</button>
        </form>
    </div>

    <div class="bigos" id="bigos">
        <h3>Bigos</h3>
        <form method="get" action="basket">
            <input type="text" name="bigos" placeholder="bigos" VALUE="bigos"  class="form__input" style="display: none" />
            <button type="submit">Dodaj</button>
        </form>
    </div>

    <div class="zurek" id="zurek">
        <h3>Żurek</h3>

        <form method="get" action="basket">
            <input type="text" name="zurek" placeholder="zurek" VALUE="zurek"  class="form__input" style="display: none" />
            <button type="submit">Dodaj</button>
        </form>
    </div>
</div>


</body>
</html>
