public class MyStackTester {
   public static void main (String [] args) {
      MyStack myStack = new MyStack();
      myStack.push("Chris");
      myStack.push("Kim");
      myStack.push("Jasmin");
      System.out.println ("Original Stack:\t");
      while (!myStack.isEmpty()){
         System.out.print(myStack.pop()+ "\t");
      }
      System.out.println ("\nIs it empty?\t" + myStack.isEmpty()); 
      Integer [] numbers = {10, 20, 30};
      myStack = new MyStack (numbers);
      System.out.println ("Second Stack:\t");

      while (!myStack.isEmpty()){
         System.out.print(myStack.pop()+ "\t");
      }
   }
}
