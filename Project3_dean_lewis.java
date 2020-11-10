import java.util.Scanner; //import scanner class to get user input

public class Project3_dean_lewis
{

   public static void main(String[] args)
   {
      double roomWidth = 0.0; //initialize variable for width
      double roomLength = 0.0; //initialize variable for length
      double btu = 0.0; //initialize variable for capacity in BTUs
      String roomShade = "";
      int wholeCapacity = 0;
      String roomName = null;
      int menuChoice = 0;
      String input = "";
      char repeat = '\0';
      int count = 0;
       
      do
      {
         Scanner keyboard = new Scanner(System.in); //create scanner object to get user input
         
         System.out.print("Please enter the name of the room: "); //to get the name of the room
         roomName = keyboard.nextLine();
         
         System.out.print("Please enter the width of the room (in feet):");
         roomWidth = keyboard.nextDouble(); //to get the width of the room
         
         //input validation for room width
         while (roomWidth < 5)
         {
            System.out.print("Please enter a width of at least 5 feet: ");
            roomWidth = keyboard.nextDouble();
         }
         
         System.out.print("Please enter the length of the room (in feet):");
         roomLength = keyboard.nextDouble(); //to get the length of the room
         
         //input validation for room length
         while (roomLength < 5)
         {
            System.out.print("Please enter a length of at least 5 feet: ");
            roomLength = keyboard.nextDouble();
         }
         
         //return area from calculateArea
         double roomArea = calculateArea(roomWidth, roomLength);
         
         //Define constants
         final int littleShade = 1;
         final int moderateShade = 2;
         final int abundantShade = 3;
 
         //create menu to ask user for how much shade the room gets
         System.out.println("What is the amount of shade that this room receives?");
         System.out.println("1. Little shade");
         System.out.println("2. Moderate shade");
         System.out.println("3. Abundant shade");
         menuChoice = keyboard.nextInt(); //to receive user input from menu choices
         
         roomShade = translateShadeChoiceToString(menuChoice);         
         
         btu = calculateBTUsPerHour(menuChoice, roomArea);
                  
         //store value of capacity as integer with cast operator
         wholeCapacity = (int)btu;
         
         //return area from calculateArea
         roomArea = calculateArea(roomWidth, roomLength);
         
         //print output of variables
         displayTitle();
         displayRoomInformation(roomName, roomArea, roomShade, wholeCapacity);
        
         //Consume the new line
         keyboard.nextLine();
         
         //ask user if they would like to enter another room
         System.out.print("Would you like to enter information for another room (Y/N)?");
         input = keyboard.nextLine();
         repeat = input.charAt(0);
         
         //counting variable
         count++;
         
      } while (repeat == 'Y' || repeat == 'y');
      
      System.out.println("The total number of rooms processed was: " + count);
    
   } //end main
   
   public static void displayTitle()
   {
   //create string object to store output title
   String output = "Air Conditioning Window Unit Cooling Capacity";
   System.out.println(output + "\n");
   }
   
   public static double calculateArea(double widthOfRoom, double lengthOfRoom)
   {
   double areaOfRoom = widthOfRoom * lengthOfRoom;
   
   return areaOfRoom;
   }
   
   public static String translateShadeChoiceToString(int selection)
   {
   String shadeAmount = "";
   
   //create if else statement to define menu selection
         if (selection == 1)
         {
             shadeAmount = "Little shade";
         }
         else if (selection == 2)
         {
            shadeAmount = "Moderate shade";
         }
         else if (selection == 3)
         {
            shadeAmount = "Abundant shade";
         }
         
     return shadeAmount;
   }
   
   public static double calculateBTUsPerHour(int choice, double area)
   {
   //create if else if statement to determine how many BTUs the ac unit needs for the size of the room
         double capacity;
         
         if (area < 250)
         {
            capacity = 5500;
         }
         else if (area >= 250 && area <= 500)
         {
            capacity = 10000;
         }
         else if (area > 500 && area < 1000)
         {
            capacity = 17500;
         }
         else
         {
            capacity = 24000;
         }
         
         //create if statements to modify the BTUs based on the shade
         if (choice == 1)
         {
            capacity = capacity * 1.15;
         }
         
         if (choice == 3)
         {
            capacity = capacity * .90;
         }
         
         return capacity;
   }
   
   public static void displayRoomInformation(String name, double area, String shade, int endCapacity)
   {
   System.out.println("Room name: " + name);
   System.out.println("Room area: " + area + " square feet");
   System.out.println("Shade level: " + shade);
   System.out.println("BTUs per hour needed: " + endCapacity);
   }
   
  
} //end class
      
      
      
         
        
      