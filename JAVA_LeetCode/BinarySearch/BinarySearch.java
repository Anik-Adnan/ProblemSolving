package BinarySearch;
public class BinarySearch {

    public static void main(String[] args) {
        int[] arr = {-14, -7,-6, -3, 0, 2, 4,12,23,44,47,93,100};
        int target = 22;
        int ans = search(arr, target);
        System.out.println(ans);
    }

    public static int search(int[] nums, int target) { 
        int start = 0;
        int end = nums.length - 1;

        while(start <= end) {
            int mid = start + (end - start) / 2;

            if (target < nums[mid]) {
                end = mid - 1;
            } else if (target > nums[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}