package myfirstjava;

import java.util.InputMismatchException;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import javafx.geometry.Pos;
import javafx.scene.input.KeyCode;

public class sob40 extends Application {
protected TextField tfCelsius = new TextField();
protected TextField tfFarenheit = new TextField();

@Override 
public void start(Stage primaryStage) {
        
        tfCelsius.setAlignment(Pos.BOTTOM_RIGHT);
        tfFarenheit.setAlignment(Pos.BOTTOM_RIGHT);

        
        GridPane pane = new GridPane();
        pane.setAlignment(Pos.CENTER);
        pane.add(new Label("Celsius"), 0, 0);
        pane.add(tfCelsius, 1, 0);
        pane.add(new Label("Farenheit"), 0, 1);
        pane.add(tfFarenheit, 1, 1);
        
        tfCelsius.setOnKeyPressed(e -> {
                if (e.getCode() == KeyCode.ENTER && tfCelsius.getText().length() > 0) {
                    try{
                        double celsius = Double.parseDouble(tfCelsius.getText());
                        tfFarenheit.setText(String.valueOf((celsius * 9/5) + 32));
                }catch (NumberFormatException a){
                    
                    tfFarenheit.setText("Wrong format!");
                   // error.setText("Wrong format!");
                    
                }
                }
        });

        tfFarenheit.setOnKeyPressed(e -> {if (e.getCode() == KeyCode.ENTER && tfFarenheit.getText().length() > 0)
                {
                   try{
                    double farenheit = Double.parseDouble(tfFarenheit.getText());
                        tfCelsius.setText(String.valueOf((farenheit-32)*5/9));
                }
                    catch (NumberFormatException a){
                    
                    tfCelsius.setText("Wrong format!");
                    }                
                }
        }
        );

        
        Scene scene = new Scene(pane, 300, 150);
        primaryStage.setTitle("sob40"); 
        primaryStage.setScene(scene); 
        primaryStage.show(); 
    
}
    
public static void main(String[] args) {
        launch(args);
    }
}