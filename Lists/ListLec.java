package Lists;
import java.util.ArrayList;
import java.util.List;

public class ListLec {
    public static <Student> void main(String[] args) {
        /*
        List<String> myList;

        List<Student> studentList;


        List<String> strings = new ArrayList<>();
        // If you need to hold a primitive type in a List you should instead use the corresponding class version
        List<Integer> numbers = new ArrayList<>();

        // Adding Items to a List
        strings.add("A");
        strings.add("B");
        strings.add("C");

        // Adding item according to index
        strings.add(1, "D");

        // Removing Items from a List
        strings.remove("B");

        // Accessing Items in a List
        for(int i = 0; i < strings.size(); i++) {
            System.out.println(strings.get(i));
        }

        List<String> strings = new ArrayList<>();

        strings.add("A");
        strings.add("B");
        strings.add("C");
        strings.add("D");

        // strings.remove("B");

        // remove by index
        strings.remove(1);

        for(int i = 0; i < strings.size(); i++) {
            System.out.println(strings.get(i));
        }

         */

        // Enhanced For Loops and Lists
        List<String> strings = new ArrayList<>();

        strings.add("A");
        strings.add("B");
        strings.add("C");
        strings.add("D");

        for (String s : strings) {
            System.out.println(s);
        }

    }
}
