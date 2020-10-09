/**
 * Auto Generated Java Class.
 */
import java.util.Scanner;
public class Main {
  
  
  public static void main(String[] args) { 
    Scanner scan = new Scanner(System.in);
    IntBag bag = new IntBag();
    
    int selection;
    int value;
    int index;
    
    do{
      System.out.println("1)Create a new empty collection(any previous values are lost!) \n" +
                         "2)Read a set of positive values into the collection (use zero to indicate all the values have been entered.) \n" + 
                         "3)Print the collection of values. \n" + 
                         "4)Add a value to the collection of values at a specified location \n" +
                         "5)Remove the value at a specified location from the collection of values \n" + 
                         "6)Remove all instances of a value within the collection \n" +
                         "7)Quit the program \n");
      
      selection = scan.nextInt();
      if(selection == 1){
        bag = new IntBag();
      }
      else if(selection == 2){
        do{
          System.out.println("Enter value to add to bag, enter 0 to finish adding values: ");
          value = scan.nextInt();
          
          if(value != 0)
            bag.add(value);
          
        }while(value != 0);
      }
      else if(selection == 3){
        System.out.println(bag.toString());
      }
      else if(selection == 4){
        
          System.out.println("Enter value and index to add to bag, enter 0 to finish adding values: ");
          value = scan.nextInt();
          scan.nextLine();
          index = scan.nextInt();
  
          bag.add(value, index);
          
      }
      else if(selection == 5){
        System.out.println("Enter index to remove from bag: ");
        index = scan.nextInt();
        bag.remove(index);
      }
      else if(selection == 6){
        System.out.println("Enter a value to remove all its indices from bag: ");
        value = scan.nextInt();
        bag.removeAll(value);
      }
      else if(selection == 7){
        System.out.println("End of the program.");
      }
      
      
    }while(selection != 7);
  }
  /* ADD YOUR CODE HERE */
  
}
