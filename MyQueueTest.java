import java.util.*;
public class MyQueueTest {
   public static void main (String [] args) {
      MyQueue <Integer> myQueue = new MyQueue<Integer>();
      myQueue.enqueue(10);
      myQueue.enqueue(5);
      myQueue.enqueue(15);
      myQueue.enqueue(50);
      System.out.println ("\noriginal integer queue\t");
      while (!myQueue.isEmpty())
         System.out.print (myQueue.dequeue() + "\t");
         
     MyQueue <String> myQ = new MyQueue<String>();
     myQ.enqueue ("Kim");
     myQ.enqueue ("Jasmin");
     myQ.enqueue ("Noma");
     myQ.dequeue();
     
     System.out.println ("\noriginal String queue\t");
     while (!myQ.isEmpty())
         System.out.print (myQ.dequeue() + "\t");
    String [] names = {"Kemper", "Carlton", "Caleb"};
    MyQueue<String> myQ2 = new MyQueue<String> (names);
    
    System.out.println ("\noriginal second String queue\t");
    while (!myQ2.isEmpty()){
         System.out.print(myQ2.dequeue()+ "\t");
      }
     
   }
}
