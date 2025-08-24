class Node{
    int val;
    Node left,right;
    public Node(int val){
        this.val=val;
        this.left=null;
        this.right=null;
    }
}
public class TreesDemo{

    static int sumofNodes(Node root){
        if(root==null) return 0;
        return root.val+sumofNodes(root.left)+sumofNodes(root.right);
    }

    static int countNodes(Node root){
        if(root==null){
            return 0;
        }
        return 1+countNodes(root.left)+countNodes(root.right);
    }

    static int countLeaves(Node root){
        if(root.left==null && root.right==null) return 1;
        return countLeaves(root.left) + countLeaves(root.right);
    }
    static void printlevel(Node root, int Level){
        if(root == null) return;
        if(Level == 0){
            System.out.println(root.val+" ");
        }
        else{
            printlevel(root.left,Level-1);
            printlevel(root.right,Level-1);
        }

    }

    public static void main(String[] args){
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);

        // System.out.println("Root : "+root.val);
        // System.out.println("left child : "+root.left.val);
 
        // System.out.println(countNodes(root));
        // System.out.println(countLeaves(root));

        printlevel(root,2);
        System.out.println(sumofNodes(root));
    }
}