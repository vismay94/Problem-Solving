package Moderate;

public class factorialZero {

    public int countZero(int num){
//        We will have less 5 in a num then 2. So we will only count 5.
        int count = 0;
        for(int i =2; i<=num;i++){
            count = count + factorialOfFive(i);
        }
        return count;
    }
    public int factorialOfFive(int i){
        int count = 0;
        while(i % 5 ==0){
            count ++;
            i=i/5;
        }
        return count;
    }
}
