/*
 * To change this template, choose Tools | Templates and open the template in
 * the editor.
 */
package Logic.Images;

import Logic.Objekte;
import javafx.scene.image.Image;

/**
 *
 * @author Alex
 */
public class LoadImagesEditor {
 
    public LoadImagesEditor(){
        
    }
    
    public void loadMapEditor(){
        Image singleBorder = new Image(LoadImagesPlayer.class.getResourceAsStream("editor\\feldRect.png"));
        Objekte.getImgMapEditor().setSingleBorder(singleBorder);
        
        Image singleBorderHover = new Image(LoadImagesPlayer.class.getResourceAsStream("editor\\feldRectHover.png"));
        Objekte.getImgMapEditor().setSingleBorderHover(singleBorderHover);
    }
}
