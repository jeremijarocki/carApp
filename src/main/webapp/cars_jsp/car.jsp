<%--
  Created by IntelliJ IDEA.
  User: HP
  Date: 07.02.2019
  Time: 21:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.2.1/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.6/umd/popper.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.2.1/js/bootstrap.min.js"></script>
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <title>Adding a new car</title>
</head>
<body>

<jsp:include page="nav.jsp"/>
<div class="container-fluid">
    <form action="/car/save" method="POST">
        <input type="hidden" name="id" value="${car.id}">
        <div class="form-group">
            <label for="vin">Vin number of the car</label>
            <input type="number" name="vin" class="form-control" id="vin" value="${car.vin}">
        </div>
        <div class="form-group">
            <label for="mark">Mark of the car</label>
            <input type=text" name="mark" class="from-control" id="mark" value="${car.mark}">
        </div>
        <div class="form-group">
            <label for="model">Model of the car</label>
            <input text="text" name="model" class="form-control" id="model" value="${car.model}">
        </div>
        <div class="form-group">
            <label for="color">Color of the car</label>
            <input type="text" name="color" class="form-control" id="color" value="${car.color}">
        </div>
        <div class="form-group">
            <label for="yearOfProduction">Year of production of the car</label>
            <input type="number" name="yearOfProduction" class="form-control" id="yearOfProduction" value="${car.yearOfProduction}">
        </div>
        <br><br>
        <input type="submit" value="Submit">

    </form>
</div>
<p>If you click the "Submit" button, the form will be saved in the database</p>
</body>
</html>
