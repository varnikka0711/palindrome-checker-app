
public class PalindromeCheckerApp {

    /**
     * Application entry point for UC11.
     *
     * @param args Command-line arguments
     */
    public static void main(String[] args) {

        // Input as shown in the expected output example
        String input = "racecar";

        String input = "A man a plan a canal Panama";
        String normalized = input.toLowerCase().replaceAll("[^a-z0-9]", "");


        boolean isPalindrome = true;

        // 2. Compare characters from both ends (Logic from hint)
        for (int i = 0; i < normalized.length() / 2; i++) {
 main

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

feature/UC11
        while (start < end) {
            // Compare characters at current pointer positions
            if (word.charAt(start) != word.charAt(end)) {
                return false; // Characters don't match, not a palindrome
            }
            start++; // Move the start pointer forward
            end--;   // Move the end pointer backward
        }

        return true; // All characters matched


            // Compare symmetric characters
            if (normalized.charAt(i) != normalized.charAt(normalized.length() - 1 - i)) {
                isPalindrome = false;
                break;
            }
        }

        // 3. Print the results
        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + isPalindrome);
 main
    }
}
