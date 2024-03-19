
package javaui;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Lable_Example extends Application {
    @Override
    public void start(Stage primaryStage){
        StackPane root=new StackPane();
        Button btn=new Button();
        Scene scene =new Scene(root,300,300);
        root.getChildren().add(btn);
        primaryStage.setScene(scene);
         primaryStage.setTitle("button class example");
             
        }
    public static void main(String[] args){
        
        launch(args);
    }
    
}
