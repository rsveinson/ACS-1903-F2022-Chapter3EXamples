 /**
 * Several variations on a simple for loop
 */
public class SimpleForLoopExamples
{
    public static void main(String[] args)
    {
        System.out.println("Simplest example");
        for (int count = 0; count < 10; count++ )
            System.out.println(count);
        System.out.println("*******\n\n");
        
        // simple decrementing example
        System.out.println("Decrementing");
        
        for (int count = 10; count > 0; count-- )
            System.out.println(count);
        System.out.println("*******\n\n");
        
        // increase by more than 1
        System.out.println("Increasing by more than one");
        
        for (int count = 0; count < 20; count += 2)
            System.out.println(count);
        System.out.println("*******\n\n"); 
        
        // decrease by more than 1
        System.out.println("Decreasing by more than one");
        
        for (int count = 20; count >= 0; count -= 2)
            System.out.println(count);
        System.out.println("*******\n\n"); 
        
        // variable lower and upper limit
        System.out.println("Variable start and end values");
        
        int low = 5;
        int upper = 15;
        
        for (int count = low; count < upper; count++ )
            System.out.println(count);
        System.out.println("*******\n\n");        
        

    }
}
