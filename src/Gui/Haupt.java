/*
 * To change this template, choose Tools | Templates and open the template in
 * the editor.
 */
package Gui;

import Logic.DB.sql.*;
import Logic.Objekte;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.ProgressIndicator;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

/**
 *
 * @author Alex
 */
public class Haupt {
    
    private Group root;
    private Scene scene;
    
    private static Map loadMap;
    
    public Haupt(){
        root = new Group();
        scene = new Scene(root, 800, 700,Color.LIGHTBLUE);
        
        //user Settings
        Objekte.getPlayerData().setUserId(3);
        Objekte.getMapData().setMapId(1);
        
        
        //db start
        initDatabase();
        
        //laden
        loadBackground();
        loadImagesMap();
        loadMap();
        loadPlayer();
        loadMapEditor();
        
        //loadTest();
        
        // Main Thread starten
        Logic.MainThread mainT= new Logic.MainThread();
        mainT.start();
    }
    
    private void loadBackground(){
        Rectangle bg = new Rectangle(800, 600);
        bg.setFill(Color.CORNFLOWERBLUE);
        bg.setFocusTraversable(true);
        bg.setOnKeyPressed(new EventHandler<KeyEvent>() {

            public void handle(KeyEvent t) {
                if(t.getCode()==KeyCode.S){
                    Objekte.getPlayerData().setMoveB(true);
                }else if(t.getCode()==KeyCode.A){
                    Objekte.getPlayerData().setMoveL(true);
                }else if(t.getCode()==KeyCode.W){
                    Objekte.getPlayerData().setMoveT(true);
                }else if(t.getCode()==KeyCode.D){
                    Objekte.getPlayerData().setMoveR(true);
                }
            }
        });
        bg.setOnKeyReleased(new EventHandler<KeyEvent>() {

            public void handle(KeyEvent t) {
                if(t.getCode()==KeyCode.S){
                    Objekte.getPlayerData().setMoveB(false);
                }else if(t.getCode()==KeyCode.A){
                    Objekte.getPlayerData().setMoveL(false);
                }else if(t.getCode()==KeyCode.W){
                    Objekte.getPlayerData().setMoveT(false);
                }else if(t.getCode()==KeyCode.D){
                    Objekte.getPlayerData().setMoveR(false);
                }
            }
        });
        root.getChildren().add(bg);
        
        Rectangle bgBot = new Rectangle(800, 100);
        bgBot.setFill(Color.BURLYWOOD);
        bgBot.setLayoutY(600);
        
        root.getChildren().add(bgBot);
    }
    
    private void loadImagesMap(){
        Logic.Images.LoadImagesMap loadImgMap = new Logic.Images.LoadImagesMap();
        loadImgMap.loadMap();
    }
    
    private void loadMap(){
        loadMap = new Map();
        loadMap.loadMap(root);
    }
    
    public static Gui.Map getLoadMap(){
        return loadMap;
    }
    
    private void loadMapEditor(){
        MapEditor me = new MapEditor();
        me.loadMapEditor(root);
    }
    
    private void loadPlayer(){
        Logic.Images.LoadImagesPlayer loadImgPlayer = new Logic.Images.LoadImagesPlayer();
        loadImgPlayer.loadUnits();
        
        Logic.LoadPlayer loadPlayer = new Logic.LoadPlayer();
        loadPlayer.loadPlayer(root);
        
        Objekte.getPlayerData().getPlayerGroup().setLayoutX(200);
        Objekte.getPlayerData().getPlayerGroup().setLayoutY(200);
        Objekte.getPlayerData().setAnimation(true);
        
    }
    
    private void loadTest(){
        ProgressIndicator progressI = new ProgressIndicator();
        progressI.setLayoutX(50);
        progressI.setLayoutY(50);
        progressI.setPrefSize(50, 50);
        root.getChildren().add(progressI);
    }
    
    private void initDatabase(){
        Objekte.getDbInit().connectDB();
    }
    
    public Group getRoot() {
        return root;
    }

    public Scene getScene() {
        return scene;
    }
    
    private void CreateFirstTimeDb(){
        CreateTableMap ctm = new CreateTableMap();
        ctm.createTableMap();
        CreateTableMapObjekt ctmo = new CreateTableMapObjekt();
        ctmo.createTableMapObjekte();
        CreateTableUser ctu = new CreateTableUser();
        ctu.createTableUser();
        CreateTableMapNumber ctmn = new CreateTableMapNumber();
        ctmn.createTableMapNumber();
        NewUser nu = new NewUser();
        nu.newUser("a", "a", "bla@bla.de");
        newUserMap num = new newUserMap();
        num.newUserMap(1, "map");
        NewUserMapNumber numn = new NewUserMapNumber();
        numn.newUserMapNumber(1, "neu", 1);
        newUserMapObjekte numo = new newUserMapObjekte();
        numo.newUserMapObjekte(1);
    }

}
