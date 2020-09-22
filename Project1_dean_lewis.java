import java.util.Scanner; //import scanner class to get user input

public class Project1_dean_lewis
{

   public static void main(String[] args)
   {
      double roomWidth = 0.0; //initialize variable for width
      double roomLength = 0.0; //initialize variable for length
      double capacity = 0.0;
      String roomShade = null;
      int wholeCapacity = 0;
      
      Scanner keyboard = new Scanner(System.in); //create scanner object to get user input
      
      System.out.println("What is the width of the room?");
      roomWidth = keyboard.nextDouble(); //to get the width of the room
      
      System.out.println("What is the length of the room?");
      roomLength = keyboard.nextDouble(); //to get the length of the room
      
      //Calculate area of room
      double roomArea = roomWidth * roomLength;
      
      //Define constants
      final int littleShade = 1;
      final int moderateShade = 2;
      final int abundantShade = 3;
      
      //create menu to ask user for how much shade the room gets
      System.out.println("Enter a number to select how much shade the room gets:");
      System.out.println("1. Little shade");
      System.out.println("2. Moderate shade");
      System.out.println("3. Abundant shade");
      int menuChoice = keyboard.nextInt(); //to receive user input from menu choices
      
      //create if else statement to define menu selection
      if (menuChoice == 1)
      {
          roomShade = "Little shade";
      }
      else if (menuChoice == 2)
      {
         roomShade = "Moderate shade";
      }
      else if (menuChoice == 3)
      {
         roomShade = "Abundant shade";
      }
      
      //create if else if statement to determine how many BTUs the ac unit needs for the size of the room
      
      if (roomArea < 250)
      {
         capacity = 5500;
      }
      else if (roomArea >= 250 && roomArea <= 500)
      {
         capacity = 10000;
      }
      else if (roomArea > 500 && roomArea < 1000)
      {
         capacity = 17500;
      }
      else
      {
         capacity = 24000;
      }
      
      //create if statements to modify the BTUs based on the shade
      
      if (menuChoice == 1)
      {
         capacity = capacity * 1.15;
      }
      
      if (menuChoice == 3)
      {
         capacity = capacity * .90;
      }
      
      //create string object to store output title
      
      String output = "Air Conditioning Window Unit Cooling Capacity";
      
      //store value of capacity as integer with cast operator
      
      wholeCapacity = (int)capacity;
      
      //print output of variables
      
      System.out.println(output);
      System.out.println("Room area: " + (roomWidth * roomLength) + " square feet");
      System.out.println("Shade level: " + roomShade);
      System.out.println("BTUs per hour needed: " + wholeCapacity);
      
   } //end main
  
} //end class
      
      
      
         
        
      