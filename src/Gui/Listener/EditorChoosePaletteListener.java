/*
 * To change this template, choose Tools | Templates and open the template in
 * the editor.
 */
package Gui.Listener;

import Logic.Objekte;
import java.util.ArrayList;
import javafx.event.EventHandler;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;


/**
 *
 * @author Alex
 */
public class EditorChoosePaletteListener implements EventHandler<MouseEvent> {

    private int[][] paletteId = new int[10][30];
    private ImageView ivBorder;
    
    public void handle(MouseEvent t) {
        ImageView iv = (ImageView)t.getSource();
        int pos = (int) iv.getLayoutX() / 25;
        
        Objekte.getMapEditorData().setCurPalettChoose(paletteId[Objekte.getMapEditorData().getCurPalette()][pos]);
        ivBorder.setLayoutX(pos*25);
        ivBorder.setLayoutY(0);
        System.out.println(Objekte.getMapEditorData().getCurPalettChoose());
    }

    public void setBorder (ImageView iv){
        this.ivBorder=iv;
    }
    public void setId(int palett,int pos, int paletteId){
        this.paletteId[palett][pos]=paletteId;
    }
    
   
    
}
