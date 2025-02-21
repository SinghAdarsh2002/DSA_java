import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TuplewithSameProduct {

    public static void main(String[] args) {
        // Create an instance of the class
        TuplewithSameProduct obj = new TuplewithSameProduct();
        // Define an array of integers
        int[] nums = {1,2,4,8,16,32};
        // Print the result of the method tupleSameProduct
        System.out.println(obj.tupleSameProduct(nums));
    }

    // Method to find the number of tuples with the same product
    public int tupleSameProduct(int[] nums) {
        int n = nums.length;
        // Create a list to store the products of pairs
        List<Integer> pairsList = new ArrayList<>();
        // Calculate the product of all possible pairs and add them to the list
        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                pairsList.add(nums[i]*nums[j]);
            }
        }
        // Sort the list of products
        Collections.sort(pairsList);
        
        // Uncomment the following line if you want to print the sorted list of products
        // System.out.println(pairsList);

        int count = 0;
        // Initialize the first product as the last product
        int lastPrdct = pairsList.get(0);
        int result = 0;
        // Loop through the sorted list of products
        for(int i=0; i<pairsList.size()-1; i++){
            // If the current product is equal to the last product, increment the count
            if(lastPrdct == pairsList.get(i)){
                count++;
            }else{
                // Calculate the result based on the count of identical products
                result += 8 * (count * count - count * (count + 1) / 2);
                // Reset the count to 1
                count = 1;
                // Update the last product to the current product
                lastPrdct = pairsList.get(i);
            }
        }
        // Return the result
        return result;
    }
}
