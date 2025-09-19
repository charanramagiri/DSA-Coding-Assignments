/*
 876. Middle of the Linked List
Given the head of a singly linked list, return the middle node of the linked list.
If there are two middle nodes, return the second middle node.

Example 1:
Input: head = [1,2,3,4,5]
Output: [3,4,5]
Explanation: The middle node of the list is node 3.

Example 2:
Input: head = [1,2,3,4,5,6]
Output: [4,5,6]
Explanation: Since the list has two middle nodes with values 3 and 4, we return the second one.
 
Constraints:
The number of nodes in the list is in the range [1, 100].
1 <= Node.val <= 100
 */

 //Code

 /**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode middleNode(ListNode head) {
        int cnt=0;
        ListNode curr = head;
        while(curr.next!=null){
            cnt++;
            curr=curr.next;
        }
        int n;
        if(cnt%2==0){
            n=cnt/2;
        }
        else{
            n=(cnt/2)+1;
        }
        
        ListNode mid=head;
        for(int i=0;i<n;i++){
            mid=mid.next;
        }
        return mid;
    }
}

/*
 
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }

class Solution {
    public ListNode middleNode(ListNode head) {
        int length=1;
        ListNode temp = head;
        while(temp.next!=null){
            length++;
            temp=temp.next;
        }

        if(length==1){
            return head;
        }
        
        int mid = length/2;

        int cnt = 1;
        ListNode t = head;
        while(cnt<mid){
            t=t.next;
            cnt++;
        }
        return t.next;
    }
}
 */