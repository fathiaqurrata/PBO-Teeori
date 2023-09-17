public class semuaRelasi {
    // Kelas dasar
    class Vehicle {
        String brand;

        public Vehicle(String brand) {
            this.brand = brand;
        }

        public void start() {
            System.out.println(brand + " is starting");
        }

        public void stop() {
            System.out.println(brand + " is stopping");
        }
    }

    // Kelas turunan dari Vehicle
    class Car extends Vehicle {
        public Car(String brand) {
            super(brand);
        }

        public void drive() {
            System.out.println(brand + " is driving");
        }
    }

    // Kelas yang bergantung pada Vehicle (Dependency)
    class Driver {
        private String name;
        private Vehicle vehicle;

        public Driver(String name, Vehicle vehicle) {
            this.name = name;
            this.vehicle = vehicle;
        }

        public void driveVehicle() {
            System.out.println(name + " is driving " + vehicle.brand);
            vehicle.start();
        }

        public void parkVehicle() {
            System.out.println(name + " is parking " + vehicle.brand);
            vehicle.stop();
        }
    }

    // Kelas yang menggunakan Aggregation terhadap Vehicle
    class Garage {
        private Vehicle[] vehicles;

        public Garage(int capacity) {
            vehicles = new Vehicle[capacity];
        }

        public void parkVehicle(Vehicle vehicle) {
            for (int i = 0; i < vehicles.length; i++) {
                if (vehicles[i] == null) {
                    vehicles[i] = vehicle;
                    System.out.println(vehicle.brand + " is parked in the garage.");
                    break;
                }
            }
        }

        public void listVehicles() {
            System.out.println("Vehicles in the garage:");
            for (Vehicle vehicle : vehicles) {
                if (vehicle != null) {
                    System.out.println(vehicle.brand);
                }
            }
        }
    }

    public static void main(String[] args) {
        semuaRelasi program = new semuaRelasi();
        Car car = program.new Car("Toyota");
        Driver driver = program.new Driver("John", car);
        Garage garage = program.new Garage(3);

        driver.driveVehicle();
        driver.parkVehicle();

        garage.parkVehicle(car);
        garage.listVehicles();
    }
}
