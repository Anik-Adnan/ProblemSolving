package Array;

/**
 * RichestCustomerWealth
 */
public class RichestCustomerWealth {

    public static void main(String[] args) {
        int[][] ar ={{1,5},{7,3},{3,5}};
        int ans = maximumWealth(ar);
        System.out.println(ans);
    }
    public static int maximumWealth(int[][] accounts) {
        int maxWealth=0;
        for(int[] account : accounts){
            int sum=0;
            for (int wealth : account) {
                sum+=wealth;
            }
            if(sum> maxWealth){
                maxWealth=sum;
            }
        }
        return maxWealth;
    }
}