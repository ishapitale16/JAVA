import java.util.Scanner;
class Largest{
public static void main(String[]args){
Scanner sc = new Scanner(System.in);
System.out.println("enter first no as string");
String s1 = sc.nextLine();
System.out.println("enter second no as string");
String s2 = sc.nextLine();
System.out.println("enter third no as string");
String s3 = sc.nextLine();
Integer n1 = Integer.valueOf(s1);
Integer n2 = Integer.valueOf(s2);
Integer n3 = Integer.valueOf(s3);
Integer largest = n1;
if (n2 > largest)
largest = n2;
if (n3 > largest)
largest = n3;
System.out.println("Largest Number = " + largest);
    }
}