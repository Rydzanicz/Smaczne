<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <link rel="stylesheet" href="style/restauracjaTurecka.css">

    <title>Smaczne</title>
</head>
<body>

<div class="naglowek">
    <h1 class="nazwa">Smaczne</h1>
</div>

<div class="cialo">
    <div class="kebab" id="kebab">
        <h3>Adana kebab</h3>
        <form method="get" action="basket">
            <input type="text" name="kebab" placeholder="kebab" VALUE="kebab"  class="form__input" style="display: none" />
            <button type="submit">Dodaj</button>
        </form>
    </div>
    <div class="kumpir" id="kumpir">
        <h3>Kumpir </h3>
        <form method="get" action="basket">
            <input type="text" name="kumpir" placeholder="kumpir" VALUE="kumpir"  class="form__input" style="display: none" />
            <button type="submit">Dodaj</button>
        </form>
    </div>
    <div class="balikekmek" id="balikekmek">
        <h3>Balik ekmek</h3>
        <form method="get" action="basket">
            <input type="text" name="kumpir" placeholder="kumpir" VALUE="kumpir"  class="form__input" style="display: none" />
            <button type="submit">Dodaj</button>
        </form>
    </div>

</div>

<div class="stopka">
    Twórcy: Maciej Kierys, Jan Łaniocha, Michał Rydzanicz, Michał Stadnicki Grupa: 33INF-SSI-SP/C
</div>

</body>
</html>
