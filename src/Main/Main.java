/*
 * To change this template, choose Tools | Templates and open the template in
 * the editor.
 */
package Main;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.stage.Stage;
import javafx.stage.WindowEvent;

/**
 *
 * @author Alex
 */
public class Main extends Application {
    
    private String name="Spiel";
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Application.launch(args);
    }
    
    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle(name);
        primaryStage.setResizable(false);
        
        primaryStage.setOnCloseRequest(new EventHandler<WindowEvent>() {

            public void handle(WindowEvent t) {
                System.exit(0);
            }
        });
        Gui.Haupt gui = new Gui.Haupt();
        
        primaryStage.setScene(gui.getScene());
        primaryStage.show();
    }
}
