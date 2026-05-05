// Title: Median of Two Sorted Arrays
// URL: https://leetcode.com/problems/median-of-two-sorted-arrays/
// Difficulty: Hard
// Language: java

class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] arr = new int[nums1.length + nums2.length];
        System.arraycopy(nums1, 0, arr, 0, nums1.length);
        System.arraycopy(nums2, 0, arr, nums1.length, nums2.length);
        Arrays.sort(arr);
        double median=(double)arr[arr.length/2];
        if(arr.length==1){
         return (double)arr[0];   
        }
        if(arr.length%2==0){
           median=arr[arr.length/2]+arr[(arr.length/2)-1];
           median/=2;
        }
        else{
            median=arr[(arr.length/2)];
        }
        return median;
    }
}