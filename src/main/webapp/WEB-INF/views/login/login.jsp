<%--
  Created by IntelliJ IDEA.
  User: kjk
  Date: 2022-03-02
  Time: 오전 9:31
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE HTML>
<html>
<head>
    <title>login</title>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1" />
   <link href="/css/login.css" rel="stylesheet">
</head>
<body>
<div class="container" id="container">
    <div class="form-container sign-up-container">
        <form action="#">
            <h1>Create Account</h1>
            <div class="social-container">
<%--                <a href="#" class="social"><i class="fab fa-facebook-f"></i></a> 소셜 로그인 주석처리
                <a href="#" class="social"><i class="fab fa-google-plus-g"></i></a>
                <a href="#" class="social"><i class="fab fa-linkedin-in"></i></a>--%>
            </div>
            <span>or use your email for registration</span>
            <input type="text" name="name" placeholder="Name" />
            <input type="text" name="loginid" placeholder="ID" />
            <input type="password" name="password" placeholder="Password" />
            <button type="submit">Sign Up</button>
        </form>
    </div>
    <div class="form-container sign-in-container">
        <form action="<c:url value="/default"/>" method="post">
            <h1>Sign in</h1>
            <div class="social-container">
<%--                <a href="#" class="social"><i class="fab fa-facebook-f"></i></a>
                <a href="#" class="social"><i class="fab fa-google-plus-g"></i></a>
                <a href="#" class="social"><i class="fab fa-linkedin-in"></i></a>--%>
            </div>
            <span>or use your account</span>
            <input type="text" name="loginid" placeholder="Enter your ID" />
            <input type="password" name="password" placeholder="Enter your password" />
            <a href="#">Forgot your password?</a>
            <button type="submit">Sign In</button>
        </form>
    </div>
    <div class="overlay-container">
        <div class="overlay">
            <div class="overlay-panel overlay-left">
                <h1>Welcome Back!</h1>
                <p>To keep connected with us please login with your personal info</p>
                <button class="ghost" id="signIn">Sign In</button>
            </div>
            <div class="overlay-panel overlay-right">
                <h1>Hello, Friend!</h1>
                <p>Enter your personal details and start journey with us</p>
                <button class="ghost" id="signUp">Sign Up</button>
            </div>
        </div>
    </div>
</div>

<footer>
    <p>
        Work and Life Balance
    </p>
</footer>
<script type="text/javascript" src="/js/login.js"></script>
</body>
</html>
