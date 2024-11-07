package edu.syslocacar.model.entity;

public class Veiculo {
    private Integer id;
    private String marca;
    private String modelo;
    private String placa;
    private String status;

    // CONSTRUTOR
    public Veiculo() {
    }

    public Veiculo(Integer id, String marca, String modelo, String placa, String status) {
        this.id = id;
        this.marca = marca;
        this.modelo = modelo;
        this.placa = placa;
        this.status = status;
    }
    // GET E SET

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
