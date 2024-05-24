class DynamicArray{
    
    private static final int defaultSize=10;
    int[] arr;
    int size;
    int capacity;

    public DynamicArray(int data){
        arr=new int[data];
        size=0;
        capacity=data;
    }
    public DynamicArray(){
        this(defaultSize);
    }

    public void add(int data){
        if(capacity==size){

            int[] oldArr=arr;

            arr=new int[2*capacity];

            for (int i = 0; i < oldArr.length; i++) {
                arr[i]=oldArr[i];
            }

            oldArr=null;

            capacity *=2;

        }
        arr[size]=data;
        size++;
        
    }

    public void display(){
        for (int i = 0; i < size; i++) {
            if (i==size-1) {
                System.out.println(arr[i]);
            }
            else{
                System.out.print(arr[i]+",");
            }
        }
    }

    public int capacity(){
        return capacity;
    }

    public int size(){
        return size;
    }

    public int getIndex(int i){
        for (int j = 0; j < arr.length; j++) {
            if(arr[j]==i){
                return j;
            }
        }
        return -1;
    }

    public int get(int index){
        return arr[index];
    }


    public boolean contains(int data){
        for (int i = 0; i < size; i++) {
            if (arr[i]==data) {
               return true; 
            }
        }
        return false;
    }

    public void remove(int index){
        
        if(index==size) removeLast();

        for (int i = index; i < size; i++) {
            arr[i]=arr[i+1];
        }
        size--;
    }

    public void removeLast(){
        size--;
    }




        

    
}