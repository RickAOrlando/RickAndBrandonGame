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
    
    //Constructor
    GameController(){
        testPlayerSwitch();
         
    }//End Contructor
    
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
}//End Class
