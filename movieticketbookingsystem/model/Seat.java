package model;

public class Seat {
  private int seatId;
  private int row;
  private int number; // seat number in that row (aka) col
  private char category;
  private boolean status; // booked or not booked
  private boolean lockExpiry; // locked or not locked
  
  //getters
  public int getSeatId(){
    return this.seatId;
  }

  public int getRow(){
    return this.row;
  }

  public int getSeatNumber(){
    return this.number;
  }

  public boolean getStatus(){
    return this.status;
  }

  public boolean getLockExpiry(){
    return this.lockExpiry;
  }

  public char getCategory(){
    return this.category;
  }

  //lock
  public boolean lock(){
    if(this.lockExpiry) return false;
    this.lockExpiry = true;
    return true;
  }

  //release
  public boolean release(){
    if(this.status){
      this.status = false;
      this.lockExpiry = false;
      return true;
    }

    return false;
  }

  //book III ar to lock for now
  public boolean book(){
    if(this.status) return false;
    this.status = true;
    lock();
    return this.status;
  }

  //isLocked?
  public boolean isLocked(){
    return this.status;
  }

  
  //constructor
  public Seat(int seatId, int row, int number, char category){
    this.seatId = seatId;
    this.row = row;
    this.number = number;
    this.category = category;
    this.status = false;
    this.lockExpiry = false;
  }

}
