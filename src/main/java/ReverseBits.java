import java.util.Arrays;

/**
 * Created by Administrator on 2015/4/7.
 * @see https://leetcode.com/problems/reverse-bits/
 */

public class ReverseBits {
    public static void main(String args[]){
    	System.out.println(Integer.toBinaryString(Integer.MIN_VALUE));
        System.out.println(Integer.toBinaryString(Integer.MAX_VALUE));
        System.out.println(reverserBits1(43261596 ));
    }

    // Integer.toBianryString() returns a 26 bits String, but the topic is 32 bits, so the following is illegal.
    public static int reverserBits(int n){
        StringBuilder binaryN = new StringBuilder(Integer.toBinaryString(n ^ Integer.MIN_VALUE));
        return Integer.valueOf(binaryN.reverse().toString(), 2);
    }

    public static int reverserBits1(int n){

        int[] bits = new int[32];
        int num = 0;

        Arrays.fill(bits, 0);

        if(n < 0) {
            n = n ^ Integer.MIN_VALUE;  //异或
            bits[31] = 1;
        }

        for (int i = 0; i < bits.length - 1; i++) {
            bits[i] = n % 2;
            n /= 2;
        }

        for(int i = 1; i < bits.length; i ++) {
            num <<= 1;
            num += bits[i];
        }

        //判断符号位
        return bits[0] == 1 ? num | Integer.MIN_VALUE : num;
    }
}
