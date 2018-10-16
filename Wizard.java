/**
 * Pick your wizard
 * 
 * @Rachel Ratnam & Ashwini Sarvepalli
 * @09/12/2018
 */
import javax.swing.JOptionPane;
import java.util.Random; 
public class Wizard
{
    // instance variables - replace the example below with your own
    String wizardName; //initializes wizardname variable
    String power; //initialized power variable 
    
    /**
     * Constructor for objects of class Wizard
     */
    public void Wizard()
    {
        // initialise instance variables
        wizardName = JOptionPane.showInputDialog("Pick a wizard name: Alatar, Merlin, Puck, Evanora, Gwydion, Spiritseeker, or pick your own!");//picks a name 
        int health = 100;//initializes original health 
    }

    public void WizardPower()
        {
            Random rand = new Random(); //random generator
            int randint = rand.nextInt(4); //picks a random integer between 0 and 3 
            if (randint == 0){ //checks if it is equal to 0 
                power = "Earth"; //sets wizard to earth wizard 
            } else if (randint == 1) { //check it equals 1 
                power = "Water"; //sets wizard to water wizard
            } else if (randint == 2) { //checks if equal to 2
                power = "Fire"; //sets wizard equal to fire wizard
            } else { //if not equal to those
                power = "Air"; //sets wizard equal to air wizard
            }
            JOptionPane.showMessageDialog(null, "By random pick, you are the wizard of " + power); //shows wizard power at end
        }
}
