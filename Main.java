class Main{
    public static void main(String[] args)throws Exception{

          DynamicQueue  d=new DynamicQueue(4);

          d.enqueue(1);
          d.enqueue(2);
          d.enqueue(3);
          d.enqueue(4);
          d.enqueue(5);
          d.enqueue(6);

          d.display();
          System.out.println(d.dequeue());

          System.out.println(d.peek());

        

    }
}
