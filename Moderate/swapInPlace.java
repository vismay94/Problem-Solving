package Moderate;

public class swapInPlace {
    public int[] swapNumber(int[] numbers){

//        Ex: x = 1, y =2 -> x = x + y -> x=3, y=2 -> y = x-y and x = x-y
//        Without using temp variable we can swap elements.
        int num1 = numbers[0];
        int num2 = numbers[1];
        num1 = num1 + num2;
        numbers[1] = num1 - num2;
        numbers[0]= num1 - num2;

        return numbers;

    }
}
