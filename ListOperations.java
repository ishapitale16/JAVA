import java.util.*;

public class ListOperations {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();

        // Insertion
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);

        System.out.println("After insertion: " + list);

        // Deletion
        list.remove(Integer.valueOf(20));
        System.out.println("After deletion: " + list);

        // Searching
        int search = 30;

        if (list.contains(search)) {
            System.out.println(search + " is found in the list.");
        } else {
            System.out.println(search + " is not found in the list.");
        }

        // Display
        System.out.println("Elements in the list:");

        for (Integer element : list) {
            System.out.println(element);
        }
    }
}
