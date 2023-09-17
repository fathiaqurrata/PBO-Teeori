public class latihanDua {
    class Student {
        private String name;
        private int studentId;  
        
        public Student(String name, int studentId) {
            this.name = name;
            this.studentId = studentId;
        } 
        
        public String getName() {
            return name;
        }
        
        public void setName(String name) {
            this.name = name;
        }
        
        public int getStudentId() {
            return studentId;
        }
        
        public void setStudentId(int studentId) {
            this.studentId = studentId;
        }
    }
    class Classroom {
        private String className;
        private Student[] students;    
        
        public Classroom(String className, int capacity) {
            this.className = className;
            this.students = new Student[capacity];
        }
        public void addStudent(Student student) {
            for (int i = 0; i < students.length; i++) {
                if (students[i] == null) {
                    students[i] = student;
                    break;
                }
            }
        }
    }   
    public static void main(String[] args) {
        
        latihanDua outerInstance = new latihanDua(); // Buat instance dari outer class
        Student student1 = outerInstance.new Student("Alice", 101); 
        // Gunakan instance outer class untuk membuat instance inner class
        Student student2 = outerInstance.new Student("Bob", 102);   
        Classroom classroom = outerInstance.new Classroom("Class A", 30); 
        // Gunakan instance outer class untuk membuat instance inner class
        classroom.addStudent(student1);
        classroom.addStudent(student2);       
        
        // Contoh penggunaan getter
        System.out.println("Student 1 Name: " + student1.getName());
        System.out.println("Student 1 ID: " + student1.getStudentId());
    }
}
