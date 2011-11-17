/*
 * To change this template, choose Tools | Templates and open the template in
 * the editor.
 */
package Gui.Listener;

import Logic.Objekte;
import java.util.ArrayList;
import javafx.beans.InvalidationListener;
import javafx.beans.Observable;
import javafx.scene.image.ImageView;

/**
 *
 * @author Alex
 */
public class EditorHoverListener implements InvalidationListener{

    private ArrayList<ImageView> imageViewList = new ArrayList<ImageView>();
    private ImageView ivHover;
    
    public EditorHoverListener(ImageView ivHover){
        this.ivHover = ivHover;
    }
    
    public void invalidated(Observable o) {
        for(ImageView iv : imageViewList){
            if(iv.isHover()){
                ivHover.setLayoutX(iv.getLayoutX());
                ivHover.setLayoutY(iv.getLayoutY());
                Objekte.getMapEditorData().setCurPos((int)iv.getLayoutX()/25, (int)iv.getLayoutY()/25);
            }
        }
    }
    public void addImageView(ImageView tempIv){
        imageViewList.add(tempIv);
    }
    
}
