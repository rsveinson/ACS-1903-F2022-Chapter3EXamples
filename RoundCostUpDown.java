import java.util.Scanner;
/**
 * Determine value of payment to be received from customer
 * based on whether or not it is cash payment.
 * Cash payments are rounded off to the nearest nickel and
 * debit card payments have a surcharge of 25 cents.
 */
public class RoundCostUpDown
{
    public static void main(String[] args)
    {
        int originalCost, actualCost;
        String typePayment;
        System.out.println("Enter type of payment and "
            +"value of purchase in pennies: ");
        Scanner kb = new Scanner(System.in);
        typePayment = kb.next();
        originalCost = kb.nextInt();
        if (typePayment.equals("cash")) {
            if (originalCost % 5 < 3)
                actualCost = originalCost - originalCost%5;
            else 
                actualCost = originalCost + (5 - originalCost%5);
        }
        else 
            actualCost = originalCost + 25;
        System.out.println(originalCost+"  "+actualCost);
    }
}
