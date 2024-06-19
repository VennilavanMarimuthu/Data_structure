import java.util.Scanner;
class BinarySearchTree {
    NodeTree root;
    public BinarySearchTree(){
       root=createTree();
    }
    public NodeTree createTree() {
        Scanner sc=new Scanner(System.in);
        int data=sc.nextInt();
        root=null;
        while(data!=-1){
            root=insert(root,data);
            data=sc.nextInt();
        }
        return root;
    }
    public NodeTree insert(NodeTree root2, int key) {
        if(root2==null) return new NodeTree(key);
        
        if(key<root2.data){
            root2.left= insert(root2.left, key);
        }
        else if(key>root2.data) {
            root2.right= insert(root2.right, key);
        }
        return root2;
    }
    public void display(){
        inOrderDisplay(root);
        System.out.println();
    }
    private void inOrderDisplay(NodeTree root2) {
        if(root2==null) return ;
        
        System.out.print(root2.data+",");

        inOrderDisplay(root2.left);
        
        inOrderDisplay(root2.right);
    }
    
    public boolean contains(int data){
        return search(root,data);
    }
    public boolean search(NodeTree root2,int key){
        if(root2==null)return false;
        if(root2.data==key) return true;
        if(key<root2.data) return search(root2.left,key);
        else return search(root2.right,key);
    }
    public void remove(int data){
        root=delete(root,data);
    }
    public NodeTree delete(NodeTree root2, int key){
        if(key>root2.data){
            root2.right=delete(root2.right,key);
        }
        else if(key<root2.data){
            root.left=delete(root2.left,key);
        }
        else{
            if(root2.left==null && root2.right==null){
                return null;
            }
            else if(root2.left==null) return root2.right;
            else if(root2.right==null) return root2.left;
            else{
                NodeTree temp =root.right;
                while(temp.left!=null){
                    temp=temp.left;
                }
                root2.data=temp.data;
                root2.right=delete(root2.right,temp.data);
            }
            return root2;
        }
        return root2;
    }
}
