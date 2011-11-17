/*
 * To change this template, choose Tools | Templates and open the template in
 * the editor.
 */
package Data;

import java.util.ArrayList;
import javafx.scene.Node;

/**
 *
 * @author Alex
 */
public class MapData {
    
    private int mapSizeX=32;
    private int mapSizeY=24;
    private int mapId=-1;
    private int curNumberId=-1;
    
    private int[][] mapBoden;
    private int[][] mapBodenEnv;
    private int[][] mapObjekte;
    
    private ArrayList<MapNumber> mapNumberList = new ArrayList<MapNumber>();
    private ArrayList<javafx.scene.Node> blockList = new ArrayList<javafx.scene.Node>();

    public int getMapSizeX() {
        return mapSizeX;
    }

    public void setMapSizeX(int mapSizeX) {
        this.mapSizeX = mapSizeX;
    }

    public int getMapSizeY() {
        return mapSizeY;
    }

    public void setMapSizeY(int mapSizeY) {
        this.mapSizeY = mapSizeY;
    }

    public int getMapId() {
        return mapId;
    }

    public void setMapId(int mapId) {
        this.mapId = mapId;
    }

    public int[][] getMapObjekte() {
        return mapObjekte;
    }

    public void setMapObjekte(int[][] mapObjekte) {
        this.mapObjekte = mapObjekte;
    }

    public int[][] getMapBoden() {
        return mapBoden;
    }

    public int[][] getMapBodenEnv() {
        return mapBodenEnv;
    }

    public void setMapBodenEnv(int[][] mapBodenEnv) {
        this.mapBodenEnv = mapBodenEnv;
    }

    public void setMapBoden(int[][] mapBoden) {
        this.mapBoden = mapBoden;
    }
    
    public void addBlock(javafx.scene.Node node){
        this.blockList.add(node);
    }

    public ArrayList<Node> getBlockList() {
        return blockList;
    }
    
    public MapNumber getMapNumberListByNumber(int number){
        for(MapNumber mnl : mapNumberList){
            if(mnl.getNr() == number)
                return mnl;
        }
        return null;
    }
    
    public MapNumber getMapNumberListById(int id){
        for(MapNumber mnl : mapNumberList){
            if(mnl.getId() == id)
                return mnl;
        }
        return null;
    }

    public ArrayList<MapNumber> getMapNumberList() {
        return mapNumberList;
    }
    
    public void addMapNumber(int id, int nr, String name){
        mapNumberList.add(new MapNumber(id, nr, name));
    }
    
    public void deleteMapNumber(int id){
        for(MapNumber mnl : mapNumberList){
            if(mnl.getId() == id)
                mapNumberList.remove(mnl);
        }
    }
    
    public void refreshMapNumberList(){
        this.mapNumberList = new ArrayList<MapNumber>();
    }
    
    public int getFirstMapNumberId(){
        if(mapNumberList.isEmpty())
            return -1;
        return mapNumberList.get(0).getId();
    }

    public int getCurNumberId() {
        return curNumberId;
    }

    public void setCurNumberId(int curNumberId) {
        this.curNumberId = curNumberId;
    }
    
    
}
