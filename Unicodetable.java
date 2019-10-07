
package unicodetable;

/**
 *
 * @author aladd
 */
import java.text.DecimalFormat;
public class Unicodetable {


    public static void main(String[] args) {
		char c = '\u0000';
                 int i;
              
		for( i = 0; i <= 65536; i++){
                         DecimalFormat fourD = new DecimalFormat("0000");
			System.out.print("u"+ fourD.format(i) + "\t");
			System.out.println(c+"\t" );
			c++;
    }
         
    }   
}
