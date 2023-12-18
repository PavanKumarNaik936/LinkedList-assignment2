/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public boolean isPalindrome(ListNode head) {
        if(head==null||head.next==null)
            return true;
        ListNode mid=Middle(head);
        ListNode temp=head;
        int c=0;
        while(temp!=null){
            temp=temp.next;
            c++;
        }
        ListNode h2=mid.next;
        mid.next=null;
        ListNode h1=Reverse(head);
        ListNode temp1=h1;
        ListNode temp2=h2;
        if(c%2!=0){
            temp1=temp1.next;
        }
        while((temp1!=null && temp2!=null)&& temp1.val==temp2.val){
            temp1=temp1.next;
            temp2=temp2.next;
        }
        if(temp1!=null || temp2!=null ){
            return false;
        }
        else return true;
    }
    ListNode Middle(ListNode head){
        if(head==null)
            return null;
        ListNode fast=head;
        ListNode slow=head;
        while(fast.next!=null && fast.next.next!=null){
            fast=fast.next.next;
            slow=slow.next;
        }
        return slow;
    }
    ListNode Reverse(ListNode head){
        if(head==null || head.next==null)
            return head;
        ListNode curr=head;
        ListNode temp=null;
        ListNode prev=null;
        while(curr!=null){
            temp=curr.next;
            curr.next=prev;
            prev=curr;
            curr=temp;
        }
        return prev;
    }
}
