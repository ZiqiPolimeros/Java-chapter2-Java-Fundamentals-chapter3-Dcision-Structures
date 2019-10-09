
package stringmanipulation;

/**
 *
 * @author Ziqi
 */
import java.util.Scanner;
import java.lang.String;

public class StringManipulation {


    public static void main(String[] args) {
        String str1;
        String str2;
        String sentence1;
        String sentence2;
        
        int i;
        int count = 0;
  
        
        System.out.println("===========================================\n" +
                           "Welcome to the StringManipulation program!\n" +
                           "===========================================\n" +
                           "Please provide us with your first sentence:\n"+
                           "prompt>");
        Scanner keyboad = new Scanner(System.in);
        str1 = keyboad.nextLine();
        sentence1 = str1.toUpperCase();
        System.out.println("Please proivde us with your second sentence:\n" +
                           "prompt>  ");
        str2 = keyboad.nextLine();
        sentence2 = str2.toUpperCase();
        
          
    
    for ( i = 0; i < str1.length(); i++) {
      if (Character.isLetter(str1.charAt(i)))
        count++;
    }
    System.out.println(count + " letters.");
                       
   
        
        if( sentence1 == sentence2 ){
            System.out.println("It appears that both of these sentences are the same!\n" +
                               "\n" +
                               "The length of the sentence is" + count + " characters!\n" +
                               "\n" +
                               "Thank you for using the StringManipulation program! Bye!");
        }else{
            System.out.println("Note the two sentences are not equals. \n" +
                               "This is because == compares both Strings to see if they occupy the same space in memory.\n"+
                               "It is not concerned with the contents of the String variable.\n"+
                               "== only turns true when the memory address the Strings are stored at in RAM is the same!");
            
        }
        
   
    }
    
}
