package tasks;

import core.Elem;
import core.MetodsFactory;
import org.openqa.selenium.By;

public class Spin extends MetodsFactory {

    private Elem find = new Elem(By.cssSelector("[id*='spinButton']"));

    public void start(){
        find.clck();
    }
}
