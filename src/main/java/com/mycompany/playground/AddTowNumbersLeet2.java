/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.playground;

/**
 *
 * @author carlo
 */
public class AddTowNumbersLeet2 {

    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {val = x;}
    }
    
    class solution{
         public ListNode addTwoNumbers(ListNode l1, ListNode l2){
             ListNode dummy_head = new ListNode(0);
             ListNode l3= dummy_head;
             
             
             int carry=0;
             while(l1!=null || l2!=null){
                int l1_val=(l1!=null) ? l1.val :0; 
                int l2_val=(l2!=null) ? l2.val :0; 
                
                int current_sum = l1_val + l2_val + carry; 
                carry = current_sum /10;
                int last_digit = current_sum %10;
                
                ListNode new_node = new ListNode(last_digit);
                l3.next=new_node;
                if(l1 != null) l1= l1.next;
                if(l2 != null) l2= l2.next;
                
                l3= l3.next;
                
             }
             
             if (carry>0){
                 ListNode new_node = new ListNode(carry);
                 l3.next=new_node;
                 l3=l3.next;
             }
             return dummy_head.next;
         }
    }
}
