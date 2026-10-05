import java.time.LocalDate;

class JodaDateOperations {
    public static void main(String[] args) {

        LocalDate date = LocalDate.of(2026, 10, 5);

        System.out.println("Original Date: " + date);

        System.out.println("After adding 10 days: "
                + date.plusDays(10));

        System.out.println("After adding 2 months: "
                + date.plusMonths(2));

        System.out.println("After adding 1 year: "
                + date.plusYears(1));

        System.out.println("After subtracting 10 days: "
                + date.minusDays(10));

        System.out.println("After subtracting 2 months: "
                + date.minusMonths(2));

        System.out.println("After subtracting 1 year: "
                + date.minusYears(1));
    }
}