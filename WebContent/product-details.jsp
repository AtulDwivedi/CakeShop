<%@ taglib uri="/WEB-INF/c.tld" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<title>CakeShop | Product Details</title>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<link rel="stylesheet" type="text/css" media="all" href="${pageContext.request.contextPath}/styles/960.css" />
<link rel="stylesheet" type="text/css" media="all" href="${pageContext.request.contextPath}/styles/reset.css" />
<link rel="stylesheet" type="text/css" media="all" href="${pageContext.request.contextPath}/styles/text.css" />
<link rel="stylesheet" type="text/css" media="all" href="${pageContext.request.contextPath}/style.css" />
<link rel="stylesheet" type="text/css" media="all" href="${pageContext.request.contextPath}/themes/brown/style.css" />
</head>
<body>
<div id="warp">
  <div id="main" class="container_16">
    
    <jsp:include page="header.jsp" />
    
    <div class="prodNav grid_16">
      <div class="breadcrumb grid_12 alpha">
      <c:url var="categoryUrl" value="byCat">
      <c:param name="category">${requestScope.item.category}</c:param>
      </c:url>
      
      <c:url var="subCategoryUrl" value="bySubCat">
      <c:param name="category">${requestScope.item.category}</c:param>
      <c:param name="subCategory">${requestScope.item.subCategory}</c:param>
      </c:url>
      
            <a href="${categoryUrl}">${requestScope.item.category}</a> &raquo; 
      <a href="${subCategoryUrl}">${requestScope.item.subCategory}</a> &raquo; ${requestScope.item.name}</div>
      <div class="browseCategory grid_4 omega">
        <form action="#" method="get">
          <select>
            <option>All Category</option>
            <option>Brownimissu</option>
            <option>Kue Tete</option>
            <option>Bagelan</option>
          </select>
        </form>
      </div>
    </div>
    <div class="bodyContent grid_16">
      <div class="blogPage grid_11 alpha">
        <div class="post">
          <p><img src="${pageContext.request.contextPath}/${requestScope.item.imagePath}" alt="" /></p>
          <h2>Lorem ipsum dolor sit amet, consectetuer adipiscing elit.</h2>
          <p>Lorem ipsum dolor sit amet, consectetuer adipiscing elit. vivamus tempor justo sit amet metus cursus consequat. Nulla viverra, felis vel accumsan fermentum, nisl enim aliquam risus, id convallis mauris turpis iaculis felis. Etiam sollucitudin augue et turpis. Vivamus rutrum metus. Lorem ipsum dolor sit amet, consectetuer adipiscing elit. vivamus tempor justo sit amet metus cursus consequat. Nulla viverra, felis vel accumsan fermentum, nisl enim aliquam risus, id convallis mauris turpis iaculis felis. Etiam sollucitudin augue et turpis. Vivamus rutrum metus.</p>
          <p>Lorem ipsum dolor sit amet, consectetuer adipiscing elit. vivamus tempor justo sit amet metus cursus consequat. Nulla viverra, felis vel accumsan fermentum, nisl enim aliquam risus, id convallis mauris turpis iaculis felis. Etiam sollucitudin augue et turpis. Vivamus rutrum metus.</p>
        </div>
      </div>
      <div class="sideBarProd grid_5 omega">
        <div class="sideBarWarp">
          <h3>${requestScope.item.name}</h3>
          <h4>$ ${requestScope.item.price}</h4>
          <p>Lorem ipsum dolor sit amet, consectetuer adipiscing elit. vivamus tempor justo sitouiet amet metus cursus consequat. Nullaiverra, felis vel accumsan fermentum, nisl enimuh.</p>
          <form action="#" method="get">
            <p>
              <label for="qty">Select Qty: </label>
              <select tabindex="1">
                <option>half dozen</option>
                <option>1 dozen</option>
              </select>
            </p>
            <p>
              <input type="submit" value="Add to Cart" tabindex="2" name="submit" class="addCart button" />
              <input type="hidden" value="30" name="comment_post_ID" />
            </p>
          </form>
          <ul>
            <li><a href="#"><img src="images/flickr1.jpg" alt="" /></a></li>
            <li><a href="#"><img src="images/flickr2.jpg" alt="" /></a></li>
            <li><a href="#"><img src="images/flickr3.jpg" alt="" /></a></li>
            <li><a href="#"><img src="images/flickr4.jpg" alt="" /></a></li>
          </ul>
          <div class="clear"></div>
        </div>
        <div class="fiveStar">
          <h4>Our Quality Guarantee</h4>
          <p><img src="images/star.png" alt="" /> <img src="images/star.png" alt="" /> <img src="images/star.png" alt="" /> <img src="images/star.png" alt="" /> <img src="images/star.png" alt="" /></p>
          <p>Lorem ipsum dolor sit amet, consectetuer adipiscing elit. vivamus tempor justo sit amet metus cursus consequat. Nulla viverra.</p>
        </div>
        <p><a href="#" class="viewOrder">View Order &amp; delivery details &raquo;</a></p>
      </div>
      <div id="chooseCake" class="grid_16">
        <div class="youLike grid_16">
          <h3>You might also like</h3>
        </div>
      </div>
      <div class="newCakes">
        <div class="newCake"><a href="#" class="grid_4"><img src="images/freshCake1.jpg" alt="" width="220" height="120" /></a></div>
        <div class="newCake"><a href="#" class="grid_4"><img src="images/freshCake2.jpg" alt="" width="220" height="120" /></a></div>
        <div class="newCake"><a href="#" class="grid_4"><img src="images/freshCake3.jpg" alt="" width="220" height="120" /></a></div>
        <div class="newCake"><a href="#" class="grid_4"><img src="images/freshCake4.jpg" alt="" width="220" height="120" /></a></div>
      </div>
    </div>
  </div>
  <div class="clear"></div>
</div>
<jsp:include page="footer.jsp" />

</html>