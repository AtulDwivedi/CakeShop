<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<title>CakeShop | Checkout 3</title>
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
        <h4>3. Delivery Option</h4>
        <form method="post" action="#" id="comment_form">
          <fieldset>
            <label class="delivery">Deliver on this spesific date:</label>
            <select tabindex="1">
              <option>Date</option>
              <option>Onde mande</option>
              <option>onde tusday</option>
              <option>onde fridey</option>
            </select>
            <select tabindex="2">
              <option>Month</option>
              <option>January</option>
              <option>July</option>
            </select>
            <select tabindex="3">
              <option>Year</option>
              <option>1984</option>
              <option>2005</option>
            </select>
            <br />
            <label class="delivery">Deliver on this spesific time:</label>
            <select tabindex="4">
              <option>Early Morning - 6.00 - 9.0c0 AM</option>
              <option>Early Morning - 6.00 - 9.0c0 AM</option>
              <option>Early Morning - 6.00 - 9.0c0 AM</option>
            </select>
            <input type="checkbox" value="Anytime" />
            Anytime <br />
            <label class="delivery">United States Postal Service:</label>
            <input type="radio" name="delivery" value="First delivery option" class="radio" />
            First delivery option <span>$12.36</span><br />
            <input type="radio" name="delivery" value="Second delivery option" class="radio" />
            Second delivery option <span>$18.15</span><br />
            <div class="clear"></div>
          </fieldset>
          <p><a href="checkout-4.html" id="nextSubmit" class="button">Next</a></p>
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
            <li><a href="#">Shipping Information <span><img src="images/done.png" alt="" /></span></a></li>
            <li><a href="#" class="billActive">Delivery Option</a></li>
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