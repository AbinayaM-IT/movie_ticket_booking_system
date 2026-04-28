package services;
import model.Screen;
import java.util.ArrayList;

public class ScreenService {
  ArrayList<Screen> screens = new ArrayList<>();
  private int screenId = 0;
  
  public void addScreen(String name, int totalSeats, int silver, int gold, int couple, int premium){
    Screen x = new Screen(screenId, name, totalSeats, silver, gold, couple, premium);
    screens.add(x);
    screenId++;
    System.out.println("Screen Added Successfully!");
  }

  public void getScreenLayout(String screenName){
    int flag = 0;
    for(Screen s : screens){
      if(s.getScreenName().equalsIgnoreCase(screenName)){
        s.getSeatMap();
        flag = 1;
        break;
      }
    }
    
    if(flag == 0){
      System.out.println("No such Screen Exist");
    }

  }


}
