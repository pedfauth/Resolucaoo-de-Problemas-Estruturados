import java.util.ArrayList;
import java.util.List;

class Customer {
    private String name;
    private String phone;
    private List<Car> cars;

    public Customer(String name, String phone) {
        this.name = name;
        this.phone = phone;
        this.cars = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public List<Car> getCars() {
       return cars;
    }

    public void addCar(Car car) {
        cars.add(car);
    }
}
