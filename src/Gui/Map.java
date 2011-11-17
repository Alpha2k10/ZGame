/*
 * To change this template, choose Tools | Templates and open the template in
 * the editor.
 */
package Gui;

import Gui.Listener.EditorMapClickListener;
import Logic.Images.LoadImagesMap;
import Logic.Objekte;
import javafx.scene.Group;
import javafx.scene.image.ImageView;

/**
 *
 * @author Alex
 */
public class Map {
    
    private static Gui.Listener.EditorMapClickListener editListener = null;
    
    private Group groupObjekte;
    private Group groupGroundEnv;
    private Group groupGround;
    
    private Group root;
    
    public Map(){
        
    }
    
    public void reloadMap(){
        root.getChildren().remove(groupGround);
        root.getChildren().remove(groupGroundEnv);
        root.getChildren().remove(groupObjekte);
        loadMap(root);
        
        
    }
    
    public void loadMap(Group root){
        this.root = root;
        Logic.Map.LoadMap loadMapDB = new Logic.Map.LoadMap();
        loadMapDB.loadMap();
        
        
        int sizeX = Objekte.getMapData().getMapSizeX();
        int sizeY = Objekte.getMapData().getMapSizeY();
        
        groupGround = new Group();
        groupGroundEnv = new Group();
        groupObjekte = new Group();   
        
        if(Objekte.getGameData().isEditorOn()){
            editListener = new Gui.Listener.EditorMapClickListener();
            editListener.setGroupGround(groupGround);
            editListener.setGroupGroundEnv(groupGroundEnv);
            editListener.setGroupObjekte(groupObjekte);
        
        }
        int[][] boden = Objekte.getMapData().getMapBoden();
        int[][] bodenEnv = Objekte.getMapData().getMapBodenEnv();
        int[][] objekte = Objekte.getMapData().getMapObjekte();
        
        for (int y=0;y<sizeY;y++){
            for (int x=0;x<sizeX;x++){
                switch (boden[x][y]){
                    case 1: // gras
                        placeGras01(x, y);
                        break;
                    case 20:
                        placeGroundWalk01(x, y);
                        break;
                    case 21:
                        placeGroundWalkRB01(x, y);
                        break;
                    case 22:
                        placeGroundWalkRT01(x, y);
                        break;
                    case 23:
                        placeGroundWalkRR01(x, y);
                        break;
                    case 24:
                        placeGroundWalkRL01(x, y);
                        break;
                    case 25:
                        placeGroundWalkOL_UR_L(x, y);
                        break;
                    case 26:
                        placeGroundWalkOL_UR_R(x, y);
                        break;
                    case 27:
                        placeGroundWalkUL_OR_L(x, y);
                        break;
                    case 28:
                        placeGroundWalkUL_OR_R(x, y);
                        break;
                    case 29:
                        placeGroundWalkE_B(x, y);
                        break;
                    case 30:
                        placeGroundWalkE_T(x, y);
                        break;
                    case 31:
                        placeGroundWalkE_R(x, y);
                        break;
                    case 32:
                        placeGroundWalkE_L(x, y);
                        break;
                }
                switch (bodenEnv[x][y]){
                    case 201:
                        placeGrasBunch01(x, y);
                        break;
                    case 202:
                        placeGrasBunch02(x, y);
                        break;
                    case 203:
                        placeGrasFlower01(x, y);
                        break;
                    case 204:
                        placeGrasFlowerBunch01(x, y);
                        break;
                }
                switch (objekte[x][y]){
                    case 0: // leer
                        break;
                    case 101: //plant
                        placePlant01(x, y);
                        break;
                    case 102:
                        placeZaunH01(x, y);
                        break;
                    case 103:
                        placeZaunV01(x, y);
                        break;
                    case 104:
                        placeZaunOL_UR01(x, y);
                        break;
                    case 105:
                        placeZaunUL_OR01(x, y);
                        break;                
                    case 106:
                        placeZaunOM_RM01(x,y);
                        break;
                    case 107:
                        placeZaunLM_UM01(x,y);
                        break;
                    case 120:
                        placeCrystal_kl(x, y);
                        break;
                    case 150:
                        placeTree01(x, y);
                        break;
                }
            }
        }
        groupGround.setVisible(true);
        root.getChildren().add(1,groupGround);
        root.getChildren().add(2,groupGroundEnv);
        root.getChildren().add(3,groupObjekte);
    }
    
    private void placeGras01(int x, int y){
        ImageView iv = new ImageView(Objekte.getImgMap().getGras());
        placeBoden(iv, x, y);
    }
    
    private void placeGroundWalk01(int x, int y){
        ImageView iv = new ImageView(Objekte.getImgMap().getGroundWalk01());
        placeBoden(iv, x, y);
    }
    
    private void placeGroundWalkRB01(int x, int y){
        ImageView iv = new ImageView(Objekte.getImgMap().getGroundWalkRB01());
        placeBoden(iv, x, y);
    }
    
    private void placeGroundWalkRT01(int x, int y){
        ImageView iv = new ImageView(Objekte.getImgMap().getGroundWalkRT01());
        placeBoden(iv, x, y);
    }
    
    private void placeGroundWalkRR01(int x, int y){
        ImageView iv = new ImageView(Objekte.getImgMap().getGroundWalkRR01());
        placeBoden(iv, x, y);
    }
    
    private void placeGroundWalkRL01(int x, int y){
        ImageView iv = new ImageView(Objekte.getImgMap().getGroundWalkRL01());
        placeBoden(iv, x, y);
    }
    
