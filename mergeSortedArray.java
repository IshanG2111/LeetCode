class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int l1=nums1.length;
        int l2=nums2.length;
        int count=0;
        
            for(int i=m;i< l1;i++){
                nums1[i]=nums2[count];
                count++;
            }
        Arrays.sort(nums1);
        for(int i=0;i<l1;i++){
            System.out.print(nums1[i]+",");
        }
    }
}
