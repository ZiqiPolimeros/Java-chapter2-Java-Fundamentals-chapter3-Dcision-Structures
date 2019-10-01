
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
    
        System.out.println("Welcome to Math Library --- Circumference Calculator!\n" +
                           "Please type in the diameter of a circle.\n "+
                           "Remember to press ENTER for your answer. \n");
        double diameter;
        Scanner d = new Scanner(System.in);
        diameter = d.nextDouble();
        double circumference = diameter * Math.PI;
        DecimalFormat twoDForm = new DecimalFormat("#.00");
        System.out.println("The circumferece is "+ twoDForm.format(circumference) +".");
        
    }
    
}
