//Reverse first K of a Queue -> GFG

//link : https://www.geeksforgeeks.org/problems/reverse-first-k-elements-of-queue/1

package Queues;

import java.util.Queue;
import java.util.Stack;

public class ReverseK_Queue {
    public Queue<Integer> reverseFirstK(Queue<Integer> q, int k) {
        // code here\
        int n = q.size();
        int m = n-k;
        
        if(k>n || k<=0) return q;
        
        Stack<Integer> st = new Stack<>();
        int arr[] = new int[m];
        for(int i=0;i<k;i++){
            st.push(q.poll());
        }
        for(int i=0;i<m;i++){
            arr[i] = q.poll();
        }
        while(!st.isEmpty()){
            q.offer(st.pop());
        }
        for(int i=0;i<m;i++){
            q.offer(arr[i]);
        }
        return q;
    }
}
