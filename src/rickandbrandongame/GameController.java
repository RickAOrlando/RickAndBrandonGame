/*
 * Last Updated: 0/0/2017
 * Class description:
 */
package rickandbrandongame;

/**
 *
 * @author Pussy Whisperer
 */
public class GameController {
    //Global variables
    private String player = "x";
    private int xWinCount = 0;
    private int yWinCount = 0;
    
    //Constructor
    GameController(){ 
        
    }
    
    public void switchPlayer(){
        if (getPlayer().equalsIgnoreCase("x")){
            setPlayer("o");
        }else{
            setPlayer("x");
        }
    }

    /**
     * @return the player
     */
    public String getPlayer() {
        return player;
    }

    /**
     * @param player the player to set
     */
    public void setPlayer(String player) {
        this.player = player;
    }

    /**
     * @return the xWinCount
     */
    public int getXWinCount() {
        return xWinCount;
    }

    /**
     * @param xWinCount the xWinCount to set
     */
    public void setXWinCount(int xWinCount) {
        this.xWinCount = xWinCount;
    }

    /**
     * @return the yWinCount
     */
    public int getYWinCount() {
        return yWinCount;
    }

    /**
     * @param yWinCount the yWinCount to set
     */
    public void setOWinCount(int yWinCount) {
        this.yWinCount = yWinCount;
    }
}//End Class
