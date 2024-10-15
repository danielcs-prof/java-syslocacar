package edu.syslocacar;

import edu.syslocacar.controller.MainController;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.FileInputStream;
import java.io.IOException;

public class MainApp extends Application {

    private static Scene scene;
    private static Stage stage;

    @Override
    public void start(Stage stage) throws IOException {
        String pathView = "E:\\dev\\Projetos-Java\\syslocacar\\src\\main\\java\\edu\\syslocacar\\view\\MainView.fxml";
        FXMLLoader fxmlLoader = new FXMLLoader();

        //fxmlLoader.setRoot(scrollPaneMain);
        Parent root = fxmlLoader.load(new FileInputStream(pathView));
        scene = new Scene(root, 800, 550);

        ScrollPane scrollPane = (ScrollPane) scene.getRoot();
        scrollPane.setFitToHeight(true);
        scrollPane.setFitToWidth(true);
        stage.setTitle("SYSLocaCar!");
        stage.setScene(scene);
        stage.show();
    }

    public static Scene getScene(){
        return  scene;
    }

    public static void main(String[] args) {
        launch();
    }
}