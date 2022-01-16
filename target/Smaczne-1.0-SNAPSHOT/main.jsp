<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <link rel="stylesheet" href="style/maine.css">
    <title>Smaczne</title>
</head>
<body>

<div class="naglowek">
    <h1 class="nazwa">Smaczne</h1>
</div>

<div>
<form class="cialo" action="basket.jsp">>
    <button type="submit">Koszyk</button>
</form>
    <div class="restauracjapolska" id="restauracjapolska" onclick="location.href='restauracjaPolska.jsp';">
        <h3>Kuchnia polska</h3>
    </div>
    <div class="restauracjaturecka" id="restauracjaturecka" onclick="location.href='restauracjaTurecka.jsp';">
        <h3>Kuchnia turecka</h3>
    </div>
    <div class="restauracjawloska" id="restauracjawloska" onclick="location.href='restauracjaWloska.jsp';">
        <h3>Kuchnia włoska</h3>
    </div>
    <div class="restauracjachinska" id="restauracjachinska">
        <h3>Kuchnia chińska</h3>
    </div>
</div>

<div class="stopka">
    Twórcy: Maciej Kierys, Jan Łaniocha, Michał Rydzanicz, Michał Stadnicki Grupa: 33INF-SSI-SP/C
</div>

</body>
</html>
