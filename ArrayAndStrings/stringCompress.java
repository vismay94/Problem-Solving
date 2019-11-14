package ArrayAndStrings;

public class stringCompress {

    public static void main(String args[]){
        String str = "aabbcccccaaa";
        String ans = "";
        int count = 0;
        for(int i = 0; i<str.length(); i++){
            count++;
            if(i+1 >= str.length() || str.charAt(i) != str.charAt(i+1)) {
                ans = ans + str.charAt(i) + "" + String.valueOf(count);
                count = 0;
            }
        }
        System.out.println(ans.length() + " "+ str.length());
    }
}
