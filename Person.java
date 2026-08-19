class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void walk() {
        System.out.println(name + " is walking.");
    }
}

class Student extends Person {

    Student(String name, int age) {
        super(name, age);
    }
}

interface Sport {
    void play();
}

class SportStudent extends Student implements Sport {

    SportStudent(String name, int age) {
        super(name, age);
    }

    public void play() {
        System.out.println(name + " is playing a sport.");
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

public class SportStudentDemo {
    public static void main(String[] args) {
        SportStudent s = new SportStudent("Isha", 20);

        s.display();
        s.walk();
        s.play();
    }
}
