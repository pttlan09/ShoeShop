<%-- 
    Document   : cua-hang
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<div class="product-big-title-area">
	<div class="container">
		<div class="row">
			<div class="col-md-12">
				<div class="product-bit-title text-center">
					<h2>Shop</h2>
				</div>
			</div>
		</div>
	</div>
</div>


<div class="single-product-area">
	<div class="zigzag-bottom"></div>
	<div class="container">
		<div class="row">
			<c:forEach items="${dssp}" var="sp">
				<div class="col-md-3 col-sm-6">
					<div class="single-shop-product">
						<div class="product-upper">
							<img src="img/${sp.hinhAnh }" alt="">
						</div>
						<h2>
							<a href="">${sp.tenSanPham } :P</a>
						</h2>
						<div class="product-carousel-price">
							<ins>$899.00</ins>
							<del>$999.00</del>
						</div>

						<div class="product-option-shop">
							<a class="add_to_cart_button" data-quantity="1"
								data-product_sku="" data-product_id="70" rel="nofollow"
								href="/canvas/shop/?add-to-cart=70">Add to cart</a>
						</div>
					</div>
				</div>
			</c:forEach>

			<div class="row">
				<div class="col-md-12">
					<div class="product-pagination text-center">
						<nav>
							<ul class="pagination">
								<li><a href="#" aria-label="Previous"> <span
										aria-hidden="true">&laquo;</span>
								</a></li>
								<li><a href="#">1</a></li>
								<li><a href="#">2</a></li>
								<li><a href="#">3</a></li>
								<li><a href="#">4</a></li>
								<li><a href="#">5</a></li>
								<li><a href="#" aria-label="Next"> <span
										aria-hidden="true">&raquo;</span>
								</a></li>
							</ul>
						</nav>
					</div>
				</div>
			</div>
		</div>
	</div>