interface abc {
    int display(int a, int b);
}
public class Multipleparameter {
    public static void main(String[]args){
        abc obj = (a, b) -> a + b;

        System.out.println("Sum = " + obj.display(5, 10));
    }
}