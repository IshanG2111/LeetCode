// Title: Lexicographically Maximum MEX Array
// URL: https://leetcode.com/problems/lexicographically-maximum-mex-array/
// Difficulty: Hard
// Language: java

class Solution {
    public int[] maximumMEX(int[] nums) {
        int n=nums.length;
        int[] f=new int[n+2];
        for(int x:nums){
            if(x<=n){
                f[x]++;
            }
        }
        ArrayList<Integer> a=new ArrayList<>();
        int i=0;
        while(i<n){
            int m=0;
            while(f[m]>0){
                m++;
            }
            if(m==0){
                a.add(0);
                if(nums[i]<=n){
                    f[nums[i]]--;
                }
                i++;
                continue;
            }
            boolean[] s=new boolean[m];
            int c=0;
            while(c<m){
                int x=nums[i];
                if(x<m && !s[x]){
                    s[x]=true;
                    c++;
                }
                if(x<=n){
                    f[x]--;
                }
                i++;
            }
            a.add(m);
        }
        int[] r=new int[a.size()];
        for( int j=0;j<a.size();j++){
            r[j]=a.get(j);
        }
        return r;
    }
}