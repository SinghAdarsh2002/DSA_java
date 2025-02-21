public class Greatstring {
    public static void main(String[] args) {
        // Create an instance of the Greatstring class
        Greatstring obj = new Greatstring();

        // Test the makeGood method and print the result
        System.out.println(obj.makeGood("leEeetcode"));
    }

    /**
     * This method takes a string and removes all adjacent characters 
     * that are the same letter but in different cases.
     * @param s The input string
     * @return The modified string with adjacent case-insensitive matches removed
     */
    public String makeGood(String s) {
        int n = s.length(); // Get the length of the input string
        StringBuilder str = new StringBuilder(); // Initialize a StringBuilder to store the result
        
        // Iterate through each character in the input string
        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i); // Get the current character
            
            // Check if the StringBuilder is not empty
            if (str.length() > 0) {
                // Compare the current character with the last character in the StringBuilder (case-insensitive)
                if (ch == (str.charAt(str.length() - 1) + 32) || ch == (str.charAt(str.length() - 1) - 32)) {
                    // If they match (case-insensitively), remove the last character from the StringBuilder
                    str.deleteCharAt(str.length() - 1);
                } else {
                    // If they don't match, append the current character to the StringBuilder
                    str.append(ch);
                }
            } else {
                // If the StringBuilder is empty, append the current character
                str.append(s.charAt(i));
            }
        }
        return str.toString(); // Return the modified string
    }
}
