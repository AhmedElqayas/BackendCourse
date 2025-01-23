<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Update Product</title>
    <link rel="stylesheet" type="text/css" href="/resources/css/bootstrap.min.css">
    <link rel="stylesheet" type="text/css" href="/resources/css/style.css">
</head>
<body>
    <div class="container mt-5">
        <h1 class="text-center mb-4">Add New Product</h1>

        <form action="processUpdateProduct" method="POST" modelAttribute="productDetailsModel" class="border p-4 rounded shadow">
            <div class="mb-3">
                <label for="name" class="form-label">Product Name</label>
                <input type="text" name="name" id="name" class="form-control" value="${productDetails.name}" required>
            </div>

            <div class="mb-3">
                <label for="expirationDate" class="form-label">Expiration Date (yyyy-MM-dd)</label>
                <input type="date" name="expirationDate" id="expirationDate" class="form-control" value="${productDetails.expirationDate}" required>
            </div>

            <div class="mb-3">
                <label for="manufacturer" class="form-label">Manufacturer</label>
                <input type="text" name="manufacturer" id="manufacturer" class="form-control" value="${productDetails.manufacturer}" required>
            </div>

            <div class="mb-3">
                <label for="price" class="form-label">Price</label>
                <input type="number" name="price" id="price" class="form-control" value="${productDetails.price}" step="0.01" required>
            </div>

            <div class="mb-3">
                <label for="availability" class="form-label">Availability</label>
                <select name="availability" id="availability" class="form-select" required>
                   <option value="true" <c:if test="${productDetails.availability}">selected</c:if>>Available</option>
                               <option value="false" <c:if test="${!productDetails.availability}">selected</c:if>>Unavailable</option>
                </select>
            </div>

            <!-- Submit Button -->
            <div class="d-grid">
                <button type="submit" class="btn btn-primary">Update Product</button>
            </div>
        </form>
    </div>
</body>
</html>
