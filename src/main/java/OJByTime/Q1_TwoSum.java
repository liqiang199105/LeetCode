package OJByTime;

import java.util.*;

/**
 * Given an array of integers, find two numbers such that they add up to a specific target number.
 * The function twoSum should return indices of the two numbers such that they add up to the target,
 * where index1 must be less than index2. Please note that your returned answers (both index1 and index2) are not zero-based.
 * You may assume that each input would have exactly one solution.
 * Input: numbers={2, 7, 11, 15}, target=9
 * Output: index1=1, index2=2
 */
public class Q1_TwoSum {
    public static void main(String [] args){
        int [] nums = {3, 2, 4};
        Q1_TwoSum twosum = new Q1_TwoSum();
        int[] result = twosum.twoSum(nums, 6);
        System.out.println(result[0] );
        System.out.println(result[1] );
//        int[] resultBySort = twosum.twoSumBySort(nums, 6);
//        System.out.println(resultBySort[0] );
//        System.out.println(resultBySort[1] );

    }

    /**
     * O(N^2)
     * @param nums
     * @param target
     * @return
     */
    private int[] twoSum(int[] nums, int target) {
        int len = nums.length;
        int []result = new int[2];
        for (int i = 0 ;i < len - 1; i++){
            for(int j = i + 1; j <  len; j++){
                if ((nums[i] + nums[j]) == target){
                    result[0] = i + 1;
                    result[1] = j + 1;
                    return result;
                }
            }
        }
        return result;
    }

    /**
     * First sort, then find tow numbers
     * @param nums
     * @param target
     * @return
     */
    private int[] twoSumBySort(int[] nums, int target){
        int []result = new int[2];
        int len = nums.length;
        // Step 1 : Sort nums asc
        List sortedNums = new ArrayList(len);
        for(int i = 0; i < len; i++){
            sortedNums.add(nums[i]);
        }
        Collections.sort(sortedNums);
        for(int i = 0; i < len; i++){
            nums[i] = (Integer) sortedNums.get(i);
        }
        // Step 2 : Find two numbers from tow sides
        int l = 0, r = len -1;
       while (l < r){
           if (nums[l] + nums[r] == target){
               result[0] = l;
               result[1] = r;
               return result;
           } else if (nums[l] + nums[r] < target){
               l++;
           } else {
               r++;
           }

       }
        return result;

    }
}
