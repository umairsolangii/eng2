
public class Vehicle {
    private String vehicleName;
    private String plateNumber;
    private double horsePower;

    public Vehicle(String vehicleName, String plateNumber, double horsePower) {
        this.horsePower = 0;
        this.plateNumber = "Uninitialized";
        this.vehicleName = "Uninitialized";
    }

    public void startVehicle() {
        System.out.println("Vroom Vroom, Car started.");
    }

    public void stopVehicle() {
        System.out.println("EEEEEEEEEEEEHHHH, Car stopped. ");
    }
}
