/*
 * To change this template, choose Tools | Templates and open the template in
 * the editor.
 */
package Logic.Images;
import Logic.Objekte;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.scene.Group;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.shape.Rectangle;
import javafx.util.Duration;


/**
 *
 * @author Alex
 */
public class LoadImagesPlayer {

    
    public void loadUnits(){
        
        Image player = new Image(LoadImagesPlayer.class.getResourceAsStream("player\\zelda2.png"));
        Logic.Objekte.getImgUnits().setPlayerSprite(player);
        
    }
}
