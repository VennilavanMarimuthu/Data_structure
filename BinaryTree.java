import java.util.Scanner;

public class BinaryTree {
    NodeTree root;

    public BinaryTree(){
        Scanner sc=new Scanner(System.in);
        root=createTree(sc);
    }

    public NodeTree createTree(Scanner sc) {
        int data=sc.nextInt();
        if(data==-1) return null;

        var n=new NodeTree(data);
        n.left=createTree(sc);
        n.right=createTree(sc);
        return n;
        
    }

    public void display(){
        inOrderDisplay(root);
    }

    private void inOrderDisplay(NodeTree root2) {
        if(root2==null) return ;
        System.out.print(root2.data+",");
        inOrderDisplay(root2.left);
        inOrderDisplay(root2.right);

    }
}
