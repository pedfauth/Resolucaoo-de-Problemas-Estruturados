import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        CarWash carWash = new CarWash();

        Service wash = new Service("Lavar", 75);
        Service oil = new Service("Troca de oleo", 250);

        carWash.addService(wash);
        carWash.addService(oil);

        Customer pedro = new Customer("Pedro", "41991129333");
        Car ferrari = new Car("AQP5I18", "Ferrari 488", pedro);
        Car polo = new Car("PQP7O77", "Volkswagem Polo", pedro);

        pedro.addCar(ferrari);
        pedro.addCar(polo);

        carWash.addCustomer(pedro);
        
        ArrayList<Service> servicesCarro1 = new ArrayList<>();
        servicesCarro1.add(wash);
        servicesCarro1.add(oil);
        carWash.processCarWash(ferrari, servicesCarro1);

        ArrayList<Service> servicesCarro2 = new ArrayList<>();
        servicesCarro2.add(wash);
        carWash.processCarWash(polo, servicesCarro2);

        System.out.println("O cliente " + pedro.getName() + " finalizou a compra.");
    }
}