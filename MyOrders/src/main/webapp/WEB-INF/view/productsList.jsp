<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Products List</title>
    <link rel="stylesheet" href="/resources/css/bootstrap.min.css">
    <link rel="stylesheet" type="text/css" href="/resources/css/style.css">
</head>
<body>
    <div class="container table-container">
        <h2 class="text-center mb-4">Products List</h2>
        <table class="table table-bordered table-hover">
            <thead class="table-dark">
                <tr>
                    <th>ID</th>
                    <th>Name</th>
                    <th>View</th>
                    <th>Update</th>
                    <th>Delete</th>
                </tr>
            </thead>
            <tbody>
                <c:forEach var="product" items="${productsList}">
                    <tr>
                        <td>${product.id}</td>
                        <td>${product.name}</td>
                        <td>
                            <form action="products/${product.id}" method="GET" class="d-inline">
                            <button type="submit" class="btn btn-primary btn-sm">Show Details</button>
                            </form>
                        </td>
                         <td>
                            <form action="products/update/${product.id}" method="GET" style="margin: 0;">
                            <button type="submit" class="btn btn-warning btn-sm">Update</button>
                            </form>
                         </td>
                         <td>
                            <form action="products/delete/${product.id}" method="DELETE" style="margin: 0;">
                               <button type="submit" class="btn btn-danger btn-sm">Delete</button>
                            </form>
                         </td>
                    </tr>
                </c:forEach>
            </tbody>
        </table>
         <form:form action="addProduct">
                <input type="submit" class="btn btn-success" value="Add new Product"/>
         </form:form>
    </div>
</body>
</html>
