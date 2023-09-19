import java.util.*;

public class Q2_HashAndTreeSets {
    public static void main(String[] args) {

        Set<String> hashSetNames = new HashSet<>();
        Set<String> treeSetNames = new TreeSet<>();

        hashSetNames.add("Kay");
        hashSetNames.add("Jay");
        hashSetNames.add("May");
        hashSetNames.add("Fay");

        treeSetNames.add("Kay");
        treeSetNames.add("Jay");
        treeSetNames.add("May");
        treeSetNames.add("Fay");

        // (Test Duplicate)
        hashSetNames.add("Kay");
        treeSetNames.add("Kay"); // Duplicates not allowed in TreeSet

        // Display names in the HashSet
        System.out.println("HashSet names:");
        Iterator<String> hashSetIterator = hashSetNames.iterator();
        while (hashSetIterator.hasNext()) {
            System.out.println(hashSetIterator.next());
        }

        //Display names in the TreeSet
        System.out.println("\nTreeSet names:");
        Iterator<String> treeSetIterator = treeSetNames.iterator();
        while (treeSetIterator.hasNext()) {
            System.out.println(treeSetIterator.next());
        }

        /**in the HashSet the order of elements is random, duplicates are not allowed.
         *
         * In the TreeSet, the elements are sorted in alphabetical order, duplicates are automatically removed**/
    }
}
