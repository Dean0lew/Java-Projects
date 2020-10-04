// Dean Lewis
// Exam 1
// 10/2/20
import java.util.Scanner;

public class Exam1Lewis
{
   public static void main(String[] args)
   {
      //declare variables
      double itemPrice = 0.0;
      int itemQuantity = 0;
      String itemName;
      double subtotal = 0.0;
      double discount = 0.0;
      double discountRate = 0.0;
      double totalCost = 0.0;
      
      //declare constants
      final double UNDER_TWENTYFIVE = 0.05;
      final double TWENTYFIVE_TO_SEVENTYFIVE = 0.10;
      final double OVER_SEVENTYFIVE = 0.15;
      
     
      //create scannner object to obtain user input
      Scanner keyboard = new Scanner(System.in);
      
      //get price of the item
      System.out.print("What is the price of the item you wish to purchase? ");
      itemPrice = keyboard.nextDouble();
      
      //get quantity of item
      System.out.print("What is the quantity you wish to purchase? ");
      itemQuantity = keyboard.nextInt();
      
      //consume remaining newline
      keyboard.nextLine();
      
      //get name of item
      System.out.print("What is the name of the item? ");
      itemName = keyboard.nextLine();
      
      //calculate subtotal
      subtotal = itemPrice * itemQuantity;
      
      //create if statement to determine which discount rate to use
      if (subtotal < 25)
      {
         discountRate = UNDER_TWENTYFIVE;
      }
      else if (subtotal >=25 && subtotal <= 75)
      {
         discountRate = TWENTYFIVE_TO_SEVENTYFIVE;
      }
      else if (subtotal > 75)
      {
         discountRate = OVER_SEVENTYFIVE;
      }
      
      //calculate discount
      discount = subtotal * discountRate;
      
      //calculate total
      totalCost = subtotal - discount;
      
       //string object for text
      String title = "Discount Calculation Utility";
      
      //print title and results
      System.out.println("\n" + title);
      System.out.println("Item name:" + "\t" + itemName);
      System.out.printf("Price:" + "\t\t$%,-8.2f\n", itemPrice);
      System.out.printf("Quantity:" + "\t%-8d\n", itemQuantity);
      System.out.printf("Subtotal:" + "\t$%,-8.2f\n", subtotal);
      System.out.printf("Discount:" + "\t$%,-8.2f\n", discount);
      System.out.printf("Total: " + "\t\t$%,-8.2f\n", totalCost);
      
      
      
      
      
    }
 }
      
      
      
      