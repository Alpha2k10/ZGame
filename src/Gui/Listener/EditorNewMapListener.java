/*
 * To change this template, choose Tools | Templates and open the template in
 * the editor.
 */
package Gui.Listener;

import Logic.Objekte;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressIndicator;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

/**
 *
 * @author Alex
 */
public class EditorNewMapListener implements EventHandler<ActionEvent> {

    private TextField tf1;
    private Stage stage;
    private Group groupRoot;
    private ProgressIndicator progressI;
    
    private Button b;
    
    private Gui.MapEditor loadMapEditorObjekt;
    
    public void handle(ActionEvent t) {
            if(b!=null)
                b.setDisable(false);
            b = (Button) t.getSource();
        
        if(b.getId().equals("showStage")){
            b.setDisable(true);
            
            stage = new Stage(StageStyle.UNDECORATED);
            groupRoot = new Group();
            Scene scene = new Scene(groupRoot, 200, 100, Color.CORNFLOWERBLUE);
            stage.setScene(scene);
            stage.centerOnScreen();
            stage.show();
             
            Label l1 = new Label();
            l1.setText("Nr.: "+(Objekte.getMapData().getMapNumberList().size()+1));
            l1.setLayoutX(20);
            l1.setLayoutY(10);
            
            tf1 = new TextField("Name");
            tf1.setMaxSize(200, 25);
            tf1.setLayoutX(20);
            tf1.setLayoutY(40);
            
            Button b1 = new Button("Create");
            b1.setId("newMap");
            b1.setOnAction(this);
            b1.setLayoutX(20);
            b1.setLayoutY(70);
            
            Button b2 = new Button("Abort");
            b2.setId("Abort");
            b2.setOnAction(this);
            b2.setLayoutX(100);
            b2.setLayoutY(70);
            
            groupRoot.getChildren().add(l1);
            groupRoot.getChildren().add(tf1);
            groupRoot.getChildren().add(b1);
            groupRoot.getChildren().add(b2);
        }else if(b.getId().equals("newMap")){
            
            progressI = new ProgressIndicator();
            progressI.setLayoutX(60);
            progressI.setLayoutY(30);
            progressI.setPrefSize(50, 50);
            
            groupRoot.getChildren().add(progressI);
            int curMaxNr = Objekte.getMapData().getMapNumberListByNumber(Objekte.getMapData().getMapNumberList().size()).getNr();

            Logic.DB.sql.NewUserMapNumber numn = new Logic.DB.sql.NewUserMapNumber();
            numn.newUserMapNumber(Objekte.getMapData().getMapId(), tf1.getText(), curMaxNr + 1);

            int newNumberId;
            Logic.DB.Select.LastMapNumberId lmni = new Logic.DB.Select.LastMapNumberId();
            newNumberId = lmni.loadLastNumber(Objekte.getMapData().getMapId(), curMaxNr + 1);

            if (newNumberId < 0) {
                System.out.println("FEHLER: db abfrage last mapnumber id -1 // ENDE");
                System.exit(0);
            }
            Logic.DB.sql.newUserMapObjekte numo = new Logic.DB.sql.newUserMapObjekte();
            numo.newUserMapObjekte(newNumberId);

            Objekte.getMapData().setCurNumberId(newNumberId);

            Gui.Haupt.getLoadMap().reloadMap();
            loadMapEditorObjekt.loadNumberChoiceBox();
            groupRoot.getChildren().remove(progressI);
            stage.close();
        }else if(b.getId().equals("Abort")){
            stage.close();
        }
    }
    
    public void setloadMapObjekt(Gui.MapEditor loadMapEO){
        loadMapEditorObjekt = loadMapEO; 
    }
}
