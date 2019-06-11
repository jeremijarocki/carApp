<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: HP
  Date: 07.02.2019
  Time: 21:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>List of cars</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.2.1/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.6/umd/popper.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.2.1/js/bootstrap.min.js"></script>
    <meta name="viewport" content="width=device-width, initial-scale=1">

</head>
<body>
<jsp:include page="nav.jsp"/>
<div class="container-fluid">
    <table class="table">
        <thead>
        <tr>
            <th>Vin number</th>
            <th>Mark of the car</th>
            <th>Model of the car</th>
            <th>Color of the car</th>
            <th>Year of production of the car</th>
            <th></th>
        </tr>
        </thead>
        <tbody>
        <c:forEach items="${carsModel}" var="car">
            <tr>
                <td>${car.vin}</td>
                <td>${car.mark}</td>
                <td>${car.model}</td>
                <td>${car.color}</td>
                <td>${car.yearOfProduction}</td>
                <td><a href="/car?id=${car.id}">Edit</a></td>
                <td><a href="/car/delete?id=${car.id}">Delete</a></td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
</div>
</body>
</html>
