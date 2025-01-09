// Write a function to find the longest common prefix string amongst an array of strings.

// If there is no common prefix, return an empty string "".

 

// Example 1:

// Input: strs = ["flower","flow","flight"]
// Output: "fl"
// Example 2:

// Input: strs = ["dog","racecar","car"]
// Output: ""
// Explanation: There is no common prefix among the input strings.
 

// Constraints:

// 1 <= strs.length <= 200
// 0 <= strs[i].length <= 200
// strs[i] consists of only lowercase English letters.
////////////////////////////////////////////////////////////////////////////////////////////////////////////
class Solution {
    public String longestCommonPrefix(String[] strs) {

        String out = strs[0];
        for(int i=1;i<strs.length;i++)
        {
            int len=prefixlen(out,strs[i]);
            out=out.substring(0,len);
        }
        return out;
    }
     public int prefixlen(String s1,String s2){
        int i = 0;
        int len = Math.min(s1.length(), s2.length());

        while (i < len && s1.charAt(i) == s2.charAt(i)) {
            i++;
        }

        return i;
     }
}
