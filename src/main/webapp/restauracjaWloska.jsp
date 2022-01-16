<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <link rel="stylesheet" href="style/restauracjaWloska.css">

    <title>Smaczne</title>
</head>
<body>

<div class="naglowek">
    <h1 class="nazwa">Smaczne</h1>
</div>

<div class="cialo">
    <div class="pizza" id="pizza">
        <h3>Adana kebab</h3>
        <form method="get" action="basket">
            <input type="text" name="pizza" placeholder="pizza" VALUE="pizza"  class="form__input" style="display: none" />
            <button type="submit">Dodaj</button>
        </form>
    </div>
    <div class="minestrone" id="minestrone">
        <h3>Minestrine </h3>
        <form method="get" action="basket">
            <input type="text" name="minestrone" placeholder="minestrone" VALUE="minestrone"  class="form__input" style="display: none" />
            <button type="submit">Dodaj</button>
        </form>
    </div>
    <div class="lasagne" id="lasagne">
        <h3>Lasagne</h3>
        <form method="get" action="basket">
            <input type="text" name="lasagne" placeholder="lasagne" VALUE="lasagne"  class="form__input" style="display: none" />
            <button type="submit">Dodaj</button>
        </form>
    </div>

</div>

<div class="stopka">
    Twórcy: Maciej Kierys, Jan Łaniocha, Michał Rydzanicz, Michał Stadnicki Grupa: 33INF-SSI-SP/C
</div>

</body>
</html>
