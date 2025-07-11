public class Student {
    private int id;
    private String name;
    private String department;

    public Student(int id, String name, String department){
        this.id = id;
        this.name = name;
        this.department = department;
    }

    public void displayDetails(){
        System.out.println("The Student id is: " + this.id);
        System.out.println("The Student name: " + this.name);
        System.out.println("The Student Department: " + this.department);
    }
}

class StudentDemo {
    public static void main(String[] args) {
        Student s = new Student(34, "Santhosh", "EEE");
        s.displayDetails();
    }
}
