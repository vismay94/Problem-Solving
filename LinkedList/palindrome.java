package linkedlist;

import java.util.Stack;

//Given a singly linked list, determine if its a palindrome.
public class palindrome {

    public Boolean palindromeCheck(Node head){
        Node fast = head;
        Node slow = head;
        Stack<Integer> values = new Stack<Integer>();
        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
            values.push(slow.data);
        }
        if(fast != null){
            slow = slow.next;
        }

        while(slow != null){
            int top = values.pop().intValue();

            if(top != slow.data){
                return false;
            }
        }
        return true;
    }
}
