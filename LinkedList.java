
public class LinkedList {
      int size;
      Node head;
      Node tail;
      
    public LinkedList(){
        size=0;
        head=tail=null;
    }

    public void addFirst(int data){
        var n=new Node(data);

        n.next=head;

        head=n;

        if(size==0) tail=n;

        size++; 
    }

    public void addLast(int data){
        var n=new Node(data);
        if(size==0){
            tail=head=n;
            size++;
            return;

        } 
        tail.next=n;
        tail=n;
        size++;
    }

    public void addAt(int data,int index)throws Exception{
        if(index<0 || index>size){
            Exception e=new Exception("invalid index");
            throw e;
        }
    
       if(index==0) addFirst(data);

       else if (index==size) addLast(data);

       else{
        var n=new Node(data);


        Node temp=head;
        for(int i=0;i<index-1;i++){
        temp=temp.next;
        }
 
        n.next=temp.next;
        temp.next=n;

        size++;
    }


    }

    public int removeFirst() throws Exception{
        if(size==0) throw new Exception("LinkedList is empty!!");
        int output=head.data;
        head=head.next;
        return output;
    }

    public int removeLast()throws Exception{ 
        if(size==0) {
            throw new Exception("LinkedList is empty!!");
        }
        int output=tail.data;
        Node temp=head;
        while (temp.next!=tail) {
            temp=temp.next;
        }
        tail=temp;
        tail.next=null;
        return output;

    }

    public int removeAt(int index)throws Exception{ 
        if(size==0) {
            throw new Exception("LinkedList is empty!!");
        }

        if(index<0 || index >size-1) throw new Exception("Invalid index!!");

        if(index==0) return removeFirst();

        if(index==size-1) return removeLast();

       Node temp=head;
       for (int i = 0; i < index-1; i++) {
           temp=temp.next;

       }
        int output=temp.next.data;

        temp.next=temp.next.next;

        return output;


    }

    public int get(int index)throws Exception{
        if(size==0) throw new Exception("LinkedList is empty!");

        if(index<0 || index>size-1) throw new Exception("Invalid Index!!");

        if(index==0) return getFirst();

        if(index==size-1) return getLast();

        Node temp=head;

        for (int i = 0; i < index; i++) {
            temp=temp.next;

        }
        return temp.data;


    }

    public int getFirst() throws Exception {
        if(size==0) throw new Exception("LinkedList is empty!!");

        return head.data;

        
    }

    public int getLast() throws Exception {
        if(size==0) throw new Exception("LinkedList is empty!!");

        return tail.data;

        
    }

    public int size(){
        return size;
    }

    

    public void diplay(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println();
    }

    public boolean isEmpty(){
        if (size==0) return true;

        return false;
    }
    
}