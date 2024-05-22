public class Scoreboard {
  private String team1;
  private String team2;
  private int team1score;
  private int team2score;
  private boolean team1active;

  public Scoreboard(String team1, String team2){
    this.team1=team1;
    this.team2=team2;
    this.team1score=0;
    this.team2score=0;
    this.team1active= true;
  }

  public void recordPlay(int points){
    if(points == 0){
      team1active = !team1active;
    }
    else{
      if(team1active){
        team1score+=points;
      }
    }
  }
  public String getScore(){
    if(team1active){
      return team1score + "-" +team2score + "-" + team1;
    }
    else{
      return team1score + "-" +team2score + "-" + team2;
    }
  }





  
}
