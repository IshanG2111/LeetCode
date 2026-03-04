class Solution:
    def vowelConsonantScore(self, s: str) -> int:
        v=c=0
        for ch in s.lower():
            if ch in "aeiou":
                v+=1
            elif ch.isalpha():
                c+=1;
        if c==0:
            return 0
        return v//c
        
