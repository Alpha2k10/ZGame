/*
 * To change this template, choose Tools | Templates and open the template in
 * the editor.
 */
package Data.Overwrite;

import javafx.scene.image.Image;

/**
 *
 * @author Alex
 */
public class ImageView extends javafx.scene.image.ImageView {
    
    public ImageView(Image iv){
        super(iv);
    }
    
    @Override
    public boolean equals(Object o){
        ImageView iv = (ImageView) o;
        if(this.getLayoutX()==iv.getLayoutX() && this.getLayoutY()==iv.getLayoutY())
            return true;
        return false;
    }
    
}
