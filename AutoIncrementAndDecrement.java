
/*******************************************************
 * Name:        Sveinson
 * Class:       ACS-1903
 * 
 * Assignment:  Auto Increment and Decrement
 * 
 * Description: examples of pre and post auto increment and auto 
 *              decrement
 **********************************************************************/

// import statements go here
// comment them out when you don't need them
 //import java.util.Scanner;
 //import javax.swing.JOptionPane;

 // after you duplicate the project don't forget to change the name of the 
 // puboic class
public class AutoIncrementAndDecrement {
    public static void main(String[] args) {
    // ****** Constants *****
    
    // ***** Variables *****
     
        int n = 0;      // some number to use in the examples
        int m = 1;      // another variables for the examples
    
        //Scanner scanner = new Scanner(System.in);        
    
    // ***** get some input from the keyboard *****
      
    // ***** Processing *****
    
    /* stand alone auto increment and decrement
     * should be exactly the same
     */
        //System.out.println(++m);
        //m = 1;
        //System.out.println(m++);
        //System.out.println(m);
        
    /* pre auto increment used in an expressions
     * increment then add
     */
        //n = ++m + 1;        // should equal 3
        //System.out.println("n =  " + n);
        // System.out.println("m = " + m);
        
    /* pre auto decrement used in an expressions
     * increment then add
     */
        // n = --m - 1;        // should equal -1
        // System.out.println("n =  " + n);
        // System.out.println("m = " + m);
    
    /* post auto decrement used in an expressions
     * increment then add
     */
        // n = m-- - 1;        // should equal 0
        // System.out.println("n =  " + n);
        // System.out.println("m = " + m);
        
    /* post auto increment used in an expressions
     * increment then add
     */
        // n = m++ - 1;        // should equal 0
        // System.out.println("n =  " + n); 
        // System.out.println("m = " + m);
    // ***** output *****
    
       
    // ***** Closing Message *****
    
        System.out.println();
        System.out.println("End of processing");
    
    } // end of main method
    
} // end of public class
