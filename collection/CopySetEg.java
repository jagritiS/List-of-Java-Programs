package collection;

import java.util.HashSet;

/**
 * Created by Jagriti on 11/2/2018.
 */
public class CopySetEg {
    public static void main(String[] args) {
        // Create a HashSet
        HashSet<String> hset = new HashSet<String>();

        //add elements to HashSet
        hset.add("Element1");
        hset.add("Element2");
        hset.add("Element3");
        System.out.println("Set before addAll:"+ hset);

        // Create another HashSet
        HashSet<String> hset2 = new HashSet<String>();
        hset2.add("Item1");
        hset2.add("Item2");

        // Copying one Set to another
        hset.addAll(hset2);

        System.out.println("Set after addAll:"+ hset);
    }
}
