package stackAndQueues;

import java.util.EmptyStackException;
import java.util.Stack;

public class stackOfPlates {

    public Stack<Integer>[] stacks;
    public int thresold;
    public int capacity = 0;    // Presents current size of Stack array

    public void threeStacksfromArray(int size, int limit){
        stacks = new Stack[size];
        thresold = limit;
    }

    public void pushIntoStack(int data){
        if(stacks.length == capacity){
            throw new ArrayIndexOutOfBoundsException();
        }

        Stack<Integer> currentArr = stacks[capacity];
        if (currentArr!= null && currentArr.size() != thresold){
            currentArr.push(data);
        }
        else{
            stacks[capacity+1] = new Stack();
        }
    }
    public int popFromStack() throws Exception {
        Stack<Integer> currStack = null;
        if(stacks.length > 0){
            if(stacks[capacity].isEmpty()){
                capacity -= 1;
            }
           currStack = stacks[capacity];
        }
        return currStack.pop();
    }
}
