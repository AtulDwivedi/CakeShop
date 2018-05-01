<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>CakeShop</title>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<link rel="stylesheet" type="text/css" media="all" href="styles/960.css" />
<link rel="stylesheet" type="text/css" media="all" href="styles/reset.css" />
<link rel="stylesheet" type="text/css" media="all" href="styles/text.css" />
<link rel="stylesheet" type="text/css" media="all" href="style.css" />
<link rel="stylesheet" type="text/css" media="all" href="themes/brown/style.css" />
<script type="text/javascript" src="scripts/jquery-1.4.2.js"></script>
<script type="text/javascript" src="scripts/jquery.tools.min.js"></script>
<script type="text/javascript" src="scripts/dapur.js"></script>
</head>
<body>
<div id="warp">
  <div id="main" class="container_16">
   <jsp:include page="header.jsp" />
    <div class="products grid_16">
      <div class="productsWarp">
        <ul>
          <li><a href="product-overview.html"><img src="images/cake1.jpg" alt="" width="938" height="398" /></a></li>
          <li><a href="product-overview.html"><img src="images/cake2.jpg" alt="" width="938" height="398" /></a></li>
          <li><a href="product-overview.html"><img src="images/cake3.jpg" alt="" width="938" height="398" /></a></li>
          <li><a href="product-overview.html"><img src="images/cake3.jpg" alt="" width="938" height="398" /></a></li>
          <li><a href="product-overview.html"><img src="images/cake3.jpg" alt="" width="938" height="398" /></a></li>
        </ul>
      </div>
    </div>
    <div class="productThumb grid_10 prefix_3 suffix_3">
      <ul>
        <li class="grid_2 alpha"><a href="#"><img src="images/thumb1.jpg" alt="" width="100" height="60" /></a></li>
        <li class="grid_2"><a href="#"><img src="images/thumb2.jpg" alt="" width="100" height="60" /></a></li>
        <li class="grid_2"><a href="#"><img src="images/thumb1.jpg" alt="" width="100" height="60" /></a></li>
        <li class="grid_2"><a href="#"><img src="images/thumb2.jpg" alt="" width="100" height="60" /></a></li>
        <li class="grid_2 omega"><a href="#"><img src="images/thumb1.jpg" alt="" width="100" height="60" /></a></li>
      </ul>
    </div>
  </div>
  <div class="clear"></div>
</div>
<div id="fresh">
  <div class="container_16">
    <div id="freshCake" class="grid_16">
      <div class="grid_1 alpha"> <a class="prevButton">&laquo;</a></div>
      <div class="headLine grid_14">
        <h3>Fresh from the oven</h3>
      </div>
      <div class="grid_1 omega"> <a class="nextButton">&raquo;</a></div>
    </div>
    <div class="newCakes">
      <div class="scroller">
        <div class="newCake"><a href="product-details.html" class="grid_4"><img src="images/freshCake1.jpg" alt="" width="220" height="120" /></a></div>
        <div class="newCake"><a href="product-details.html" class="grid_4"><img src="images/freshCake2.jpg" alt="" width="220" height="120" /></a></div>
        <div class="newCake"><a href="product-details.html" class="grid_4"><img src="images/freshCake3.jpg" alt="" width="220" height="120" /></a></div>
        <div class="newCake"><a href="product-details.html" class="grid_4"><img src="images/freshCake4.jpg" alt="" width="220" height="120" /></a></div>
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