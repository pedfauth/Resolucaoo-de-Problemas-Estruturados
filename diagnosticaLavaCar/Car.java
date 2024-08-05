class Car {
    private String licensePlate;
    private String model;
    private Customer owner;

    public Car(String licensePlate, String model, Customer owner) {
        this.licensePlate = licensePlate;
        this.model = model;
        this.owner = owner;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public String getModel() {
       return model;
    }

    public Customer getOwner() {
       return owner;
    }
}
