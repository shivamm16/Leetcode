class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 == null)
            return list2;

        if (list2 == null)
            return list1;

        ListNode prev1 = null;
        ListNode p1 = list1;
        ListNode p2 = list2;

        while (p1 != null && p2 != null) {
            if (p1.val <= p2.val) {
                prev1 = p1;
                p1 = p1.next;
            } else {
                ListNode temp = p2;
                p2 = p2.next;
                temp.next = p1;
                if (prev1 == null)
                    list1 = temp;
                else
                    prev1.next = temp;
                prev1 = temp;
            }
        }

        if (p1 == null)
            prev1.next = p2;

        return list1;
    }
}