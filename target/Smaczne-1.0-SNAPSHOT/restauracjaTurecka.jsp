<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <link rel="stylesheet" href="style/restauracjaTurecka.css">

    <title>Smaczne</title>
</head>
<body>
<audio id="music">
    <source src="style/mp3/HadalAhbek.mp3" type="audio/mpeg"></source>
</audio>

<script>
    var audio = document.getElementById("music");
    audio.volume = 0.1;
    audio.play();
</script>
<div class="naglowek">
    <h1 class="nazwa">Smaczne</h1>
</div>

<div class="cialo">
    <div class="kebab" id="kebab">
        <form method="get" action="basket">
            <label for="kebab" style="font-size: 40px;">Adana kebab</label>
            <input type="text" name="kebab" placeholder="kebab" VALUE="kebab 11zł"  class="form__input" style="display: none" />
            <button type="submit">Dodaj</button>
        </form>
    </div>
    <div class="kumpir" id="kumpir">
        <form method="get" action="basket">
            <label for="kumpir" style="font-size: 40px;">Kumpir</label>
            <input type="text" name="kumpir" placeholder="kumpir" VALUE="kumpir 9zł"  class="form__input" style="display: none" />
            <button type="submit">Dodaj</button>
        </form>
    </div>
    <div class="balikekmek" id="balikekmek">
        <form method="get" action="basket">
            <label for="balikekmek" style="font-size: 40px;">Balik ekmek</label>
            <input type="text" name="kumpir" placeholder="kumpir" VALUE="kumpir 12zł"  class="form__input" style="display: none" />
            <button type="submit">Dodaj</button>
        </form>
    </div>

</div>

<div class="stopka">
    Twórcy: Maciej Kierys, Jan Łaniocha, Michał Rydzanicz, Michał Stadnicki Grupa: 33INF-SSI-SP/C
</div>

</body>
</html>
