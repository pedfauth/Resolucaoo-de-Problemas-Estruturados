import java.util.ArrayList;
import java.util.List;

class CarWash {
    private List<Customer> customers;
    private List<Service> services;

    public CarWash() {
       this.customers = new ArrayList<>();
       this.services = new ArrayList<>();
    }

    public void addCustomer(Customer customer) {
        customers.add(customer);
    }

    public void addService(Service service) {
        services.add(service);
    }

    public void processCarWash(Car car, List<Service> selectedServices) {
        double totalCost = 0;
        System.out.println("Processando a lavagem para o carro: " + car.getModel() + " Placa: " + car.getLicensePlate());

       for(Service service : selectedServices){
            System.out.println("Serviço: " + service.getName() + " - $" + service.getPrice());
            totalCost += service.getPrice();
        }
        System.out.println("Custo total: $" + totalCost);
    }
}