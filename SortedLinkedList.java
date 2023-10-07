import java.util.LinkedList;
import java.util.Collections;
import java.util.Scanner;

/**
 * A Java program that reads a list of integers from the user and stores them in a
 * LinkedList, sorting them in ascending order using the Collections Framework,
 * and then prints the sorted list.
 * @author Christian O
 */
public class SortedLinkedList {
    /**
     * Main method to execute the program.
     *
     * @param args Command-line arguments (not used in this program).
     * @author Christian O
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create a LinkedList to store the numbers
        LinkedList<Integer> numbers = new LinkedList<>();

        System.out.println("Enter a list of integers. (Ex= 6 5 7 4) (type a non-integer to stop and display results):");

        // Read integers until a non-integer input is encountered
        while (scanner.hasNextInt()) {
            int num = scanner.nextInt();
            numbers.add(num);
        }

        // Sort the LinkedList in ascending order
        Collections.sort(numbers);

        // Display the sorted list
        System.out.println("Sorted List:");
        for (Integer num : numbers) {
            System.out.print(num + " ");
        }

        // Close the scanner
        scanner.close();
    }
}
