<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>CakeShop | Checkout 4</title>
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
        <h4>4. Payment Option</h4>
        <form method="post" action="#" id="comment_form">
          <fieldset>
            <dl>
              <dt>
                <input type="radio" name="method" value="Bank transfer" />
                Bank transfer</dt>
            </dl>
            <dl>
              <dt>
                <input type="radio" name="method" value="Credit Card" />
                Credit Card</dt>
            </dl>
            <dl>
              <dt>
                <input type="radio" name="method" value="Paypal" />
                Paypal</dt>
            </dl>
          </fieldset>
          <p><a href="checkout-5.html" id="nextSubmit" class="button">Next</a></p>
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
            <li><a href="#" class="down">Shipping Information <span><img src="images/done.png" alt="" /></span></a>
              <ul>
                <li class="info"> Monika Halim<br />
                  Jl. Tralala Trilili Similikiti<br />
                  Solo, Jawa Tengah 57171<br />
                  Indonesia<br />
                  (62) 817627670</li>
                <li class="edit"><a href="#">EDIT &raquo;</a></li>
                <li class="clear"></li>
              </ul>
            </li>
            <li><a href="#" class="down">Delivery Option <span><img src="images/done.png" alt="" /></span></a>
              <ul>
                <li class="info"> Deliver on February 3rd, 2010<br />
                  at Evening 3.00 pm - 6.00 pm<br />
                  by First delivery option $12.36</li>
                <li class="edit"><a href="#">EDIT &raquo;</a></li>
                <li class="clear"></li>
              </ul>
            </li>
            <li><a href="#" class="billActive">Payment Option</a></li>
          </ul>
        </div>
      </div>
    </div>
  </div>
  <div class="clear"></div>
</div>
<jsp:include page="footer.jsp" />
</html>