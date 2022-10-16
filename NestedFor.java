/**
 * Print values of i, j , and i*j where
 * i varies from 1 to 4 in increments of 1, and 
 * where j varies from 1 to 4 in increments of 1.
 */
public class NestedFor
{
    public static void main(String[] args){
        System.out.println("\ti\tj\ti*j");
        for (int i=1; i<=4; i++){
            for (int j=1; j<=4; j++)
                System.out.println("\t"+i+"\t"+j+"\t"+(i*j));
        }
        System.out.println("program ended");
    }
}
