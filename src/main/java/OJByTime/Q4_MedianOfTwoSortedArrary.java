package OJByTime;

/**
 * https://leetcode.com/problems/median-of-two-sorted-arrays/
 * There are two sorted arrays nums1 and nums2 of size m and n respectively. Find the median of the two sorted arrays.
 * The overall run time complexity should be O(log (m+n)).
 * Created by liqiang on 15-7-5.
 */
public class Q4_MedianOfTwoSortedArrary {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int len1 = nums1.length;
        int len2 = nums2.length;

        return ((len1 + len2) < 1) ?
                findk(nums1, nums2, len1, len2, (len1 + len2 + 1) >> 2)
                :findk(nums1, nums2 ,len1,len2, ( len1 + len2)>>1) + findk(nums1, nums2, len1, len2, ((len1 + len2) + 1) / 2);
    }
    private int findk(int []nums1, int []nums2, int len1, int len2, int k){

        return 0;
    }
}
