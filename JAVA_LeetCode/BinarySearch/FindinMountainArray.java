package BinarySearch;

/**
 * FindinMountainArray
 */

/* interface MountainArray {
    public int get(int index);
    public int length();
}
*/

public class FindinMountainArray {

    public static void main(String[] args) {
        int[] nums = {0,1,2,4,2,1};
        int target = 3;
        System.out.println(findPeakElement(nums));
    }

    // public static int findInMountainArray(int target, MountainArray mountainArr) {
    public static int findInMountainArray(int target, int[] nums) {
        int end = nums.length - 1;
        int start = 0;
        int peakIndex= findPeakElement(nums);
        
        int leftIndex = orderAgnosticBS(nums, nums[peakIndex], start, peakIndex);
        int rightIndex = orderAgnosticBS(nums, nums[peakIndex], peakIndex+1, end);
        if (leftIndex == -1 || rightIndex==-1) {
            return -1;
        }
        if(leftIndex<rightIndex){
            return leftIndex;
        }else{
            return rightIndex;
        }
        

    }

    public static int findPeakElement(int[] nums) {
        int start = 0;
        int end = nums.length - 1;

        while(start < end) {
            int mid = start + (end - start) / 2;

            if (nums[mid] > nums[mid+1]) {
                end = mid;
            } else {
                start =  mid + 1;
            }
        }
        return end;
    } 

    public static int orderAgnosticBS(int[] arr, int target, int start, int end) {
        // find whether the array is sorted in ascending or descending
        boolean isAsc = arr[start] < arr[end];

        while(start <= end) {
            // find the middle element
//            int mid = (start + end) / 2; // might be possible that (start + end) exceeds the range of int in java
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return mid;
            }

            if (isAsc) {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (target > arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return -1;
        
    }
}