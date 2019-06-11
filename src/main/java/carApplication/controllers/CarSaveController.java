package carApplication.controllers;

import carApplication.dto.CarDto;
import carApplication.services.CarService;
import carApplication.services.CarServiceInMemoryImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "carSaveController", value = "/car/save")
public class CarSaveController extends HttpServlet {

    private CarService carService = new CarServiceInMemoryImpl();

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String id = req.getParameter("id");
        String vin = req.getParameter("vin");
        String mark = req.getParameter("mark");
        String model = req.getParameter("model");
        String color = req.getParameter("color");
        String yearOfProduction = req.getParameter("yearOfProduction");

        Long carId = null;
        Long carVin = null;
        Integer carYearOfProduction = null;

        try {
            carId = Long.valueOf(id);
        } catch (NumberFormatException e) {
        }
        try {
            carVin = Long.valueOf(vin);
        } catch (NumberFormatException e) {
        }
        try {
            carYearOfProduction = Integer.valueOf(yearOfProduction);
        } catch (NumberFormatException e) {
        }

        CarDto formCarDto = new CarDto(carId, carVin, mark, model, color, carYearOfProduction);
        carService.save(formCarDto);
        resp.sendRedirect("/car/list");
    }
}
