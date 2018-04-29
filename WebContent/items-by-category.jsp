<%@ taglib uri="/WEB-INF/c.tld" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<title>CakeShop | Product Overview</title>
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
      <div class="prodHeadline grid_12 alpha">
        <h3>Cakes</h3>
      </div>
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
      <div class="products grid_16 alpha">
        <c:forEach var="itemSubCat" items="${requestScope.itemsMap}">
        <div class="prodMenu">
          <h4>${itemSubCat.key} <a href="bySubCat?category=${param.category}&subCategory=${itemSubCat.key}" class="viewAll">View All &raquo;</a></h4>
          <c:forEach var="item" items="${itemSubCat.value}">
          <div class="menu grid_4 alpha">
            <p><a href="itm?id=${item.id}" class="grid_4 alpha"><img src="${pageContext.request.contextPath}/${item.imagePath}" alt="" width="220" height="120" /></a><br />
              <a href="itm?id=${item.id}">${item.name}</a></p>
          </div>
          </c:forEach>
        </div>
        </c:forEach>
      </div>
      <div class="commentPages grid_16">
        <ul>
          <li><a href="#">&laquo; Prev</a></li>
          <li><a href="#" class="commentPageActive">1</a></li>
          <li><a href="#">2</a></li>
          <li><a href="#">3</a></li>
          <li><a href="#">4</a></li>
          <li><a href="#">Next &raquo;</a></li>
        </ul>
      </div>
    </div>
  </div>
  <div class="clear"></div>
</div>
<jsp:include page="footer.jsp" />
</html>