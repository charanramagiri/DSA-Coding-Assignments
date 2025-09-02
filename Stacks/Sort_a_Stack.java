// Sort a stack

//link : https://www.geeksforgeeks.org/problems/sort-a-stack/1


class Sort_a_Stack {
    
    public void sortedInsert(Stack<Integer> s, int x){
        if(s.isEmpty() || x>s.peek()){
            s.push(x);
            return;
        }
        int temp = s.pop();
        sortedInsert(s, x);
        s.push(temp);
    }
    
    
    public Stack<Integer> sort(Stack<Integer> s) {
        // add code here.
        if(!s.isEmpty()){
            int x = s.pop();
            sort(s);
            sortedInsert(s,x);
        }
        return s;
    }
}

