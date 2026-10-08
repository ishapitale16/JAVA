import java.time.LocalDate;

class LocalDateToday {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        System.out.println(today);
                System.out.println(today.getDayOfMonth());
        System.out.println(today.getYear());
        System.out.println(today.getMonth());


                
    }
}