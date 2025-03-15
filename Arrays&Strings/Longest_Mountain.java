/*
 845. Longest Mountain in Array

You may recall that an array arr is a mountain array if and only if:
arr.length >= 3
There exists some index i (0-indexed) with 0 < i < arr.length - 1 such that:
arr[0] < arr[1] < ... < arr[i - 1] < arr[i]
arr[i] > arr[i + 1] > ... > arr[arr.length - 1]
Given an integer array arr, return the length of the longest subarray, which is a mountain. Return 0 if there is no mountain subarray.

Example 1:
Input: arr = [2,1,4,7,3,2,5]
Output: 5
Explanation: The largest mountain is [1,4,7,3,2] which has length 5.

Example 2:
Input: arr = [2,2,2]
Output: 0
Explanation: There is no mountain.
 
code:

*/

class Solution {
    public int longestMountain(int[] arr) {
        if(arr.length<3) return 0;

        int max =0;
        int n = arr.length;

        for(int i=1;i<n-1;i++){
            if(arr[i]>arr[i-1] && arr[i]>arr[i+1]){
                int left=i,right=i;

                while(left>0 && arr[left]> arr[left-1]){
                    left--;
                }
                while(right<n-1 && arr[right]> arr[right+1]){
                    right++;
                }

                int length = right-left+1;
                max=Math.max(max,length);
            }
        }
        return max;
    }
}
