
/**
 * Created by Administrator on 2015/4/8.
 * @see https://leetcode.com/problems/rotate-array/
 */
public class RotateArray {
	public static void main(String [] args){
        int [] nums = {1,2,3,4,5,6,7};
        rotate1(nums, 3);
        for (int i = 0; i< nums.length ; i++){
            System.out.print(nums[i]);
        }
    }

    // Status: Time Limit Exceeded
	public static void rotate(int[] nums, int k) {
        k =  k % nums.length ;
        int tmp = 0;
       for (int i = 0 ; i < k; i++){
           tmp = nums[nums.length - 1];
           for (int j = nums.length -1; j > 0; j--){
                nums[j] = nums[j-1];
           }
           nums[0] = tmp;
       }
    }

    // Submission Result: Accepted
    public static void rotate1(int [] nums, int k){
    	k = k % nums.length;
    	int [] tmp = new int[k];

    	for (int i = nums.length -k,j = 0; i < nums.length && j<k ; i++ ,j++) {
    		tmp[j] = nums[i];
    	}
    	for (int i = nums.length - k -1, j=nums.length-1; i > -1 ;i--,j--) {
    		nums[j] = nums[i];
    	}

        for (int i = 0 ; i < k ; i++){
            nums[i] = tmp[i];
        }
    }


}
