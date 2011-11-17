/*
 * To change this template, choose Tools | Templates and open the template in
 * the editor.
 */
package Logic;

import Data.GameData;
import Data.Images.*;
import Data.MapData;
import Data.MapEditorData;
import Data.PlayerData;
import Logic.DB.InitDB;

/**
 *
 * @author Alex
 */
public class Objekte {
    private static Data.PlayerData playerData = new PlayerData();
    private static Data.GameData gameData= new GameData();
    private static Data.MapEditorData mapEditorData = new MapEditorData();
    
    private static Data.MapData mapData = new MapData();
    
    private static Data.Images.Units imgUnits = new Units();
    private static Data.Images.MapEditor imgMapEditor = new MapEditor();
    private static Data.Images.Map imgMap = new Map();
    
    private static Logic.KollisionCheck kolliCheck = new KollisionCheck();

    private static Logic.DB.InitDB dbInit = new InitDB();
    
    public static Data.Images.Units getImgUnits(){
        return imgUnits;
    }

    public static PlayerData getPlayerData() {
        return playerData;
    }

    public static InitDB getDbInit() {
        return dbInit;
    }

    public static MapEditor getImgMapEditor() {
        return imgMapEditor;
    }

    public static GameData getGameData() {
        return gameData;
    }

    public static MapData getMapData() {
        return mapData;
    }

    public static Map getImgMap() {
        return imgMap;
    }

    public static MapEditorData getMapEditorData() {
        return mapEditorData;
    }
    
    public static KollisionCheck getKolliCheck() {
        return kolliCheck;
    }
}
