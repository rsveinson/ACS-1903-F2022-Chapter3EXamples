import java.util.Scanner;
/**
 * Count the number of lowercase 'a's 
 * in a line provided by the user.
 */
public class CountLetters
{
    public static void main(String[] args)
    {
        String text;
        System.out.println("Enter text: ");
        Scanner kb = new Scanner(System.in);
        text = kb.nextLine();
        int count = 0;
        for (int i=0; i<text.length(); i++){
            if (text.charAt(i) == 'a') 
                count++;
        }
        System.out.println("The line contains "+count+" a\'s");
    }
}
