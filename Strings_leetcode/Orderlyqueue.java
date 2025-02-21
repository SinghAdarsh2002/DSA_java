import java.util.Arrays;

public class Orderlyqueue {
    public static void main(String[] args) {
        // Create an instance of the Orderlyqueue class
        Orderlyqueue obj = new Orderlyqueue();
        
        // Test the orderlyQueue method with the given string and k value
        String s = "cba";
        int k = 1;
        obj.orderlyQueue(s, k);
    }

    /**
     * This method rearranges a string s into the lexicographically smallest string possible
     * by applying specific operations based on the value of k.
     * @param s The input string
     * @param k The number of allowed swaps or rotations
     * @return The lexicographically smallest string possible
     */
    public String orderlyQueue(String s, int k) {
        // If k is greater than 1, we can sort the characters to get the smallest string
        if (k > 1) {
            char[] arr = s.toCharArray(); // Convert the string to a char array
            Arrays.sort(arr); // Sort the char array
            String result = new String(arr); // Convert the sorted char array back to a string
            System.out.println(result); // Print the result
            return result; // Return the result
        }

        // If k is 1, we can only rotate the string to find the smallest lexicographical order
        String result = s;
        for (int i = 1; i < s.length(); i++) {
            // Create a rotated version of the string
            String temp = s.substring(i) + s.substring(0, i);
            
            // Update the result if the rotated string is lexicographically smaller
            if (temp.compareTo(result) < 0) {
                result = temp;
            }
        }
        System.out.println(result); // Print the result
        return result; // Return the result
    }
}
