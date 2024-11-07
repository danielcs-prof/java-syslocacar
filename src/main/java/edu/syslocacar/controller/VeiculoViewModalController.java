package edu.syslocacar.controller;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class VeiculoViewModalController implements Initializable {
    @FXML
    TextField txtMarca;
    @FXML
    TextField txtModelo;
    @FXML
    TextField txtPlaca;
    @FXML
    TextField txtStatus;
    @FXML
    Button btnSalvar;
    @FXML
    Button btnAlterar;
    @FXML
    Button btnExcluir;
    @FXML
    Button btnCancelar;

//*****************************************************************************************************************
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        
    }
//*****************************************************************************************************************
// TRATAMENTO DE EVENTOS
    @FXML
    public void btnSalvarOnAction() {}
    @FXML
    public void btnAlterarOnAction() {}
    @FXML
    public void btnExcluirOnAction() {}
    @FXML
    public void btnCancelarOnAction() {}

}
