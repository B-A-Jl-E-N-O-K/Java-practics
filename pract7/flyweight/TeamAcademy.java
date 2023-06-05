package pract7.flyweight;

import java.util.HashMap;
import java.util.Map;

public class TeamAcademy {
    private final Map<Name, Team> teams = new HashMap<>();


    @SuppressWarnings("UnusedReturnValue")
    public Team createTeam(Name name) {
        if (teams.containsKey(name)) {
            return teams.get(name);
        } else {
            Team team = new Team().setTeamName(name);
            teams.put(name, team);
            return team;
        }
    }
}
