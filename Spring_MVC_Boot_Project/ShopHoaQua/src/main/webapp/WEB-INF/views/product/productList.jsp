<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:forEach items="${allProducts}" var="product">
    <div class="product-item">
        <a class="" href="${pageContext.request.contextPath}/products/${product.id}"> <span class="image">
                    <c:choose>
                        <c:when test="${not empty product.image}">
                            <img class="product-image img-responsive"
                                 src="${pageContext.request.contextPath}/images/${product.image}" alt=""/>
                        </c:when>
                        <c:otherwise>
                            <img class="product-image img-responsive"
                                 src="${pageContext.request.contextPath}/images/defaultProduct.png" alt=""/>
                        </c:otherwise>
                    </c:choose>

            <span class="product-right-icon"> <i class="tikicon icon-2h"></i>
                            </span>
                        </span> <span class="title">${product.name}</span>
            <p class="author">Nguyễn Nhật Ánh</p>
            <p class="price-sale">
                <span class="final-price">57.399&nbsp;₫</span> <span class="price-regular">82.000&nbsp;₫</span> <span
                    class="sale-tag sale-tag-square">-30%</span>
            </p>
            <div class="review-wrap">
                <p class="rating">
                    <span class="fa fa-star checked"></span> <span class="fa fa-star checked"></span> <span
                        class="fa fa-star checked"></span> <span class="fa fa-star"></span>
                    <span class="fa fa-star"></span>
                </p>
                <p class="review">(1265 nhận xét)</p>
            </div>
        </a>
    </div>
</c:forEach>