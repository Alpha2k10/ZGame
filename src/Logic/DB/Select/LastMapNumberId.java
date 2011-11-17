/*
 * To change this template, choose Tools | Templates and open the template in
 * the editor.
 */
package Logic.DB.Select;

import Logic.Objekte;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Alex
 */
public class LastMapNumberId {
    public int loadLastNumber(int mapId, int nr){
        String query="";
        query+="SELECT id FROM mapNumber WHERE ";
        query+="mapId="+mapId+" AND ";
        query+="number="+nr+";";
        System.out.println(query);
        ResultSet result = Objekte.getDbInit().makeDbQuery(query);
        System.out.println(result);
        try {
            if(result.next())
                return result.getInt("id");
        } catch (SQLException ex) {
            Logger.getLogger(LastMapNumberId.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return -1;
    }
}
