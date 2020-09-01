import java.util.Scanner;

public class RestaurantBill {
    public static void main(String[] args) {

        double taxRate = .0675; //to hold the rate of tax
        double tipRate = .2; //to hold the rate of the tip
        double mealCost; //to hold the cost of the meal

        //create scanner object to read input
        Scanner keyboard = new Scanner(System.in);

        //get the cost of the meal
        System.out.println("Cost of the meal: ");

        //to hold the cost of the meal
        mealCost = keyboard.nextDouble();

        //calculate the amount of tax
        double taxAmount = taxRate * mealCost;

        //calculate the tip amount after tax
        double tipAmount = tipRate * (taxAmount + mealCost);

        //calculate total cost
        double totalCost = tipAmount + taxAmount + mealCost;

        //display results
        System.out.println("Meal Cost: " + mealCost);
        System.out.println("Tax: " + taxAmount);
        System.out.println("Tip: " + tipAmount);
        System.out.println(" Total: " + totalCost);


        
    }
}
