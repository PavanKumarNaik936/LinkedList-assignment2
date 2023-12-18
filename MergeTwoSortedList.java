class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
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
}
