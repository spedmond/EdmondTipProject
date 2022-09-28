import java.util.Scanner;

public class tip {
    public static void main(String[] args)
    {
        //Getting values for initial variables
        Scanner input = new Scanner(System.in);
        System.out.print("Bill: $");
        double bill = input.nextDouble();
        System.out.print("Amount of people: ");
        int people = input.nextInt();
        System.out.print("Tip %: ");
        double tipPercent = input.nextInt();
        tipPercent/=100; //Turn whole number into decimal

        //Getting tip
        double tip = bill * tipPercent;

        //Getting total
        double total = bill + tip;

        //Tip per person
        double tipPerPerson = tip / people;

        //Total per person
        double totalPerPerson = total / people;

        //Displaying all numbers, rounded to two decimal places
        System.out.println("Tip: $" + String.format("%.2f", tip));
        System.out.println("Total: $" + String.format("%.2f", total));
        System.out.println("Tip per person: $" + String.format("%.2f", tipPerPerson));
        System.out.println("Total per person: $" + String.format("%.2f", totalPerPerson));
    }
}
