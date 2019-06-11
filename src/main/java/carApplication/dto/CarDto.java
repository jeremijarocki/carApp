package carApplication.dto;

public class CarDto {
    private Long id;
    private Long vin;
    private String mark;
    private String model;
    private String color;
    private Integer yearOfProduction;

    public CarDto() {
    }

    public CarDto(Long vin, String mark, String model, String color, Integer yearOfProduction) {
        this.vin = vin;
        this.mark = mark;
        this.model = model;
        this.color = color;
        this.yearOfProduction = yearOfProduction;
    }

    public CarDto(Long id, Long vin, String mark, String model, String color, Integer yearOfProduction) {
        this.id = id;
        this.vin = vin;
        this.mark = mark;
        this.model = model;
        this.color = color;
        this.yearOfProduction = yearOfProduction;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getVin() {
        return vin;
    }

    public void setVin(Long vin) {
        this.vin = vin;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Integer getYearOfProduction() {
        return yearOfProduction;
    }

    public void setYearOfProduction(Integer yearOfProduction) {
        this.yearOfProduction = yearOfProduction;
    }

    @Override
    public String toString() {
        return "CarDto{" +
                "id=" + id +
                ", vin=" + vin +
                ", mark='" + mark + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", yearOfProduction=" + yearOfProduction +
                '}';
    }

}

