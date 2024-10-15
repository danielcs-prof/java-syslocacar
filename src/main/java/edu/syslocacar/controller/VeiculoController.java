package edu.syslocacar.controller;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.layout.VBox;

import java.net.URL;
import java.util.ResourceBundle;

public class VeiculoController implements Initializable {
    @FXML
    private VBox vBoxVeiculo;
    @FXML
    private Label lbVeiculo;
    @FXML
    private TableView tbVeiculo;
    @FXML
    private TableColumn columnIdVeiculo;
    @FXML
    private TableColumn columnMarcaVeiculo;
    @FXML
    private TableColumn columnPlacaVeiculo;
    @FXML
    private TableColumn columnStatusVeiculo;
    @FXML
    private Button btnNovo;

    //INITIALIZER
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }

    // TRATAMENTO DE EVENTOS
    @FXML
    public void onBtnNovoAction(){
        MainController.modalView("Manter Veiculos","E:\\dev\\Projetos-Java\\syslocacar\\src\\main\\java\\edu\\syslocacar\\view\\VeiculoViewModal.fxml");
    }
}
