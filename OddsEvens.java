/*
This is kinda my first real java program.
It is an Odds vs Evens game vs a random number generator (computer)
Author: Nygel
Date:   September 20, 2019
Written in: Vim and a terminal
   */

import java.util.Scanner;

public class OddsEvens {
  public static void main(String [] args) {
    Scanner input = new Scanner(System.in);
    
    int evenPlayer = 0;
    int oddPlayer = 1;
    String again = "y";
    
    System.out.println( );
    System.out.println( "Let's play a game called \"Odds and Evens\"" );
    System.out.print( "What is your Name? " );
    String name = input.next();
    System.out.println( "Well hello there, " + name + "!");
    System.out.println( "-------------------------" );

    while ((again.equals("y")) || (again.equals("Y"))) {
      System.out.println( );
      System.out.print( name + ", please select (o)dds or (e)vens: " );
      String select = input.next();
      if (select.equals("o")) {
        System.out.println( "You selected Odds so I shall be Evens." );
      } else if (select.equals("e")) {
        System.out.println( "You selected Evens so I shall be Odds." );
      } else {
        select = "e";
        System.out.println( "Hmmm, I'll assume you meant Evens which means I will be Odds." );
      }
      System.out.println( "-------------------------" );

      System.out.println( );
      System.out.print( "Now select any number of fingers between 0 - 5: ");
      int fingers = input.nextInt();
      if ( (fingers >= 0) && (fingers <= 5) ) {
        System.out.println( "You selected " + fingers + " fingers." );
      } else {
        fingers = 0 + (int)(Math.random() * 6);
        System.out.println( "Hmmm, did you type " + fingers + " fingers?  Great!  Let's play!" );
      }
      int rand = 0 + (int)(Math.random() * 6);
      System.out.println( "I've selected, " + rand + " fingers!");
      System.out.println( "-------------------------" );

      System.out.println( );
      int total = fingers + rand;
      int result = total % 2;
      System.out.println( "Well, " + fingers + " + " + rand + " = " + total);
      if ( result == 0 ) {
        System.out.println( "And " + total + " is .... Even!");
        if ( select.equals("e") ) {
            System.out.println( "Which means " + name + " wins!  You're really something else :)" );
        } else {
            System.out.println( "Which means I've won!  Good game!  Let's play again!");
        }
      } else {
        System.out.println( "And " + total + " is .... Odd!");
        if ( select.equals("o") ) {
            System.out.println( "Which means " + name + " wins!  You're really something else :)" );
        } else {
            System.out.println( "Which means I've won!  Good game!  Let's play again!");
        }
      }
      System.out.println( "-------------------------" );

      System.out.println( "Would you like to play again? (y or n): " );
      again = input.next();

      if ((again.equals("y")) || (again.equals("Y"))) {
          System.out.println( "Great! Lesss goooooo!" );
      } else {
          System.out.println( "Ok! See ya later!" );
      }
    }
    
  }
}


/*
NOTES:
+++ INPUT STUFF +++ 

`import java.util.Scanner`
  this imports the Scanner utility into the program to allow user input
  
`Scanner input = new Scanner(System.in);`
  this creates a handle, "input" for me to use the scanner method
  I define input the handle
  
`String name = input.next();`
  this uses the scanner method to grab the input which is the next
  thing that is entered; it then assigns the input to the variable "name"

  Remember to decare the type of variable and also to declare the type
  of input expected with the .next; they should totally both match

  .nextInt();  .nextDouble();
  .nextLine(); <- this one will allow spaces as .next(); will not

+++ Random number generator +++
`(1 + (int)(Math.random() * 10))`

+++ How to compare strings again? +++
Interesting fact `==` means you are comparing memory addresses not values
That is why trying to compare two strings with `==` does not work

We need to use the String class method, `equals()`
eg: `value1.equals(value1)` then this returns a boolean value
 */
