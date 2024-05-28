public class Queue{
    int[] arr;
    int size;
    int front;
    int capacity;
   
    private final static int def=10;

    public Queue(){
        this(def);
    }
    public Queue(int data){
        arr=new int[data];
        size=0;
        front=0;
        this.capacity=data;

    }

    public void enqueue(int data)throws Exception{
        if(size==capacity) throw new Exception("Size is full !!");

        int rear=(front+size)%capacity;
        arr[rear]=data;
        size++;

    }

    public int dequeue() throws Exception{
        if(size==0) throw new Exception("Queue is Empty!!");

        int output =arr[front];

        front=(front+1)%capacity;
        
        size--;

        return output;



    }

    public int size(){
        return size;
    }

    public boolean isEmpty(){
        return (size==capacity);
    }

    public void display(){
        for (int i = 0; i < size; i++) {
            int index=(front+i)%capacity;
            System.err.print(arr[index]+",");
        }
        System.out.println();
    }

    public int peek(){
        int index=(front)%capacity;
        return arr[index];
    }


    
}