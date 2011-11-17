/*
 * To change this template, choose Tools | Templates and open the template in
 * the editor.
 */
package Gui;

import Gui.Listener.EditorNewMapListener;
import Gui.Listener.EditorSaveToDBListener;
import Logic.Images.LoadImagesEditor;
import Logic.Objekte;
import java.util.ArrayList;
import javafx.beans.InvalidationListener;
import javafx.beans.Observable;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.control.*;
import javafx.scene.image.ImageView;

/**
 *
 * @author Alex
 */
public class MapEditor {
    
    private ChoiceBox cb;
    
    public MapEditor(){
        
    }
    
    ImageView ivHover;
    public void loadMapEditor(Group root){
        Logic.Images.LoadImagesEditor li = new LoadImagesEditor();
        li.loadMapEditor();
        
        Group meGroup = new Group();
        ivHover = new ImageView(Objekte.getImgMapEditor().getSingleBorderHover());
        ivHover.setVisible(true);
        
        Gui.Listener.EditorHoverListener eHoverL = new Gui.Listener.EditorHoverListener(ivHover);
        
        for(int y=0;y<Objekte.getMapData().getMapSizeY();y++){
            for (int x=0;x<Objekte.getMapData().getMapSizeX();x++){
                
                ImageView iv = new ImageView(Objekte.getImgMapEditor().getSingleBorder());
                iv.setLayoutX(x*25);
                iv.setLayoutY(y*25);
                eHoverL.addImageView(iv);
                iv.hoverProperty().addListener(eHoverL);
                meGroup.getChildren().add(iv);
                
            }
        }
        
        root.getChildren().add(meGroup);
        root.getChildren().add(ivHover);
        
        loadEditorPalette(root);
        loadMapUI(root);
        loadEditorButtons(root);
        loadMapNumbers(root);
        
    }
    
    private void loadMapUI(Group root){
        Group editorUI = new Group();
        editorUI.setLayoutX(0);
        editorUI.setLayoutY(600);
        editorUI.setVisible(true);
        
        ToggleGroup tGroup = new ToggleGroup();
        
        ToggleButton tb1 = new ToggleButton("Ground");
        tb1.setLayoutX(0);
        tb1.setLayoutY(0);
        tb1.setId("Ground");
        ToggleButton tb2 = new ToggleButton("Forest");
        tb2.setLayoutX(70);
        tb2.setLayoutY(0);
        tb2.setId("Forest");
        ToggleButton tb3 = new ToggleButton("G Env");
        tb3.setLayoutX(140);
        tb3.setLayoutY(0);
        tb3.setId("GEnv");
        
        tb1.setToggleGroup(tGroup);
        tb2.setToggleGroup(tGroup);
        tb3.setToggleGroup(tGroup);
        
        tGroup.selectedToggleProperty().addListener(new Gui.Listener.EditorChangePaletteListener());
        tGroup.selectToggle(tb1);
        editorUI.getChildren().add(tb1);
        editorUI.getChildren().add(tb2);
        editorUI.getChildren().add(tb3);
        
        root.getChildren().add(editorUI);
    }
    
    public void loadEditorPalette(Group root){
        
        Gui.Listener.EditorChoosePaletteListener listener = new Gui.Listener.EditorChoosePaletteListener();
        
        Group pGroup1 = loadPaletteImg1(listener);
        Group pGroup2 = loadPaletteImg2(listener);
        Group pGroup3 = loadPaletteImg3(listener);
        
        Objekte.getMapEditorData().setPalettGroups(pGroup1, 0);
        Objekte.getMapEditorData().setPalettGroups(pGroup2, 1);
        Objekte.getMapEditorData().setPalettGroups(pGroup3, 2);
        root.getChildren().add(pGroup1);
        root.getChildren().add(pGroup2);
        root.getChildren().add(pGroup3);
    }
    
