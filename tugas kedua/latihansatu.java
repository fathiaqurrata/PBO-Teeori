public class latihansatu {
    class Engine {
        public void start() {
            System.out.println("Engine started");
        }
    }
    
    class Car {
        public void startCar(Engine engine) {
            engine.start();
            System.out.println("Car started");
        }
    }
    
    public static void main(String[] args) {
        latihansatu program = new latihansatu(); // Membuat objek dari kelas luar
        Car car = program.new Car(); // Membuat objek dari inner class
        Engine engine = program.new Engine(); // Membuat objek Engine
        car.startCar(engine); // Menggunakan Engine sebagai dependensi
    }
}
