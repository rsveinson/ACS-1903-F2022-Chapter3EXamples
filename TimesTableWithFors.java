 /**
 * 5x5 times table with column and row headings
 * using nested for statements
 */
public class TimesTableWithFors
{
    public static void main(String[] args)
    {
        // heading and column headings
        System.out.println("\n\t5x5 Times Table");
        System.out.println();
        for (int i=1; i<=5; i++)
            System.out.print("\t"+i);
        System.out.println();

        // Compute and print rows of times table
        for (int i=1; i<=5; i++){
            // row heading and row contents
            System.out.print(i);
            for (int j=1; j<=5; j++)
                System.out.print("\t"+i*j);
            System.out.println();
        }
    }
}
