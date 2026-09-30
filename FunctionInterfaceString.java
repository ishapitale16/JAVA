import java.util.function.*;
public class FunctionInterfaceString {
    public static void main(String[] args) {
        Function<String,Integer>len = str -> str.length();
        System.out.println(len.apply("java"));
    }
}
