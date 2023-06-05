package pract7.flyweight;

public class Main {
    public static void main(String[] args) {


        System.out.println("Flyweight: ");
        TeamAcademy teamAcademy = new TeamAcademy();
        for (int i = 0; i < 10; i++) {
            switch (i % 3) {
                case 0 -> teamAcademy.createTeam(Name.Alpha);
                case 1 -> teamAcademy.createTeam(Name.Beta);
                case 2 -> teamAcademy.createTeam(Name.Alpha);
            }
        }
    }
}
