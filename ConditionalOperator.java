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

        
        Scanner scanner = new Scanner(System.in);
        
        n = Integer.parseInt(JOptionPane.showInputDialog("enter a number"));
        
        ch = (n == 1) ? 'o' : (n == 2) ? 't' : 'z';
        
        System.out.println(ch);       

        System.out.println("end of program");
       
 
    }
}
