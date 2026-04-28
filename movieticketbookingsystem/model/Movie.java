package model;

public class Movie{
  private int movieId;
  private String title;
  private String genre;
  private String language;
  private int rating;
  private float duration;

  //getters

  public int getMovieId(){
    return this.movieId;
  }

  public String getMovieTitle(){
    return this.title;
  }

  public String getMovieGenre(){
    return this.genre;
  }

  public int getMovieRating(){
    return this.rating;
  }

  public float getDuration(){
    return this.duration;
  }

  public String getLanguage(){
    return this.language;
  }

  //getShowTime
  //isAvailable
  //constructor

  public Movie(int movieId, String title, String genre, String language, int rating, float duration){
    this.movieId = movieId;
    this.title = title;
    this.genre = genre;
    this.language = language;
    this.rating = rating;
    this.duration = duration;
  }
}