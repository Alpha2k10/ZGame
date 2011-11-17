/*
 * To change this template, choose Tools | Templates and open the template in
 * the editor.
 */
package Gui.Listener;

import Logic.Objekte;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.scene.control.Toggle;
import javafx.scene.control.ToggleButton;

/**
 *
 * @author Alex
 */
public class EditorChangePaletteListener implements ChangeListener<Toggle> {

    public void changed(ObservableValue<? extends Toggle> ov, Toggle oldValue, Toggle selectedT) {
        if(selectedT!=null){
            String id = ((ToggleButton)selectedT).getId();
            if(id.equals("Ground")){
                if (oldValue!=null)
                    setLastInvisible(oldValue);
                Objekte.getMapEditorData().getPalettGroups(0).setVisible(true);
                Objekte.getMapEditorData().setCurPalette(0);
            }else if(id.equals("Forest")){
                setLastInvisible(oldValue);
                Objekte.getMapEditorData().getPalettGroups(1).setVisible(true);
                Objekte.getMapEditorData().setCurPalette(1);
            }else if(id.equals("GEnv")){
                setLastInvisible(oldValue);
                Objekte.getMapEditorData().getPalettGroups(2).setVisible(true);
                Objekte.getMapEditorData().setCurPalette(2);
            }
        }else{
            // nichts ausgewählt
            setLastInvisible(oldValue);
        }
    }
    
    private void setLastInvisible(Toggle oldValue){
        if(oldValue!=null){
            String id = ((ToggleButton)oldValue).getId();
            if(id.equals("Ground")){
                Objekte.getMapEditorData().getPalettGroups(0).setVisible(false);
            }else if(id.equals("Forest")){
                Objekte.getMapEditorData().getPalettGroups(1).setVisible(false);
            }else if(id.equals("GEnv")){
                Objekte.getMapEditorData().getPalettGroups(2).setVisible(false);
            }
        }   
    }
    
}
