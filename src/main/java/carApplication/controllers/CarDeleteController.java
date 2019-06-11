package carApplication.controllers;

import carApplication.services.CarService;
import carApplication.services.CarServiceInMemoryImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet (name="carDeleteController", value = "/car/delete")
public class CarDeleteController extends HttpServlet {

    CarService carService = new CarServiceInMemoryImpl();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Long carId = Long.valueOf(req.getParameter("id"));
        carService.delete(carId);

        resp.sendRedirect("/car/list");
    }
}
