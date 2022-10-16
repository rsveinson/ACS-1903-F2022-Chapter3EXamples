import java.util.Scanner;
import java.util.Random;
/** 
 * Give the user two random integers to add.
 * Inform user if their answer is correct.
 * Prompt the user to try again.
 * The user always attempts one addition.
 */
public class Additions
{
    public static void main(String[] args)
    {
        Scanner kb = new Scanner(System.in);
        Random generator = new Random();
        String response;
        System.out.println("Welcome. "
                    +"Try some additions:");
        do
        {
            int n1 = generator.nextInt(10)+1;
            int n2 = generator.nextInt(10)+1;
            System.out.println(n1+"+"+n2+"=?");
            int answer = kb.nextInt();
            if (answer == n1+n2) System.out.println("Correct!");
            else System.out.println(
                     "Sorry that is not correct "
                    +"... the sum is "+(n1+n2));
            System.out.println(
                     "To try again enter Y: ");
            response = kb.next( );
            response = response.toLowerCase();
        }
        while ( response.equals("y"));
        System.out.println("Goodbye");
    }
}
