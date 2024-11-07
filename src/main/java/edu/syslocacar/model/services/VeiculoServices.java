package edu.syslocacar.model.services;

import edu.syslocacar.model.entity.Marca;
import edu.syslocacar.model.entity.Modelo;
import edu.syslocacar.model.entity.Veiculo;
import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.List;




public class VeiculoServices {
    public List<Veiculo> findAll(){

        List<Veiculo> veiculoList = new ArrayList<>();
        Marca marca = new Marca(1,"FORD");
        Modelo modelo1 = new Modelo(1,"FORD RANGER");
        modelo1.setMara(marca);
        Modelo modelo2 = new Modelo(1,"FORD K");
        modelo2.setMara(marca);

        veiculoList.add( new Veiculo(1,"FORD","Ford Ranger","DMI-2409","locado"));
        veiculoList.add( new Veiculo(2,"CHEVROLET","Celta","OMI-2408","locado"));
        veiculoList.add( new Veiculo(3,"FORD","Ford K","GMI-2407","disponível"));
        veiculoList.add( new Veiculo(4,"CHEVROLET","S10","KMI-2406","disponível"));
        veiculoList.add( new Veiculo(4,"CHEVROLET","S10","KMI-2406","disponível"));
        veiculoList.add( new Veiculo(4,"CHEVROLET","S10","KMI-2406","disponível"));
        veiculoList.add( new Veiculo(4,"CHEVROLET","S10","KMI-2406","disponível"));
        veiculoList.add( new Veiculo(4,"CHEVROLET","S10","KMI-2406","disponível"));
        veiculoList.add( new Veiculo(4,"CHEVROLET","S10","KMI-2406","disponível"));
        veiculoList.add( new Veiculo(4,"CHEVROLET","S10","KMI-2406","disponível"));
        veiculoList.add( new Veiculo(4,"CHEVROLET","S10","KMI-2406","disponível"));
        veiculoList.add( new Veiculo(4,"CHEVROLET","S10","KMI-2406","disponível"));
        veiculoList.add( new Veiculo(4,"CHEVROLET","S10","KMI-2406","disponível"));

        //veiculoList.forEach( (obj) -> System.out.println(obj.getId() +", "+ obj.getMarca()+", "+obj.getModelo() + ", " + obj.getPlaca() + ", "+obj.getStatus()));

        return veiculoList;
    }
}
