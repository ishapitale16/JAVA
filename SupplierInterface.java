import java.util.function.*;
public class SupplierInterface {
    public static void main(String[] args) {
        Supplier<String>s = () -> "java";
    System.out.println(s.get());
    }
    
}
