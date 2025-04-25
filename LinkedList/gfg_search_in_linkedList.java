/*
 Search in Linked List
Difficulty: EasyAccuracy: 65.4%Submissions: 102K+Points: 2Average Time: 10m
Given a linked list of n nodes and a key, the task is to check if the key is present in the linked list or not.

Example:

Input: n = 4, key = 3
1->2->3->4
Output: true
Explanation: 3 is present in Linked List, so the function returns true.
Constraint:
1 <= n <= 105
1 <= key <= 105
 */

 //code

 class Solution {
    static boolean searchKey(int n, Node head, int key) {
        // Code here
        Node curr=head;
        for(int i=0;i<n;i++){
            if(curr.data==key){
                return true;
            }
            curr=curr.next;
        }
        return false;
    }
}
