import java.util.Scanner;
class Stringtointeger{
public static void main(String[]args){
Scanner sc = new Scanner(System.in);
System.out.println("enter a string");
String str = sc.nextLine();
Integer num = Integer.valueOf(str);

System.out.println("String:"+str);
System.out.println("Wrapper obj:"+num);
System.out.println("Primitive Value"+num.intValue());
}
}