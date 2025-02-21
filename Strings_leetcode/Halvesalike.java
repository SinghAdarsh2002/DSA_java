public class Halvesalike {
    public static void main(String[] args) {
        // Create an instance of the Halvesalike class
        Halvesalike obj = new Halvesalike();

        // Test the halvesAreAlike method and print the result
        System.out.println(obj.halvesAreAlike("Book"));
    }

    /**
     * This method checks whether the two halves of a string have the same number of vowels.
     * @param s The input string
     * @return true if the number of vowels in both halves are equal, false otherwise
     */
    public boolean halvesAreAlike(String s) {
        // Find the length of half of the string
        int n = s.length() / 2;

        // Split the string into two halves
        String a = s.substring(0, n);
        String b = s.substring(n);

        int countA = 0; // Initialize the vowel count for the first half
        int countB = 0; // Initialize the vowel count for the second half

        // Iterate through each character in both halves
        for (int i = 0; i < n; i++) {
            char chA = a.charAt(i); // Get the current character from the first half
            char chB = b.charAt(i); // Get the current character from the second half

            // Check if the character in the first half is a vowel and count it
            if (chA == 'A' || chA == 'E' || chA == 'I' || chA == 'O' || chA == 'U' ||
                chA == 'a' || chA == 'e' || chA == 'i' || chA == 'o' || chA == 'u') {
                countA++;
            }

            // Check if the character in the second half is a vowel and count it
            if (chB == 'A' || chB == 'E' || chB == 'I' || chB == 'O' || chB == 'U' ||
                chB == 'a' || chB == 'e' || chB == 'i' || chB == 'o' || chB == 'u') {
                countB++;
            }
        }

        // Return true if the number of vowels in both halves are equal, false otherwise
        return countA == countB;
    }
}
