import java.util.Scanner;
/**
 * asks user for a positive integer, tell the user all the numbers from 1 to that number
 * @author Graham Ellacott
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    //make a scanner to get user input
    Scanner input = new Scanner(System.in);

    //initialize variables
    int number; //the number provided by the user

    //ask user for a number
    System.out.println("Please enter a positive integer");
    number = input.nextInt();

    //start a loop to count to that number
    for(int i = 1; i <= number; i++){
      //print the current number
      System.out.print(i);
      //check if comma is needed
      if(i != number){ //if it is not the last number
        //print a comma to the screen
        System.out.print(", ");
      }
    }
  }
}
