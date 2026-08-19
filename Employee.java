
class Employee{
String name;
int salary;
employee(String n, int s){
this.name = n;
this.salary = s;
}
}
class Manager extends Employee{
double bonus;
Manager(String n, int s, double b){
super(n, s);
this.bonus = b;
}
void display(){
System.out.println("Manager detail");
System.out.println("name:"+name);
System.out.println("salary:"+salary);
System.out.println("bonus:"+bonus);
}
}
class clerk extends Employee{
double allowance;
clerk(String n, int s, double a){
super(n, s);
this.allowance = a;
}
void display(){
System.out.println("Manager detail");
System.out.println("name:"+name);
System.out.println("salary:"+salary);
System.out.println("allowance:"+allowance);
}
}
public static void main(String[]args){
Manager m = new Manager("Rahul",50000,100000);
clerk c = new clerk("amit",45000,24000);
m.display();
c.display();
}
} 
