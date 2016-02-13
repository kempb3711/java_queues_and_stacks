import java.util.ArrayList;
import java.util.Arrays;
import java.util.*;

public class MyStack<E>
{
   private ArrayList<E> stack; 
   
   public MyStack()
   {
     stack = new ArrayList<>();
   }
   
   public MyStack(E[] array)
   {
      stack = new ArrayList<>(Arrays.asList(array));  
   }
   
   public boolean isEmpty()
   {
      return (stack.size() <= 0);
   }
   
   public void push(E item)
   {
      stack.add(item);
   }
   
   public E pop()
   {
      E item = stack.get(stack.size()-1);
      stack.remove(stack.size()-1);
      return item;
   }
   
   public void clear()
   {
      stack.clear();
   }
   
}
      
    