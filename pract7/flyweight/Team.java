package pract7.flyweight;

public class Team {

    @SuppressWarnings("unused")
    private Name teamName;

    public Team() {
        System.out.println("Новая команда");
        this.teamName = Name.Alpha;
    }

    public Team setTeamName(Name teamName) {
        this.teamName = teamName;
        return this;
    }
}
