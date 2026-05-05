// Title: Final Value of Variable After Performing Operations
// URL: https://leetcode.com/problems/final-value-of-variable-after-performing-operations/
// Difficulty: Easy
// Language: java

class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int x=0;
        for(int i=0;i<operations.length;i++){
            if(operations[i].equals("--X")||operations[i].equals("X--")){
                x-=1;
            }
            else if(operations[i].equals("++X")||operations[i].equals("X++")){
                x+=1;
            }
        }
        return x;
    }
}