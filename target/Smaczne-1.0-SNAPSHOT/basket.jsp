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

    </form> <form method="get" id="basketDelete">
        <input type="text" name="basketDelete" placeholder="basketDelete" VALUE="basketDelete"  class="form__input" style="display: none" />
        <p style="font-size: 30px;">${order}</p></br>
    <button style="margin: 2px;" type="submit">Opróżnij koszyk</button>
    </form>
    <form method="get" id="basket">
        <input type="text" name="formularz" placeholder="formularz" VALUE="formularz"  class="form__input" style="display: none" />
        <button style="margin: 2px;" type="submit">Zamów</button>
    </form>
</div>


</body>
</html>