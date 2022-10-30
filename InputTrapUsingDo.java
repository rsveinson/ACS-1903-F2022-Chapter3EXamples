import java.util.Scanner;
import javax.swing.*;
/** 
 * ACS-1903 trapping user input with a do loop
 * @author 
*/

public class InputTrapUsingDo{
    public static void main(String[] args) {
        int n = 0;
        String prompt = "Enter a number between 10 and 50";
        
        Scanner scanner = new Scanner(System.in);
        
        
        // use a do while loop to get user input
        // you can use it to trap the program exection until a valid 
        // input is entered
        do{
            n = Integer.parseInt(JOptionPane.showInputDialog(prompt));

        }
        while(n < 10 || n > 50);
        
        // valid input has been received so we can now get on with it
        JOptionPane.showMessageDialog(null, "success, you have entered wisely.");
        

        System.out.println("end of program");
    }
}
