<%-- 
    Document   : san-pham-moi
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<div class="maincontent-area">
	<div class="zigzag-bottom"></div>
	<div class="container">
		<div class="row">
			<div class="col-md-12">
				<div class="latest-product">
					<h2 class="section-title">New Products</h2>
					<div class="product-carousel">
						<c:forEach items="${dsspm }" var="spm">
							<div class="single-product">
								<div class="product-f-image">
									<img src="img/${spm.hinhAnh }" alt="">
									<div class="product-hover">
										<a href="ThemVaoGioServlet?idsp=${spm.id}&slm=1"
											class="add-to-cart-link"><i class="fa fa-shopping-cart"></i>
											Thêm vào giỏ hàng</a> <a href="single-product.html"
											class="view-details-link"><i class="fa fa-link"></i> Xem
											chi tiết</a>
									</div>
								</div>
								<h2>
									<a href="single-product.html">${spm.tenSanPham }</a>
								</h2>
								<div class="product-carousel-price">
									<fmt:formatNumber value="${spm.donGia }"  pattern="#,###" 	var="donGia"></fmt:formatNumber>
									<fmt:formatNumber value="${spm.donGiaKM }" pattern="#,###"  var="donGiaKM"></fmt:formatNumber>
									<ins>${donGiaKM } đ</ins>
									<del>${donGia } đ</del>
								</div>
							</div>
						</c:forEach>

					</div>
				</div>
			</div>
		</div>
	</div>
</div>
<!-- End main content area -->
