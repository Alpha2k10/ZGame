/*
 * To change this template, choose Tools | Templates and open the template in
 * the editor.
 */
package Logic.DB.Update;

import Logic.Objekte;

/**
 *
 * @author Alex
 */
public class mapObjekte {
    
   
    public void updateMapObjekt(int mapNumberId, int x, int y, int objekt ){
        String query="";
        query+="UPDATE mapObjekte SET objekt="+objekt+" ";
        query+="WHERE mapNumberId="+mapNumberId+" AND ";
        query+="x="+x+" AND ";
        query+="y="+y+";";
        System.out.println(query);
        int result = Objekte.getDbInit().makeDbUpdate(query);
        System.out.println(result);
    }
    
    public void updateMapGroundEnv(int mapNumberId, int x, int y, int objekt){
        String query="";
        query+="UPDATE mapObjekte SET groundEnv="+objekt+" ";
        query+="WHERE mapNumberId="+mapNumberId+" AND ";
        query+="x="+x+" AND ";
        query+="y="+y+";";
        System.out.println(query);
        int result = Objekte.getDbInit().makeDbUpdate(query);
        System.out.println(result);
    }
    
    public void updateMapGround(int mapNumberId, int x, int y, int objekt){
        String query="";
        query+="UPDATE mapObjekte SET ground="+objekt+" ";
        query+="WHERE mapNumberId="+mapNumberId+" AND ";
        query+="x="+x+" AND ";
        query+="y="+y+";";
        System.out.println(query);
        int result = Objekte.getDbInit().makeDbUpdate(query);
        System.out.println(result);
    }
}
