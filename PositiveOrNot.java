import java.util.Scanner;
public class PositiveOrNot
{
    public static void main(String[] args)
    {
       // Use a scanner object for keyboard input
       Scanner keyboard = new Scanner(System.in);
       // Prompt the user for a number
       System.out.println("Enter a number "
           +"and then press Enter: ");
       int number = keyboard.nextInt();
       System.out.print("the number "+number+" is ");
        // Display a message if number is positive or not
        if (number > 0) {
            System.out.println("positive");
        }
        else {
            System.out.println("not positive");
        }
    }
}