    /**
     * Ground
     * @param listener
     * @return 
     */
    private Group loadPaletteImg1(Gui.Listener.EditorChoosePaletteListener listener){
        Group pGroup = new Group();
        pGroup.setVisible(false);
        pGroup.setLayoutX(0);
        pGroup.setLayoutY(650);
        
        ImageView ivBorder = new ImageView(Objekte.getImgMapEditor().getSingleBorder());
        listener.setBorder(ivBorder);
        
        ImageView gras01 = new Data.Overwrite.ImageView(Objekte.getImgMap().getGras());
        listener.setId(0, 0, 1);
        gras01.setLayoutX(0);
        
        ImageView groundWalk01 = new Data.Overwrite.ImageView(Objekte.getImgMap().getGroundWalk01());
        listener.setId(0, 1, 20);
        groundWalk01.setLayoutX(25);
        ImageView groundWalkRB01 = new Data.Overwrite.ImageView(Objekte.getImgMap().getGroundWalkRB01());
        listener.setId(0, 2, 21);
        groundWalkRB01.setLayoutX(50);
        ImageView groundWalkRT01 = new Data.Overwrite.ImageView(Objekte.getImgMap().getGroundWalkRT01());
        listener.setId(0, 3, 22);
        groundWalkRT01.setLayoutX(75);
        ImageView groundWalkRR01 = new Data.Overwrite.ImageView(Objekte.getImgMap().getGroundWalkRR01());
        listener.setId(0, 4, 23);
        groundWalkRR01.setLayoutX(100);
        ImageView groundWalkRL01 = new Data.Overwrite.ImageView(Objekte.getImgMap().getGroundWalkRL01());
        listener.setId(0, 5, 24);
        groundWalkRL01.setLayoutX(125);
        
        ImageView groundWalkOL_UR_L = new Data.Overwrite.ImageView(Objekte.getImgMap().getGroundWalkOL_UR_L());
        listener.setId(0, 6, 25);
        groundWalkOL_UR_L.setLayoutX(150);
        ImageView groundWalkOL_UR_R = new Data.Overwrite.ImageView(Objekte.getImgMap().getGroundWalkOL_UR_R());
        listener.setId(0, 7, 26);
        groundWalkOL_UR_R.setLayoutX(175);
        ImageView groundWalkUL_OR_L = new Data.Overwrite.ImageView(Objekte.getImgMap().getGroundWalkUL_OR_L());
        listener.setId(0, 8, 27);
        groundWalkUL_OR_L.setLayoutX(200);
        ImageView groundWalkUL_OR_R = new Data.Overwrite.ImageView(Objekte.getImgMap().getGroundWalkUL_OR_R());
        listener.setId(0, 9, 28);
        groundWalkUL_OR_R.setLayoutX(225);
        
        ImageView groundWalkE_B = new Data.Overwrite.ImageView(Objekte.getImgMap().getGroundWalkE_B());
        listener.setId(0, 10, 29);
        groundWalkE_B.setLayoutX(250);
        ImageView groundWalkE_T = new Data.Overwrite.ImageView(Objekte.getImgMap().getGroundWalkE_T());
        listener.setId(0, 11, 30);
        groundWalkE_T.setLayoutX(275);
        ImageView groundWalkE_R = new Data.Overwrite.ImageView(Objekte.getImgMap().getGroundWalkE_R());
        listener.setId(0, 12, 31);
        groundWalkE_R.setLayoutX(300);
        ImageView groundWalkE_L = new Data.Overwrite.ImageView(Objekte.getImgMap().getGroundWalkE_L());
        listener.setId(0, 13, 32);
        groundWalkE_L.setLayoutX(325);
        
        
        // Listener
        gras01.setOnMouseClicked(listener);
        
        groundWalk01.setOnMouseClicked(listener);
        groundWalkRB01.setOnMouseClicked(listener);
        groundWalkRT01.setOnMouseClicked(listener);
        groundWalkRR01.setOnMouseClicked(listener);
        groundWalkRL01.setOnMouseClicked(listener);
        
        groundWalkOL_UR_L.setOnMouseClicked(listener);
        groundWalkOL_UR_R.setOnMouseClicked(listener);
        groundWalkUL_OR_L.setOnMouseClicked(listener);
        groundWalkUL_OR_R.setOnMouseClicked(listener);
        
        groundWalkE_B.setOnMouseClicked(listener);
        groundWalkE_T.setOnMouseClicked(listener);
        groundWalkE_R.setOnMouseClicked(listener);
        groundWalkE_L.setOnMouseClicked(listener);
        
        // Gruppe adden
        pGroup.getChildren().add(gras01);
        
        pGroup.getChildren().add(groundWalk01);
        pGroup.getChildren().add(groundWalkRB01);
        pGroup.getChildren().add(groundWalkRT01);
        pGroup.getChildren().add(groundWalkRR01);
        pGroup.getChildren().add(groundWalkRL01);
        
        pGroup.getChildren().add(groundWalkOL_UR_L);
        pGroup.getChildren().add(groundWalkOL_UR_R);
        pGroup.getChildren().add(groundWalkUL_OR_L);
        pGroup.getChildren().add(groundWalkUL_OR_R);
        
        pGroup.getChildren().add(groundWalkE_B);
        pGroup.getChildren().add(groundWalkE_T);
        pGroup.getChildren().add(groundWalkE_R);
        pGroup.getChildren().add(groundWalkE_L);
        
        pGroup.getChildren().add(ivBorder);
        return pGroup;        
    }
    
