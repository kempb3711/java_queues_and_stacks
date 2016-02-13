import java.util.ArrayList;
import java.util.Arrays;
import java.util.*;

public class MyQueue<E>
{
   private ArrayList<E> queue; 
   
   public MyQueue()
   {
     queue = new ArrayList<>();
   }
   
   public MyQueue(E[] array)
   {
      queue = new ArrayList<>(Arrays.asList(array));  
   }
   
   public boolean isEmpty()
   {
      return (queue.size() <= 0);
   }
   
   public void enqueue(E item)
   {
      queue.add(item);
   }
   
   public E dequeue()
   {
      E item = queue.get(0);
      queue.remove(0);
      return item;
   }
   
   public void clear()
   {
      queue.clear();
   }
   
}
  