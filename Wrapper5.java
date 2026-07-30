import java.util.Scanner;

public class Wrapper5 {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
 System.out.print("Enter first number as string: ");
String s1 = sc.nextLine();
 System.out.print("Enter second number as string: ");
 String s2 = sc.nextLine();
System.out.print("Enter operation (+, -, *, /): ");
 char op = sc.next().charAt(0);
Integer n1 = Integer.valueOf(s1);
  Integer n2 = Integer.valueOf(s2);
switch (op) {
  case '+':
  System.out.println("Result = " + (n1 + n2));
 break;
 case '-':
  System.out.println("Result = " + (n1 - n2));
 break;
  case '*':
 System.out.println("Result = " + (n1 * n2));
  break;
  case '/':
 if (n2 != 0)
 System.out.println("Result = " + (n1 / n2));
  else
System.out.println("Division by zero is not allowed.");
break;

default:
 System.out.println("Invalid Operation");
        }
    }
}