public class latihanTiga {
    class Animal {
        public void eat() {
            System.out.println("Animal is eating");
        }
    }
    
    class Dog extends Animal {
        public void bark() {
            System.out.println("Dog is barking");
        }
    }
    
    public static void main(String[] args) {
        latihanTiga mainClass = new latihanTiga();
        Dog dog = mainClass.new Dog();
        dog.eat();  // Memanggil metode dari kelas induk
        dog.bark(); // Memanggil metode dari kelas anak
    }
}
