package OOP2Lab1;
 

import com.sun.prism.paint.Color;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
 
public class OOP2Lab1 extends Application {
    public static void main(String[] args) {
        launch(args);
    }
    
    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Lab1");
        Rectangle rec = new Rectangle();
        //set the colour of the rectangle
        rec.setFill(javafx.scene.paint.Color.RED);
        rec.setStroke(javafx.scene.paint.Color.RED);
        //setup size and position of the rectangle/square
        rec.setHeight(200);
        rec.setWidth(200);
        rec.setX(350.0f); 
        rec.setY(35.0f); 
        Circle cir = new Circle();
        //set the colour of the circle
        cir.setFill(javafx.scene.paint.Color.GREEN);
        cir.setStroke(javafx.scene.paint.Color.GREEN);
        //setup size and position of the circle
        cir.setCenterX(150.0f); 
        cir.setCenterY(135.0f); 
        cir.setRadius(100.0f); 
        //set up a pane for the circle
        Pane circle = new Pane();
        //add circle to the pane
        circle.getChildren().add(cir);
        //set up a pane for the rectangle/square
        Pane square = new Pane();
        //add rectangle/square to the pane
        square.getChildren().add(rec);
        //set up a grid pane to contain the other two panes
        GridPane root = new GridPane();
        //add the circle and squre panes to the grid pane
        root.getChildren().add(circle);
        root.getChildren().add(square);
        primaryStage.setScene(new Scene(root, 600, 300));
        primaryStage.show();
    }
}