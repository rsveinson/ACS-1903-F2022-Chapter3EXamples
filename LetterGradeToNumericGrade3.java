import java.util.Scanner;
/**
 * Determine a numeric equivalent to a letter grade.
 * Note the standard indentation of extra spaces
 * for nested if statements.
 */
public class LetterGradeToNumericGrade3
{
    public static void main(String[] args)
    {
        String letterGrade;
        double numericGrade;
        System.out.println("Please enter letter grade:");
        Scanner kb = new Scanner(System.in);
        letterGrade = kb.next();
        if (letterGrade.equals("A") || letterGrade.equals("a")) 
                 numericGrade = 4.0;
        else if (letterGrade.equals("B")) 
                 numericGrade = 3.0;
        else if (letterGrade.equals("C")) 
                 numericGrade = 2.0;
        else if (letterGrade.equals("D")) 
                 numericGrade = 1.0;
        else
                 numericGrade = 0.0;
        System.out.println(letterGrade+" is equivalent to "+numericGrade);
    }
}
