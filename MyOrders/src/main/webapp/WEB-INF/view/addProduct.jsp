<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Add New Product</title>
    <link rel="stylesheet" type="text/css" href="/resources/css/bootstrap.min.css">
    <link rel="stylesheet" type="text/css" href="/resources/css/style.css">
</head>
<body>
    <div class="container mt-5">
        <h1 class="text-center mb-4">Add New Product</h1>

        <!-- Product Form -->
        <form action="processAddProduct" method="POST" modelAttribute="productDetailsModel" class="border p-4 rounded shadow">
            <!-- Product Name -->
            <div class="mb-3">
                <label for="name" class="form-label">Product Name</label>
                <input type="text" name="name" id="name" class="form-control" placeholder="Enter product name" required>
            </div>

            <!-- Expiration Date -->
            <div class="mb-3">
                <label for="expirationDate" class="form-label">Expiration Date (yyyy-MM-dd)</label>
                <input type="date" name="expirationDate" id="expirationDate" class="form-control" required>
            </div>

            <!-- Manufacturer -->
            <div class="mb-3">
                <label for="manufacturer" class="form-label">Manufacturer</label>
                <input type="text" name="manufacturer" id="manufacturer" class="form-control" placeholder="Enter manufacturer name" required>
            </div>

            <!-- Price -->
            <div class="mb-3">
                <label for="price" class="form-label">Price</label>
                <input type="number" name="price" id="price" class="form-control" placeholder="Enter price in USD" step="0.01" required>
            </div>

            <!-- Availability -->
            <div class="mb-3">
                <label for="availability" class="form-label">Availability</label>
                <select name="availability" id="availability" class="form-select" required>
                    <option value="" disabled selected>-- Select Availability --</option>
                    <option value="true">Available</option>
                    <option value="false">Out of Stock</option>
                </select>
            </div>

            <!-- Submit Button -->
            <div class="d-grid">
                <button type="submit" class="btn btn-primary">Add Product</button>
            </div>
        </form>
    </div>
</body>
</html>
