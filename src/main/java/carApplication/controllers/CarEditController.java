package carApplication.controllers;

import carApplication.dto.CarDto;
import carApplication.services.CarService;
import carApplication.services.CarServiceInMemoryImpl;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "carEditController", value = "/car")
public class CarEditController extends HttpServlet {

    private CarService carService = new CarServiceInMemoryImpl();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String id = req.getParameter("id");
        Long carId = Long.valueOf(id);
        CarDto carDto = carService.findCarById(carId);
        req.setAttribute("car", carDto);
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("/cars_jsp/car.jsp");
        requestDispatcher.forward(req, resp);
    }
}
