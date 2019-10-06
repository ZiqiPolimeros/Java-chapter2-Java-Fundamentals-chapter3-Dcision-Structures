
package mathlibrary;

/**
 *
 * @author Ziqi
 */
import java.util.Scanner;
import java.util.Calendar;
import java.util.TimeZone;
import java.util.Date;
import java.util.TimeZone;




public class MathLibrary {

    public static void main(String[] args) {
        
         int days;
         int d;
         int currentDayOfWeek;
         
        Calendar localCalendar = Calendar.getInstance(TimeZone.getDefault());
        currentDayOfWeek = localCalendar.get(Calendar.DAY_OF_WEEK);

         Scanner keyboad = new Scanner(System.in);
        
         System.out.println("Welcome to Math Library --- Day Calculator!\n"+
                            "\n"+
                            "Math Library will calculate what day of the week it is after so many days have passed. \n"+
                            ""+
                 //
                            "Please type in how many days you want to calculate. \n"+
                            "Remember to press ENTER after your answer."
                            );
         days = keyboad.nextInt();
         while( days <= 0  ){
               System.out.println("Please enter a positive whole number.");
               days = keyboad.nextInt();
         }
         if(days > 0){
                d = (days + currentDayOfWeek)%7;
        
switch ( d ) {
  case 1:
    System.out.println("Sunday");
    break;
  case 2:
    System.out.println("Monday");
    break;
  case 3:
    System.out.println("Tuesday");
    break;
  case 4:
    System.out.println("Wednesday");
    break;
  case 5:
    System.out.println("Thursday");
    break;
  case 6:
    System.out.println("Friday");
    break;
  case 7:
    System.out.println("Saturday");
    break;
}
   }  
    }
    
}
