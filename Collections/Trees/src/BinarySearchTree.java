/*  --Blueprint--
class Node{
    int data;
    Node left,right;
    Node(int data){
      this.data=data;
      left=right=null;
    }
}
 */
//import java.util.*;
public class BinarySearchTree {
    static Node Insertion(Node root,int data){
        if(root==null)
            return new Node(data);
        if(data<root.data)
            root.left=Insertion(root.left,data);
        if(data>root.data)
            root.right=Insertion(root.right,data);
        return root;
    }
    static void inorder(Node root){
        if(root==null)
            return ;
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }
    static boolean search(Node root,int key){
        if(root==null)
            return false;
        if(root.data==key)
            return true;
        if(root.data<key)
            return search(root.left,key);
        return search(root.left,key);
    }
    static void Delete(){

    }
    public static void main(String[] args){
        Node root=null;
        int[] arr={5,6,7,10,11,8,9};
        for(int x:arr){
            root=Insertion(root,x);
        }
        inorder(root);
        System.out.println("\nSearch 40:"+search(root,40));
    }
}
