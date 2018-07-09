package core;

import tasks.Bet;
import tasks.Spin;

public class MainPage extends MetodsFactory  {
    private String pageUrl = "http://slotmachinescript.com/";

    public Spin spin = new Spin();
    public void open(){
        driver().get(pageUrl);
    }

    public Bet bet = new Bet();
    public void open2(){ driver().get(pageUrl);
    }
   }
