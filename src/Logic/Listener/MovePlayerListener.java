/*
 * To change this template, choose Tools | Templates and open the template in
 * the editor.
 */
package Logic.Listener;

import Logic.Objekte;
import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.scene.image.ImageView;

/**
 *
 * @author Alex
 */
public class MovePlayerListener implements EventHandler<ActionEvent> {

    ImageView imageView;;
    Timeline timeL;
    public void handle(ActionEvent t) {
        if(Objekte.getPlayerData().isAnimation()){
            if(Objekte.getPlayerData().isMoveB()){
                moveB();
            }else if(Objekte.getPlayerData().isMoveL()){
                moveL();
            }else if(Objekte.getPlayerData().isMoveT()){
                moveT();
            }else if(Objekte.getPlayerData().isMoveR()){
                moveR();
            }
        }
        timeL.play();
    }
    
    private void moveL(){
        if(imageView.getX()==-360 || imageView.getY()!=-1530){
            imageView.setX(-90);
            imageView.setY(-1530);
        }else{
            imageView.setX(imageView.getX()-30);
        }
    }
    
    private void moveT(){
        if(imageView.getX()==-360 || imageView.getY()!=-780){
            imageView.setX(-90);
            imageView.setY(-780);
        }else{
            imageView.setX(imageView.getX()-30);
        }
    }
    
    private void moveR(){
        if(imageView.getX()==-270 || imageView.getY()!=-2530){
            imageView.setX(0);
            imageView.setY(-2530);
        }else{
            imageView.setX(imageView.getX()-30);
        }
    }
    
    private void moveB(){
        if(imageView.getX()==-360 || imageView.getY()!=0){
            imageView.setX(-90);
            imageView.setY(0);
        }else{
            imageView.setX(imageView.getX()-30);
        }
    }
    
    public Timeline getTimeline(){
        return timeL;
    }
    
    public void setImageView(ImageView iv){
        this.imageView=iv;
    }
    
    public void setTimeLine(Timeline tl){
        this.timeL = tl;
    }
    
    
}
