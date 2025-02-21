public class StringareAlmostEqual {

    public static void main(String[] args) {
        // Create an instance of the class and test the areAlmostEqual method
        StringareAlmostEqual objE1790 = new StringareAlmostEqual();
        // Test with two strings and print the result
        System.out.println(objE1790.areAlmostEqual("siyolsdcjthwsiplccjbuceoxmpjgrauocx", "siyolsdcjthwsiplccpbuceoxmjjgrauocx")); // should return true or false based on the logic
    }
    
    public boolean areAlmostEqual(String s1, String s2) {
        // Convert the strings to character arrays
        char[] str1 = s1.toCharArray();
        char[] str2 = s2.toCharArray();
        
        // Array to store the indices of mismatched characters
        int[] index = new int[3];
        int count = 0; // Count of mismatched characters

        // Iterate through the characters of the strings
        for(int i=0; i<str1.length; i++){
            // If more than 2 mismatches, return false
            if(count > 2){
                return false;
            }
            // If characters at the same position are not equal
            if(str1[i] != str2[i]){
                // Store the index of mismatched character
                index[count] = i;
                count++;
            }
            System.out.println(count); // Print the count of mismatches (for debugging purposes)
        }
        
        // If there are no mismatches, the strings are already equal
        if(count == 0){
            return true;
        }
        // If there are not exactly two mismatches, return false
        if(count != 2){
            return false;
        }
        
        // Print the mismatched characters (for debugging purposes)
        System.out.println(s1.charAt(index[0]));
        System.out.println(s2.charAt(index[1]));

        // Check if swapping the mismatched characters in s1 makes s1 equal to s2
        return s1.charAt(index[0]) == s2.charAt(index[1]) && s1.charAt(index[1]) == s2.charAt(index[0]);
    }
}
