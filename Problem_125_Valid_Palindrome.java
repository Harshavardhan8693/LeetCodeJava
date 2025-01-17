/*
125. Valid Palindrome
Solved
Easy
Topics
Companies
A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters, it reads the same forward and backward. Alphanumeric characters include letters and numbers.

Given a string s, return true if it is a palindrome, or false otherwise.

 

Example 1:

Input: s = "A man, a plan, a canal: Panama"
Output: true
Explanation: "amanaplanacanalpanama" is a palindrome.
Example 2:

Input: s = "race a car"
Output: false
Explanation: "raceacar" is not a palindrome.
Example 3:

Input: s = " "
Output: true
Explanation: s is an empty string "" after removing non-alphanumeric characters.
Since an empty string reads the same forward and backward, it is a palindrome.
 

Constraints:

1 <= s.length <= 2 * 105
s consists only of printable ASCII characters.
*/
class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder sr = new StringBuilder();
        StringBuilder rx = new StringBuilder();
        boolean out=false;
        for(int i=0;i<s.length();i++)
        {
            char ch = s.charAt(i);
            int ascii = ch;
            if(ascii>=65 && ascii<=90)
            {
                ascii = ascii + 32;
                ch = (char)ascii;
                sr = sr.append(ch);
                rx = rx.append(ch);
            }
            else if(ascii>=97 && ascii<=122)
            {
                ch = s.charAt(i);
                sr = sr.append(ch);
                rx = rx.append(ch);
            }
            else if(ascii>=48 && ascii<=57)
            {
                ch = s.charAt(i);
                sr = sr.append(ch);
                rx = rx.append(ch);
            }
        }
        rx.reverse();
        //System.out.println(rx + " " + sr);
        if(rx.toString().equals(sr.toString()))
        {
            out =true;
        }
        return out;
    }
}
