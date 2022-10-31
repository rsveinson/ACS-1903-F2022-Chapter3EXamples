import java.util.Scanner;
import javax.swing.*;
/** 
 * ACS-1903 relational operator example
 * @author 
*/

public class ConditionalOperator{
    public static void main(String[] args) {
        int n = 0;
        char ch = 'a';
        
        int x;      // some variable for an extra example
        int y;      // another variable for the extra example
        int large;  // the larger of the two ints

        
        Scanner scanner = new Scanner(System.in);
        
        // simple use
        x = 5;
        y = 8;
        
        large = x > y ? x : y;
        System.out.println("largest is: " + large);
        
        n = Integer.parseInt(JOptionPane.showInputDialog("enter a number"));
        
        ch = (n == 1) ? 'o' : (n == 2) ? 't' : 'z';
        
        System.out.println(ch);       

        System.out.println("end of program");
       
 
    }
}
