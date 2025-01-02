/*
20. Valid Parentheses
Solved
Easy
Topics
Companies
Hint
Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

An input string is valid if:

Open brackets must be closed by the same type of brackets.
Open brackets must be closed in the correct order.
Every close bracket has a corresponding open bracket of the same type.
 

Example 1:

Input: s = "()"

Output: true

Example 2:

Input: s = "()[]{}"

Output: true

Example 3:

Input: s = "(]"

Output: false

Example 4:

Input: s = "([])"

Output: true

 

Constraints:

1 <= s.length <= 104
s consists of parentheses only '()[]{}'.
*/
///////////////////////////////////////////////////////////////////////////
class Solution {
    public boolean isValid(String s) {
        boolean out=false;
        StringBuilder str = new StringBuilder("p"); 
        str.append(s.charAt(0));
         for (int i=1;i<=s.length()-1;i++)
         {
            char temp = s.charAt(i);
            char check = str.charAt(str.length()-1);
            if((temp == '}' && check == '{')||(temp == ')' && check == '(')||(temp == ']' && check == '['))
            {
                str.deleteCharAt(str.length()-1);
            }
            else
            {
                str.append(s.charAt(i));
            } 
        }
        if(str.length() == 1)
        {
            out = true;
        }
        return out;
    }
        
}
