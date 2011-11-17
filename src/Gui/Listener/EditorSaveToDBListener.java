/*
 * To change this template, choose Tools | Templates and open the template in
 * the editor.
 */
package Gui.Listener;

import Logic.Objekte;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.scene.control.Button;

/**
 *
 * @author Alex
 */
public class EditorSaveToDBListener implements EventHandler<ActionEvent> {

    public void handle(ActionEvent t) {
        Button b = (Button) t.getSource();
        
        if(b.getId().equals("save")){
            
            Logic.DB.Update.mapObjekte moUpdate = new Logic.DB.Update.mapObjekte();
            
            LinkedList<Integer[]> liste = Objekte.getMapEditorData().getVeraendert();
            
            while(!liste.isEmpty()){
                if(liste.getFirst()[2]<100){
                    moUpdate.updateMapGround(
                    Objekte.getMapData().getCurNumberId(), 
                    liste.getFirst()[0], 
                    liste.getFirst()[1],
                    liste.getFirst()[2]);
                }else if(liste.getFirst()[2]>100 && liste.getFirst()[2]<200){
                    moUpdate.updateMapObjekt(
                    Objekte.getMapData().getCurNumberId(), 
                    liste.getFirst()[0], 
                    liste.getFirst()[1],
                    liste.getFirst()[2]);
                }else if(liste.getFirst()[2]>200 && liste.getFirst()[2]<300){
                    moUpdate.updateMapGroundEnv(
                    Objekte.getMapData().getCurNumberId(), 
                    liste.getFirst()[0], 
                    liste.getFirst()[1],
                    liste.getFirst()[2]);
                }
                
                
                liste.removeFirst();
            }
        }
    }
    
}
