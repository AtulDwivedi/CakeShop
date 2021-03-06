<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<title>CakeShop | Checkout 2</title>
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
    <div class="pageInfo grid_16">
      <div class="dapurBlog grid_11 alpha">
        <h3>Checkout</h3>
      </div>
    </div>
    <div class="checkout grid_16">
      <div class="billInfo grid_11 alpha">
        <h4>2. Shipping Information</h4>
        <a href="#" class="sameInfo">Same with billing info</a>
        <form method="post" action="#" id="comment_form">
          <fieldset>
            <label for="firstName">First Name: </label>
            <input type="text" tabindex="1" size="22" value="" id="firstName" name="firstName" class="text" />
            <br />
            <label for="lastName">Last Name: </label>
            <input type="text" tabindex="2" size="22" value="" id="lastName" name="lastName" class="text" />
            <br />
            <label for="company">Company:</label>
            <input type="text" tabindex="3" size="50" value="optional" id="company" name="company" class="text" />
            <br />
            <label for="address">Address:</label>
            <input type="text" tabindex="4" size="50" value="" id="address" name="address" class="text" />
            <br />
            <label for="address2">&nbsp;</label>
            <input type="text" tabindex="5" size="50" value="" id="address2" name="address2" class="text" />
            <br />
            <label for="address3">&nbsp;</label>
            <input type="text" tabindex="6" size="50" value="" id="address3" name="address3" class="text" />
            <br />
            <label for="city">City:</label>
            <input type="text" tabindex="7" size="22" value="" id="city" name="city" class="text" />
            <br />
            <label for="state">State/Province:</label>
            <select id="state" tabindex="8">
              <option>DKI Jakarta</option>
              <option>Lembah Silikon</option>
              <option>Gunung Kidul</option>
            </select>
            <br />
            <label for="zip">Zip:</label>
            <input type="text" tabindex="9" size="22" value="" id="zip" name="zip" class="text" />
            <br />
            <label for="country">country:</label>
            <select id="country" tabindex="10">
              <option>United Kingdom</option>
              <option>German</option>
              <option>Indonesia</option>
            </select>
            <br />
            <label for="phone">Phone:</label>
            <input type="text" tabindex="11" size="22" value="" id="phone" name="phone" class="text" />
            <br />
            <div class="clear"></div>
          </fieldset>
          <p><a href="checkout-3.html" id="nextSubmit" class="button">Next</a></p>
          <input type="hidden" value="30" name="comment_post_ID" />
        </form>
      </div>
      <div class="summary grid_5 omega">
        <h4>Summary</h4>
        <div class="sumWarp">
          <ul>
            <li><a href="#" class="down">Shopping Cart <span><img src="images/done.png" alt="" /></span></a>
              <ul>
                <li class="info">3 items in your cart</li>
                <li class="total">$ 000.00</li>
                <li class="clear"></li>
              </ul>
            </li>
            <li><a href="#">Billing Information <span><img src="images/done.png" alt="" /></span></a></li>
            <li><a href="#" class="billActive">Shipping Information</a></li>
            <li><a href="#" class="billDie">Delivery Option</a></li>
            <li><a href="#" class="billDie">Payment Option</a></li>
          </ul>
        </div>
      </div>
    </div>
  </div>
  <div class="clear"></div>
</div>
<jsp:include page="footer.jsp" />
</html>