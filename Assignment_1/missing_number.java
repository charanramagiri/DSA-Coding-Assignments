/**

268. Missing Number

Easy

Given an array nums containing n distinct numbers in the range [0, n], return the only number in the range that is missing from the array.

Example 1:
Input: nums = [3,0,1]
Output: 2
Explanation:
n = 3 since there are 3 numbers, so all numbers are in the range [0,3]. 2 is the missing number in the range since it does not appear in nums.

Example 2:
Input: nums = [0,1]
Output: 2
Explanation:
n = 2 since there are 2 numbers, so all numbers are in the range [0,2]. 2 is the missing number in the range since it does not appear in nums.

Example 3:
Input: nums = [9,6,4,2,3,5,7,0,1]
Output: 8
Explanation:
n = 9 since there are 9 numbers, so all numbers are in the range [0,9]. 8 is the missing number in the range since it does not appear in nums.


**/


//Code :

import java.util.HashSet;
class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        HashSet<Integer> set = new HashSet<>();
        for(int ele:nums){
            set.add(ele);
        }
        int j=0;
        while(j<n){
            if(!set.contains(j)){
                return j;
            }
            j++;
        }
        return n;
    }
}

// Time Complexity : O(n)
// Space Complexity : O(n)
// The above code uses a HashSet to store the elements of the array, and then iterates through the range [0, n] to find the missing number. The time complexity is O(n) for both the insertion and search operations in the HashSet, and the space complexity is O(n) for storing the elements in the HashSet.

        // class Solution {
        //     public int missingNumber(int[] nums) {
        //         int n = nums.length;
        //         int sum = n*(n+1)/2;
        //         int s=0;
        //         for(int i=0;i<n;i++){
        //             s+=nums[i];
        //         }
        //         int miss = sum-s;
        //         return miss;
        //     }
        // }

// Time Complexity : O(n)
// Space Complexity : O(1)
// The above code uses the formula for the sum of the first n natural numbers to calculate the expected sum, and then subtracts the actual sum of the elements in the array to find the missing number. The time complexity is O(n) for iterating through the array, and the space complexity is O(1) since no additional data structures are used.