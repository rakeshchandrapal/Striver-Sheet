package GFG_Daily;
import  java.util.Collections;
import java.util.Collection;
public class DAY_02 {

//                    8
//                    25 20 35 15 22 30 45 32
//                    35

    public static void main(String[] args) {

        Node root = new Node(25);
        root.left = new Node(20);
        root.right = new Node(35);
        root.right.right = new Node(45);
        root.right.left = new Node(30);
        System.out.println(maxDifferenceBST(root,35));
    }
    public static int maxDifferenceBST(Node root,int target)
    {
        //Please code here


        return helper(root,target,0);
    }

    public static int helper(Node root , int target,int sum){
        if(root == null) return -1;
        if(root.data == target) return sum -  root.left.data;
        else if(target < root.data) return helper(root.left,target, sum+root.data);
        else return helper(root.right,target, sum+root.data);
    }

    public static  Node insertIntoBST2(Node root, int data) {

        if(root == null ) return new Node(data);

        if(data > root.data) root.right = insertIntoBST2( root.right,data);
        else root.left =  insertIntoBST2(root.left,data);
        return root;
    }
}

class Node {
    int data;
    Node left ;
    Node right;

    Node(int data){
        this.data = data;
    }

}