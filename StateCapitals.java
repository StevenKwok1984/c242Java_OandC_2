import java.util.*;

public class StateCapitals {

    public static void main(String[] args){
    // create a map names of all the states and their corresponding capital names

        Map<String, String> capitals = new HashMap<>();
        capitals.put("Alabama", "Montgomery");
        capitals.put("Alaska", "Juneau");
        capitals.put("Arizona", "Phoenix");
        capitals.put("Arkansas", "Little Rock");



        // get the Set of keys from the map
        Set<String> keys = capitals.keySet();

        System.out.println("STATES:\n" + "=======");
        // print all states
        for (String k : keys) {
            System.out.println(k);
        }
        System.out.println("....\n" + "....");
        System.out.println();


        // get the Set of values from the map
        Collection<String> capValues = capitals.values();
        System.out.println("CAPITALS:\n" + "=======");
        // print all states
        for (String p : capValues) {
            System.out.println(p);
        }
        System.out.println("....\n" + "....");
        System.out.println();

        // value and key
        // print the keys and associated values to the screen
        System.out.println("STATE/CAPITAL PAIRS:\n" + "====================");
        for (String k : keys) {
            System.out.println(k + " - " + capitals.get(k));
        }

    }
}
