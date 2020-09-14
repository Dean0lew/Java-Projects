import java.util.Scanner;

public class Temperature
{
    public static void main(String[] args)
    {
        //Variable declaration
        double temp = 0;

        //Instantiating a Scanner object to get user input
        Scanner sc = new Scanner(System.in);

        //Get temperature from user
        System.out.print( "Enter a temperature:  ");
        temp = sc.nextInt();

        //Display message based on temperature
        if (temp <= 32)
            System.out.println("It's freezing.");

        if (temp < 50)
            System.out.println("It's cold.");

        if (temp < 80)
            System.out.println("It's warm.");

        if (temp < 100)
        System.out.println("It's hot.");

      else
        System.out.println("It's extremely hot!");

    }//end main
}//end class