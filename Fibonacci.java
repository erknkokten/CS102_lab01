/**
 * Auto Generated Java Class.
 */
public class Fibonacci {
  
  public static void main(String[] args) { 
    
    IntBag bag = new IntBag();
    //First 2 terms of fibonacci
    bag.add(0);
    bag.add(1);
    for(int i = 0; bag.getSize() != 40 ;i++){
      bag.add(bag.getValue(i) + bag.getValue(i+1));
    }
    System.out.println(bag.toString());
  }
  
  /* ADD YOUR CODE HERE */
  
}
