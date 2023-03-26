package ro.sda.advanced._6_generics;

/*

Create a generic class to implement a league table for sport.
The class should allow teams to be added to the list, and store
a list of teams that belong to the league.

Your class should have a method to print out the teams in order,
with the team at the top of the league printed first.

Only teams of the same type should be added to any particular
instance of the league class - the program should fail to compile
if an attempt is made to add an incompatible team.
*/
public class Team<T> implements Comparable<Team<T>> {

    private String name;
    private int playedGames;
    private int won;
    private int lost;
    private int tied;

    public Team(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void matchResult(Team<T> opponent, int ourScore, int theirScore) {
        String message;
        if (ourScore > theirScore) {
            this.won++;
            opponent.lost++;
            message = " beat ";
        } else if (ourScore == theirScore) {
            this.tied++;
            opponent.tied++;
            message = " draw ";
        } else {
            this.lost++;
            opponent.won++;
            message = " lost to ";
        }
        playedGames++;
        System.out.println(this.getName() + message + opponent.getName());
    }

    public int ranking() {
        return (won * 3) + tied;
    }


    @Override
    public int compareTo(Team<T> o) {
        if (this.ranking()>o.ranking()){
            return -1;
        } else if (this.ranking()<o.ranking()) {

            return 1;
        }else return 0;
    }
}
