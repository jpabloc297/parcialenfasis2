/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcial.model;

/**
 *
 * @author s204e11
 */
public class Automovil extends Vehiculo {

    public Automovil(String placa, String marca, double valorPeaje) {
        super(placa, marca, valorPeaje);
    }

    @Override
    public String toString() {
        return "automovil{'placa':'"+this.getPlaca()+"' ,'Marca':"+this.getMarca()+"' , 'valor del peaje':'"+this.getValorPeaje()+"'}"; 
    }
    
}
