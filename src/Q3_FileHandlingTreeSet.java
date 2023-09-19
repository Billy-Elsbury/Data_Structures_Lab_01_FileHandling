import java.io.File;
import java.io.FileNotFoundException;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Q3_FileHandlingTreeSet {
    public static void main(String[] args) throws FileNotFoundException {
        String fileName = "src\\hamlet.txt";

        Scanner in = new Scanner(new File(fileName));
        Set<String> uniqueWords = new TreeSet<>();

        while (in.hasNextLine()) {
            Scanner lineParser = new Scanner(in.nextLine());
            lineParser.useDelimiter("[^A-Za-z0-9]+");

            while (lineParser.hasNext()) {
                String word = lineParser.next();
                uniqueWords.add(word);
            }
        }

        // Using iterator to print all unique words
        Iterator<String> iterator = uniqueWords.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // Size of the resulting set
        System.out.println("\nNumber of unique words: " + uniqueWords.size());

    }
}

