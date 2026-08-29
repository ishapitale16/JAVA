import java.util.Scanner;

public class EvenNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        try {
            if (n % 2 != 0) {
                throw new Exception("Number is not even");
            }

            System.out.println("Number is even");
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
