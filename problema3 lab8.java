package lab8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
public class problema3 {
    public static void main(String[] args) {
        // Sample list of integers
        List<Integer> numbers = Arrays.asList(5, 2, 8, 1, 6, 3, 7, 4);

        // Sort in ascending order using streams
        List<Integer> ascendingOrder = numbers.stream()
                .sorted()
                .collect(Collectors.toList());

        // Sort in descending order using streams
        List<Integer> descendingOrder = numbers.stream()
                .sorted((a, b) -> b.compareTo(a))
                .collect(Collectors.toList());

        // Display the results
        System.out.println("Original list: " + numbers);
        System.out.println("Ascending order: " + ascendingOrder);
        System.out.println("Descending order: " + descendingOrder);
    }
}
