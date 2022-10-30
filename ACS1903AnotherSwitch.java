
/*******************************************************
 * Name:        Sveinson
 * Class:       ACS-1903
 * 
 * Assignment:  Another switch exapmple
 * 
 * Description: a brief description is alwauys appreciated
 **********************************************************************/

// import statements go here
// comment them out when you don't need them
 import java.util.Scanner;
 import javax.swing.JOptionPane;

 // after you duplicate the project don't forget to change the name of the 
 // puboic class
public class ACS1903AnotherSwitch {
    public static void main(String[] args) {
    // ****** Constants *****
    
    // ***** Variables *****
    
        String prompt;
        int sin = 0;            // social insurance number
        int code = 0;           // a code based on the last sin digit
        String strout;          //output string          
        Scanner scanner = new Scanner(System.in);        
    
    // ***** get some input from the keyboard *****
    
        prompt = "enter you social insurance number.";
        sin = Integer.parseInt(JOptionPane.showInputDialog(prompt));
      
    // ***** Processing *****
    
        switch(sin / 10){
            case 0:
            case 1:
            case 2: code = sin % 3;
            break;
            case 3:
            case 4:
            case 5: code = sin % 5;
            break;
            case 6:
            case 7:
            case 8: code = sin % 8;
            break;
            case 9: code = sin % 9;
            break;
            default: code = 10;
        }// end switch
           
    // ***** output *****
    
        System.out.println("SIN" + "\t\t" + "Code");
        System.out.println(sin + "\t" + code);
        
        strout = "SIN: " + sin + "\n";
        strout += "Code: " + code;
        
        JOptionPane.showMessageDialog(null, strout);
    
       
    // ***** Closing Message *****
    
        System.out.println();
        System.out.println("End of processing");
    
    } // end of main method
    
} // end of public class
