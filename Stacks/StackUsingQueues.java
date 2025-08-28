// 225. Implement Stack using Queues

// link: https://leetcode.com/problems/implement-stack-using-queues/description/


class MyStack {
    Queue<Integer> q = new LinkedList<>();

    // public MyStack() {
    //     q = new LinkedList<>();
    // }
    
    public void push(int x) {
        int s = q.size();
        q.offer(x);
        for(int i=0;i<s;i++){
            q.offer(q.poll());
        }
    }
    
    public int pop() {
        return q.poll();
    }
    
    public int top() {
        return q.peek();
    }
    
    public boolean empty() {
        return q.isEmpty();
    }
}
