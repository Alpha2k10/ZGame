/*
 * To change this template, choose Tools | Templates and open the template in
 * the editor.
 */
package Logic;

import java.util.ArrayList;
import javafx.scene.shape.Rectangle;

/**
 *
 * @author Alex
 */
public class KollisionCheck {
    
    public boolean checkCollision(javafx.scene.Node player){
        for (javafx.scene.Node node : Objekte.getMapData().getBlockList()){
            if(player.getBoundsInParent().intersects(node.getBoundsInParent()))
                return true;
        }
        return false;
    }
}
