
import javax.swing.JOptionPane;
import java.util.ArrayList;
/**
 * Write a description of class SpellClass here.
 *
 * @author Ashwini Sarvepalli
 * @version 11/12/2018
 */
public class Spell {
    int health;
    int gain;
    public Spell (int h, int g){
        health = h;
        gain = g;
    }
    public Spell createSpell()
    {
        Spell s = new Spell(health, gain);
        return s;
    }
    public int gethealth()
    {
        return -health;
    }
    public int getGain()
    {
        return gain;
    }
    public void printSpellSummary()
    {
        System.out.println("health: " + health + "\n"+ "gain: " + gain);

        /*public void greenSpells(int h, int g){
        h = -10;
        g = 5;
        }*/
    }
}