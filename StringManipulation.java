
package stringmanipulation;


import java.util.Scanner;
import java.lang.String;

public class StringManipulation {


    public static void main(String[] args) {
        String str1;
        String str2;
        String sentence1;
        String sentence11;
        String sentence2;
        String sentence22;
        
        
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
        sentence11 = sentence1.trim();
        System.out.println("Please proivde us with your second sentence:\n" +
                           "prompt>  ");
        str2 = keyboad.nextLine();
        sentence2 = str2.toUpperCase();
        sentence22 = sentence2.trim();
        
        
          
    
    for ( i = 0; i < str1.length(); i++) {
      if (Character.isLetter(str1.charAt(i)))
        count++;
    }
    /*System.out.println(count + " letters. \n" +
            "the first sentence hash Code is " + sentence11.hashCode() +"\n" +
            "the second sentence hash Code is " + sentence22.hashCode());
     */
   
        if( sentence11.hashCode() == ( sentence22.hashCode()) ){
            System.out.println("It appears that both of these sentences are the same!\n" +
                               "\n" +
                               "The length of the sentence is " + count + " characters!\n" +
                               "\n" +
                               "Thank you for using the StringManipulation program! Bye!");
        }else{
            System.out.println("Note the two sentences are not equals. \n" +
                               "The first sentence is " + sentence11.length() + " letters. \n"+
                               
                               "The second sentence is " + sentence22.length() + " letters.\n" +
                               "Thank you for using the StringManipulation program! Bye!");
            
        }
        
   
    }
    
}
