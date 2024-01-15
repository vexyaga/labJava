package lab8;

import java.util.Arrays;
import java.util.List;
public class problema2 {
    public static void main(String[] args) {
        // Sample list of strings
        List<String> words = Arrays.asList("apple", "banana", "orange", "grape", "avocado", "kiwi");

        // Specify the letter to check
        char startingLetter = 'a';

        // Count the number of strings starting with the specified letter using streams
        long count = words.stream()
                .filter(word -> word.startsWith(String.valueOf(startingLetter)))
                .count();

        // Display the result
        System.out.println("Number of strings starting with '" + startingLetter + "': " + count);
    }
}
