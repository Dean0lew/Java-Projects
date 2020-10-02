import java.util.Scanner;

public class Gasoline
{
   public static void main(String[] args)
   {
      /* This program calculates the cost of a gasoline purchase based on the amount of gasoline purchased,
         the brand and the octane rating */
         
      // declare variables
      int octane;
      double liters;
      double gallons;
      int brand;
      double discountCost;
      double premiumCost;
      
      // create scanner object to get user input
      Scanner keyboard = new Scanner(System.in);
      
      // print message at top of menu
      System.out.println("CPCC Gasoline Services\n");
      
      // prompt user for brand of gasoline
      System.out.println("\t1. Discount");
      System.out.println("\t2. Premium\n");
      System.out.print("Enter the brand type: ");
      brand = keyboard.nextInt();
      
      // prompt user for octane rating
      System.out.print("\nEnter the octane rating: ");
      octane = keyboard.nextInt();
      
      // prompt user for amount of gasoline in purchase (in liters)
      System.out.print("\nEnter the amount of gasoline in liters: ");
      liters = keyboard.nextDouble();
      
      // convert liters to gallons
      gallons = liters * 0.264172;
      
      // calculate cost of gasoline
      discountCost = (2.49 - (100 - octane) * 0.01) * gallons;
      premiumCost = (2.99 - (100 - octane) * 0.01) * gallons;
      
      // create if statement to decide which cost to calculate and print
      
      if (brand == 1)
      {
         System.out.printf("\nThe cost of gasoline is $%,.2f\n", discountCost);
      }
      else if (brand == 2)
      {
         System.out.printf("\nThe cost of gasoline is $%,.2f\n", premiumCost);
      }
      
    }
 }
      
      
      