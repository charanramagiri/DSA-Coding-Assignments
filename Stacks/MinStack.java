//155. Min Stack

//Link: https://leetcode.com/problems/min-stack/

// Two arrays approach
class MinStack {
    int arr[];
    int arr2[];
    int top;
    int capacity;
    int min;
    int i;
    public MinStack() {
        capacity=10000;
        top=-1;
        arr = new int[capacity];
        arr2= new int[capacity];
        min=Integer.MAX_VALUE;
        i=0;
    }
    
    public void push(int val) {
        if(top<capacity-1){
            top++;
            arr[top] = val;
        }
        if(arr[top]<=min){
            arr2[i++]=arr[top];
            min=arr[top];
        }
    }
    
    public void pop() {
        if(top>-1){
            if(arr[top]==arr2[i-1]){
                top--;
                i--;
                if(i>0){
                    min=arr2[i-1];
                }
                else{
                    min=Integer.MAX_VALUE;
                }
            }
            else{
                top--;
            }
        }
    }
    
    public int top() {
        if(top>-1){
            return arr[top];
        }
        return -1;
    }
    
    public int getMin() {
        if(i>0){
            return arr2[i-1];
        }
        return 0;
    }
}



//Two stacks Approach

class MinStack {
    Stack<Integer> stack;
    Stack<Integer> minstack;

    public MinStack() {
        stack = new Stack<>();
        minstack = new Stack<>();
    }
    
    public void push(int val) {
        stack.push(val);
        if(minstack.isEmpty() || minstack.peek()>=val){
            minstack.push(val);
        }
    }
    
    public void pop() {
        if(stack.peek().equals(minstack.peek())){
            minstack.pop();
        } 
        stack.pop();
    }
    
    public int top() {
        if(!stack.isEmpty()){
            return stack.peek();
        }
        return -1;
    }
    
    public int getMin() {
        if(!minstack.isEmpty()){
            return minstack.peek();
        }
        return -1;
    }
}