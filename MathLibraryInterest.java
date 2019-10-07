
package mathlibraryinterest;

/**
 *
 * @author Ziqi
 */
import java.util.Scanner;
import java.text.DecimalFormat;
import java.lang.Math;

public class MathLibraryInterest {

    public static void main(String[] args) {
        
        double principle;
        double rate;
        int time;
        double exponent;
        double base;
        double amount;
        char repeat;                            
        String input; 
                 
    do{ 
         System.out.println("Welcome to the Math Library --- Interest Calculator!\n" +
                            "The Interest Calculator will tell you how much you gain base on your investment.\n  " +
                            "How much you invest? \n "+
                            "Remember to press ENTER for your answer. \n"           
                 );
        Scanner i = new Scanner(System.in);
        
        principle = i.nextDouble();
        while(principle <=0){
             System.out.println("Please type in a number which is bigger than zero. "); 
             principle = i.nextDouble();
        }
          if( principle>0 ) {
             System.out.println("Please type in the interest rate. Your interest rate is either a percent or a decimal value less than 1.  ");
             rate = i.nextDouble(); 
             while(rate <= 0 || rate>=1){
                  System.out.println("Please type in a number which is bigger than zero and less than 1.");
                  rate = i.nextDouble();
             }
                  if(  rate > 0 && rate < 1){
                       System.out.println("How many month did you invest?");  
                       time = i.nextInt();
                  }
                     while( time <=0){
                           System.out.println("Please type in a integer which is bigger than zero. "); 
                           time = i.nextInt();
                     }
                     if(principle > 0 && time >0 && rate >0 && rate <1){
                         DecimalFormat twoDForm = new DecimalFormat("#.00");
                         exponent = rate * time;
                          base = Math.E;                
                          amount = principle * Math.pow(base, exponent); 
                          System.out.println("The amount of your money is $"+ twoDForm.format(amount) +"." ); 
                      }
         System.out.println("Would you like to calculate " + 
                    "another set of interest?"); 
         System.out.print("Enter Y for yes or N for no: "); 
            input = i.nextLine(); 
            input = i.nextLine();             
            repeat = input.charAt(0);   
} 
    }
    while(repeat == 'Y' || repeat == 'y');
    }
}
