/*
 70. Climbing Stairs
Solved
Easy
Topics
Companies
Hint
You are climbing a staircase. It takes n steps to reach the top.

Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?

 

Example 1:

Input: n = 2
Output: 2
Explanation: There are two ways to climb to the top.
1. 1 step + 1 step
2. 2 steps
Example 2:

Input: n = 3
Output: 3
Explanation: There are three ways to climb to the top.
1. 1 step + 1 step + 1 step
2. 1 step + 2 steps
3. 2 steps + 1 step
 

Constraints:

1 <= n <= 45
*/
class Solution {
    public int climbStairs(int n) {
       return FindStairs(n);
    }
    public static int FindStairs(int n)
    {
        if(n == 1)
        {
            return 1;
        }
        else if(n == 2)
        {
            return 2;
        }
        else if(n == 3)
        {
            return 3;
        }
        else if(n == 4)
        {
            return 5;
        }
        else if(n == 5)
        {
            return 8;
        }
        else if(n == 6)
        {
            return 13;
        }
        else
        {
            return FindStairs(n-1)+FindStairs(n-2);
        }
    }
}
