// Given a sorted array of distinct integers and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.

// You must write an algorithm with O(log n) runtime complexity.

 

// Example 1:

// Input: nums = [1,3,5,6], target = 5
// Output: 2
// Example 2:

// Input: nums = [1,3,5,6], target = 2
// Output: 1
// Example 3:

// Input: nums = [1,3,5,6], target = 7
// Output: 4
 

// Constraints:

// 1 <= nums.length <= 104
// -104 <= nums[i] <= 104
// nums contains distinct values sorted in ascending order.
// -104 <= target <= 104
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
class Solution {
    public int searchInsert(int[] nums, int target) {
        int s=0,m=0;
        int e=nums.length-1;
        int ans=-1;
        while(s<=e)
        {
            m=s+(e-s)/2;
            if(target>nums[m])
            {
                s=m+1;
            }
            else if(target<nums[m])
            {
                e=m-1;
            }
            else if(target==nums[m])
            {
                return m;
            }
        }
        if(target<nums[m])
        {
            return m;
        }
        else
            return(m+1);
        
    }
}
