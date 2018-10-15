import javax.swing.JOptionPane;
import java.util.ArrayList;
/**
 * Write a description of class SpellBook here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class SpellBook
{
    ArrayList<Spell> sspellBook;
    String wizardType;
    boolean correct = true;
    public void addSpell(Spell someSpell)
    {
        sspellBook.add(someSpell);
    }
    public void prompt(){
        String wizardType = JOptionPane.showInputDialog("It is time to create your spell library, what type of the wizard are you? Green, Blue, Red, or Purple");
        JOptionPane.showMessageDialog(null, "Because you are the " + wizardType + " You are only allowed to learn the following spells.");
        String edspellType =  JOptionPane.showInputDialog("We will start with defense spells, chose level 1, level 2, level 3 earth wall");
        if (edspellType.equalsIgnoreCase("level 1")){
            JOptionPane.showMessageDialog(null, "For level 1 mudslide type in the state where the given city is from");
            boolean correct = true;
            while(correct){
                String useranswer1 = JOptionPane.showInputDialog("San Francisco");
                if (useranswer1 != "California"){
                    correct = false;
                }
                else {
                    /// chech writes userTeam.addPlayer(createPlayer()); so i'm thinking its wizardtype.blah blah blah///
                    addSpell(createSpell());
                    String useranswer2 = JOptionPane.showInputDialog("Austin");
                    if (useranswer2 != "Texas"){
                        correct = false;
                    }
                    else{
                        addSpell(createSpell());
                        String useranswer3 = JOptionPane.showInputDialog("Atlanta");
                        if (useranswer3 != "Georgia"){
                            correct = false;
                        }
                        else {
                            addSpell(createSpell());
                            String useranswer4 = JOptionPane.showInputDialog("Miami");
                            if (useranswer4 != "Florida"){
                                correct = false;
                            }
                            else {
                                addSpell(createSpell());
                                String useranswer5 = JOptionPane.showInputDialog("Seattle");
                                if (useranswer5 != "Washington"){
                                    correct = false;
                                }
                                else {
                                    addSpell(createSpell());
                                    String useranswer6 = JOptionPane.showInputDialog("Boston");
                                    if (useranswer6 != "Massachusetts"){
                                        correct = false;
                                    }
                                    else{
                                        addSpell(createSpell());
                                        String useranswer7 = JOptionPane.showInputDialog("Nashville");
                                        if (useranswer7 != "Tennessee"){
                                            correct = false;
                                        }
                                        else{
                                            addSpell(createSpell());
                                            correct = false;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        else if (edspellType == "level 2"){
            JOptionPane.showMessageDialog(null, "For level 2 answer the question to get the spell");
        }
        else if (edspellType == "level 3"){
            JOptionPane.showMessageDialog(null, "For level 3 answer the question to get the spell");
        }
        String easpellType = JOptionPane.showInputDialog("For attack spells, chose level 1: mudslide, level 2: rockslide, level 3: pelting rocks");
        if (easpellType == "mudslide"){
            JOptionPane.showMessageDialog(null, "For level 1 answer the question to get the spell");
        }
        else if (easpellType == "rockslide"){
            JOptionPane.showMessageDialog(null, "For level 1 answer the question to get the spell");
        }
        else if (easpellType == "pelting rocks"){
            JOptionPane.showMessageDialog(null, "For level 1 answer the question to get the spell");
        }
    }

    public void printSpellBookSummary(){
        for(int i = 0; i<sspellBook.size();i++)
        {
            sspellBook.get(i).printSpellSummary();
        }

    }
}