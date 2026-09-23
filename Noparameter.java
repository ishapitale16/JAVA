interface noparameter {
    void display();
}
public class Noparameter{
    public static void main(String[]args){
        noparameter obj = () -> {
            System.out.println("Hello World");
        };
        obj.display();
    }
}