package tasks;

import core.Elem;
import core.MetodsFactory;
import org.openqa.selenium.By;

public class Bet extends MetodsFactory{
    public Elem up = new Elem(By.cssSelector("[id*='betSpinUp']"));


    public void level(){
        up.clck();
        up.clck();
        //[class ='won']
    }
}
