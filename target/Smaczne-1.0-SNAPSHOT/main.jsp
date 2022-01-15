<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <link rel="stylesheet" href="style/main.css">
    <title>Pyszne v2</title>
</head>
<body>

<div class="naglowek">
    <h1 class="nazwa"><%= "Pyszne v2" %>
</div>

<div class="cialo">
    <h1 class="music_name">Golec uOrkiestra - Ściernisko</h1>
    <audio controls autoplay >
        <source src="SCIERNISCO.mp3" type="audio/mp3"/>
    </audio>
    <h2 class="music_name">Akcent - Przez twe oczy zielone</h2>
    <audio controls >
        <source src="OczyZielone.mp3" type="audio/mp3"/>
    </audio>

    <h2 class="restaurant_names">Kuchnia Turecka</h2>
    <button class="buttons" type="button">Kuchnia Turecka</button>

    <h2 class="restaurant_names">Kuchnia Polska</h2>
    <button class="buttons" type="button">Kuchnia Polska</button>

    <h2 class="restaurant_names">Kuchnia Włoska</h2>
    <button class="buttons" type="button">Kuchnia Włoska</button>

</div>

<div class="stopka">
    Twórcy: Maciej Kierys, Jan Łaniocha, Michał Rydzanicz, Michał Stadnicki Grupa: 33INF-SSI-SP/C

</div>

</body>
</html>