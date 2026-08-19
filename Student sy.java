interface FY {
    int rollno = 101;
    String name = "Isha";
}

interface SY {
    String result = "Pass";
}

class Student implements FY, SY {

    void display() {
        System.out.println("Roll No: " + rollno);
        System.out.println("Name: " + name);
        System.out.println("Result: " + result);
    }
}

public class StudentDemo {
    public static void main(String[] args) {

        Student s = new Student();

        s.display();
    }
}
