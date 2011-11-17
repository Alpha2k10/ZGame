/*
 * To change this template, choose Tools | Templates and open the template in
 * the editor.
 */
package Logic.DB.Insert;

import Logic.Objekte;

/**
 *
 * @author Alex
 */
public class mapObjekte {
    
    // weg
    public void insertMapObjekt(int mapId,int mapNr, int x, int y){
        String query="";
        query+="INSERT INTO mapObjekte (mapId,x,y,ground) VALUES (";
        query+=""+mapId+",";
        query+=""+x+",";
        query+=""+y+",";
        query+=""+1+");";
        System.out.println(query);
        int result = Objekte.getDbInit().makeDbUpdate(query);
        System.out.println(result);
    }
}
