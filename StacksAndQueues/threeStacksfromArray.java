package stackAndQueues;

import java.util.EmptyStackException;

public class threeStacksfromArray {
    private int stackCapacity;
    private int numberOfStacks = 3;
    private int[] values;
    private int[] sizes;

    public threeStacksfromArray(int stackSize){
        stackCapacity = stackSize;
        values = new int[numberOfStacks * stackCapacity];
        sizes = new int[numberOfStacks];
    }

    public void push(int stackNum, int data){
        if(isFull(stackNum)){
            throw new StackOverflowError();
        }
        sizes[stackNum]++;
        values[getIndex(stackNum)]= data;
    }

    public Boolean isFull(int stackNum){
        return sizes[stackNum] == stackCapacity;
    }
    // We have to insert into within capacity range, so we will calculate offset.
    public int getIndex(int stackNum){
        int offset = stackNum * stackCapacity;
        int size = sizes[stackNum];
        return offset + size -1;
    }

    public int pop(int stackNum){
        if(isEmpty(stackNum)){
            throw new EmptyStackException();
        }
        int index = getIndex(stackNum);
        int value = values[index];
        values[index] = 0;
        sizes[stackNum]--;
        return value;


    }
    public Boolean isEmpty(int stackNum){
        return sizes[stackNum] == 0;
    }
}
