// Title: Build an Array With Stack Operations
// URL: https://leetcode.com/problems/build-an-array-with-stack-operations/
// Difficulty: Medium
// Language: java

import java.util.*;

class Solution {
    public List<String> buildArray(int[] target, int n) {
        List<String> ops = new ArrayList<>();
        int currentStreamNum = 1; 
        for (int num : target) {
            while (currentStreamNum < num) {
                ops.add("Push");
                ops.add("Pop");
                currentStreamNum++;
            }
            ops.add("Push");
            currentStreamNum++;
        }
        
        return ops;
    }
}
