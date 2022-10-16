 /**
 * Displays a text string character-by-character.
 * Get individual characters using the charAt(...) method
 */
public class GetIndividualCharacters
{
    public static void main(String[] args){
        // a string of characters
        String text = "abc123"; 
        // the length (number of characters) of the string
        int textLength = text.length(); 
        System.out.println("text string is: "+text);
        System.out.println("now, each character one-by-one");
        for (int i=0; i<textLength; i++){
            char c = text.charAt(i);
            System.out.println(c);
        }
    }
}
