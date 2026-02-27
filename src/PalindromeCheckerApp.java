public class PalindromeCheckerApp {
    static final String APP_NAME = "Palindrome Checker App";
    static final String APP_VERSION = "Version 1.0";
    public static void main(String[] args) {
        System.out.println("=======================================");
        System.out.println(" Welcome to " + APP_NAME);
        System.out.println(" " + APP_VERSION);
        System.out.println("=======================================");
        System.out.println("This application checks whether a given");
        System.out.println("string is a palindrome.");
        System.out.println("---------------------------------------");
        System.out.println("Program initialized successfully.");
        System.out.println("Proceeding to Palindrome Processing...");

        //uc2
        String word = "madam";
        String reversed = "";
        for (int i = word.length() - 1; i >= 0; i--) {
            reversed = reversed + word.charAt(i);
        }
        System.out.println("Given Word: " + word);
        if (word.equals(reversed)) {
            System.out.println("Result: The given word is a Palindrome.");
        } else {
            System.out.println("Result: The given word is NOT a Palindrome.");
        }
        System.out.println("Program Completed.");
    }
}

