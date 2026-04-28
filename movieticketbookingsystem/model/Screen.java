package model;

// SCREEN IS THE THEATRE

public class Screen {
  //members
  private int screenId;
  private String name; //theatre name
  private int totalSeats;
  private Seat[][] seatLayout; 

  //setters
  public void setSeatLayout(int totalSeats, int silver, int gold, int couple, int premium){
    //Assumption: Each row will have 10 seats
    int row = totalSeats / 10;
    int col = 10;

    int idx = 0;
    int silverLimit = silver;
    int goldLimit = silverLimit + gold;
    int coupleLimit = goldLimit + couple;
    this.seatLayout = new Seat[row][col];

    for(int r = 0; r < row; r++){
      for(int c = 0; c < col; c++){
        idx++;
        char category = ' ';
        if(idx < silverLimit) category = 's';
        else if(idx >= silverLimit && idx < goldLimit) category = 'g';
        else if(idx >= goldLimit && idx < coupleLimit) category = 'c';
        else category = 'p';

        seatLayout[r][c] = new Seat(idx, r, c, category);
      }
    }

  }
  //getters
  public int getScreenId(){
    return this.screenId;
  }

  public String getScreenName(){
    return this.name;
  }

  public int getTotalSeats(){
    return this.totalSeats;
  }

  

  //getSeatMap
  public void getSeatMap(){
    for(int i = 0; i < this.seatLayout.length; i++){
      for(int j = 0; j < this.seatLayout[0].length; j++){
        System.out.print(this.seatLayout[i][j].getSeatId() + " " + this.seatLayout[i][j].getStatus() + " " + this.seatLayout[i][j].getCategory() + "\t");
      }
      System.out.println("");
    }
  }

  //lockSeat
  public boolean lockSeat(int row, int col){
    return this.seatLayout[row][col].lock();
  }

  //releaseSeat
  public boolean releaseSeat(int row, int col){
    return this.seatLayout[row][col].release();
  }

  //constructor
  public Screen(int screenId, String name, int totalSeats, int silver, int gold, int couple, int premium){
    this.screenId = screenId;
    this.name = name;
    this.totalSeats = totalSeats;
    setSeatLayout(totalSeats, silver, gold, couple, premium);
  }

}
