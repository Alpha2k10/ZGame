/*
 * To change this template, choose Tools | Templates and open the template in
 * the editor.
 */
package Logic;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.scene.Group;
import javafx.scene.image.ImageView;
import javafx.scene.shape.Rectangle;
import javafx.util.Duration;

/**
 *
 * @author Alex
 */
public class LoadPlayer {
    
    public void loadPlayer(Group root){
        
        Group playerGroup = new Group();
        
        // für animation
        Rectangle rec = new Rectangle();
        rec.setX(0);
        rec.setY(0);
        rec.setWidth(30.0d);
        rec.setHeight(25.0d);

        // imageview für player
        ImageView iv = new ImageView(Objekte.getImgUnits().getPlayerSprite()); 
        iv.setClip(rec);
        
        // Rectangle für die collision
        Rectangle playerRect = new Rectangle();
        playerRect.setWidth(20);
        playerRect.setHeight(20);
        Objekte.getPlayerData().setPlayerRect(playerRect);
        root.getChildren().add(playerRect);
        
        //playerGroup.getChildren().add(playerRect);
        
        // Listener für die collisionsbox
        Logic.Listener.ChangePlayerBindingListener changeListener = new Logic.Listener.ChangePlayerBindingListener();
        changeListener.setImageView(playerGroup);
        
        playerRect.layoutXProperty().addListener(changeListener);
        playerRect.layoutYProperty().addListener(changeListener);
        
        Timeline tl = new Timeline();
        KeyFrame kf = new KeyFrame(Duration.millis(50));
        
        // listener für animation
        Logic.Listener.MovePlayerListener onFinish = new Logic.Listener.MovePlayerListener();
        
        onFinish.setImageView(iv);
        onFinish.setTimeLine(tl);
        
        tl.getKeyFrames().add(kf);
        tl.setOnFinished(onFinish);
        tl.setAutoReverse(true);
        tl.play();
             
        playerGroup.getChildren().add(iv);
        
        Logic.Objekte.getPlayerData().setPlayerGroup(playerGroup);
        root.getChildren().add(playerGroup);
    }
}
