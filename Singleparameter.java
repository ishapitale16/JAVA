interface sq {
    int display(int n);
}
public class Singleparameter {
    public static void main(String[]args){
         sq s = n -> n * n;

        System.out.println("Square = " + s.display(5));
        }
       
}
