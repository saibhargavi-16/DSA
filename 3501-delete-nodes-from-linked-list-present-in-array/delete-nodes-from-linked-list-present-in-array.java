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
    public ListNode modifiedList(int[] nums, ListNode head) {
        Set<Integer> sh=new HashSet<>();
        for(int i:nums) sh.add(i);
        while(head!=null && sh.contains(head.val)) head=head.next;
        if(head==null) return null;
        ListNode c=head;
        while(c.next!=null){
            if(sh.contains(c.next.val)) c.next=c.next.next;
            else c=c.next;
        }
        return head;
    }
}