package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {
    Button btn1,btn2,btn3;
    HBox hBox;
    VBox vBox;
    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        btn1= new Button("Botón 1");
        btn2= new Button("Botón 2");
        btn3= new Button("Botón 3");
        hBox= new HBox();
        hBox.setSpacing(5.0);
        hBox.getChildren().addAll(btn1,btn2,btn3);

        vBox= new VBox();
        vBox.setSpacing(5.0);
        vBox.getChildren().addAll(btn1,btn2,btn3);

        primaryStage.setTitle("Topicos Avanzados");
        primaryStage.setScene(new Scene(root, 800, 600));
        primaryStage.setScene(new Scene(vBox,200,100));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
