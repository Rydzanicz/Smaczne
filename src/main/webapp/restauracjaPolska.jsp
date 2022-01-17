<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <link rel="stylesheet" href="style/restauracjaPolska.css">

    <title>Smaczne</title>
</head>
<body>

<audio id="music">
    <source src="style/mp3/SCIERNISCO.mp3" type="audio/mpeg"></source>
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
    <div class="pierogi" id="pierogi" name="pierogi">
        <form method="get" action="basket">
            <label for="pierogi" style="font-size: 40px;">Pierogi</label>
            <input type="text" name="pierogi" placeholder="pierogi" VALUE="pierogi 15 zł"  class="form__input" style="display: none" />
            <button type="submit">Dodaj</button>
        </form>
    </div>

    <div class="schabowy" id="schabowy">
        <form method="get" action="basket">
            <label for="schabowy" style="font-size: 40px;">Schabowy</label>
            <input type="text" name="schabowy" placeholder="Schabowy" VALUE="schabowy 17 zł"  class="form__input" style="display: none" />
            <button type="submit">Dodaj</button>
        </form>
    </div>

    <div class="bigos" id="bigos">
        <form method="get" action="basket">
            <label for="bigos" style="font-size: 40px;">Bigos</label>
            <input type="text" name="bigos" placeholder="bigos" VALUE="bigos 13zł"  class="form__input" style="display: none" />
            <button type="submit">Dodaj</button>
        </form>
    </div>

    <div class="zurek" id="zurek">
        <form method="get" action="basket">
            <label for="zurek" style="font-size: 40px;">Zurek</label>
            <input type="text" name="zurek" placeholder="zurek" VALUE="zurek"  class="form__input" style="display: none" />
            <button type="submit">Dodaj</button>
        </form>
    </div>
</div>

<div class="stopka">
    Twórcy: Maciej Kierys, Jan Łaniocha, Michał Rydzanicz, Michał Stadnicki Grupa: 33INF-SSI-SP/C
</div>
</body>
</html>
