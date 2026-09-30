
import java.util.function.Consumer;
public class ConsumerInterface {
    public static void main(String[] args) {
        Consumer<String>c = name ->{ System.out.println("Welcome " + name);};
        
        c.accept("Rahul");
    }
}
