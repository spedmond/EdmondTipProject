import java.util.Scanner;

public class tip {
    public static void main(String[] args)
    {
        //Getting values for initial variables
        Scanner input = new Scanner(System.in);

        System.out.println("------------------");
        System.out.println("| TIP CALCULATOR |");
        System.out.println("------------------");

        //User puts in cost of bill, stores value in bill
        System.out.println("Please enter the total cost of your bill below.");
        System.out.print("Bill: $");
        double bill = input.nextDouble();
        System.out.println();

        //User puts in amount of people, stores value in people
        System.out.println("Please enter the amount of people you dined with.");
        System.out.print("Amount of people: ");
        int people = input.nextInt();
        System.out.println();

        //User puts in tip %, stores value in tipPercent
        System.out.println("Please enter the percent you tipped your server AS A WHOLE NUMBER.");
        System.out.print("Tip %: ");
        double tipPercent = input.nextInt();
        tipPercent/=100; //Turn the whole number into a decimal in order to calculate the actual tip
        System.out.println();

//-----------------------------------------------------------------------------------------------

        //Calculating tip by multiplying the bill by the tip %
        double tip = bill * tipPercent;

        //Calculating total by adding the bill and tip together
        double total = bill + tip;

        //Calculating tip per person by dividing the tip by the # of people
        double tipPerPerson = tip / people;

        //Calculating total per person by dividing the total by the # of people
        double totalPerPerson = total / people;

//-----------------------------------------------------------------------------------------------

        //Displaying all numbers, rounded to two decimal places using String.format
        System.out.println("---------");
        System.out.println("| COSTS |");
        System.out.println("---------");

        System.out.println("Tip: $" + String.format("%.2f", tip));
        System.out.println("Total: $" + String.format("%.2f", total));
        System.out.println("Tip per person: $" + String.format("%.2f", tipPerPerson));
        System.out.println("Total per person: $" + String.format("%.2f", totalPerPerson));
    }
}
