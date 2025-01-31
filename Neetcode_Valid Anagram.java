/*
Valid Anagram
Solved 
Given two strings s and t, return true if the two strings are anagrams of each other, otherwise return false.

An anagram is a string that contains the exact same characters as another string, but the order of the characters can be different.

Example 1:

Input: s = "racecar", t = "carrace"

Output: true
Example 2:

Input: s = "jar", t = "jam"

Output: false
Constraints:

s and t consist of lowercase English letters
*/
////////////////////////////////////////////////////////////////
class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap <Character,Integer> H1 = new HashMap<>();
        HashMap <Character,Integer> H2 = new HashMap<>();
        if(s.length()!= t.length())
        {
            return false;
        }
        else
        {
            for(int i=0;i<s.length();i++)
            {
                char c1 = s.charAt(i);
                char c2 = t.charAt(i);
                H1.put(c1, H1.getOrDefault(c1, 0) + 1);
                H2.put(c2, H2.getOrDefault(c2, 0) + 1);
            }
        }
        if(H1.equals(H2))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
