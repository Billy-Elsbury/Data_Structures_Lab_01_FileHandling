import java.util.LinkedList;
import java.util.ListIterator;

public class Q1_LinkedList {
    /**1. Write a program that creates a LinkedList of String objects.
(i) Add the following names to the list,
using the add method (or addLast method) :Kay, Jay, May, Fay
(ii) Use an iterator to insert “Ray” after May.
(iii) Then delete Jay
(iv) Use an iterator to display all the names on the list
From the beginning of the list
From the end of the list
(v) Add Kay again. Use an iterator to display all the names. Note that duplicates are allowed.**/

    public static void main(String[] args) {
            //Question 1
            // Create a LinkedList of String objects
            LinkedList<String> namesList = new LinkedList<>();

            // (i) Add names to the list
            namesList.add("Kay");
            namesList.add("Jay");
            namesList.add("May");
            namesList.add("Fay");

            // (ii) Use an iterator to insert "Ray" after "May"
            ListIterator<String> iterator = namesList.listIterator();
            while (iterator.hasNext()) {
                String name = iterator.next();
                if (name.equals("May")) {
                    iterator.add("Ray");
                }
            }

            // (iii) Delete "Jay"
            namesList.remove("Jay");

            // (iv) Use an iterator to display all names from the beginning and end
            System.out.println("Names from the beginning:");
            iterator = namesList.listIterator();
            while (iterator.hasNext()) {
                System.out.println(iterator.next());
            }

            System.out.println("\nNames from the end:");
            iterator = namesList.listIterator(namesList.size());
            while (iterator.hasPrevious()) {
                System.out.println(iterator.previous());
            }

            // (v) Add "Kay" again
            namesList.add("Kay");

            // Use an iterator to display all names (including duplicates)
            System.out.println("\nNames with duplicates:");
            iterator = namesList.listIterator();
            while (iterator.hasNext()) {
                System.out.println(iterator.next());
            }
        }
    }
