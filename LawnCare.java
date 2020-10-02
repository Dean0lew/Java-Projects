import java.util.Scanner;

public class LawnCare
{
   public static void main(String[] args)
   {
      //declare variables
      double cost = 0.0;
      int serviceOption;
      double yardSize;
      
      //declare constants
      final double MOWING_SERVICE_CHARGE = 0.01;
      final double FERTILIZING_SERVICE_CHARGE = 0.015;
      final int MOWING = 1;
      final int FERTILIZING = 2;
      
      //create scanner variable to take user input
      Scanner keyboard = new Scanner(System.in);
      
      //print title
      System.out.println("CPCC Lawn Care Services");
      
      //print menu options
      System.out.println("\t1. Mowing");
      System.out.println("\t2. Fertilizing");
      
      //user input for service
      System.out.print("Enter the service provided: ");
      serviceOption = keyboard.nextInt();
      
      //user input for yard size in acres
      System.out.print("Enter the size of the yard in acres: ");
      yardSize = keyboard.nextDouble();
      
      //convert acres to square yards
      double ACRES_TO_YARDS = yardSize * 4840;
      
      //calculate cost
      if (serviceOption == MOWING)
      {
         cost = ACRES_TO_YARDS * MOWING_SERVICE_CHARGE;
      }
      else if (serviceOption == FERTILIZING)
      {
         cost = ACRES_TO_YARDS * FERTILIZING_SERVICE_CHARGE;
      }
      
      //print result of cost
      System.out.printf("The cost of the lawn service is $%,.2f", cost);
    }
 }