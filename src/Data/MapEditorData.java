/*
 * To change this template, choose Tools | Templates and open the template in
 * the editor.
 */
package Data;

import java.util.LinkedList;
import javafx.scene.Group;

/**
 *
 * @author Alex
 */
public class MapEditorData {
    
    private int curPalettChoose = 1;
    private int curPalette=1;
    private Group[] palettGroups = new Group[5];
    
    // [0] = X Wert;  [1] = Y Wert - vom veränderten Objekt
    LinkedList<Integer[]> veraendert= new LinkedList<Integer[]>();
    
    private int curPosX=1;
    private int curPosY=1;

    public Group getPalettGroups(int index) {
        return palettGroups[index];
    }

    public void setPalettGroups(Group palettGroup, int index) {
        this.palettGroups[index] = palettGroup;
    }

    public int getCurPalettChoose() {
        return curPalettChoose;
    }

    public void setCurPalettChoose(int curPalettChoose) {
        this.curPalettChoose = curPalettChoose;
    }
    
    public void setCurPos(int x,int y){
        this.curPosX=x;
        this.curPosY=y;
    }
    public int[] getCurPos(){
        return new int[]{curPosX,curPosY};
    }
    
    public boolean isDrin(int x, int y){
        for (Integer[] i : veraendert){
            if(i[0] == x && i[1] == y )
                return true;
        }
        return false;
    }
   
    public void deleteVeraendert(int x, int y){
        for (Integer[] i : veraendert){
            if(i[0] == x && i[1] == y)
                veraendert.remove(i);
        }
    }
    
    public void addVeraendert(int x, int y, int objekt){
        veraendert.add(new Integer[]{x,y,objekt});
    }

    public LinkedList<Integer[]> getVeraendert() {
        return veraendert;
    }

    public int getCurPalette() {
        return curPalette;
    }

    public void setCurPalette(int curPalette) {
        this.curPalette = curPalette;
    }
    
    
}
