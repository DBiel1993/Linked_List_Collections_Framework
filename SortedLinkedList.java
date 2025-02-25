import java.util.LinkedList; // Code Reuse: Using Java's built-in LinkedList instead of custom implementation
import java.util.Collections; // Code Reuse: Using Java's Collections utility class for sorting
import java.util.Scanner; // Code Reuse: Using Scanner for input handling instead of manual parsing

/**
 * The SortedLinkedList program reads a list of integers from the user input,
 * stores them in a LinkedList, sorts them in ascending order, and prints them.
 * The list can be sorted in reverse order by changing the order of the
 * arguments in the Collections.sort() method.
 * 
 * This program utilizes Java's Collections Framework for sorting and follows
 * best practices.
 * It is designed to be executed from the command line.
 * 
 * Code Reuse Examples:
 * 
 * LinkedList: Uses Java’s built-in linked list instead of implementing from
 * scratch.
 * Collections.sort(): Uses Java’s optimized sorting algorithm instead of
 * writing our own.
 * Scanner: Uses Java’s standard input handling instead of manual parsing.
 * System.out.println(): Uses built-in output handling instead of custom print
 * logic.
 * 
 * 
 * Best Practices Used:
 * 
 * Encapsulation:</b> Uses LinkedList for efficient data storage.
 * Collections Framework:</b> Uses built-in sorting instead of custom logic.
 * Input Validation:</b> Ensures only valid integers are added.
 * Resource Management:</b> Closes Scanner to prevent memory leaks.
 * Modularity:</b> Structured for easy maintenance and reuse.
 * 
 * 
 * @author Dylan Bielser
 * @version 1.1
 * @since 2025
 */
public class SortedLinkedList {

    /**
     * The main method drives the program execution.
     *
     * Reads integers from standard input, adds them to a LinkedList,
     * sorts the list, and prints the sorted numbers.
     * 
     * Code Reuse Examples:
     * 
     * Uses a LinkedList from the Java Collections Framework.</li>
     * Sorts the list efficiently using {@code Collections.sort()}.</li>
     * Uses Scanner to handle input instead of custom parsing.</li>
     * Uses built-in System.out.println() for output.</li>
     *
     *
     * @param args Command-line arguments (not used)
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Code Reuse: Using built-in Scanner for input handling
        LinkedList<Integer> numbers = new LinkedList<>(); // Code Reuse: Using Java’s LinkedList instead of manual
                                                          // linked list implementation

        System.out.println("Enter integers (type 'done' to finish):");
        System.out.flush(); // Ensures immediate output visibility in some terminal environments

        // Code Reuse: Using Scanner's built-in methods to validate input
        while (scanner.hasNext()) {
            if (scanner.hasNextInt()) {
                numbers.add(scanner.nextInt()); // Encapsulation: Stores values in a reusable linked list
            } else {
                String input = scanner.next();
                if (input.equalsIgnoreCase("done")) {
                    break;
                } else {
                    System.out.println("Invalid input. Please enter an integer or 'done' to finish.");
                    System.out.flush();
                }
            }
        }
        scanner.close(); // Best Practice: Closing Scanner to prevent resource leaks

        // Code Reuse: Using Collections.sort() instead of writing our own sorting
        // algorithm
        Collections.sort(numbers);

        // Code Reuse: Using built-in System.out.println() instead of custom print logic
        System.out.println("Sorted numbers:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}