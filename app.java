import java.util.ArrayList;
import java.util.List;
public class app
 { public static void main(String[]args)throws Exception{
    List<Team>teams=new ArrayList<>();
    teams.add(new Team("India"));
    teams.add(new Team("pakisthan"));
    teams.add(new Team("Australia"));
    teams.add(new Team("Newzealand"));
    teams.add(new Team("south Africa"));
    List<Match>matches = Scheduler.createSchedule(teams);
    System.out.println(matches);
    Simulator.playmatches(matches);
    Simulator.showPointsTable(teams,matches);
  }
}