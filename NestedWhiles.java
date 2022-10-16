 /**
 * Program with one while inside another while.
 * The program prints i, j, and i*j
 * where i varies from 1 to 4 and
 * where j varies from 1 to 4
 */
public class NestedWhiles
{
    public static void main(String[] args)
    {
       int i, j;
       System.out.println("\ti\tj\ti*j");
       // i takes on values 1,2,3,4
       i = 1;
       while (i < 5){
           j = 1;
           // j takes on values 1,2,3,4
           while (j < 5){
               System.out.println("\t"+i+"\t"+j+"\t"+(i*j));
               j = j + 1;
            }
           i = i + 1;
        }
       System.out.println("program ended");
    }
}
