package carApplication.services;

import carApplication.dto.CarDto;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class CarServiceInMemoryImplTest {

    private CarService carService = new CarServiceInMemoryImpl();

    @Test
    public void shouldFindAllCars() {
        List<CarDto> cars = carService.findCars();
        Assert.assertEquals(4, cars.size());
    }

    @Test
    public void shouldFindCarById() {
        CarDto carDto = carService.findCarById(1l);
        Assert.assertEquals("Fiat", carDto.getMark());
    }

    @Test
    public void shouldNotFindCarById() {
        CarDto carDto = carService.findCarById(5l);
        Assert.assertNull(carDto);
    }
    @Test
    public void shouldEditCar() {
        CarDto carDto = new CarDto(1l, 12313l, "FSO", "Polonez", "Gówniany", 1991);
        carService.save(carDto);
        CarDto carDtoChanged = carService.findCarById(1l);
        Assert.assertEquals("FSO", carDtoChanged.getMark());
    }

    @Test
    public void shouldAddNewCar() {
        CarDto carDto = new CarDto(19913l, "Citroen", "Xsara", "Wrzosowy", 2001);
        carService.save(carDto);
        CarDto carDtoAdded = carService.findCarById(5l);
        Assert.assertEquals("Citroen", carDtoAdded.getMark());
    }
}