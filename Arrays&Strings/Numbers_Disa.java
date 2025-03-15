/*
 448. Find All Numbers Disappeared in an Array
Given an array nums of n integers where nums[i] is in the range [1, n], return an array of all the integers in the range [1, n] that do not appear in nums.

Example 1:
Input: nums = [4,3,2,7,8,2,3,1]
Output: [5,6]

Example 2:
Input: nums = [1,1]
Output: [2]

CODE:
 */

class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int n = nums.length;
        List<Integer> arr = new ArrayList<>();
        Set<Integer> map = new HashSet<>();
        for(int i=0;i<n;i++){
            map.add(nums[i]);
        }
        for(int i=1;i<=n;i++){
            if(!map.contains(i)){
                arr.add(i);
            }
        }
        return arr;
    }
}