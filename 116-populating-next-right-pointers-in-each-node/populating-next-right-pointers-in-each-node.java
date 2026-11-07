class Solution {
    public Node connect(Node root) {
        if(root==null){
            return null;
        }

        Node left = root.left;
        Node right = root.right;
        Node next = root.next;

        if(left!=null){// means node have both child
            left.next=right;
            if(next!=null){
                right.next=next.left;
            }
            connect(left);
            connect(right);
        }

        return root;
    }
}