package list;

public class LeeCode_83_042 {

	/*
	 * Definition for singly-linked list.
	 * */

    public ListNode deleteDuplicates(ListNode head) {
        ListNode stubNode = head;    
        if(head ==null){
            return null;
        }else{
            ListNode ptemp= head.next;
            int stub = head.val;
            while(ptemp!=null){
                if(stub == ptemp.val){
                    head.next = ptemp.next;
                }else{
                    stub = ptemp.val;
                    head = head.next;               
                }           
                ptemp = ptemp.next;
                if(ptemp!=null){
                    System.out.println(ptemp.val); 
                }


            }
            return stubNode;
        }
    }
    
    public static void main(String[] args){
    	
    }
}

