<%-- <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>  --%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <link href="styles/style.css" rel="stylesheet" type="text/css">

    <title></title>
    <link rel="stylesheet" href="WEB-INF/style.css">

    <style>

        .forForm{
            margin: auto;
            width: 250px;
            height: 400px;
        }

    </style>
</head>
<body bgcolor = #D3D3D3>
<H1 class = "forMainText">IFP</H1>


<form class = "forForm" action="signin" method="POST">
    <fieldset>
        <legend>Create account / Sign In</legend>
        <b>Login:</b></br>
        <input type="text" name="login"/><br/>
        <b >Password:</b></br>
        <input type="text" name="password"/><br/>
        <p><input type = "submit" value="Create account"><input type = "submit" value="Sign In"></p>
    </fieldset>
</form>


</body>
</html>