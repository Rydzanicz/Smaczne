<%@ page import="static jdk.nashorn.internal.objects.Global.print" %>
<%@ page import="static jdk.nashorn.internal.objects.Global.print" %>
<%@ page import="static jdk.nashorn.internal.objects.Global.*" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <link rel="stylesheet" href="style/basket.css">
    <title>Smaczne</title>
</head>
<body>

<div class="naglowek">
    <h1 class="nazwa">Smaczne</h1>
</div>

<div class="cialo">

</div>
    <p id="koszyk">Koszyk</p>

    <form method="get" id="formularz">
        ${order}
        <button type="submit">Zamów</button>
    </form>
</body>
</html>
