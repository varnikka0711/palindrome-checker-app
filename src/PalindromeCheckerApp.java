/**
 * ************************************************************
 * MAIN CLASS - UseCase11PalindromeCheckerApp
 * ************************************************************
 *
 * Use Case 11: Palindrome Validation Logic
 *
 * Description:
 * This class validates whether a given word is a palindrome
 * by comparing characters from both ends using pointers.
 *
 * @author Developer
 * @version 11.0
 */
public class PalindromeCheckerApp {

    /**
     * Application entry point for UC11.
     *
     * @param args Command-line arguments
     */
    public static void main(String[] args) {
        // Input as shown in the expected output example
        String input = "racecar";

        // Instantiate the analyzer service
        PalindromeAnalyzer analyzer = new PalindromeAnalyzer();

        // Call the checkPalindrome method
        boolean isPalindrome = analyzer.checkPalindrome(input);

        // Print the output in the required format
        System.out.println("Input : " + input);
        System.out.println("Is Palindrome : " + isPalindrome);
    }
}

/**
 * Service class that contains palindrome logic.
 */
class PalindromeAnalyzer {

    /**
     * Checks whether the input string is a palindrome.
     *
     * @param word The input string to check.
     * @return true if palindrome, else false.
     */
    public boolean checkPalindrome(String word) {
        // Implementation based on the hint provided
        int start = 0;
        int end = word.length() - 1;

        while (start < end) {
            // Compare characters at current pointer positions
            if (word.charAt(start) != word.charAt(end)) {
                return false; // Characters don't match, not a palindrome
            }
            start++; // Move the start pointer forward
            end--;   // Move the end pointer backward
        }

        return true; // All characters matched
    }
}
