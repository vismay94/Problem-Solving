package stackAndQueues;

import java.util.Stack;

public class SortStack {
    public void insertIntoStack(Stack<Integer> s,int data){
            if(!s.isEmpty() && s.peek() < data){
                int temp = s.pop();
                s.push(data);
                s.push(temp);
            }
            else{
                s.push(data);
            }
    }
    public int pop(Stack<Integer> s, Stack<Integer> temp){
        int result = s.pop();

        while(!s.isEmpty()){
            temp.push(s.pop());
        }

        while(!temp.isEmpty()){
            insertIntoStack(s,temp.pop());
        }
        return result;
    }

}
