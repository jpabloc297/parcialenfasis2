/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcial.controller;

import java.util.ArrayList;
import parcial.model.Vehiculo;

/**
 *
 * @author s204e11
 */
public class Controller {
    //lista que contendrá los vehiculos
    private ArrayList<Vehiculo> listaVehiculos ;

    public Controller() {
      listaVehiculos = new ArrayList<>();
    }
    //mostrar metodos de la lista de vehiculos donde guardo estos
    public  ArrayList<Vehiculo> getListaVehiculos() {
        return listaVehiculos;
    }

   //agrega un vehiculo
    public  void agregarVehiculo(Vehiculo v) {
        listaVehiculos.add(v);
    }



    
}