    /**
     * Forest
     * @param listener
     * @return 
     */
    private Group loadPaletteImg2(Gui.Listener.EditorChoosePaletteListener listener){
        Group pGroup = new Group();
        pGroup.setVisible(false);
        pGroup.setLayoutX(0);
        pGroup.setLayoutY(650);
        
        ImageView ivBorder = new ImageView(Objekte.getImgMapEditor().getSingleBorderHover());
        listener.setBorder(ivBorder);
        
        ImageView ivPlant01 = new Data.Overwrite.ImageView(Objekte.getImgMap().getPlant01());
        listener.setId(1, 0, 101);
        ImageView ivZaunH01 = new Data.Overwrite.ImageView(Objekte.getImgMap().getZaunH01());
        listener.setId(1, 1, 102);
        ivZaunH01.setLayoutX(25);
        ImageView ivZaunV01 = new Data.Overwrite.ImageView(Objekte.getImgMap().getZaunV01());
        listener.setId(1, 2, 103);
        ivZaunV01.setLayoutX(50);
        ImageView ivZaunOL_UR01 = new Data.Overwrite.ImageView(Objekte.getImgMap().getZaunOL_UR01());
        listener.setId(1, 3, 104);
        ivZaunOL_UR01.setLayoutX(75);
        ImageView ivZaunUL_OR01 = new Data.Overwrite.ImageView(Objekte.getImgMap().getZaunUL_OR01());
        listener.setId(1, 4, 105);
        ivZaunUL_OR01.setLayoutX(100);
        ImageView ivZaunOM_RM01 = new Data.Overwrite.ImageView(Objekte.getImgMap().getZaunOM_RM01());
        listener.setId(1, 5, 106);
        ivZaunOM_RM01.setLayoutX(125);
        ImageView ivZaunLM_UM01 = new Data.Overwrite.ImageView(Objekte.getImgMap().getZaunLM_UM01());
        listener.setId(1, 6, 107);
        ivZaunLM_UM01.setLayoutX(150);
        
        ImageView ivCrystal_kl = new Data.Overwrite.ImageView(Objekte.getImgMap().getCrystal_kl());
        listener.setId(1, 7, 120);
        ivCrystal_kl.setLayoutX(175);
        
        ImageView ivTree01 = new Data.Overwrite.ImageView(Objekte.getImgMap().getTree01());
        listener.setId(1, 8, 150);
        ivTree01.setLayoutX(200);
        
        
        //listener
        ivPlant01.setOnMouseClicked(listener);
        ivZaunH01.setOnMouseClicked(listener);
        ivZaunV01.setOnMouseClicked(listener);
        ivZaunOL_UR01.setOnMouseClicked(listener);
        ivZaunUL_OR01.setOnMouseClicked(listener);
        ivZaunOM_RM01.setOnMouseClicked(listener);
        ivZaunLM_UM01.setOnMouseClicked(listener);
        
        ivCrystal_kl.setOnMouseClicked(listener);
        
        ivTree01.setOnMouseClicked(listener);
        
        //group
        pGroup.getChildren().add(ivPlant01);
        pGroup.getChildren().add(ivZaunH01);
        pGroup.getChildren().add(ivZaunV01);
        pGroup.getChildren().add(ivZaunOL_UR01);
        pGroup.getChildren().add(ivZaunUL_OR01);
        pGroup.getChildren().add(ivZaunOM_RM01);
        pGroup.getChildren().add(ivZaunLM_UM01);
        pGroup.getChildren().add(ivBorder);
        
        pGroup.getChildren().add(ivCrystal_kl);
        
        pGroup.getChildren().add(ivTree01);
        return pGroup;        
    }
    
