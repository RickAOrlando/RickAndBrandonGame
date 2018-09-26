/*
 * Last Updated: 0/0/2017
 * Class description:
 */
package rickandbrandongame;

import java.util.ArrayList;

/**
 *
 * @author Pussy Whisperer
 */
public class GameController {
    //Global variables
    ArrayList playerList = new ArrayList();
    
    //Constructor
    GameController(){
        
    }//End Contructor
    
    public void createPlayer(){
        //user input for player name argument
        //alternatly assign markers for player marker argument
        Player player = new Player("player name","player marker"); 
        playerList.add(player);
    }
}//End Class
