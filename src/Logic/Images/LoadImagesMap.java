/*
 * To change this template, choose Tools | Templates and open the template in
 * the editor.
 */
package Logic.Images;

import Logic.Objekte;
import javafx.scene.image.Image;

/**
 *
 * @author Alex
 */
public class LoadImagesMap {
    
    public void loadMap(){
        loadGround();
        loadGroundEnv();
        loadForest();
    }
    
    private void loadGround(){
        Image gras = new Image(LoadImagesMap.class.getResourceAsStream("map\\ground\\gras.png"));
        Objekte.getImgMap().setGras(gras);
        
        Image groundWalk01 = new Image(LoadImagesMap.class.getResourceAsStream("map\\ground\\groundWalk01.png"));
        Objekte.getImgMap().setGroundWalk01(groundWalk01);
        
        Image groundWalkRB01 = new Image(LoadImagesMap.class.getResourceAsStream("map\\ground\\groundWalkRB01.png"));
        Objekte.getImgMap().setGroundWalkRB01(groundWalkRB01);
        Image groundWalkRT01 = new Image(LoadImagesMap.class.getResourceAsStream("map\\ground\\groundWalkRT01.png"));
        Objekte.getImgMap().setGroundWalkRT01(groundWalkRT01);
        Image groundWalkRR01 = new Image(LoadImagesMap.class.getResourceAsStream("map\\ground\\groundWalkRR01.png"));
        Objekte.getImgMap().setGroundWalkRR01(groundWalkRR01);
        Image groundWalkRL01 = new Image(LoadImagesMap.class.getResourceAsStream("map\\ground\\groundWalkRL01.png"));
        Objekte.getImgMap().setGroundWalkRL01(groundWalkRL01);
        
        Image groundWalkOL_UR_L = new Image(LoadImagesMap.class.getResourceAsStream("map\\ground\\groundWalkOL_UR_L.png"));
        Objekte.getImgMap().setGroundWalkOL_UR_L(groundWalkOL_UR_L);
        Image groundWalkOL_UR_R = new Image(LoadImagesMap.class.getResourceAsStream("map\\ground\\groundWalkOL_UR_R.png"));
        Objekte.getImgMap().setGroundWalkOL_UR_R(groundWalkOL_UR_R);
        Image groundWalkUL_OR_L = new Image(LoadImagesMap.class.getResourceAsStream("map\\ground\\groundWalkUL_OR_L.png"));
        Objekte.getImgMap().setGroundWalkUL_OR_L(groundWalkUL_OR_L);
        Image groundWalkUL_OR_R = new Image(LoadImagesMap.class.getResourceAsStream("map\\ground\\groundWalkUL_OR_R.png"));
        Objekte.getImgMap().setGroundWalkUL_OR_R(groundWalkUL_OR_R);
        
        Image groundWalkE_B = new Image(LoadImagesMap.class.getResourceAsStream("map\\ground\\groundWalkE_B.png"));
        Objekte.getImgMap().setGroundWalkE_B(groundWalkE_B);
        Image groundWalkE_T = new Image(LoadImagesMap.class.getResourceAsStream("map\\ground\\groundWalkE_T.png"));
        Objekte.getImgMap().setGroundWalkE_T(groundWalkE_T);
        Image groundWalkE_R = new Image(LoadImagesMap.class.getResourceAsStream("map\\ground\\groundWalkE_R.png"));
        Objekte.getImgMap().setGroundWalkE_R(groundWalkE_R);
        Image groundWalkE_L = new Image(LoadImagesMap.class.getResourceAsStream("map\\ground\\groundWalkE_L.png"));
        Objekte.getImgMap().setGroundWalkE_L(groundWalkE_L);
    }
    
    private void loadGroundEnv(){
        Image grasBunch01 = new Image(LoadImagesMap.class.getResourceAsStream("map\\gEnv\\grasBunch01.png"));
        Objekte.getImgMap().setGrasBunch01(grasBunch01);
        Image grasBunch02 = new Image(LoadImagesMap.class.getResourceAsStream("map\\gEnv\\grasBunch02.png"));
        Objekte.getImgMap().setGrasBunch02(grasBunch02);
        Image grasFlower01 = new Image(LoadImagesMap.class.getResourceAsStream("map\\gEnv\\grasFlower01.png"));
        Objekte.getImgMap().setGrasFlower01(grasFlower01);
        Image grasFlowerBunch01 = new Image(LoadImagesMap.class.getResourceAsStream("map\\gEnv\\grasFlowerBunch01.png"));
        Objekte.getImgMap().setGrasFlowerBunch01(grasFlowerBunch01);
    }
    
    private void loadForest(){
        Image plant01 = new Image(LoadImagesMap.class.getResourceAsStream("map\\forest\\plant01.png"));
        Objekte.getImgMap().setPlant01(plant01);
        Image zaunH01 = new Image(LoadImagesMap.class.getResourceAsStream("map\\forest\\zaunH01.png"));
        Objekte.getImgMap().setZaunH01(zaunH01);
        Image zaunV01 = new Image(LoadImagesMap.class.getResourceAsStream("map\\forest\\zaunV01.png"));
        Objekte.getImgMap().setZaunV01(zaunV01);
        Image zaunOL_UR01 = new Image(LoadImagesMap.class.getResourceAsStream("map\\forest\\zaunOL_UR01.png"));
        Objekte.getImgMap().setZaunOL_UR01(zaunOL_UR01);
        Image zaunUL_OR01 = new Image(LoadImagesMap.class.getResourceAsStream("map\\forest\\zaunUL_OR01.png"));
        Objekte.getImgMap().setZaunUL_OR01(zaunUL_OR01);
        Image zaunOM_RM01 = new Image(LoadImagesMap.class.getResourceAsStream("map\\forest\\zaunOM_RM01.png"));
        Objekte.getImgMap().setZaunOM_RM01(zaunOM_RM01);
        Image zaunLM_UM01 = new Image(LoadImagesMap.class.getResourceAsStream("map\\forest\\zaunLM_UM01.png"));
        Objekte.getImgMap().setZaunLM_UM01(zaunLM_UM01);
        
        Image crystal_kl = new Image(LoadImagesMap.class.getResourceAsStream("map\\forest\\crystal_kl.png"));
        Objekte.getImgMap().setCrystal_kl(crystal_kl);
        
        Image tree01 = new Image(LoadImagesMap.class.getResourceAsStream("map\\forest\\tree01.png"));
        Objekte.getImgMap().setTree01(tree01);
    }
}
