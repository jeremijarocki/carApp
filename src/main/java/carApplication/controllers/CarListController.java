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
import java.util.List;

@WebServlet(name = "carListController", value = "/car/list")
public class CarListController extends HttpServlet {

    private CarService carService = new CarServiceInMemoryImpl();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<CarDto> cars = carService.findCars();
        req.setAttribute("carsModel", cars);
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("/cars_jsp/cars_jstl.jsp");
        requestDispatcher.forward(req, resp);
    }
}
