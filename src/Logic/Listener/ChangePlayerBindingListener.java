/*
 * To change this template, choose Tools | Templates and open the template in
 * the editor.
 */
package Logic.Listener;

import Logic.Objekte;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.scene.Group;
import javafx.scene.shape.Rectangle;

/**
 *
 * @author Alex
 */
public class ChangePlayerBindingListener implements ChangeListener {

    private Group playerG;
    
    public void changed(ObservableValue ov, Object oldV, Object newV) {
        Rectangle rect = Objekte.getPlayerData().getPlayerRect();
        playerG.setLayoutX(rect.getLayoutX()-4);
        playerG.setLayoutY(rect.getLayoutY()-6);
    }
    
    public void setImageView(Group playerG){
        this.playerG = playerG;
    }
}
