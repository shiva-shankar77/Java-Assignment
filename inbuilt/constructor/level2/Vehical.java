class Vehicle {
    String ownerName;
    String vehicleType;
    static double registrationFee = 500;

    Vehicle(String owner, String type) {
        ownerName = owner;
        vehicleType = type;
    }

    void displayVehicleDetails() {
        System.out.println("Owner: " + ownerName + ", Vehicle: " + vehicleType + ", Registration Fee: " + registrationFee);
    }

    static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
    }

    public static void main(String[] args) {
        Vehicle v1 = new Vehicle("Ankit", "Car");
        Vehicle v2 = new Vehicle("Ravi", "Bike");
        v1.displayVehicleDetails();
        v2.displayVehicleDetails();
        Vehicle.updateRegistrationFee(600);
        v1.displayVehicleDetails();
        v2.displayVehicleDetails();
    }
}
