class Student {
String name;
int roll_no;
String dept;
Student(String n, int rn, String dt) {
name = n;
roll_no = rn;
dept = dt;
}
 void display() {
 System.out.println("Name    : " + name);
 System.out.println("Roll No : " + roll_no);
  System.out.println("Dept    : " + dept);
 }
 public static void main(String[] args) {
  Student obj = new Student("Isha", 10, "CSE");
obj.display();
  }
}