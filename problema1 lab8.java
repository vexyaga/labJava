package lab8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
public class problema1 {
    public static void main(String[] args) {
        // Sample list with duplicates
        List<Integer> numbersWithDuplicates = Arrays.asList(1, 2, 3, 4, 1, 2, 5, 6, 7, 8, 3);

        // Remove duplicates using streams
        List<Integer> numbersWithoutDuplicates = numbersWithDuplicates.stream()
                .distinct()
                .collect(Collectors.toList());

        // Display the result
        System.out.println("List with duplicates: " + numbersWithDuplicates);
        System.out.println("List without duplicates: " + numbersWithoutDuplicates);
    }
}
