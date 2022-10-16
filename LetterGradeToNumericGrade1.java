import java.util.Scanner;
/**
 * Determine a numeric equivalent to a letter grade.
 * Note the standard indentation of extra spaces.
 */
public class LetterGradeToNumericGrade1
{
    public static void main(String[] args)
    {
        String letterGrade;
        // default value for numericGrade
        //         corresponds to "F"
        double numericGrade=0.0;
        System.out.println("Please enter letter grade:");
        Scanner kb = new Scanner(System.in);
        letterGrade = kb.next();
        if (letterGrade.equals("A")) 
            numericGrade = 4.0;
        if (letterGrade.equals("B")) 
            numericGrade = 3.0;
        if (letterGrade.equals("C")) 
            numericGrade = 2.0;
        if (letterGrade.equals("D")) 
            numericGrade = 1.0;
        System.out.println(letterGrade+" is equivalent to "+numericGrade);
    }
}
