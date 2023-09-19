import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Q4_FileHandlingMap {
    public static void main(String[] args) throws FileNotFoundException {

        String fileName = "src\\hamlet.txt";
        Scanner in = new Scanner(new File(fileName));
        Map<String, Set<Integer>> wordLineMap = new HashMap<>();

        int lineNumber = 1;

        while (in.hasNextLine()) {
            String line = in.nextLine();
            Scanner lineParser = new Scanner(line);
            lineParser.useDelimiter("[^A-Za-z0-9]+");

            while (lineParser.hasNext()) {
                String word = lineParser.next().toLowerCase(); // Convert to lowercase
                Set<Integer> lineNumbers = wordLineMap.getOrDefault(word, new HashSet<>());
                lineNumbers.add(lineNumber);
                wordLineMap.put(word, lineNumbers);
            }
                lineNumber++;
        }

            // Print unique words and their line numbers
            for (Map.Entry<String, Set<Integer>> entry : wordLineMap.entrySet()) {
                String word = entry.getKey();
                Set<Integer> lineNumbers = entry.getValue();
                System.out.println("Unique word: " + word + ", Line Numbers: " + lineNumbers);
            }

            // Search for a word in the map
            String searchWord = "to";
            if (wordLineMap.containsKey(searchWord)) {
                Set<Integer> lineNumbers = wordLineMap.get(searchWord);
                System.out.println("The word '" + searchWord + "' was found on line numbers: " + lineNumbers);
            } else {
                System.out.println("The word '" + searchWord + "' not found in the text.");
            }
            /**There are 2 occurrences of the word 'to' on line 1, but as "[only] the last occurrence of the word will be in the map"
             * only 3 occurrences are referenced**/
    }
}
