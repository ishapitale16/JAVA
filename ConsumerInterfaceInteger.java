
import java.util.function.Consumer;
public class ConsumerInterfaceInteger {
    public static void main(String[] args) {
        Consumer<Integer> sq = n -> { System.out.println(n * n);};
        
        sq.accept(3);
    }
}
