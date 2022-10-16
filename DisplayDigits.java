import java.util.Scanner;
public class DisplayDigits
{
    public static void main(String[] args)
    {
        // Arrange to use a scanner object for keyboard input
        Scanner keyboard = new Scanner(System.in);
        // Prompt the user for a positive number
        System.out.println("Enter a positive number " + "and then press Enter: ");
        int number = keyboard.nextInt();
        System.out.println("The number is " + number);
        System.out.println("\tdigit\tnumber");
        while (number > 0){
            int digit = number % 10;
            System.out.print("\t"+digit);
            number = number / 10;
            System.out.println("\t"+number);
        }
        System.out.println("end of list");
    }
}
