
import java.util.Scanner;

class Replace {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter string:");
        String str = sc.nextLine();

        System.out.println("Enter index:");
        int index = sc.nextInt();

        System.out.println("Enter char:");
        char ch = sc.next().charAt(0);

        StringBuilder sb = new StringBuilder(str);
        sb.setCharAt(index, ch);

        System.out.println("Updated String: " + sb.toString());

        sc.close();
    }
}