    /**
     * House
     * @param listener
     * @return 
     */
    private Group loadPaletteImg3(Gui.Listener.EditorChoosePaletteListener listener){
        Group pGroup = new Group();
        pGroup.setVisible(false);
        pGroup.setLayoutX(0);
        pGroup.setLayoutY(650);
        
        ImageView ivBorder = new ImageView(Objekte.getImgMapEditor().getSingleBorder());
        listener.setBorder(ivBorder);
        
        ImageView ivGrasBunch01 = new Data.Overwrite.ImageView(Objekte.getImgMap().getGrasBunch01());
        listener.setId(2, 0, 201);
        ivGrasBunch01.setLayoutX(0);
        ImageView ivGrasBunch02 = new Data.Overwrite.ImageView(Objekte.getImgMap().getGrasBunch02());
        listener.setId(2, 1, 202);
        ivGrasBunch02.setLayoutX(25);
        ImageView ivGrasFlower01 = new Data.Overwrite.ImageView(Objekte.getImgMap().getGrasFlower01());
        listener.setId(2, 2, 203);
        ivGrasFlower01.setLayoutX(50);
        ImageView ivGrasFlowerBunch01 = new Data.Overwrite.ImageView(Objekte.getImgMap().getGrasFlowerBunch01());
        listener.setId(2, 3, 204);
        ivGrasFlowerBunch01.setLayoutX(75);
        
        ivGrasBunch01.setOnMouseClicked(listener);
        ivGrasBunch02.setOnMouseClicked(listener);
        ivGrasFlower01.setOnMouseClicked(listener);
        ivGrasFlowerBunch01.setOnMouseClicked(listener);
        pGroup.getChildren().add(ivGrasBunch01);
        pGroup.getChildren().add(ivGrasBunch02);
        pGroup.getChildren().add(ivGrasFlower01);
        pGroup.getChildren().add(ivGrasFlowerBunch01);
        pGroup.getChildren().add(ivBorder);
        return pGroup;        
    }
    
    public void loadEditorButtons(Group root){
        Group group = new Group();
        group.setLayoutX(730);
        group.setLayoutY(600);
        
        Button b1 = new Button("save");
        b1.setId("save");
        b1.setOnAction(new EditorSaveToDBListener());
        
        Button b2 = new Button("new Map");
        b2.setId("showStage");
        
        EditorNewMapListener enml = new EditorNewMapListener();
        enml.setloadMapObjekt(this);
        b2.setOnAction(enml);
        b2.setLayoutY(25);
        
        group.getChildren().add(b1);
        group.getChildren().add(b2);
        
        root.getChildren().add(group);
    }
    
    public void loadMapNumbers(Group root){
        Group group = new Group();
        group.setLayoutX(600);
        group.setLayoutY(600);
        
        cb = new ChoiceBox();
        loadNumberChoiceBox();
        
        Button b1 = new Button("Go");
        b1.setLayoutY(25);
        Gui.Listener.EditorChangeMapListener editorCML = new Gui.Listener.EditorChangeMapListener();
        editorCML.setChoiceBox(cb);
        b1.setOnAction(editorCML);
        
        Button b2 = new Button("Delete");
        b2.setLayoutY(50);
       
        editorCML.setChoiceBox(cb);
        b1.setOnAction(editorCML);
        
        group.getChildren().add(b1);
        group.getChildren().add(b2);
        group.getChildren().add(cb);
        root.getChildren().add(group);
    }
    
    public void loadNumberChoiceBox(){
        int nr = (Objekte.getMapData().getMapNumberListById(Objekte.getMapData().getCurNumberId())).getNr();
        cb.getItems().clear();
        for(Data.MapNumber mapN : Objekte.getMapData().getMapNumberList()){
            String anzeige = "";
            anzeige+=""+mapN.getNr()+": "+mapN.getName();
            cb.getItems().add(anzeige);
        }
        cb.getSelectionModel().select(nr-1);
    }
}
