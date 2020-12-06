package pers.cloud.FirstWeek;

public class swapNodesInPairs {
    public ListNode swapPairs(ListNode head) {
        if (head == null) return null;
        ListNode curr = head;
        if (head.next != null) {
            head = head.next;
        }
        ListNode preNode = null;
        while (curr != null && curr.next != null) {
            ListNode temp = curr.next.next;
            curr.next.next = curr;
            if (preNode != null) {
                preNode.next = curr.next;
            }
            preNode = curr;
            curr.next = temp;
            curr = temp;
        }
        return head;
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
