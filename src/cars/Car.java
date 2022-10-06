package cars;

import java.time.LocalDate;

public class Car {
    //    id, Марка, Модель, Год выпуска, Цвет, Цена, Регистрационный номер.
    private int id;
    private int dateOfIssue;
    private int price;
    private String brand;
    private String model;
    private String color;
    private String registrationNumber;


    public Car() {
    }

    public Car(int id, String brand, String model, String color, int dateOfIssue, int price,  String registrationNumber) {
        this.id = id;
        this.dateOfIssue = dateOfIssue;
        this.price = price;
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.registrationNumber = registrationNumber;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getDateOfIssue() {
        return dateOfIssue;
    }

    public void setDateOfIssue(int dateOfIssue) {
        this.dateOfIssue = dateOfIssue;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
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

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", dateOfIssue=" + dateOfIssue +
                ", price=" + price +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", registrationNumber='" + registrationNumber + '\'' +
                '}';
    }
}
