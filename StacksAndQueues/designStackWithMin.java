package stackAndQueues;

import java.util.Stack;

public class designStackWithMin extends Stack<Integer> {
    private Stack<Integer> s2 ;
    public designStackWithMin( ){
        s2 = new Stack<>();
    }
    public Integer pop(){
        int value = super.pop();
        if(value == min()){
            s2.pop();
        }
        return value;
    }
    public int min(){
        if(s2.isEmpty()){
            return Integer.MAX_VALUE;
        }
        else{
            return s2.peek();
        }
    }
    public void push(int data){
        if(data <= min()){
            s2.push(data);
        }
        super.push(data);
    }
}
