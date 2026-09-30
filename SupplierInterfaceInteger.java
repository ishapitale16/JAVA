import java.util.function.*;
public class SupplierInterfaceInteger {
    public static void main(String[] args) {
        Supplier<Integer>s = () -> (10);
    System.out.println(s.get());
    }
    
}
