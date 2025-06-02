// 448. Find All Numbers Disappeared in an Array

// Given an array nums of n integers where nums[i] is in the range [1, n], return an array of all the integers in the range [1, n] that do not appear in nums.

// Example 1:
// Input: nums = [4,3,2,7,8,2,3,1]
// Output: [5,6]

// Example 2:
// Input: nums = [1,1]
// Output: [2]


//code
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int n = nums.length;
        List<Integer> arr = new ArrayList<>();
        for(int i=1;i<=n;i++){
            int flag=0;
            for(int j=0;j<n;j++){
                if(nums[j]==i){
                    flag=1;
                    break;
                }
            }
            if(flag==0){
                arr.add(i);
            }
        }
        return arr;
    }
}
//brute force approach
// Time Complexity : O(n^2)
// Space Complexity : O(1)
// The above code uses a nested loop to check for each number in the range [1, n] if it exists in the array. The time complexity is O(n^2) due to the nested loops, and the space complexity is O(1) as no additional data structures are used.


// class Solution {
//     public List<Integer> findDisappearedNumbers(int[] nums) {
//         int n = nums.length;
//         List<Integer> arr = new ArrayList<>();
//         Set<Integer> map = new HashSet<>();
//         for(int i=0;i<n;i++){
//             map.add(nums[i]);
//         }
//         for(int i=1;i<=n;i++){
//             if(!map.contains(i)){
//                 arr.add(i);
//             }
//         }
//         return arr;
//     }
// }

// Time Complexity : O(n)
// Space Complexity : O(n)


// class Solution {
//     public List<Integer> findDisappearedNumbers(int[] a) {
//         List<Integer> ans = new ArrayList<>();
//         int n = a.length;
//         for(int i=0;i<n;i++){
//             while(a[a[i]-1]!=a[i]){
//                 int temp=a[a[i]-1];
//                 a[a[i]-1]=a[i];
//                 a[i]=temp;
//             }
//         }
//         for(int i=0;i<n;i++){
//             if(a[i]!=i+1){
//                 ans.add(i+1);
//             }
//         }
//         return ans;
//     }
// }

//