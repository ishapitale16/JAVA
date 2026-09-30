@FunctionalInterface 
interface Message{
    void show();
}
class Functional{
    public static void main(String[] args) {
        Message m = () -> {
        System.out.println("hello");
        };
        m.show();
    }
}