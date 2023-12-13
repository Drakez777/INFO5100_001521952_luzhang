import java.util.regex.*;

public class Main {

    public static void main(String[] args) {
        // Sample input strings
        String[] inputStrings = {
            "ValidEmail@example.com",
            "InvalidEmail@.com",
            "2023-12-04",
            "NotADate",
            "Password123!"
        };

        // Regular expression patterns
        String[] regexPatterns = {
            "^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$",  // Email pattern
            "^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$",  // Invalid email pattern
            "^\\d{4}-\\d{2}-\\d{2}$",                              // Date pattern
            "^\\d{4}-\\d{2}-\\d{2}$",                              // Invalid date pattern
            "^(?=.*[A-Za-z])(?=.*\\d)(?=.*[@$!%*?&])[A-Za-z\\d@$!%*?&]{8,}$"  // Password pattern
        };

        // Demonstrate regular expressions
        for (int i = 0; i < inputStrings.length; i++) {
            System.out.println("Input: " + inputStrings[i]);

            // Compile the pattern
            Pattern pattern = Pattern.compile(regexPatterns[i]);

            // Create matcher object
            Matcher matcher = pattern.matcher(inputStrings[i]);

            // Check for a match
            if (matcher.matches()) {
                System.out.println("Positive Match!");
            } else {
                System.out.println("Negative Match!");
            }

            System.out.println();
        }
    }
}
