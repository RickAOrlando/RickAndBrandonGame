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
    
    public void testPlayerSwitch(){
        //Testing player switch functionality
        System.out.println(getPlayer());
        switchPlayer();
        System.out.println(getPlayer());
        switchPlayer();
        System.out.println(getPlayer());
        switchPlayer();
        System.out.println(getPlayer());
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
    public int getxWinCount() {
        return xWinCount;
    }

    /**
     * @param xWinCount the xWinCount to set
     */
    public void setxWinCount(int xWinCount) {
        this.xWinCount = xWinCount;
    }

    /**
     * @return the yWinCount
     */
    public int getyWinCount() {
        return yWinCount;
    }

    /**
     * @param yWinCount the yWinCount to set
     */
    public void setyWinCount(int yWinCount) {
        this.yWinCount = yWinCount;
    }
}//End Class
