/*
 * To change this template, choose Tools | Templates and open the template in
 * the editor.
 */
package Gui.Listener;

import Logic.Objekte;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;

/**
 *
 * @author Alex
 */
public class EditorMapClickListener implements EventHandler<MouseEvent> {

    private Group groupGround;
    private Group groupGroundEnv;
    private Group groupObjekte;
    
    public void handle(MouseEvent t) {
        int x=Objekte.getMapEditorData().getCurPos()[0];
        int y=Objekte.getMapEditorData().getCurPos()[1];
        int index = (x)+(y)*Objekte.getMapData().getMapSizeX();
        
        //groupGround.getChildren().remove(index);
        switch(Objekte.getMapEditorData().getCurPalettChoose()){
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
            case 101: 
                placePlant01(x,y);
                break;
            case 102:
                placeZaunH01(x, y);
                break;
            case 103:
                placeZaunV01(x,y);
                break;
            case 104:
                placeZaunOL_UR01(x,y);
                break;
            case 105:
                placeZaunUL_OR01(x,y);
                break;
            case 106:
                placeZaunOM_RM01(x, y);
                break;
            case 107:
                placeZaunLM_UM01(x, y);
                break;
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
                case 120:
                placeCrystal_kl(x, y);
                break;
            case 150:
                placeTree01(x, y);
                break;
        }
        
        System.out.println(index+" "+groupObjekte.getChildren().size()+" "+Objekte.getMapEditorData().getVeraendert().size());
        
    }
    
    private void placeGras01(int x, int y){
        ImageView iv = new ImageView(Objekte.getImgMap().getGras());
        placeBoden(iv, x, y, 1);
    }
    
    private void placeGroundWalk01(int x, int y){
        ImageView iv = new ImageView(Objekte.getImgMap().getGroundWalk01());
        placeBoden(iv, x, y,20);
    }
    
    private void placeGroundWalkRB01(int x, int y){
        ImageView iv = new ImageView(Objekte.getImgMap().getGroundWalkRB01());
        placeBoden(iv, x, y,21);
    }
    
    private void placeGroundWalkRT01(int x, int y){
        ImageView iv = new ImageView(Objekte.getImgMap().getGroundWalkRT01());
        placeBoden(iv, x, y,22);
    }
    
    private void placeGroundWalkRR01(int x, int y){
        ImageView iv = new ImageView(Objekte.getImgMap().getGroundWalkRR01());
        placeBoden(iv, x, y,23);
    }
    
    private void placeGroundWalkRL01(int x, int y){
        ImageView iv = new ImageView(Objekte.getImgMap().getGroundWalkRL01());
        placeBoden(iv, x, y,24);
    }
    
    private void placeGroundWalkOL_UR_L(int x, int y){
        ImageView iv = new ImageView(Objekte.getImgMap().getGroundWalkOL_UR_L());
        placeBoden(iv, x, y,25);
    }
    
    private void placeGroundWalkOL_UR_R(int x, int y){
        ImageView iv = new ImageView(Objekte.getImgMap().getGroundWalkOL_UR_R());
        placeBoden(iv, x, y,26);
    }
    
    private void placeGroundWalkUL_OR_L(int x, int y){
        ImageView iv = new ImageView(Objekte.getImgMap().getGroundWalkUL_OR_L());
        placeBoden(iv, x, y,27);
    }
    
    private void placeGroundWalkUL_OR_R(int x, int y){
        ImageView iv = new ImageView(Objekte.getImgMap().getGroundWalkUL_OR_R());
        placeBoden(iv, x, y,28);
    }
    
    private void placeGroundWalkE_B(int x, int y){
        ImageView iv = new ImageView(Objekte.getImgMap().getGroundWalkE_B());
        placeBoden(iv, x, y,29);
    }
    
    private void placeGroundWalkE_T(int x, int y){
        ImageView iv = new ImageView(Objekte.getImgMap().getGroundWalkE_T());
        placeBoden(iv, x, y,30);
    }
    
    private void placeGroundWalkE_R(int x, int y){
        ImageView iv = new ImageView(Objekte.getImgMap().getGroundWalkE_R());
        placeBoden(iv, x, y,31);
    }
    
    private void placeGroundWalkE_L(int x, int y){
        ImageView iv = new ImageView(Objekte.getImgMap().getGroundWalkE_L());
        placeBoden(iv, x, y,32);
    }
    
    private void placeBoden(ImageView iv,int x, int y, int objektId){
        if(Objekte.getGameData().isEditorOn())
            iv.setOnMouseClicked(Gui.Map.getEditListener());
        iv.setLayoutX(x*25);
        iv.setLayoutY(y*25);
        if(groupGround.getChildren().contains(iv)){
            groupGround.getChildren().remove(iv);
        }
        if(Objekte.getMapEditorData().isDrin(x, y))
            Objekte.getMapEditorData().deleteVeraendert(x, y);
        Objekte.getMapEditorData().addVeraendert(x, y, objektId);
        groupGround.getChildren().add(iv);
    }
    
