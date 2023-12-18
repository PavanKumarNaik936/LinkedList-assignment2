 
class Solution {
    public ListNode sortList(ListNode head) {
        if(head==null||head.next==null)
            return head;
        ListNode mid=Middle(head);
        ListNode h2=mid.next;
        mid.next=null;
        head=sortList(head);
        h2=sortList(h2);
        return merge(head,h2);
    }
    ListNode merge(ListNode list1,ListNode list2){
         ListNode H3=new ListNode(-1);
        ListNode tail=H3;
        while(list1!=null && list2!=null){
            if(list1.val<=list2.val){
                tail.next=list1;
                tail=tail.next;
                list1=list1.next;
            }
            else{
                tail.next=list2;
                tail=tail.next;
                list2=list2.next;
            }
        }
        if(list1!=null){
            tail.next=list1;
        }
        if(list2!=null){
            tail.next=list2;
        }
        return H3.next;
    }
    ListNode Middle(ListNode head){
        if(head==null)
            return null;
        ListNode fast=head;
        ListNode slow=head;
        while(fast.next!=null&& fast.next.next!=null){
            fast=fast.next.next;
            slow=slow.next;
        }
        return slow;
    }
}
