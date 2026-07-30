import java.util.Scanner;
class Wrapper2{
public static void main(String[]args){
Scanner sc = new Scanner(System.in);
System.out.println("enter first no as string");
String s1 = sc.nextLine();
System.out.println("enter second no as string");
String s2 = sc.nextLine();

Integer n1 = Integer.valueOf(s1);
Integer n2 = Integer.valueOf(s2);
System.out.println("Sum:"+(n1+n2));
}
}


