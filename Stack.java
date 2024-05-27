public class Stack {
    int[] arr;
    int top;
    
    private static final int def=10;

    public Stack(){
        this(def);
    }

    public Stack(int size){
        arr=new int[size];
        top=-1;
        size=0;
    }

    public int getSize(){
        return top+1;
    }

    public void push(int data){
        if(arr.length==getSize()){
            int[] oldArr=arr;
            arr=new int[2* getSize()];

            for (int i = 0; i < oldArr.length; i++) {
            arr[i]=oldArr[i];
            }
            oldArr=null;

        }
        arr[++top]=data;

    }
    public int pop() throws Exception{
        if(getSize()==0) throw new Exception("Stack is Empty!!");

        int output=arr[top];

        top--;

        return output;
    }


    public int peek()throws Exception{
        if(getSize()==0) throw new Exception("Stack is Empty!");
        return arr[top];

    }

    public boolean isEmpty(){
        return getSize()==0;
    }

    public void display(){
        for(int i=getSize()-1;i>=0;i--){
            System.out.print(arr[i]+"->");
        }
        
        System.out.println();
    }
}
