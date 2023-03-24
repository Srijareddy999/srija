public class Match {
  private Team  team1;
  private Team team2;
  private Team winner;
  private Team loser;
  match(Team team,Team team3){
    this.team1=team;
    this.team2=team3;
     }
     public Team getTeam1(){
        return team1;
 }
 public Team getTeam2(){
    return Team2;
 }
 public Team getWinner(){
    return Winner;
 } 
 public void setWinner (Team Winner){
    this.Winner = Winner;
 }
 public team getLoser(){
    return loser;
 }  
 public void setLoser(Team Loser){
    this.Loser = loser;
 }
 public String toString(){
    String matchDescription =team1+"vs"+team2;
    if(Winner!=null){
        String result="\n winner= "+ this.winner.toString()+"Loser= "+this.loser.toString()+"\n";
        MatchDescription=matchDescription+result;
 }
 return matchDescription;
  }
}
