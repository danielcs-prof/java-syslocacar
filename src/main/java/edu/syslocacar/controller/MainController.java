package edu.syslocacar.controller;

import edu.syslocacar.MainApp;
import edu.syslocacar.model.services.VeiculoServices;
import edu.syslocacar.utils.Alerta;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class MainController implements Initializable {

    @FXML
    private ScrollPane scrollPaneMain;
    @FXML
    private VBox vBoxMain;
    @FXML
    private MenuBar menuBarMain;
    @FXML
    private Menu menuCadastro;
    @FXML
    private Menu menuRelatorios;
    @FXML
    private Menu menuHelp;
    @FXML
    private MenuItem menuItemVeiculos;
    @FXML
    private MenuItem menuItemLocacao;
    @FXML
    private MenuItem menuItemManutencao;
    @FXML
    private MenuItem menuItemRelatorioVeiculos;
    @FXML
    private MenuItem menuItemAbout;

    //******************************************************************************************************************
    // INITIALIZER
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
    //******************************************************************************************************************
    // TRATAMENTO DE EVENTOS
    @FXML
    public void onCadastroVeiculoAction(){
        loadView("E:\\dev\\Projetos-Java\\syslocacar\\src\\main\\java\\edu\\syslocacar\\view\\VeiculoView.fxml");
        System.out.println("menu veiculo");
    }
    @FXML
    public void onCadastroLocacaoAction(){
        System.out.println("menu locação");
    }
    @FXML
    public void onCadastroManutencaoAction(){
        System.out.println("menu manutenção");
    }
    @FXML
    public void onRelatorioVeiculosAction(){
        System.out.println("menu relatorio veiculo");
    }
    @FXML
    public void onHelpAboutAction(){
        System.out.println("menu About");
        Alerta.exibirAlerta("SYSLocaCar","About","SYSLocaCar V 1.0", Alert.AlertType.INFORMATION);
    }
    //******************************************************************************************************************
    // CARREGAMENTO DA VIEW
    public void loadView(String pathFXML){
        try {
            FXMLLoader fxmlLoader = new FXMLLoader();
            VBox vBox = fxmlLoader.load(new FileInputStream(pathFXML));
            vBoxMain.getChildren().clear();
            vBoxMain.getChildren().add(menuBarMain);
            vBoxMain.getChildren().addAll(vBox.getChildren());
            VeiculoController controller = fxmlLoader.getController();
            controller.setVeiculoServices(new VeiculoServices());
            controller.updateTableView();


        } catch (RuntimeException | IOException e) {
            Alerta.exibirAlerta("Error","Erro ao carregar a view",e.getMessage(), Alert.AlertType.ERROR);
        }
    }
    public static void modalView(String title, String pathFXML){
        try {
            FXMLLoader fxmlLoader = new FXMLLoader();
            Parent root = fxmlLoader.load(new FileInputStream(pathFXML));
            Stage modal = new Stage();
            modal.setTitle(title);
            modal.setScene(new Scene(root));
            modal.initModality(Modality.WINDOW_MODAL);
            modal.initOwner(MainApp.getScene().getWindow());
            modal.showAndWait();
        } catch (RuntimeException | IOException e) {
            Alerta.exibirAlerta("Error","Erro ao carregar a view",e.getMessage(), Alert.AlertType.ERROR);
        }
    }

}
