/**
 * @author Rafa
 * @version 17/10/2021/ - 23:37
 */

/*
    The following table stores the details of the top goal scorers in the English Premier League for the 2017/2018 season.
    The details include the player name, premier league club, player nationality and the number of goals scored.
    Assuming that a class called PlayerDetails already exists which encapsulates the data for records including all necessary set and get methods.
    Write a Main class which uses a HashMap to create and store the objects below.
 */
package Exam_2018;
public class PlayerDetails
{
    private String player_name,club_name,nationality;
    private int goals_scored;

    public PlayerDetails() {
        this.player_name = null;
        this.club_name = null;
        this.nationality = null;
        this.goals_scored = 0;
    }

    public PlayerDetails(String player_name, String club_name, String nationality, int goals_scored) {
        this.player_name = player_name;
        this.club_name = club_name;
        this.nationality = nationality;
        this.goals_scored = goals_scored;
    }

    public String getPlayer_name() {
        return player_name;
    }
    public String getClub_name() {
        return club_name;
    }
    public String getNationality() {
        return nationality;
    }
    public int getGoals_scored() {
        return goals_scored;
    }

    public void setPlayer_name(String player_name) {
        this.player_name = player_name;
    }
    public void setClub_name(String club_name) {
        this.club_name = club_name;
    }
    public void setNationality(String nationality) {
        this.nationality = nationality;
    }
    public void setGoals_scored(int goals_scored) {
        this.goals_scored = goals_scored;
    }

    @Override
    public String toString() {
        return "PlayerDetails{" +
                "player_name='" + player_name + '\'' +
                ", club_name='" + club_name + '\'' +
                ", nationality='" + nationality + '\'' +
                ", goals_scored=" + goals_scored +
                '}';
    }
}
