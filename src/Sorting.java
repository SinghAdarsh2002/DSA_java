import java.util.*;

public class Sorting {
    public static void main(String[] args) {
        int[] arr1 = {-1,2,7,4};
        bubbleSort(arr1);
        System.out.println(Arrays.toString(arr1));
        int[] arr2 = {-1,9,2,7,4,1};
        selectionSort(arr2);
        System.out.println(Arrays.toString(arr2));
        int[] arr3 = {-1,9,2,7,4,1,3,-8};
        insertionSort(arr3);
        System.out.println(Arrays.toString(arr3));
    }
    static void swap(int[] arr,int start, int last){
        int temp = arr[start];
        arr[start] = arr[last];
        arr[last] = temp;
    }

    static int getMaxIndex(int[] arr, int last){
        int max = 0;
        for(int j = 1; j<=last; j++){
            if(arr[j]>arr[max]) max = j;
        }
        return max;
    }

    static void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            boolean isSwapped = false;
            for (int j = 1; j < arr.length - i; j++) {
                if (arr[j] < arr[j - 1]) {
//                    swap the values
                    swap(arr, j, j - 1);
                    isSwapped = true;
                }
            }
            if (!isSwapped) {
                break;
            }
        }
    }

    static void selectionSort(int[] arr){
//        selection sort
        for (int i=0; i< arr.length; i++){
            int last = arr.length-1-i;
            int maxIndex = getMaxIndex(arr, last);
            swap(arr,maxIndex,last);
        }
    }

    static void insertionSort(int[] arr){
        for (int i = 0; i < arr.length -1; i++) {
            for(int j = i+1; j>0; j--){
                if(arr[j]<arr[j-1]){
                    swap(arr,j-1,j);
                }else{
                    break;
                }
            }
        }
    }
}
