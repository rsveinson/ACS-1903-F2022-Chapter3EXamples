 /**
 * Produce values for a 5x5 times table using nested for statements
 */
public class TimesTableStep1
{
    public static void main(String[] args)
    {
       // variable i represents row i
        for (int i=1; i<=5; i++) {   
            // variable j represents row j
            for (int j=1; j<=5; j++) {
                // multiply i and j
                // print(... ) keeps all values for i on same line
                System.out.print("\t"+i*j);
            }
            System.out.println();
        }
    }
}
