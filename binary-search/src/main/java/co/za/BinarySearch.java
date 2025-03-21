package co.za;

public class BinarySearch {
    private static int binarySearch(int[] array, int target){
        int low = 0;
        int high = (array.length-1);
        while(low <= high){
            int midpoint = (low+high)/2;
            if(array[midpoint] == target){
                return midpoint;
            }
            if(array[midpoint] > target){
                high = midpoint - 1;
            }
            if(array[midpoint] < target){
                low = midpoint + 1;
            }
        }
        return -1;
    }
}