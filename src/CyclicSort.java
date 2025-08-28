import java.util.Arrays;

public class CyclicSort {
    public static void main(String[] args) {
        int[] arr = {3,1,2,7,4,5,8,6};
        cyclicSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void swap(int[] arr,int start, int last){
        int temp = arr[start];
        arr[start] = arr[last];
        arr[last] = temp;
    }
    static void  cyclicSort(int[] arr){
        int i = 0;
        while (i<arr.length){
            int correct = arr[i]-1;
            if(arr[i] != arr[correct]){
                swap(arr,i,correct);
            }else{
                i++;
            }
        }
    }
}
