package carApplication.services;

import carApplication.dto.CarDto;

import java.util.List;

public interface CarService {

    List<CarDto> findCars();
    CarDto findCarById(Long carId);
    void save (CarDto carDto);
    void delete (Long id);
}
