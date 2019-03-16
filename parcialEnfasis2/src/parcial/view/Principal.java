/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcial.view;
import parcial.controller.Controller;

/**
 *
 * @author s204e11
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        menu m = new menu();
        //agregar autos, quitar comentarios de las que dese provar
       // m.agregarAutomovil();
        m.agregarMoto();
        //m.agregarCamion1();
        //m.agregarCamion2();
        //m.c.getListaVehiculos();
       
        System.out.println(m.c.getListaVehiculos().get(0));
        //CODIGO XML AQUI--------------------------------------------*************************************************************
         //<auto><placa>"la placa"</placa><marca>"la marca"</marca><valor peaje>"valor del peaje"</peaje></auto>
         //así con todo los vehiculos
    }
    
}
