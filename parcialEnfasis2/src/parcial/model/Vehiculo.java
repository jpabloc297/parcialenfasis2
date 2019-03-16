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
public abstract class Vehiculo {
    
   private String placa;
   private String marca;
   private double valorPeaje;

    public Vehiculo(String placa, String marca, double valorPeaje) {
        this.placa = placa;
        this.marca = marca;
        this.valorPeaje = valorPeaje;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getValorPeaje() {
        return valorPeaje;
    }

    public void setValorPeaje(float valorPeaje) {
        this.valorPeaje = valorPeaje;
    }

    @Override
    public String toString() {
        return super.toString(); //To change body of generated methods, choose Tools | Templates.
    }
   
    
}
