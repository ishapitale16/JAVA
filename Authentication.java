import java.util.Scanner;

public class Authentication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter password: ");
        String password = sc.nextLine();

        try {
            if (!password.equals("1234")) {
                throw new Exception("Authentication Failure!");
            }

            System.out.println("Login Successful");
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
