package carApplication.controllers;

import carApplication.dto.CarDto;

import javax.jws.WebService;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "carAddController", value = "/car/add")
public class CarAddController extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("car", new CarDto());
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("/cars_jsp/car.jsp");
        requestDispatcher.forward(req, resp);
    }
}
