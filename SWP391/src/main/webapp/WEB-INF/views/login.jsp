<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>Login</title>
</head>
<body>
    <h2>Login</h2>
    <form method="post" action="${pageContext.request.contextPath}/login">
        <div>
            <label for="username">Usernamee:</label>
            <input type="text" id="username" name="username"/>
        </div>
        <div>
            <label for="password">Password:</label>
            <input type="password" id="password" name="password"/>
        </div>
        <div>
            <button type="submit">Login</button>
        </div>
    </form>
</body>
</html>
