package BinarySearch;
/**
 * FindSmallestLetterGreaterThanTarget
 */
public class FindSmallestLetterGreaterThanTarget {

    public static void main(String[] args) {
        char[] letters ={'c','d','e','f','j'};
        char target = 'd';
        // System.out.println(nextGreatestLetter(letters, target));
    }
    public static char nextGreatestLetter(char[] letters, char target) {
        int start = 0;
        int end = letters.length - 1;

        while(start <= end) {
            int mid = start + (end - start) / 2;
            // System.out.println("start: " + start+" mid :"+mid+ " end: "+end);

            if (target < letters[mid]) {
                end = mid - 1;
            } else{
                start = mid + 1;
            }
        }
        return letters[start % letters.length];
    }
}