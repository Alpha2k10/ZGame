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
public class mapNumber {
    
    public ResultSet loadMapNumbers(int mapId){
        String query="";
        query+="SELECT id,name,number FROM mapNumber WHERE ";
        query+="mapId="+mapId+";";
        System.out.println(query);
        ResultSet result = Objekte.getDbInit().makeDbQuery(query);
        System.out.println(result);
        return result;
    }
    
}
