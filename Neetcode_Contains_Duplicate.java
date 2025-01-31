/*Contains Duplicate
Solved 
Given an integer array nums, return true if any value appears more than once in the array, otherwise return false.

Example 1:

Input: nums = [1, 2, 3, 3]

Output: true

Example 2:

Input: nums = [1, 2, 3, 4]

Output: false
*/
/////////////////////////////////////////////////////
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
