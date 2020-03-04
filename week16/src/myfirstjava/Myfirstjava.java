/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myfirstjava;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author hatim
 */
public class Myfirstjava extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        Button btn = new Button();
        Button btn2 = new Button();
        btn.setText("Say 'Hello World'");
        btn2.setText("Bye");
        btn2.setVisible(false);
             Label l =new Label ("enter name:");
             TextField  tfname =new TextField();
        btn.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Hello World!");
                btn.setVisible(false);
                btn2.setVisible(true);
            }
        });
        
        VBox root = new VBox();
        root.getChildren().add(l);
        root.getChildren().add(tfname);
        root.getChildren().add(btn);
        root.getChildren().add(btn2);
        
        Scene scene = new Scene(root, 300, 250);
        
        primaryStage.setTitle("Hello World!");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
