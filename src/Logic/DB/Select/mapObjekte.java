/*
 * To change this template, choose Tools | Templates and open the template in
 * the editor.
 */
package Logic.DB.Select;

import Logic.Objekte;
import java.sql.ResultSet;

/**
 *
 * @author Alex
 */
public class mapObjekte {
    
    
    public ResultSet loadMapObjekte(int mapNumberId){
        String query="";
        query+="SELECT x,y,ground,groundEnv,objekt FROM mapObjekte WHERE ";
        query+="mapNumberId="+mapNumberId+";";
        System.out.println(query);
        ResultSet result = Objekte.getDbInit().makeDbQuery(query);
        System.out.println(result);
        return result;
    }
    
    public ResultSet loadSingleObjekt(int mapNumberId, int x, int y){
        String query="";
        query+="SELECT objekt FROM mapObjekte WHERE ";
        query+="mapNumberId="+mapNumberId+" AND ";
        query+="x="+x+" AND ";
        query+="y="+y+";";
        
        System.out.println(query);
        ResultSet result = Objekte.getDbInit().makeDbQuery(query);
        System.out.println(result);
        return result;
    }
    
    public ResultSet loadSingleGround(int mapNumberId, int x, int y){
        String query="";
        query+="SELECT ground FROM mapObjekte WHERE ";
        query+="mapNumberId="+mapNumberId+" AND ";
        query+="x="+x+" AND ";
        query+="y="+y+";";
        
        System.out.println(query);
        ResultSet result = Objekte.getDbInit().makeDbQuery(query);
        System.out.println(result);
        return result;
    }
    
    public ResultSet loadSingleGroundEnv(int mapNumberId, int x, int y){
        String query="";
        query+="SELECT groundEnv FROM mapObjekte WHERE ";
        query+="mapNumberId="+mapNumberId+" AND ";
        query+="x="+x+" AND ";
        query+="y="+y+";";
        
        System.out.println(query);
        ResultSet result = Objekte.getDbInit().makeDbQuery(query);
        System.out.println(result);
        return result;
    }
}
