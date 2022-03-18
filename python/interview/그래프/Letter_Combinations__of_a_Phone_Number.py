# 전화 번호 문자 조합
from typing import List
class Solution:
    def letterCombinations(self, digits: str) -> List[str]:
    
        def dfs(index, path):
            if len(path) == len(digits):
                result.append(path)
                return
            
            for i in range(index, len(digits)):
                for j in keyboard[digits[i]]:
                    dfs(i+1, path+j)
        
        keyboard = {
            "2": "abc",
            "3": "def",
            "4": "ghi",
            "5": "jkl",
            "6": "mno",
            "7": "pqrs",
            "8": "tuv",
            "9": "wxyz",
        }
        
        if not digits:
            return []
        
        result = []
        dfs(0, "")
        return result
        
        
            
            
        
        
        