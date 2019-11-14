package linkedlist;

import java.util.ArrayList;

public class kthElementToLast {
//    Iterative Solution
    public Node elementsOfLinkedListIterative(Node head, int k){
       Node l1 = head;
       Node l2 = head;

        //first we will move l1 by k steps
        for(int i =0; i<k;i++) {
            if (l1 != null) {
                l1 = l1.next;
            }
        }
        //we move l2 from start, whenever l1 hits the end. That's our answer

         while(l1!= null){
             l1= l1.next;
             l2 = l2.next;
         }
         return l2;
        }
//        RECURSIVE SOLUTION
        public int kthToLastRecursive(Node head, int k ){
            if(head == null){
                return 0;
            }
            int index = kthToLastRecursive(head.next, k) + 1;
            if(index == k){
                System.out.println("Value is" + head.data);
            }
            return index;

        }
}
