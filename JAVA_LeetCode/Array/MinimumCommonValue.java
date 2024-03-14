package Array;

/**
 * MinimumCommonValue
 */
public class MinimumCommonValue {

    public static void main(String[] args) {
        int[] nums1 = {2,4};
        int[] nums2 = {1,2};
        int minNum = getCommon(nums1, nums2);
        System.out.println(minNum);
        
    }
    public static int getCommon(int[] nums1, int[] nums2) {
        int len1= nums1.length;
        int len2 = nums2.length;

        if(len1 < len2){
            for (int num : nums1) {
                int minIndex= binarySearch(nums2,num);
                if (minIndex != -1) {
                    return num; 
                }
            }
        }else{
            for (int num : nums2) {
                int minIndex= binarySearch(nums1,num);
                if (minIndex != -1) {
                    return num; 
                }
            }
        }
        return -1;

    }
    public static int binarySearch(int[] nums,int target){
        int start = 0;
        int end = nums.length -1;

        while (start<= end) {
            int  mid = start +(end - start)/2;

            if(target < nums[mid]){
                end= mid - 1;
            }else if(target > nums[mid]){
                start = mid +1;
            }else{
                return mid;
            }
        }
        return -1;
    }
}