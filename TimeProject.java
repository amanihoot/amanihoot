package userInput;
import javax.swing.JOptionPane;
/**
 *
 * @author amaniharrison
 */
public class OPProject2 {

    public static void main(String args[]) {
        
       String inputValue; 
       inputValue = JOptionPane.showInputDialog("Input a value over 60"); 
     
       int i = Integer.parseInt(inputValue);
       
       if 
           (i < 60){
           String error = "This number is less than 60";
           
           JOptionPane.showMessageDialog(null, error);
           System.exit(0);
       }
       
       else 
       {   
       String Hours;
       
       if (i/60 == 1){
           Hours = "That is " + (i/60) + " hour";
       }
      else
           
       Hours = "That is " + (i/60) + " hours";
       
       String Minutes; 
       
       if (i % 60 == 1){
           Minutes = " and " + (i % 60) + " minute.";
       }
       else
           
       Minutes = " and " + (i % 60) + " minutes.";
        
       String Output = Hours + Minutes;
       
       JOptionPane.showMessageDialog(null, Output, "Results", 0);
       System.exit(0);
    }}
}
