/**
 * @author Rafa
 * @version 17/10/2021/ - 23:51
 */

package Exam_2018;
import java.util.HashMap;
public class PlayerDetailsMaker
{
    private final HashMap<String, PlayerDetails> playerDetails = new HashMap();

    public PlayerDetailsMaker() {
        playerDetails.put("SALAH", new PlayerDetails("Mohamed Salah", "Liverpool", "Egypt", 32));
        playerDetails.put("KANE", new PlayerDetails("Harry Kane", "Tottenham Hotspur", "England", 30));
        playerDetails.put("AGUERO", new PlayerDetails("Sergio Agüero", "Manchester City", "Argentina", 21));
        playerDetails.put("VARDY", new PlayerDetails("Jamie Vardy", "Leicester City", "England", 20));
        playerDetails.put("STERLING", new PlayerDetails("Raheem Sterling", "Manchester City", "England", 18));
        playerDetails.put("LUKAKU", new PlayerDetails("Romelu Lukaku", "Manchester United", "Belgium", 16));
        playerDetails.put("FIRMINO", new PlayerDetails("Roberto Firmino", "Liverpool", "Brazil", 15));
    }

    public PlayerDetails getRefForName(String name) {
        // You can use the key to access the object directly without searching
        return playerDetails.get(name);
    }
}
