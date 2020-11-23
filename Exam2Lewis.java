import java.util.Scanner;

public class Exam2Lewis
{
   public static void main(String[] args)
   {
      //declare variables
      int menuSelection;
      double distance=0.0;
      int stops=0;
      int numCustomers=0;
      
      //initialize accumulator to 0
      double allTaxiFees=0.0;
      
      //create scanner object
      Scanner keyboard = new Scanner(System.in);
      
      //display title
      System.out.println("CPCC Taxi Service");
      System.out.println();
      
      //get user input for how many customers are serviced
      System.out.print("How many customers did this cab service during this shift? ");
      numCustomers = keyboard.nextInt();
      
      for(int i = 0; i < numCustomers; i++)
      {
      
         //display menu
         taxiTypeMenu();
         
         System.out.print("\nPlease select the type of taxi from the menu: ");
         menuSelection = keyboard.nextInt();
         
         //get number of miles traveled
         System.out.print("Please enter the distance traveled in miles for customer 1: ");
         distance = keyboard.nextDouble();
         
         //input validation for number of miles
         while(distance < 0)
         {
            System.out.print("Please enter a distance greater than 0 miles: ");
            distance = keyboard.nextDouble();
         }
         
         //get number of stops
         System.out.print("Please enter the number of stops for customer 1: ");
         stops = keyboard.nextInt();
         
         while(stops < 0)
         {
            System.out.print("Please enter a value greater than 0: ");
            stops = keyboard.nextInt();
         }
         
         //call feePerMile method
         double feePerMile = feePerMile(menuSelection);
         double baseFee = baseFee(distance, feePerMile);
         double totalFee = totalFee(baseFee, stops);
         
         //display total taxi fee
         displayTaxiFee(totalFee);
         
         //set accumulator to add together all fees
         allTaxiFees += totalFee;
      }
      
      //display the final total of all taxi fees
      System.out.printf("\nThe total of all Taxi Fees is: $%.2f", allTaxiFees);
      
   }
   
   //method to display the taxi type menu
   public static void taxiTypeMenu()
   {
      System.out.println("\nTaxi Type Menu");
      System.out.println();
      System.out.println("\t\t1. Standard");
      System.out.println("\t\t2. Business");
      System.out.println("\t\t3. Luxury");
   }
   
   //method to calculate the fee per mile
   public static double feePerMile(int menuSelection)
   {
      //local variable
      double feePerMile = 0.0;
      
      //define constants for the different taxi service fees
      final double STANDARD_FEE = 1.50;
      final double BUSINESS_FEE = 2.00;
      final double LUXURY_FEE = 2.50;
      
      //create a decision structure to determine which fee will be used in calculating the cost
      if (menuSelection == 1)
      {
         feePerMile = STANDARD_FEE;
      }
      else if (menuSelection == 2)
      {
         feePerMile = BUSINESS_FEE;
      }
      else if (menuSelection == 3)
      {
         feePerMile = LUXURY_FEE;
      }
      
      return feePerMile;
   }
   
   //method to calculate the base fee
   public static double baseFee(double distance, double feePerMile)
   {
      return distance * feePerMile;
   }
   
   //method to calculate the total fee
   public static double totalFee(double baseFee, int stops)
   {
      return baseFee + (5 * stops);
   }
   
   //method to display the total fee
   public static void displayTaxiFee(double totalFee)
   {
      System.out.printf("Taxi Fee: $%.2f\n", totalFee);
   }
}