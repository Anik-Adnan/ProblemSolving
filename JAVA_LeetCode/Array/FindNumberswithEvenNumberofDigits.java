package Array;

/**
 * FindNumberswithEvenNumberofDigits
 */
public class FindNumberswithEvenNumberofDigits {

    public static void main(String[] args) {
        int[] ar ={12,345,2,6,7896};
        int ans = findNumbers(ar);
        System.out.println(ans);
    }
    public static int findNumbers(int[] nums) {
        int totalCount=0;
        for(int num : nums){
            int count=0;
             count= (int)Math.log10(num)+1;
            if(count%2==0){
                totalCount++;
            }
        }
        return totalCount;
    }
}