/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcial.view;

import java.util.Scanner;
import parcial.controller.Controller;
import parcial.model.Automovil;
import parcial.model.Camion;
import parcial.model.Camion1;
import parcial.model.Camion2;
import parcial.model.Moto;
import parcial.model.Vehiculo;

/**
 *
 * @author s204e11
 */
public class menu {
    
    private int indice;
    private String placa;
    private String marca;
    private String valorPeaje;
    Scanner sc = new Scanner(System.in);
    Controller c = new Controller();
        // entrada de una cadena
       

    // agrega una moto al arrayVehiculo del controlador
    public void agregarMoto(){
        System.out.println("Placa de la moto:");
         placa = sc.nextLine();
         System.out.println("Marca de la moto:");
         marca = sc.nextLine();
         Moto m = new Moto(placa,marca,0);
         c.agregarVehiculo(m);
         
         
         
         
    }
         // agrega un auto al arrayVehiculo del controlador
        public void agregarAutomovil(){
        System.out.println("Placa de la Automovil:");
         placa = sc.nextLine();
         System.out.println("Marca de la Automovil:");
         marca = sc.nextLine();
         System.out.println("Ingrese el peaje del Automovil");
         valorPeaje = sc.nextLine();
         Automovil auto = new Automovil(placa,marca,Double.parseDouble(valorPeaje));
         c.agregarVehiculo(auto);
    }
        // agrega un camion de un eje al arrayVehiculo del controlador
        public void agregarCamion1(){
        System.out.println("Placa de la Camion:");
         placa = sc.nextLine();
         System.out.println("Marca de la Camion:");
         marca = sc.nextLine();
         System.out.println("Ingrese el peaje del Camion");
         valorPeaje = sc.nextLine();
         Camion1 cam = new Camion1(placa,marca,Double.parseDouble(valorPeaje));
         c.agregarVehiculo(cam);
    }
        //agrega un camion de dos ejes al arrayVehiculo
        public void agregarCamion2(){
        System.out.println("Placa de la camion :");
         placa = sc.nextLine();
         System.out.println("Marca de la camion :");
         marca = sc.nextLine();
         System.out.println("Ingrese el peja del camion :");
         valorPeaje = sc.nextLine();
         Camion2 cam = new Camion2(placa,marca,Double.parseDouble(valorPeaje));
         c.agregarVehiculo(cam);
    }

    
}
