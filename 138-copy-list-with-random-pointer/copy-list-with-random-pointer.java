class Solution {
    public Node copyRandomList(Node head) {
        // Original Node -> Deep Copy Node
        Map<Node, Node> map = new HashMap<>(); 
        Node cur = head;
        // Map the Original Node -> Deep Copy Node
        while (cur != null){
            map.put(cur, new Node(cur.val));
            cur = cur.next;
        }
        // Reset Pointer
        cur = head;
        // Get every Deep Copy and update its .next and .random
        while (cur != null){
            Node copy = map.get(cur);
            copy.random = map.get(cur.random);
            copy.next = map.get(cur.next);
            cur = cur.next;
        }
        return map.get(head);
    }
}