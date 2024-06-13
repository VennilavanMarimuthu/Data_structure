public class DynamicQueue extends Queue{
    public DynamicQueue(){
        this(def);
    }
    public DynamicQueue(int data){
        super(data);
    }

    public void enqueue(int data)throws Exception{
        if(size==capacity){
            int[] temp=new int[2*capacity];
            for (int i = 0; i < capacity; i++) {
                int index=(front+i)%capacity;
                temp[i]=arr[index];
            }
            arr=temp;
            temp=null;
            front=0;
            capacity*=2;
        }
        super.enqueue(data);

    }

}