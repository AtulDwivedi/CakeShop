<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>CakeShop | ShoppingCart</title>
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
    <div class="prodNav grid_16">
      <div class="prodHeadline grid_16">
        <h3>Your Shopping Cart</h3>
      </div>
    </div>
    <div class="bodyContent grid_16">
      <div class="shopCart grid_16 alpha">
        <div class="headCart grid_16 alpha">
          <div class="itemHead grid_9 alpha"> Item Description</div>
          <div class="priceHead grid_2"> Price</div>
          <div class="qtyHead grid_1"> Qty</div>
          <div class="subtotalHead grid_2"> Subtotal</div>
          <div class="remHead grid_2 omega"> Remove</div>
        </div>
        <form action="#" method="get">
          <div class="bodyCart grid_16 alpha">
            <div class="warpCart">
              <div class="item grid_9 alpha">
                <p><a href="#"><img src="images/flickr1.jpg" alt="" /></a> Delicious Cheesecake in Huge Pan With Choco Slices<br />
                  <span>Size: Large (24pcs)</span></p>
              </div>
              <div class="price grid_2">
                <p>$00.00</p>
              </div>
              <div class="qty grid_1">
                <input type="text" size="1" value="" name="Qty" />
              </div>
              <div class="subtotal grid_2">
                <p>$00.00</p>
              </div>
              <div class="remove grid_2 omega">
                <input type="checkbox" />
              </div>
            </div>
            <div class="warpCart">
              <div class="item grid_9 alpha">
                <p><a href="#"><img src="images/flickr1.jpg" alt="" /></a> Delicious Cheesecake in Huge Pan With Choco Slices<br />
                  <span>Size: Large (24pcs)</span></p>
              </div>
              <div class="price grid_2">
                <p>$00.00</p>
              </div>
              <div class="qty grid_1">
                <input type="text" size="1" value="" name="Qty" />
              </div>
              <div class="subtotal grid_2">
                <p>$00.00</p>
              </div>
              <div class="remove grid_2 omega">
                <input type="checkbox" />
              </div>
            </div>
            <div class="warpCart">
              <div class="item grid_9 alpha">
                <p><a href="#"><img src="images/flickr1.jpg" alt="" /></a> Delicious Cheesecake in Huge Pan With Choco Slices<br />
                  <span>Size: Large (24pcs)</span></p>
              </div>
              <div class="price grid_2">
                <p>$00.00</p>
              </div>
              <div class="qty grid_1">
                <input type="text" size="1" value="" name="Qty" />
              </div>
              <div class="subtotal grid_2">
                <p>$00.00</p>
              </div>
              <div class="remove grid_2 omega">
                <input type="checkbox" />
              </div>
            </div>
            <div class="warpCart">
              <div class="item grid_9 alpha">
                <p><a href="#"><img src="images/flickr1.jpg" alt="" /></a> Delicious Cheesecake in Huge Pan With Choco Slices<br />
                  <span>Size: Large (24pcs)</span></p>
              </div>
              <div class="price grid_2">
                <p>$00.00</p>
              </div>
              <div class="qty grid_1">
                <input type="text" size="1" value="" name="Qty" />
              </div>
              <div class="subtotal grid_2">
                <p>$00.00</p>
              </div>
              <div class="remove grid_2 omega">
                <input type="checkbox" />
              </div>
            </div>
          </div>
          <div class="footCart grid_16 alpha">
            <div class="grandTotal grid_3 prefix_11 alpha"> Grand Total</div>
            <div class="totalPrice grid_2 omega"> $ 000.00</div>
          </div>
          <div class="buttonCart grid_16 alpha">
            <input type="button" value="Continue Shopping" name="Continue Shopping" class="continueShop" />
            <input type="submit" value="Checkout" name="Checkout" class="checkoutCart" />
            <input type="button" value="Update Cart" name="Update Cart" class="updateCart" />
            <div class="clear"></div>
          </div>
        </form>
      </div>
      <div id="chooseCake" class="grid_16">
        <div class="youLike grid_16">
          <h3>You might also like</h3>
        </div>
      </div>
      <div class="newCakes">
        <div class="newCake"><a href="product-details.html" class="grid_4"><img src="images/freshCake1.jpg" alt="" width="220" height="120" /></a></div>
        <div class="newCake"><a href="product-details.html" class="grid_4"><img src="images/freshCake2.jpg" alt="" width="220" height="120" /></a></div>
        <div class="newCake"><a href="product-details.html" class="grid_4"><img src="images/freshCake3.jpg" alt="" width="220" height="120" /></a></div>
        <div class="newCake"><a href="product-details.html" class="grid_4"><img src="images/freshCake4.jpg" alt="" width="220" height="120" /></a></div>
      </div>
    </div>
  </div>
  <div class="clear"></div>
</div>
<div id="richContent">
  <div class="container_16">
    <div class="popularCakes grid_4">
      <h4>Popular Cakes</h4>
      <ul>
        <li><a href="#">Ultimate Choco Brownie</a></li>
        <li><a href="#">Mokakokoa Brownie</a></li>
        <li><a href="#">CoffeeBrown</a></li>
        <li><a href="#">Delicacheese</a></li>
        <li><a href="#">Berries Cheesecake</a></li>
      </ul>
    </div>
    <div class="recommended grid_4">
      <h4>Recommended</h4>
      <ul>
        <li><a href="#">Ultimate Choco Brownie</a></li>
        <li><a href="#">Mokakokoa Brownie</a></li>
        <li><a href="#">CoffeeBrown</a></li>
        <li><a href="#">Delicacheese</a></li>
        <li><a href="#">Berries Cheesecake</a></li>
      </ul>
    </div>
    <div class="specialOffer grid_4">
      <h4>Special Offer</h4>
      <ul>
        <li><a href="#">Ultimate Choco Brownie</a></li>
        <li><a href="#">Mokakokoa Brownie</a></li>
        <li><a href="#">CoffeeBrown</a></li>
        <li><a href="#">Delicacheese</a></li>
        <li><a href="#">Berries Cheesecake</a></li>
      </ul>
    </div>
    <div class="orderPhone grid_4">
      <h4><em>Order by Phone</em> <span>987-654-321</span></h4>
    </div>
    <div class="clear"></div>
  </div>
</div>
<jsp:include page="footer.jsp" />
</html>