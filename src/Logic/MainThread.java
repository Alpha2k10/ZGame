/*
 * To change this template, choose Tools | Templates and open the template in
 * the editor.
 */
package Logic;

import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.scene.Group;
import javafx.scene.shape.Rectangle;

/**
 *
 * @author Alex
 */
public class MainThread extends Thread{
    
    @Override
    public void run(){
       while(true){
           movement();
            try {
                Thread.sleep(10);
            } catch (InterruptedException ex) {
                Logger.getLogger(MainThread.class.getName()).log(Level.SEVERE, null, ex);
            }
       }
    }
    
    private void movement(){
            
        Data.PlayerData pd = Objekte.getPlayerData();
        
        Rectangle playerRect = Objekte.getPlayerData().getPlayerRect();
        
        if(pd.isMoveL()){
            
            if(!Objekte.getKolliCheck().checkCollision(playerRect)){
                playerRect.setLayoutX(playerRect.getLayoutX()-1);
            }else{
                playerRect.setLayoutX(playerRect.getLayoutX()+2);
            }
            
            
        }else if(pd.isMoveT()){
            
            if(!Objekte.getKolliCheck().checkCollision(playerRect)){
                playerRect.setLayoutY(playerRect.getLayoutY()-1);
            }else{
                playerRect.setLayoutY(playerRect.getLayoutY()+2);
            }
            
        }else if(pd.isMoveR()){
            
            if(!Objekte.getKolliCheck().checkCollision(playerRect)){
                playerRect.setLayoutX(playerRect.getLayoutX()+1);
            }else{
                playerRect.setLayoutX(playerRect.getLayoutX()-2);
            }
            
        }else if(pd.isMoveB()){
            
            if(!Objekte.getKolliCheck().checkCollision(playerRect)){
                playerRect.setLayoutY(playerRect.getLayoutY()+1);
            }else{
                playerRect.setLayoutY(playerRect.getLayoutY()-2);
            }
           
        }
    }
}
