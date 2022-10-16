import java.util.Scanner;
import javax.swing.*;
/** 
 * ACS-1903 do While supplementary example
 * @author 
*/

public class DoWhileExample02{
    public static void main(String[] args) {
        int n = 0;
        int sum = 0;
        
        Scanner scanner = new Scanner(System.in);
        
        n = Integer.parseInt(JOptionPane.showInputDialog("enter a number"));
        
        do{
            sum += n % 10;      // add the rightmost digit of n to sum
            n /= 10;            // drop the rightmost digit
        }
        while(n > 0);            // when  there's only one digit left
        
        System.out.println("sum = " + sum);

        System.out.println("end of program");
    }
}
