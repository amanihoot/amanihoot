package userInput;
import javax.swing.JOptionPane;
/**
 *
 * @author amaniharrison
 */
public class TimeProject {

    public static void main(String args[]) {
        
       String inputValue; 
       inputValue = JOptionPane.showInputDialog("Input value:"); 
        
       int i = Integer.parseInt(inputValue);
        
       String Hours;
       Hours = "That is " + (i/60) + " hours";
       
       String Minutes; 
       Minutes = " and " + (i % 60) + " minutes";
        
       String Output = Hours + Minutes;
       
        
       JOptionPane.showMessageDialog(null, Output);
       System.exit(0);
    }
}
