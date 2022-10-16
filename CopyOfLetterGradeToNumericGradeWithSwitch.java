import java.util.Scanner;
/**
 * Letter grade translated to a numeric grade.
 */
public class CopyOfLetterGradeToNumericGradeWithSwitch
{
    public static void main(String[] args)
    {
        final char eh = 'A';
        int n = 0;
        char grade;
        double nGrade = 9.8;
        char otherChar = 'A';
        
        System.out.println("Enter letter grade:");
        Scanner kb = new Scanner(System.in);
        grade = kb.next().charAt(0);
        
        switch (grade) {
            case 'a':
            case 'A': nGrade = 4.0;
                break;
            case 'B': nGrade = 3.0;
                break;
            case 'C': nGrade = 2.0;
                   break;
            case 'D': nGrade = 1.0;
                break;
            default: nGrade = 0.0;
        }
        
        System.out.println(grade+" --> "+nGrade);
    }
}
