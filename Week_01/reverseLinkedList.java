package pers.cloud.FirstWeek;

public class reverseLinkedList {
    public ListNode reverseList(ListNode head) {
       /* ListNode preNode = null;
        ListNode nextNode = null;
        while (head!=null){
            nextNode=head.next;
            head.next=preNode;
            preNode=head;
            head=nextNode;
        }
        return preNode;*/
        if (head == null || head.next == null) return head;
        ListNode newHead = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        return newHead;
    }

    private class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
}


