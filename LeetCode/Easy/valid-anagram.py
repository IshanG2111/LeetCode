// Title: Valid Anagram
// URL: https://leetcode.com/problems/valid-anagram/
// Difficulty: Easy
// Language: python3

class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        if(len(s)!=len(t)):
            return False
        sorted_s=sorted(s)
        sorted_t=sorted(t)
        if sorted_s==sorted_t:
            return True
        return False

        # countS={}
        # countT={}
        # for i in range(len(s)):
        #     countS[s[i]]=1+countS.get(s[i],0)
        #     countT[t[i]]=1+countT.get(t[i],0)
        # for c in countS:
        #     if countS[c]!=countT.get(c,0):
        #         return False
        # return True