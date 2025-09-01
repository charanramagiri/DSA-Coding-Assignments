//150. Evaluate Reverse Polish Notation

//link : https://leetcode.com/problems/evaluate-reverse-polish-notation/description/

//BruteForce

class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> st = new Stack<>();
        for(String ch : tokens){
            if(!ch.equals("+") && !ch.equals("-") && !ch.equals("*") && !ch.equals("/")){
                st.push(Integer.parseInt(ch));
            }
            if(ch.equals("+")){
                int a = st.pop();
                int b = st.pop();
                st.push(a+b);
            }
            if(ch.equals("-")){
                int a = st.pop();
                int b = st.pop();
                st.push(b-a);
            }
            if(ch.equals("*")){
                int a = st.pop();
                int b = st.pop();
                st.push(a*b);
            }
            if(ch.equals("/")){
                int a = st.pop();
                int b = st.pop();
                st.push(b/a);
            }
        }
        return st.peek();
    }
}

//SwitchCase Approach

class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> st = new Stack<>();
        for(String ch : tokens){
            if(!ch.equals("+") && !ch.equals("-") && !ch.equals("*") && !ch.equals("/")){
                st.push(Integer.parseInt(ch));
            }
            else{
                int right = st.pop();
                int left = st.pop();
                switch(ch){
                    case "+" : st.push(right+left); break;
                    case "-" : st.push(left-right); break;
                    case "*" : st.push(right*left); break;
                    case "/" : st.push(left/right); break;
                }
            }
        }
        return st.peek();
    }
}

//Recursion Approach

class Solution {
    int n;
    public int postfix(String[] tokens){
        String ch = tokens[n--];
        if(ch.equals("+") || ch.equals("-") || ch.equals("*") || ch.equals("/")){
            int left = postfix(tokens);
            int right = postfix(tokens);

            switch(ch){
                case "+" : return right+left;
                case "-" : return right-left;
                case "*" : return right*left;
                case "/" : return right/left;
            }
        }
        return Integer.parseInt(ch);
    }

    public int evalRPN(String[] tokens) {
        n = tokens.length-1;
        return postfix(tokens);
    }
}

//Single Array Approach

class Solution {
    public int evalRPN(String[] tokens) {
        int n = tokens.length;
        int st[] = new int[n];
        int top = -1;

        for(String ch : tokens){
            switch(ch){
                case "+" : st[top-1] = st[top]+st[top-1]; 
                top--; break;
                case "-" : st[top-1] = st[top-1]-st[top];
                top--; break;
                case "*" : st[top-1] = st[top]*st[top-1];
                top--; break; 
                case "/" : st[top-1] = st[top-1]/st[top];
                top--; break;
                default : st[++top] = Integer.parseInt(ch);
            }
        }
        return st[0];
    }
}