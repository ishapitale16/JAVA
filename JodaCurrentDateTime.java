import java.time.LocalDateTime;

public class JodaCurrentDateTime {
    public static void main(String[] args) {

        LocalDateTime currentDateTime = LocalDateTime.now();

        System.out.println("Current Date and Time: " + currentDateTime);
    }
}