    private void placeGrasBunch01(int x, int y){
        ImageView iv = new ImageView(Objekte.getImgMap().getGrasBunch01());
        placeBodenEnv(iv, x, y,201);
    }
    
    private void placeGrasBunch02(int x, int y){
        ImageView iv = new ImageView(Objekte.getImgMap().getGrasBunch02());
        placeBodenEnv(iv, x, y,202);
    }
    
    private void placeGrasFlower01(int x, int y){
        ImageView iv = new ImageView(Objekte.getImgMap().getGrasFlower01());
        placeBodenEnv(iv, x, y,203);
    }
    
    private void placeGrasFlowerBunch01(int x, int y){
        ImageView iv = new ImageView(Objekte.getImgMap().getGrasFlowerBunch01());
        placeBodenEnv(iv, x, y,204);
    }
    
    private void placeBodenEnv(ImageView iv,int x, int y, int objektId){
        if(Objekte.getGameData().isEditorOn())
            iv.setOnMouseClicked(Gui.Map.getEditListener());
        iv.setLayoutX(x*25);
        iv.setLayoutY(y*25);
        if(groupGroundEnv.getChildren().contains(iv)){
            groupGroundEnv.getChildren().remove(iv);
        }
        if(Objekte.getMapEditorData().isDrin(x, y))
            Objekte.getMapEditorData().deleteVeraendert(x, y);
        Objekte.getMapEditorData().addVeraendert(x, y, objektId);
        
        groupGroundEnv.getChildren().add(iv);
    }
    
    private void placePlant01(int x, int y){
        Data.Overwrite.ImageView iv = new Data.Overwrite.ImageView(Objekte.getImgMap().getPlant01());
        placeObjekt(iv, x, y, 101);
    }
    
    private void placeZaunH01(int x, int y){
        Data.Overwrite.ImageView iv = new Data.Overwrite.ImageView(Objekte.getImgMap().getZaunH01());
        placeObjekt(iv, x, y,102);
    }
    
    private void placeZaunV01(int x, int y){
        Data.Overwrite.ImageView iv = new Data.Overwrite.ImageView(Objekte.getImgMap().getZaunV01());
        placeObjekt(iv, x, y,103);
    }
    
    private void placeZaunOL_UR01(int x, int y){
        Data.Overwrite.ImageView iv = new Data.Overwrite.ImageView(Objekte.getImgMap().getZaunOL_UR01());
        placeObjekt(iv, x, y,104);
    }
    
    private void placeZaunUL_OR01(int x, int y){
        Data.Overwrite.ImageView iv = new Data.Overwrite.ImageView(Objekte.getImgMap().getZaunUL_OR01());
        placeObjekt(iv, x, y,105);
    }
    
    private void placeZaunOM_RM01(int x, int y){
        Data.Overwrite.ImageView iv = new Data.Overwrite.ImageView(Objekte.getImgMap().getZaunOM_RM01());
        placeObjekt(iv, x, y,106);
    }
    
    private void placeZaunLM_UM01(int x, int y){
        Data.Overwrite.ImageView iv = new Data.Overwrite.ImageView(Objekte.getImgMap().getZaunLM_UM01());
        placeObjekt(iv, x, y,107);
    }
    
    private void placeCrystal_kl(int x, int y){
        Data.Overwrite.ImageView iv = new Data.Overwrite.ImageView(Objekte.getImgMap().getCrystal_kl());
        placeObjekt(iv, x, y,120);
    }
    
    private void placeTree01(int x, int y){
        Data.Overwrite.ImageView iv = new Data.Overwrite.ImageView(Objekte.getImgMap().getTree01());
        placeObjekt(iv, x, y,150);
    }
    
    private void placeObjekt(Data.Overwrite.ImageView iv,int x, int y, int objektId){
        if(Objekte.getGameData().isEditorOn())
            iv.setOnMouseClicked(Gui.Map.getEditListener());
            iv.setLayoutX(x*25);
            iv.setLayoutY(y*25);
        if(groupObjekte.getChildren().contains(iv)){
            groupObjekte.getChildren().remove(iv);
        }
        if(Objekte.getMapEditorData().isDrin(x, y))
            Objekte.getMapEditorData().deleteVeraendert(x, y);
        Objekte.getMapEditorData().addVeraendert(x, y, objektId);
        
        groupObjekte.getChildren().add(iv);
    }
    
    public void setGroupGround(Group g){
        this.groupGround=g;
    }
    public void setGroupObjekte(Group g){
        this.groupObjekte = g;
    }
    
    public void setGroupGroundEnv(Group g){
        this.groupGroundEnv = g;
    }
}
