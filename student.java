class Student {
    private int registerNumber;
    private String name;
    private double marks;
    public Student(int registerNumber, String name, double marks) {
        this.registerNumber = registerNumber;
        this.name = name;
        this.marks = marks;
    }
    public void displayDetails() {
        System.out.println("Register Number: " + registerNumber);
        System.out.println("Name: " + name);
        System.out.println("Marks: " + marks);
    }
}
public class Main {
    public static void main(String[] args) {
        Student student1 = new Student(101, "John Doe", 85.5);
        Student student2 = new Student(102, "Jane Smith", 78.2);
        System.out.println("Details of Student 1:");
        student1.displayDetails();
        System.out.println();
        System.out.println("Details of Student 2:");
        student2.displayDetails();
    }
}