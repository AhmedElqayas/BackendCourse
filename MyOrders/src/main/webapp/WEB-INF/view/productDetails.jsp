<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Product Details</title>
    <link rel="stylesheet" href="/resources/css/bootstrap.min.css">
</head>
<body>
    <div class="container mt-5">
        <h1 class="text-center mb-4">Product Details</h1>
        <div class="card">
            <div class="card-header bg-primary text-white">
                <h3>Product Name: <span>${productDetails.name}</span></h3>
            </div>
            <div class="card-body">
                <table class="table table-striped">
                    <tbody>
                        <tr>
                            <th>Expiration Date</th>
                            <td>${productDetails.expirationDate}</td>
                        </tr>
                        <tr>
                            <th>Manufacturer</th>
                            <td>${productDetails.manufacturer}</td>
                        </tr>
                        <tr>
                            <th>Price</th>
                            <td>${productDetails.price}</td>
                        </tr>
                        <tr>
                            <th>Availability</th>
                            <td>
                                <span class="badge ${productDetails.availability ? 'bg-success' : 'bg-danger'}">
                                    ${productDetails.availability ? 'Available' : 'Out of Stock'}
                                </span>
                            </td>
                        </tr>
                    </tbody>
                </table>
            </div>
        </div>
    </div>
</body>
</html>
