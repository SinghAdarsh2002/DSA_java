

public class DayWed {

    public static void main(String[] args) {
        int[] nums = {1,3,4,3,3};
        int k = 2;
        int result = countSubarrays(nums,k);
        System.out.println(result);
    }
    static int countSubarrays(int[] nums, int k) {
        int max = Integer.MIN_VALUE;
        int n = nums.length;
        for(int i=0; i<n; i++){
            if(nums[i]>max){
                max = nums[i];
            }
        }
        int count = 0;
        int result = 0;
        int i=0;
        int j=0;
        while(j<n && i<n){
            if(nums[j]==max){
                count++;
            }
            if(count >= k){
                if(nums[i]==max){
                    count--;
                }
                result += n-j;
                i++;
                // return result;
                continue;
            }
            j++;
        }
        return result;
    }
}