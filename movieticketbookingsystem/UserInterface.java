import services.ScreenService;
import java.util.Scanner;

public class UserInterface{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    ScreenService s = new ScreenService();

    while(true){
       System.out.println("1. Admin\n2. User\n3. Exit");
    int opt = sc.nextInt();
    if(opt == 1){
      System.out.println("1. add screen\n2. add movie\n3. show screen layout");
      int action = sc.nextInt();
      if(action == 1){
        System.out.print("Enter the theatre name: ");
        String name = sc.next();
        System.out.print("Enter the total seats: ");
        int totalSeats = sc.nextInt();
        System.out.print("Enter no of silver: ");
        int silver = sc.nextInt();
        System.out.print("Enter no of gold: ");
        int gold = sc.nextInt();
        System.out.print("Enter no of couple: ");
        int couple = sc.nextInt();
        System.out.print("Enter no of premium: ");
        int premium = sc.nextInt();
        s.addScreen(name, totalSeats, silver, gold, couple, premium);
      }

      if(action == 3){
        System.out.print("Enter the theatre name: ");
        String name = sc.next();
        s.getScreenLayout(name);
      }
    }
    else{
      System.out.println("check seat availability in theatre");
      String name = sc.next();
      s.getScreenLayout(name);
    
    }

    if(opt == 3) break;
    }

    sc.close();
  }
}