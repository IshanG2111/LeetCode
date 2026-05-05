// Title: Sort Array By Parity
// URL: https://leetcode.com/problems/sort-array-by-parity/
// Difficulty: Easy
// Language: java

class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int l1;
        int l2;
        int []temp=new int[nums.length];
        int []temp2=new int[nums.length];
        int []merged=new int[nums.length];
        int j=0;
        int k=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2==0){
                temp[j]=nums[i];
                j++;
            }
            if(nums[i]%2!=0){
                temp2[k]=nums[i];
                k++;
            }
        }
        // l1=temp.length;
        // l2=temp2.length;
        System.arraycopy(temp, 0, merged, 0, j);
        System.arraycopy(temp2, 0, merged, j, k);
        return merged;
    }
}