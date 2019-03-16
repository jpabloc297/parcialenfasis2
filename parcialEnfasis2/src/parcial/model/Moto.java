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
public class Moto extends Vehiculo{
    
    public Moto(String placa, String marca,double f) {
        super(placa, marca, f);
    }
        @Override
    public String toString() {
        return "Moto{'placa':'"+this.getPlaca()+"' ,'Marca':"+this.getMarca()+"' , 'valor del peaje':'"+this.getValorPeaje()+"'}"; 
    }
    
}
