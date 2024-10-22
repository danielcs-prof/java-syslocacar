package edu.syslocacar.controller;

import com.sun.tools.javac.Main;
import edu.syslocacar.model.entity.Veiculo;
import edu.syslocacar.model.services.VeiculoServices;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;
//******************************************************************************************************************
public class VeiculoController implements Initializable {
    @FXML
    private VBox vBoxVeiculo;
    @FXML
    private Label lbVeiculo;
    @FXML
    private TableView<Veiculo> tbVeiculo;
    @FXML
    private TableColumn<Veiculo, Integer> columnIdVeiculo;
    @FXML
    private TableColumn <Veiculo, String> columnMarcaVeiculo;
    @FXML
    private TableColumn <Veiculo, String> columnModeloVeiculo;
    @FXML
    private TableColumn <Veiculo, String> columnPlacaVeiculo;
    @FXML
    private TableColumn <Veiculo, String> columnStatusVeiculo;
    @FXML
    private Button btnNovo;

    private VeiculoServices veiculoServices;
    private ObservableList<Veiculo> observableList;
    //******************************************************************************************************************
    //INITIALIZER
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        initializeNodes();
    }
    public void initializeNodes(){
        columnIdVeiculo.setCellValueFactory(new PropertyValueFactory<>("id"));
        columnMarcaVeiculo.setCellValueFactory(new PropertyValueFactory<>("marca"));
        columnModeloVeiculo.setCellValueFactory(new PropertyValueFactory<>("modelo"));
        columnPlacaVeiculo.setCellValueFactory(new PropertyValueFactory<>("placa"));
        columnStatusVeiculo.setCellValueFactory(new PropertyValueFactory<>("status"));
        //tbVeiculo.prefHeightProperty().bind(vBoxVeiculo.heightProperty());

    }
    //******************************************************************************************************************
    //SERVICES
    public void setVeiculoServices(VeiculoServices veiculoServices){
        this.veiculoServices = veiculoServices;
    }

    //******************************************************************************************************************
    // TRATAMENTO DE EVENTOS
    @FXML
    public void onBtnNovoAction(){
        MainController.modalView("Manter Veiculos","E:\\dev\\Projetos-Java\\syslocacar\\src\\main\\java\\edu\\syslocacar\\view\\VeiculoViewModal.fxml");
    }
    //******************************************************************************************************************
    // UPDATE TABLE
    public void updateTableView(){
        if (veiculoServices == null){
            throw  new IllegalStateException("Sercice VeiculoService não instanciado: nullpoint exception");
        }
        List<Veiculo> lista = veiculoServices.findAll();
        lista.forEach( (obj) -> System.out.println(obj.getId() +", "+ obj.getMarca()+", "+obj.getModelo() + ", " + obj.getPlaca() + ", "+obj.getStatus()));
        observableList = FXCollections.observableList(lista);
        tbVeiculo.setItems(observableList);

    }
}
