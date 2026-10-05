import java.time.LocalDate;

public class DateDetails {
    public static void main(String[] args) {

        LocalDate date = LocalDate.of(2026, 10, 5);

        System.out.println("Given Date: " + date);
        System.out.println("Day of Week: " + date.getDayOfWeek());
        System.out.println("Month: " + date.getMonth());
        System.out.println("Year: " + date.getYear());
    }
}