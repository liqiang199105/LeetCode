package BitMainpulation;

/**
 * @see https://leetcode.com/problems/number-of-1-bits/
 * @Author larkin
 * @Date 2015/03/26
 */
public class NumberOf1Bits{
    public static void main(String args[]){

        System.out.println("hello");

    }

    public int hammingWeight(int n){
       if (n <= 0){
           return 0;
       }
        int result = 0;
        while( n != 0){
            n = n & (n -1);
            result++;

        }
        return result;

    }
}
