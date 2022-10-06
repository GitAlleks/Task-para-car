package cars;

import java.time.LocalDate;
import java.util.ArrayList;

public class CarFilters {
    public static ArrayList<Car> getCarByBrand(ArrayList<Car> cars, String brand) {
        ArrayList<Car> carsToReturn = new ArrayList<Car>();
        for(Car car : cars) {
            if (car.getBrand().equals(brand)) {
                carsToReturn.add(car);
            }
        }
        return carsToReturn;
    }

    public static ArrayList<Car> getCarByModelAndYear(ArrayList<Car> cars, String model, int year) {
        ArrayList<Car> carsToReturn = new ArrayList<>();
        LocalDate currentDate = LocalDate.now();
        int differentOfYears;
        for (Car car : cars) {
            differentOfYears = currentDate.getYear() - car.getDateOfIssue();
            if (car.getModel().equals(model) && (differentOfYears > year)) {
                carsToReturn.add(car);
            }
        }
        return carsToReturn;
    }

    public static ArrayList<Car> getCarByYearAndPrice(ArrayList<Car> cars, int year, int price) {
        ArrayList<Car> carsToReturn = new ArrayList<>();
        for (Car car : cars) {
            if (car.getDateOfIssue() == year && car.getPrice() > price) carsToReturn.add(car);
        }
        return carsToReturn;
    }
}
