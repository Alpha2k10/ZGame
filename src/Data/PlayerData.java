/*
 * To change this template, choose Tools | Templates and open the template in
 * the editor.
 */
package Data;


import javafx.scene.Group;
import javafx.scene.shape.Rectangle;

/**
 *
 * @author Alex
 */
public class PlayerData {
    
    private int userId=-1;
    
    private boolean animation=true;
    private boolean moveR=false, moveL=false, moveT=false, moveB=false;
    
    private Group playerGroup;
    private Rectangle playerRect;

    public boolean isAnimation() {
        
        return animation;
    }

    public void setAnimation(boolean animation) {
        this.animation = animation;
    }

    public boolean isMoveL() {
        return moveL;
    }

    public void setMoveL(boolean moveL) {
        this.moveL = moveL;
    }

    public boolean isMoveR() {
        return moveR;
    }

    public void setMoveR(boolean moveR) {
        this.moveR = moveR;
    }

    public boolean isMoveT() {
        return moveT;
    }

    public void setMoveT(boolean moveT) {
        this.moveT = moveT;
    }

    public boolean isMoveB() {
        return moveB;
    }

    public void setMoveB(boolean moveB) {
        this.moveB = moveB;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public Group getPlayerGroup() {
        return playerGroup;
    }

    public void setPlayerGroup(Group playerGroup) {
        this.playerGroup = playerGroup;
    }

    public Rectangle getPlayerRect() {
        return playerRect;
    }

    public void setPlayerRect(Rectangle playerRect) {
        this.playerRect = playerRect;
    }
    
}
