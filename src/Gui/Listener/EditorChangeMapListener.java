/*
 * To change this template, choose Tools | Templates and open the template in
 * the editor.
 */
package Gui.Listener;

import Logic.Objekte;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;

/**
 *
 * @author Alex
 */
public class EditorChangeMapListener implements EventHandler<ActionEvent> {

    private ChoiceBox cb;
    
    public void handle(ActionEvent t) {
        int number = cb.getSelectionModel().getSelectedIndex()+1;
        int numberId = Objekte.getMapData().getMapNumberListByNumber(number).getId();
        Objekte.getMapData().setCurNumberId(numberId);
        System.out.println("Change mapNumberId to: "+numberId);
        
        Gui.Haupt.getLoadMap().reloadMap();
    }
    
    public void setChoiceBox(ChoiceBox cb){
        this.cb = cb;
    }
    
}
