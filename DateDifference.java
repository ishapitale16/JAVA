import java.time.LocalDate;
import java.time.Period;

public class DateDifference {
    public static void main(String[] args) {

        LocalDate date1 = LocalDate.of(2024, 1, 10);
        LocalDate date2 = LocalDate.of(2026, 10, 5);

        Period difference = Period.between(date1, date2);

        System.out.println("First Date: " + date1);
        System.out.println("Second Date: " + date2);

        System.out.println("Difference:");
        System.out.println("Years: " + difference.getYears());
        System.out.println("Months: " + difference.getMonths());
        System.out.println("Days: " + difference.getDays());
    }
}