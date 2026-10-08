import java.time.LocalDate;
import java.time.Period;
public class DateTimeDiff {
    public static void main(String[] args) {
        LocalDate d1 = LocalDate.of(2024,1,1);
                LocalDate d2 = LocalDate.of(2026,6,30);
Period p = Period.between(d1,d2);
System.out.println("year " + p.getYears());
System.out.println("Month " + p.getMonths());
System.out.println("Day " + p.getDays());
    }
}
