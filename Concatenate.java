import java.util.Scanner;

class Concatenate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str1 = sc.nextLine();
        String str2 = sc.nextLine();

        String res = str1 + " " + str2;

        System.out.println("Result: " + res);
    }
}
