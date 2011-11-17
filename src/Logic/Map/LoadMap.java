/*
 * To change this template, choose Tools | Templates and open the template in
 * the editor.
 */
package Logic.Map;

import Logic.Objekte;
import java.sql.Array;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Alex
 */
public class LoadMap {
    
    public void loadMap(){
        loadMapNumberFromDb();
        if(Objekte.getMapData().getCurNumberId()<0)
            Objekte.getMapData().setCurNumberId(Objekte.getMapData().getFirstMapNumberId());
        loadMapFromDb();
    }
    
    private void loadMapNumberFromDb(){
        // Löscht objekte aus der map liste
        Objekte.getMapData().refreshMapNumberList();
        
        Logic.DB.Select.mapNumber mn = new Logic.DB.Select.mapNumber();
        
        ResultSet result = mn.loadMapNumbers(Objekte.getMapData().getMapId());
        int id;
        String name;
        int number;
        
        try {
            while(result.next()){
                id = result.getInt("id");
                number = result.getInt("number");
                name = result.getString("name");
                Objekte.getMapData().addMapNumber(id, number, name);
            }
        } catch (SQLException ex) {
            Logger.getLogger(LoadMap.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    private void loadMapFromDb(){
        
        Logic.DB.Select.mapObjekte mo = new Logic.DB.Select.mapObjekte();
        ResultSet result = mo.loadMapObjekte(Objekte.getMapData().getCurNumberId());
        
        int sizeX = Objekte.getMapData().getMapSizeX();
        int sizeY = Objekte.getMapData().getMapSizeY();
        int boden[][] = new int[sizeX][sizeY];
        int bodenEnv[][] = new int[sizeX][sizeY];
        int objekt[][] = new int[sizeX][sizeY];
        try {
            while(result.next()){
                boden[result.getInt("x")][result.getInt("y")] = result.getInt("ground");
                bodenEnv[result.getInt("x")][result.getInt("y")] = result.getInt("groundEnv");
                objekt[result.getInt("x")][result.getInt("y")] = result.getInt("objekt");
            }
            Objekte.getMapData().setMapBoden(boden);
            Objekte.getMapData().setMapBodenEnv(bodenEnv);
            Objekte.getMapData().setMapObjekte(objekt);
            
        } catch (SQLException ex) {
            Logger.getLogger(LoadMap.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
