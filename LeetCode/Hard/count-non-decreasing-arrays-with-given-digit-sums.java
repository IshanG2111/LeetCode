// Title: Count Non Decreasing Arrays With Given Digit Sums
// URL: https://leetcode.com/problems/count-non-decreasing-arrays-with-given-digit-sums/
// Difficulty: Hard
// Language: java

class Solution {
    static final long MOD=1_000_000_007L;
    public int countArrays(int[] digitSum) {
        int n=digitSum.length;
        int[] ds=new int[5001];
        for(int i=1;i<=5000;i++) ds[i]=ds[i/10]+i%10;
        Map<Integer,List<Integer>> map=new HashMap<>();
        for(int i=0;i<=5000;i++){
            map.computeIfAbsent(ds[i],k->new ArrayList<>()).add(i);
        }
        List<Integer> prev=map.getOrDefault(digitSum[0],new ArrayList<>());
        long[] dp=new long[prev.size()];
        Arrays.fill(dp,1);
        for(int i=1;i<n;i++){
            List<Integer> curr=map.getOrDefault(digitSum[i],new ArrayList<>());
            long[] pref=new long[prev.size()+1];
            for(int j=0;j<prev.size();j++){
                pref[j+1]=(pref[j]+dp[j])%MOD;
            }
            long[] ndp=new long[curr.size()];
            int p=0;
            for(int j=0;j<curr.size();j++){
                while(p<prev.size()&&prev.get(p)<=curr.get(j)) p++;
                ndp[j]=pref[p];
            }
            dp=ndp;
            prev=curr;
        }

        long ans=0;
        for(long x:dp) ans=(ans+x)%MOD;
        return (int)ans;
        
    //     List<List<Integer>> valid=new ArrayList<>();
    //     for(int i=0;i<n;i++){
    //         List<Integer> vals=new ArrayList<>();
    //         for(int v=0;v<=5000;v++){
    //             if(getDs(v)==digitSum[i]){
    //                 vals.add(v);
    //             }
    //         }
    //         valid.add(vals);
    //     }
    //     int sz0=valid.get(0).size();
    //     long[] dp=new long[sz0];
    //     Arrays.fill(dp,1);
    //     for(int i=1;i<n;i++){
    //         List<Integer>prev=valid.get(i-1);
    //         List<Integer>curr=valid.get(i);
    //         long[] prefix=new long[prev.size()+1];
    //         for(int j=0;j<prev.size();j++){
    //             prefix[j+1]=(prefix[j]+dp[j])%MOD;
    //         }
    //         long[] newDp=new long[curr.size()];
    //         int p=0;
    //         for(int j=0;j<curr.size();j++){
    //             while(p<prev.size()&& prev.get(p)<=curr.get(j)){
    //                 p++;
    //             }
    //             newDp[j]=prefix[p];
    //         }
    //         dp=newDp;
    //     }
    //     long ans=0;
    //     for(long x:dp) ans=(ans+x)% MOD;
    //     return (int) ans;
    // }
    // public int getDs(int v){
    //     int s=0;
    //     while(v>0){
    //         s+=v%10;
    //         v/=10;
    //     }
    //     return s;
    }
}