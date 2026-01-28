import java.util.*;

public class Traversals {
    static void PreOrder(Node root){
        if(root==null)
            return;
        System.out.print(root.data+" ");
        PreOrder(root.left);
        PreOrder(root.right);
    }
    static void InOrder(Node root){
        if(root==null)
            return;

        InOrder(root.left);
        System.out.print(root.data+" ");
        InOrder(root.right);
    }
    static void PostOrder(Node root){
        if(root==null)
            return;

        InOrder(root.left);
        InOrder(root.right);
        System.out.print(root.data+" ");
    }
    static void LevelOrder(Node root){
        Queue<Node> q=new LinkedList<>();

        q.add(root);

        while(!q.isEmpty()){
            Node curr=q.poll();
            System.out.print(curr.data+" ");
            if(curr.left!=null)
                q.add(curr.left);
            if(curr.right!=null)
                q.add(curr.right);
        }
    }
    public static void main(String[] args){
        Node root=new Node(5);
        root.left=new Node(6);
        root.right=new Node(7);
        root.left.left=new Node(10);
        root.left.right=new Node(11);
        root.right.right=new Node(9);
        root.right.left=new Node(8);
        System.out.println("PreOrder: ");
        PreOrder(root);
        System.out.println("\nInOrder: ");
        InOrder(root);
        System.out.println("\nPostOrder: ");
        PostOrder(root);
        System.out.println("\nLevelOrder: ");
        LevelOrder(root);
    }
}

