package carApplication.services;

import carApplication.dto.CarDto;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CarServiceInMemoryImpl implements CarService {

    private static Map<Long, CarDto> cars = new HashMap<>();

    {
        cars.put(1l, new CarDto(1l, 43146l, "Fiat", "Tipo", "Silver", 2017));
        cars.put(2l, new CarDto(2l, 431346l, "Audi", "A3", "Red", 2014));
        cars.put(3l, new CarDto(3l, 43164l, "BMW", "M3", "Black", 2012));
        cars.put(4l, new CarDto(4l, 41236l, "Opel", "Astra", "Blue", 2018));
    }

    @Override
    public List<CarDto> findCars() {
        return new ArrayList<>(cars.values());
    }

    @Override
    public CarDto findCarById(Long carId) {
        return cars.get(carId);
    }

    @Override
    public void save(CarDto carDto) {
        Long id = carDto.getId();
        if (id != null) {
            CarDto savedCar = cars.get(id);
            savedCar.setVin(carDto.getVin());
            savedCar.setMark(carDto.getMark());
            savedCar.setModel(carDto.getModel());
            savedCar.setColor(carDto.getColor());
            savedCar.setYearOfProduction(carDto.getYearOfProduction());
        } else {
            long carsNumber = cars.size();
            carsNumber++;
            carDto.setId(carsNumber);
            cars.put(carsNumber, carDto);
        }
    }

    @Override
    public void delete(Long id) {
        cars.remove(id);
    }
}
