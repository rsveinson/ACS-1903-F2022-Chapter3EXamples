
/*******************************************************
 * Name:        Sveinson
 * Class:       ACS-1903
 * 
 * Assignment:  While loop with hasNext() example
 * 
 * Description: using a while to loop through all of the words in a sentence
 **********************************************************************/

// import statements go here
import java.util.Scanner;
import javax.swing.JOptionPane;

public class WhileLoopWithHasNext {
    public static void main(String[] args) {
    // ****** Declaration of Constants *****
    
    // ***** Declaration of Variables *****
    
        String strin;           // input from keyboard
        String st;              // extracted from input string
        String prompt;          // prompt for input
            

    // ***** Output Banners *****
    
        System.out.println("****************************");
        System.out.println("Name: Sveinson");
        System.out.println("Class: ACS-1903");
        System.out.println("Assignment: Using scanner and hasNext()");
        System.out.println("****************************\n");
  
    // ***** Processing *****
        
        prompt = "enter a shor verse.";
        strin = JOptionPane.showInputDialog(prompt);
        
        // now create a scanner using strin as input
        Scanner sc = new Scanner(strin);
        
        while(sc.hasNext()){
            // get the next token from the input strea 
            st = sc.next();
            System.out.println(st);
        } // end while
  
        
    // ***** Closing Message *****
    
        System.out.println();
        System.out.println("End of processing");
    
    } // end of main method
    
} // end of public class
