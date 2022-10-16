 /**
 * Display the numbers from 0 to 9.
 */
public class Numbers0To9UsingDoWhile
{
    public static void main(String[] args)
    {
        int count = 0;
        System.out.println("Numbers");
        do{
            System.out.println(count);
            count = count + 1;
        }
        while ( count < 10 ) ;
        System.out.println("*******");
    }
}
