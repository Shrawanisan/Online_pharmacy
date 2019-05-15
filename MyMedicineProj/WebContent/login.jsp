<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

 <header>
     <div id="heading">Best Online Pharmacy</div>
 </header>

  <p><h2 id="bottom-text">  Login</h2></p> 
    <div class="container">
     <form name="loginForm" action="login"
                   method="post">
                  <label for="uname"><font color="#A9A9A9" size="3"><b>Username</b></font></label><br>
                  <input type="text"  name="username">
					<!-- <p id="username-error">xyzabc</p><br> -->
                  <label for="psw"><br> <font color="#A9A9A9" size="3"><b>Password</b></font></label><br>
                  <input type="password"  name="password"><br>
  					<!-- <p id="password-error">xyz</p><br> -->
                  <button type="submit"  onclick="validateLoginFormData()">Login</button><br><br>
                  <br>
            </form>
      </div>
<footer>
   <p>Copyright &#169 2018 Best Online Pharmacy</p>
</footer>

</body>
</html>