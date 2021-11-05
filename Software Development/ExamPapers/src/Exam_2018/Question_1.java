/**
 * @author Rafa
 * @version 17/10/2021/ - 23:49
 */

package Exam_2018;
public class Question_1
{

    public static void main(String[] args) {
        PlayerDetailsMaker player_details = new PlayerDetailsMaker();
        PlayerDetails SALAH = player_details.getRefForName("SALAH");
        PlayerDetails KANE = player_details.getRefForName("KANE");
        PlayerDetails AGUERO = player_details.getRefForName("AGUERO");
        PlayerDetails VARDY = player_details.getRefForName("VARDY");
        PlayerDetails STERLING = player_details.getRefForName("STERLING");
        PlayerDetails LUKAKU = player_details.getRefForName("LUKAKU");
        PlayerDetails FIRMINO = player_details.getRefForName("FIRMINO");

        int goals_scored =
                        SALAH.getGoals_scored() +
                        KANE.getGoals_scored() +
                        AGUERO.getGoals_scored() +
                        VARDY.getGoals_scored() +
                        STERLING.getGoals_scored() +
                        LUKAKU.getGoals_scored() +
                        FIRMINO.getGoals_scored();

        int average_goals_scored = goals_scored / 7;

        
    }
}
