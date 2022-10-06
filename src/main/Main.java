package main;

import cars.Car;
import cars.CarFilters;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        ArrayList<Car> cars = new ArrayList<>();
        Car car1 = new Car(1, "Mercedes", "CLS350", "Black", 2015, 35000, "AH2530KA");
        Car car2 = new Car(2, "Mercedes", "GLE 250d", "White", 2022, 112000, "KI7777AA");
        Car car3 = new Car(3, "BMW", "350i", "Yellow", 2013, 45320, "KA9695CH");
        Car car4 = new Car(4, "Audi", "A6", "Black", 2013, 19000, "KA1239AH");
        Car car5 = new Car(5, "BMW", "X1", "White", 2013, 12500, "KI0000KI");
        Car car6 = new Car(6, "Mercedes", "CLS350", "Black", 2018, 70000, "AH3630KA");

        cars.add(car1);
        cars.add(car2);
        cars.add(car3);
        cars.add(car4);
        cars.add(car5);
        cars.add(car6);

        System.out.println("Cars sorted by brand:");
        ArrayList<Car> filteredCarsById = CarFilters.getCarByBrand(cars, "BMW");
        for (Car car : filteredCarsById) {
            System.out.println(car);
        }

        System.out.println("Cars sorted by model and year");
        ArrayList<Car> filteredCarsByModelAndYear = CarFilters.getCarByModelAndYear(cars, "CLS350", 5);
        for (Car car : filteredCarsByModelAndYear) {
            System.out.println(car);
        }

        System.out.println("Get cars by year and price");
        ArrayList<Car> filteredCarsByYearAndPrice = CarFilters.getCarByYearAndPrice(cars, 2013, 15000);
        for (Car car : filteredCarsByYearAndPrice) {
            System.out.println(car);
        }

    }
}