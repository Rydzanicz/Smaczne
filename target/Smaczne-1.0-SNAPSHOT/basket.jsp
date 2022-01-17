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
    <p id="koszyk">Koszyk</p>

    <form method="get" id="basket">
        <input type="text" name="formularz" placeholder="formularz" VALUE="formularz"  class="form__input" style="display: none" />
        ${order}
        <button type="submit">Zamów</button>
    </form>

</div>


</body>
</html>