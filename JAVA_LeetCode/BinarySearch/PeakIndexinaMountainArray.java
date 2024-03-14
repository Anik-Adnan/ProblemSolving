package BinarySearch;

/**
 * PeakIndexinaMountainArray
 */
public class PeakIndexinaMountainArray {

    public static void main(String[] args) {
        int[] arr= {1,2,3,1};
        System.out.println(peakIndexInMountainArray(arr));
    }
    public static int peakIndexInMountainArray(int[] arr) {
        return search(arr);
    }
    public static int search(int[] nums) { 
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
}