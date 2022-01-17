<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <link rel="stylesheet" href="style/restauracjaWloska.css">

    <title>Smaczne</title>
</head>
<body>
<audio id="music">
    <source src="style/mp3/Toto.mp3" type="audio/mpeg"></source>
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
    <div class="pizza" id="pizza">
        <form method="get" action="basket">
            <label for="pizza" style="font-size: 40px;">Pizza</label>
            <input type="text" name="pizza" placeholder="pizza" VALUE=20  class="form__input" style="display: none" />
            <button type="submit">Dodaj</button>
        </form>
    </div>
    <div class="minestrone" id="minestrone">
        <form method="get" action="basket">
            <label for="minestrone" style="font-size: 40px;">Minestrone</label>
            <input type="text" name="minestrone" placeholder="minestrone" VALUE=11  class="form__input" style="display: none" />
            <button type="submit">Dodaj</button>
        </form>
    </div>
    <div class="lasagne" id="lasagne">
        <form method="get" action="basket">
            <label for="lasagne" style="font-size: 40px;">Lasagne</label>
            <input type="text" name="lasagne" placeholder="lasagne" VALUE=19  class="form__input" style="display: none" />
            <button type="submit">Dodaj</button>
        </form>
    </div>
</div>

<div class="stopka">
    Twórcy: Maciej Kierys, Jan Łaniocha, Michał Rydzanicz, Michał Stadnicki Grupa: 33INF-SSI-SP/C
</div>

</body>
</html>
