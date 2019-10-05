
package mathlibrarycircumference;

/**
 *
 * @author Ziqi
 */
import java.util.Scanner;
import java.text.DecimalFormat;
import java.lang.Math.*;

public class MathLibraryCircumference {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        double diameter;
        double circumference;
        String input;
        char repeat;
    
        do{
        System.out.println("Welcome to Math Library --- Circumference Calculator!\n" +
                           "Please type in the diameter of a circle.\n "+
                           "Remember to press ENTER for your answer. \n"); 
        Scanner d = new Scanner(System.in);
        diameter = d.nextDouble();
        circumference = diameter * Math.PI;
        DecimalFormat twoDForm = new DecimalFormat("#.00");
        System.out.println("The circumferece is "+ twoDForm.format(circumference) +".");
        System.out.println("");
        System.out.println("Would you like to calculate " + 
                    "another circle?"); 
            System.out.print("Enter Y for yes or N for no: "); 
            input = d.nextLine();
            input = d.nextLine();            
            repeat = input.charAt(0);       
    } while (repeat == 'Y' || repeat == 'y'); 
    
                }
}

