package Maps;

import java.util.*;

public class MapLec {
    public static void main(String[] args) {
        /*
        // Instantiating a Map
        Map<String, Integer> populations = new HashMap<>();

        // Adding Data to a Map
        // add the first country
        populations.put("USA", 313000000);

        // add the next country
        populations.put("Canada", 34000000);

        // add another country
        populations.put("United Kingdom", 63000000);

        // add another country
        populations.put("Japan", 127000000);


        // Replacing Data in a Map
        // create a map that maps a country to its population
        Map<String, Integer> populations = new HashMap<>();

        // add the first country
        populations.put("USA", 200000000);

        // add the next country
        populations.put("Canada", 34000000);

        // replace the mapping for population of the USA - original
        // number was too low
        populations.put("USA", 313000000);
        System.out.println(populations);

        // Looking up Values in a Map

        // create a map that maps a country to its population
        Map<String, Integer> populations = new HashMap<>();

        // add the first country
        populations.put("USA", 313000000);

        // add another country
        populations.put("Japan", 127000000);

        // get the poplation of Japan and print it to the screen
        Integer japanPopulation = populations.get("Japan");
        System.out.println("The population of Japan is: " + japanPopulation);


        // Removing Values from a Map
        // create a map that maps a country to its population
        Map<String, Integer> populations = new HashMap<>();

        // add the first country
        populations.put("USA", 200000000);

        // add the next country
        populations.put("Canada", 34000000);


        // remove USA from the map entirely
        populations.remove("USA");

        // Listing all the Keys
        // create a map that maps a country to its population
        Map<String, Integer> populations = new HashMap<>();

        // add the first country
        populations.put("USA", 313000000);

        // add the next country
        populations.put("Canada", 34000000);

        // get the Set of keys from the map
        Set<String> keys = populations.keySet();

        // print the keys to the screen
        for (String k : keys) {
            System.out.println(k);
        }

        // Listing all the Values Key by Key
        // create a map that maps a country to its population
        Map<String, Integer> populations = new HashMap<>();

        // add the first country
        populations.put("USA", 313000000);

        // add the next country
        populations.put("Canada", 34000000);

        // get the Set of keys from the map
        Set<String> keys = populations.keySet();

        // print the keys and associated values to the screen
        for (String k : keys) {
            System.out.println("The population of " + k +
                    " is " + populations.get(k));
        }

         */

        // Listing all the Values: Value Collection
        // create a map that maps a country to its population
        Map<String, Integer> populations = new HashMap<>();

        // add the first country
        populations.put("USA", 313000000);

        // add the next country
        populations.put("Canada", 34000000);

        // get the Collection of values from the Map
        Collection<Integer> popValues = populations.values();

        // list all of the population values
        for (Integer p : popValues) {
            System.out.println(p);
        }
    }
}
