public class Arraysequivalent {
    public static void main(String[] args) {
        // Create an instance of the Arraysequivalent class
        Arraysequivalent obj = new Arraysequivalent();

        // Initialize two arrays of strings
        String[] word1 = {"ab", "c"};
        String[] word2 = {"a", "bc"};

        // Test the arrayStringsAreEqual method and print the result
        System.out.println(obj.arrayStringsAreEqual(word1, word2));
    }

    /**
     * This method checks whether two arrays of strings are equivalent by comparing their concatenated forms.
     * @param word1 The first array of strings
     * @param word2 The second array of strings
     * @return true if the concatenated forms of the two arrays are equal, false otherwise
     */
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        // StringBuilder to store the concatenated string of word1
        StringBuilder str = new StringBuilder();
        
        // StringBuilder to store the concatenated string of word2
        StringBuilder str2 = new StringBuilder();
        
        // Concatenate all strings in word1
        for (String s : word1) {
            str.append(s);
        }
        
        // Concatenate all strings in word2
        for (String s : word2) {
            str2.append(s);
        }
        
        // Print the concatenated strings (for debugging purposes)
        System.out.println(str.toString());
        System.out.println(str2.toString());
        
        // Check if the concatenated strings are equal and return the result
        return str.toString().equals(str2.toString());
    }
}
