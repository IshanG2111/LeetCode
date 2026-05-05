// Title: Minimum Absolute Difference
// URL: https://leetcode.com/problems/minimum-absolute-difference/
// Difficulty: Easy
// Language: java

class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        Arrays.sort(arr);
        int diff=arr[1]-arr[0];
        for(int i=1;i<arr.length-1;i++){
            diff=Math.min(diff,arr[i+1]-arr[i]);
        }
        List<List<Integer>> list=new ArrayList<>();
        for(int i=1;i<arr.length;i++){
            if(arr[i]-arr[i-1]==diff){
            list.add(Arrays.asList(arr[i-1],arr[i]));
            }
        }
        return list;
    }
}