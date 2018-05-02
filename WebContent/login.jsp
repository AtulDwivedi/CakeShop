<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<title>CakeShop | Login</title>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<link rel="stylesheet" type="text/css" media="all" href="styles/960.css" />
<link rel="stylesheet" type="text/css" media="all" href="styles/reset.css" />
<link rel="stylesheet" type="text/css" media="all" href="styles/text.css" />
<link rel="stylesheet" type="text/css" media="all" href="style.css" />
<link rel="stylesheet" type="text/css" media="all" href="themes/brown/style.css" />
</head>
<body>
<div id="warp">
  <div id="main" class="container_16">
    <jsp:include page="header.jsp" />
    <div class="checkout grid_16">
      <div class="newAccount grid_8 alpha">
        <h4>Create New Account</h4>
        <form method="post" action="CustomerServlet">
          <fieldset>
            <label for="firstName">First Name: </label>
            <input type="text" tabindex="1" size="22" value="" id="firstName" name="firstName" class="text" />
            <br />
            <label for="lastName">Last Name: </label>
            <input type="text" tabindex="2" size="22" value="" id="lastName" name="lastName" class="text" />
            <br />
            <label for="email">Email:</label>
            <input type="text" tabindex="3" size="50" value="" id="email" name="email" class="text" />
            <br />
            <label for="password">Password:</label>
            <input type="password" tabindex="4" size="22" value="" id="password" name="password" class="text" />
            <br />
            <label for="repassword">Retype Password:</label>
            <input type="password" tabindex="5" size="22" value="" id="repassword" name="repassword" class="text" />
            <br />
            <div class="clear"></div>
          </fieldset>
          <p>
            <input type="submit" value="Create New Account" tabindex="6" name="update" class="newAccountButton" />
          </p>
          <input type="hidden" value="30" />
        </form>
      </div>
      <div class="loginPage grid_8 omega">
        <h4>Login</h4>
        <form method="post" action="login">
        <span>${requestScope.loginMsg}</span>
          <fieldset>
            <label for="email2">Email:</label>
            <input type="text" tabindex="1" size="50" value="" id="email2" name="email" class="text" />
            <br />
            <label for="password2">Password:</label>
            <input type="password" tabindex="2" size="22" value="" id="password2" name="password" class="text" />
            <br />
            <div class="clear"></div>
          </fieldset>
          <p>
            <input type="submit" value="Login" tabindex="3" name="update" class="userLogin" />
          </p>
          <input type="hidden" value="30" />
        </form>
      </div>
    </div>
  </div>
  <div class="clear"></div>
</div>
<jsp:include page="footer.jsp" />
</html>