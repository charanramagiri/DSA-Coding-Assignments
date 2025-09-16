//232. Implement Queue using Stacks

//link: https://leetcode.com/problems/implement-queue-using-stacks/description/

class MyQueue {
    Stack<Integer> st1 = new Stack<>();
    Stack<Integer> st2 = new Stack<>();
    // public MyQueue() {
        
    // }
    
    public void push(int x) {
        st1.push(x);
    }
    
    public int pop() {
        if(!st2.isEmpty()){
            return st2.pop();
        }
        while(!st1.isEmpty()){
            st2.push(st1.pop());
        }
        return st2.pop();
    }
    
    public int peek() {
        if(!st2.isEmpty()){
            return st2.peek();
        }
        while(!st1.isEmpty()){
            st2.push(st1.pop());
        }
        return st2.peek();
    }
    
    public boolean empty() {
        return st2.isEmpty() && st1.isEmpty();
    }
}



//with main code
/*
 
 import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution.
        Scanner sc = new Scanner(System.in);
        
        int q = sc.nextInt();
        
        Stack<Integer> st1 = new Stack<>();
        Stack<Integer> st2 = new Stack<>();
        
        for(int i=0;i<q;i++){
            int type = sc.nextInt();
            
            if(type == 1){
                int val = sc.nextInt();
                st1.push(val);
            }
            
            else if(type==2){
                if(st2.isEmpty()){
                    while(!st1.isEmpty()){
                        st2.push(st1.pop());
                    }
                }
                st2.pop();
            }
            
            else if(type ==3){
                if(st2.isEmpty()){
                    while(!st1.isEmpty()){
                        st2.push(st1.pop());
                    }
                }
                System.out.println(st2.peek());
            }
        }   
    }
}

*/