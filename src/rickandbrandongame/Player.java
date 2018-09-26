/*
 * Last Updated: 0/0/2017
 * Class description:
 */
package rickandbrandongame;

/**
 *
 * @author Pussy Whisperer
 */
public class Player {
    private String name;
    private String playerMarker;
    
    //Constructor
    Player(String name, String playerMarker){
        this.name = name;
        this.playerMarker = playerMarker; 
    }//End constructor

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the playerMarker
     */
    public String getPlayerMarker() {
        return playerMarker;
    }

    /**
     * @param playerMarker the playerMarker to set
     */
    public void setPlayerMarker(String playerMarker) {
        this.playerMarker = playerMarker;
    }
}//End Class
