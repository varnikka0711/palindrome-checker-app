
public class PalindromeCheckerApp {

    public static void main(String[] args) {
        String input = "A man a plan a canal Panama";
        String normalized = input.toLowerCase().replaceAll("[^a-z0-9]", "");


        boolean isPalindrome = true;

        // 2. Compare characters from both ends (Logic from hint)
        for (int i = 0; i < normalized.length() / 2; i++) {

        // Define input string
        String input = "madam";

        // Call recursive palindrome check
        boolean result = check(input, 0, input.length() - 1);

        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + result);
    }

    private static boolean check(String s, int start, int end) {

        if (start >= end) {
            return true;}


            // Compare symmetric characters
            if (normalized.charAt(i) != normalized.charAt(normalized.length() - 1 - i)) {
                isPalindrome = false;
                break;
            }
        }

        // 3. Print the results
        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + isPalindrome);
    }
}