    private void placeGroundWalkOL_UR_L(int x, int y){
        ImageView iv = new ImageView(Objekte.getImgMap().getGroundWalkOL_UR_L());
        placeBoden(iv, x, y);
    }
    
    private void placeGroundWalkOL_UR_R(int x, int y){
        ImageView iv = new ImageView(Objekte.getImgMap().getGroundWalkOL_UR_R());
        placeBoden(iv, x, y);
    }
    
    private void placeGroundWalkUL_OR_R(int x, int y){
        ImageView iv = new ImageView(Objekte.getImgMap().getGroundWalkUL_OR_R());
        placeBoden(iv, x, y);
    }
    
    private void placeGroundWalkUL_OR_L(int x, int y){
        ImageView iv = new ImageView(Objekte.getImgMap().getGroundWalkUL_OR_L());
        placeBoden(iv, x, y);
    }
    
    private void placeGroundWalkE_B(int x, int y){
        ImageView iv = new ImageView(Objekte.getImgMap().getGroundWalkE_B());
        placeBoden(iv, x, y);
    }
    
    private void placeGroundWalkE_T(int x, int y){
        ImageView iv = new ImageView(Objekte.getImgMap().getGroundWalkE_T());
        placeBoden(iv, x, y);
    }
    
    private void placeGroundWalkE_R(int x, int y){
        ImageView iv = new ImageView(Objekte.getImgMap().getGroundWalkE_R());
        placeBoden(iv, x, y);
    }
    
    private void placeGroundWalkE_L(int x, int y){
        ImageView iv = new ImageView(Objekte.getImgMap().getGroundWalkE_L());
        placeBoden(iv, x, y);
    }
    
    private void placeBoden(ImageView iv,int x, int y){
        if(Objekte.getGameData().isEditorOn())
            iv.setOnMouseClicked(editListener);
        iv.setLayoutX(x*25);
        iv.setLayoutY(y*25);
        iv.setVisible(true);
        groupGround.getChildren().add(iv);
    }
    
    private void placeGrasBunch01(int x, int y){
        ImageView iv = new ImageView(Objekte.getImgMap().getGrasBunch01());
        placeBodenEnv(iv, x, y);
    }
    
    private void placeGrasBunch02(int x, int y){
       ImageView iv = new ImageView(Objekte.getImgMap().getGrasBunch02());
        placeBodenEnv(iv, x, y);
    }
    
    private void placeGrasFlower01(int x, int y){
        ImageView iv = new ImageView(Objekte.getImgMap().getGrasFlower01());
        placeBodenEnv(iv, x, y);
    }
    
    private void placeGrasFlowerBunch01(int x, int y){
        ImageView iv = new ImageView(Objekte.getImgMap().getGrasFlowerBunch01());
        placeBodenEnv(iv, x, y);
    }
    
    private void placeBodenEnv(ImageView iv, int x, int y){
        if(Objekte.getGameData().isEditorOn())
            iv.setOnMouseClicked(Gui.Map.getEditListener());
        iv.setLayoutX(x*25);
        iv.setLayoutY(y*25);
        groupGroundEnv.getChildren().add(iv);
    }
    
    private void placePlant01(int x, int y){
        Data.Overwrite.ImageView iv = new Data.Overwrite.ImageView(Objekte.getImgMap().getPlant01());
        placeObjekt(iv, x, y);
    }
    
    private void placeZaunH01(int x, int y){
        Data.Overwrite.ImageView iv = new Data.Overwrite.ImageView(Objekte.getImgMap().getZaunH01());
        placeObjekt(iv, x, y);
    }
    
    private void placeZaunV01(int x, int y){
        Data.Overwrite.ImageView iv = new Data.Overwrite.ImageView(Objekte.getImgMap().getZaunV01());
        placeObjekt(iv, x, y);
    }
    
    private void placeZaunOL_UR01(int x, int y){
        Data.Overwrite.ImageView iv = new Data.Overwrite.ImageView(Objekte.getImgMap().getZaunOL_UR01());
        placeObjekt(iv, x, y);
    }
    
    private void placeZaunUL_OR01(int x, int y){
        Data.Overwrite.ImageView iv = new Data.Overwrite.ImageView(Objekte.getImgMap().getZaunUL_OR01());
        placeObjekt(iv, x, y);
    }
    
    private void placeZaunOM_RM01(int x, int y){
        Data.Overwrite.ImageView iv = new Data.Overwrite.ImageView(Objekte.getImgMap().getZaunOM_RM01());
        placeObjekt(iv, x, y);
    }
    
    private void placeZaunLM_UM01(int x, int y){
        Data.Overwrite.ImageView iv = new Data.Overwrite.ImageView(Objekte.getImgMap().getZaunLM_UM01());
        placeObjekt(iv, x, y);
    }
    
    private void placeCrystal_kl(int x, int y){
        Data.Overwrite.ImageView iv = new Data.Overwrite.ImageView(Objekte.getImgMap().getCrystal_kl());
        placeObjekt(iv, x, y);
    }
    
    private void placeTree01(int x, int y){
        Data.Overwrite.ImageView iv = new Data.Overwrite.ImageView(Objekte.getImgMap().getTree01());
        placeObjekt(iv, x, y);
    }
    
    private void placeObjekt(Data.Overwrite.ImageView iv,int x, int y){
        if(Objekte.getGameData().isEditorOn())
            iv.setOnMouseClicked(Gui.Map.getEditListener());
        iv.setLayoutX(x*25);
        iv.setLayoutY(y*25);
        Objekte.getMapData().addBlock((javafx.scene.Node) iv);

        groupObjekte.getChildren().add(iv);
    }

    public static EditorMapClickListener getEditListener() {
        return editListener;
    }
    
}
