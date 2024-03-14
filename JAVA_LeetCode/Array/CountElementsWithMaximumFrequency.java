package Array;

import java.util.HashMap;
import java.util.Map;

/**
 * CountElementsWithMaximumFrequency
 */
public class CountElementsWithMaximumFrequency {

    public static void main(String[] args) {
        int[] nums = {1,2,2,3,1,4};
        int ans = maxFrequencyElements(nums);
        System.out.println(ans);
    }
    public static int maxFrequencyElements(int[] nums) {
        Map<Integer,Integer> freqMap = new HashMap<>();

        int maxFreq=0;
        int totalmaxFreq=0;

        for (int num : nums) {
            int freq = freqMap.getOrDefault(num, 0)+1;
            freqMap.put(num, freq);
            if (freq > maxFreq) {
                maxFreq = freq;
            } 
        }
        for (Map.Entry<Integer, Integer> entry : freqMap.entrySet()) {
            int key = entry.getKey();
            int value = entry.getValue();
            if(value == maxFreq){
                totalmaxFreq+=value;
            }
            // System.out.println("Key: " + key + ", Value: " + value);
        }
        return totalmaxFreq;
    }
}