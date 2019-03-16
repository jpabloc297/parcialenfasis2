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
public class Camion1 extends Camion{
    
    public Camion1(String placa, String marca, double valorPeaje) {
        super(placa, marca, valorPeaje);
    }
        @Override
    public String toString() {
        return "Camion1{'placa':'"+this.getPlaca()+"' ,'Marca':"+this.getMarca()+"' , 'valor del peaje':'"+this.getValorPeaje()+"'}"; 
    }
    
}
