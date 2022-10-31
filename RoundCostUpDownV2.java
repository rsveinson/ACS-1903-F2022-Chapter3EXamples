import java.util.Scanner;
/**
 * Determine value of payment to be received from customer
 * based on whether or not it is cash payment.
 * Cash payments are rounded off to the nearest nickel and
 * debit card payments have a surcharge of 25 cents.
 */
public class RoundCostUpDownV2
{
    public static void main(String[] args)
    {
        // ** variables **
        int originalCost, actualCost;
        String typePayment;
        Scanner kb = new Scanner(System.in);
        
        // ** get required input **
        System.out.println("Enter type of payment and "
            +"value of purchase in pennies: ");
        
        typePayment = kb.next();
        originalCost = kb.nextInt();
        
        // ** make sure input is correct **
        System.out.println("payment type: " + typePayment);
        System.out.println("cost: " + originalCost);
        System.out.println((typePayment.equals("cash")));
        // *** calculate the new cost ***
        
        if (!(typePayment.equals("cash"))) {
            System.out.println("ncp");
            actualCost = originalCost + 25;
        }// end if (non-cash payment)
        else{
            System.out.println("cp");
            if (originalCost % 5 < 3)
                actualCost = originalCost - originalCost%5;
            else 
                actualCost = originalCost + (5 - originalCost%5);
        }// end else (cash payment)
            
        System.out.println(originalCost+"  "+actualCost);
    }// end main
}// end class
