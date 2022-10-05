import java.util.Scanner;

public class tip {
    public static void main(String[] args)
    {
        //Getting values for initial variables
        Scanner input = new Scanner(System.in);

        System.out.println("------------------");
        System.out.println("| TIP CALCULATOR |");
        System.out.println("------------------");

        //User puts in cost of bill
        System.out.println("Please enter the total cost of your bill below.");
        System.out.print("Bill: $");
        double bill = input.nextDouble();
        System.out.println();

        //User puts in amount of people
        System.out.println("Please enter the amount of people you dined with.");
        System.out.print("Amount of people: ");
        int people = input.nextInt();
        System.out.println();

        //User puts in tip %
        System.out.println("Please enter the percent you tipped your server AS A WHOLE NUMBER.");
        System.out.print("Tip %: ");
        double tipPercent = input.nextInt();
        tipPercent/=100; //Turn whole number into decimal
        System.out.println();

//-----------------------------------------------------------------------------------------------

        //Calculating tip
        double tip = bill * tipPercent;

        //Calculating total
        double total = bill + tip;

        //Calculating tip per person
        double tipPerPerson = tip / people;

        //Calculating total per person
        double totalPerPerson = total / people;

//-----------------------------------------------------------------------------------------------

        //Displaying all numbers, rounded to two decimal places
        System.out.println("---------");
        System.out.println("| COSTS |");
        System.out.println("---------");
        System.out.println("Tip: $" + String.format("%.2f", tip));
        System.out.println("Total: $" + String.format("%.2f", total));
        System.out.println("Tip per person: $" + String.format("%.2f", tipPerPerson));
        System.out.println("Total per person: $" + String.format("%.2f", totalPerPerson));
    }
}
