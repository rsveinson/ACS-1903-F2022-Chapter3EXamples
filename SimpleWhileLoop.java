
/*******************************************************
 * Name:        Sveinson
 * Class:       ACS-1903
 * 
 * Assignment:  Simple event control while loop
 * 
 * Description: A really simple event controlled while loop
 **********************************************************************/

// import statements go here
import java.util.Scanner;

public class SimpleWhileLoop {
    public static void main(String[] args) {
    // ****** Declaration of Constants *****
    
    // ***** Declaration of Variables *****
    
       int n = 0;       // this will act as the control variable of the loop
       
        
        Scanner scanner = new Scanner(System.in);

    // ***** Output Banners *****
    
        System.out.println("****************************");
        System.out.println("Name: Sveinson");
        System.out.println("Class: ACS-1903");
        System.out.println("Assignment: Simple Event Loop");
        System.out.println("****************************\n");
  
    // ***** Processing *****
    
        System.out.println("enter an int, 0 to end.");
        n = scanner.nextInt();
        
        while(n != 0){
            System.out.println("number = " + n);
            
            // we have to updat the control variable to avoid 
            // the dreaded INFINITE LOOP
            System.out.println("enter an int, 0 to end.");
            n = scanner.nextInt();           
        } // end while
  
        
    // ***** Closing Message *****
    
        System.out.println();
        System.out.println("End of processing");
    
    } // end of main method
    
} // end of public class
