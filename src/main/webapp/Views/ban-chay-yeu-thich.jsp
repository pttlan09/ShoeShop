<%-- 
    Document   : ban-chay-yeu-thich
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<div class="product-widget-area">
	<div class="zigzag-bottom"></div>
	<div class="container">
		<div class="row">
			<div class="col-md-4">
				<div class="single-product-widget">
					<h2 class="product-wid-title">Top Sellers</h2>
					<a href="" class="wid-view-more">View All</a>
					<c:forEach items="${dsspyt }" var="spyt">
						<div class="single-wid-product">

							<a href="single-product.html"><img src="img/${spyt.hinhAnh }"
								alt="" class="product-thumb"></a>
							<h2>
								<a href="single-product.html">${spyt.tenSanPham}</a>
							</h2>
							<div class="product-wid-rating">
								<i class="fa fa-star"></i> <i class="fa fa-star"></i> <i
									class="fa fa-star"></i> <i class="fa fa-star"></i> <i
									class="fa fa-star"></i>
							</div>
							<div class="product-wid-price">
								<fmt:setLocale value="vi-VN" />
								<fmt:formatNumber value="${spyt.donGia }" type="number" var="donGia"></fmt:formatNumber>
								<fmt:formatNumber value="${spyt.donGiaKM }" type="number" var="donGiaKM"></fmt:formatNumber>
								<ins>${donGiaKM } đ</ins>
								<del>${donGia } đ</del>
							</div>
							
						</div>
					</c:forEach>

				</div>
			</div>
			<div class="col-md-4">
				<div class="single-product-widget">
					<h2 class="product-wid-title">Recently Viewed</h2>
					<a href="#" class="wid-view-more">View All</a>
					<div class="single-wid-product">
						<a href="single-product.html"><img
							src="img/product-thumb-4.jpg" alt="" class="product-thumb"></a>
						<h2>
							<a href="single-product.html">Sony playstation microsoft</a>
						</h2>
						<div class="product-wid-rating">
							<i class="fa fa-star"></i> <i class="fa fa-star"></i> <i
								class="fa fa-star"></i> <i class="fa fa-star"></i> <i
								class="fa fa-star"></i>
						</div>
						<div class="product-wid-price">
							<ins>$400.00</ins>
							<del>$425.00</del>
						</div>
					</div>
					<div class="single-wid-product">
						<a href="single-product.html"><img
							src="img/product-thumb-1.jpg" alt="" class="product-thumb"></a>
						<h2>
							<a href="single-product.html">Sony Smart Air Condtion</a>
						</h2>
						<div class="product-wid-rating">
							<i class="fa fa-star"></i> <i class="fa fa-star"></i> <i
								class="fa fa-star"></i> <i class="fa fa-star"></i> <i
								class="fa fa-star"></i>
						</div>
						<div class="product-wid-price">
							<ins>$400.00</ins>
							<del>$425.00</del>
						</div>
					</div>
					<div class="single-wid-product">
						<a href="single-product.html"><img
							src="img/product-thumb-2.jpg" alt="" class="product-thumb"></a>
						<h2>
							<a href="single-product.html">Samsung gallaxy note 4</a>
						</h2>
						<div class="product-wid-rating">
							<i class="fa fa-star"></i> <i class="fa fa-star"></i> <i
								class="fa fa-star"></i> <i class="fa fa-star"></i> <i
								class="fa fa-star"></i>
						</div>
						<div class="product-wid-price">
							<ins>$400.00</ins>
							<del>$425.00</del>
						</div>
					</div>
				</div>
			</div>
			<div class="col-md-4">
				<div class="single-product-widget">
					<h2 class="product-wid-title">Top New</h2>
					<a href="#" class="wid-view-more">View All</a>
					<div class="single-wid-product">
						<a href="single-product.html"><img
							src="img/product-thumb-3.jpg" alt="" class="product-thumb"></a>
						<h2>
							<a href="single-product.html">Apple new i phone 6</a>
						</h2>
						<div class="product-wid-rating">
							<i class="fa fa-star"></i> <i class="fa fa-star"></i> <i
								class="fa fa-star"></i> <i class="fa fa-star"></i> <i
								class="fa fa-star"></i>
						</div>
						<div class="product-wid-price">
							<ins>$400.00</ins>
							<del>$425.00</del>
						</div>
					</div>
					<div class="single-wid-product">
						<a href="single-product.html"><img
							src="img/product-thumb-4.jpg" alt="" class="product-thumb"></a>
						<h2>
							<a href="single-product.html">Samsung gallaxy note 4</a>
						</h2>
						<div class="product-wid-rating">
							<i class="fa fa-star"></i> <i class="fa fa-star"></i> <i
								class="fa fa-star"></i> <i class="fa fa-star"></i> <i
								class="fa fa-star"></i>
						</div>
						<div class="product-wid-price">
							<ins>$400.00</ins>
							<del>$425.00</del>
						</div>
					</div>
					<div class="single-wid-product">
						<a href="single-product.html"><img
							src="img/product-thumb-1.jpg" alt="" class="product-thumb"></a>
						<h2>
							<a href="single-product.html">Sony playstation microsoft</a>
						</h2>
						<div class="product-wid-rating">
							<i class="fa fa-star"></i> <i class="fa fa-star"></i> <i
								class="fa fa-star"></i> <i class="fa fa-star"></i> <i
								class="fa fa-star"></i>
						</div>
						<div class="product-wid-price">
							<ins>$400.00</ins>
							<del>$425.00</del>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
</div>
<!-- End product widget area -->
