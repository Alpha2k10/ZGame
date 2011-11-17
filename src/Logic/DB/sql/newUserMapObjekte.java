/*
 * To change this template, choose Tools | Templates and open the template in
 * the editor.
 */
package Logic.DB.sql;

import Logic.Objekte;

/**
 *
 * @author Alex
 */
public class newUserMapObjekte {
    
    public void newUserMapObjekte(int mapNumberId){
        for (int x=0;x<Objekte.getMapData().getMapSizeX();x++){
            for (int y=0;y<Objekte.getMapData().getMapSizeY();y++){
                String query="";
                query+="INSERT INTO mapObjekte (mapNumberId,x,y,ground) VALUES (";
                query+=""+mapNumberId+",";
                query+=""+x+",";
                query+=""+y+",";
                query+=""+1+");";
                //System.out.println(query);
                int result = Objekte.getDbInit().makeDbUpdate(query);
                //System.out.println(result);
            }
        }
    }
    
}
