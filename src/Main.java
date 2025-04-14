/*Creamos la clase vehiculo que tiene como atributos:

* Marcas-> Citroen,SEAT, Ford, Opel,BMW,Mercedes,Toyota
* Modelo->
* Potencia
* Color
* Anio
* TipoCombustible (Diesel, Gasolina)

* Cuando se escriba la marca o tipo use los enum de marca o de tipo.

* */

import javax.swing.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    Vehiculos coche1=new Vehiculos("Ford",1.8,"Negro","Focus",2007,Marcas.Combustible.diesel);
    Vehiculos coche2=new Vehiculos("Toyota",1.6,"Panda","Splinter Trueno",1986,Marcas.Combustible.gasolina);
    Vehiculos coche3=new Vehiculos("Mercedes",1.8,"Plata","C190",1988,Marcas.Combustible.gasolina);
    Vehiculos coche4=new Vehiculos("SEAT",1.8,"AMARILLO","LEON",2005,Marcas.Combustible.diesel);

        System.out.println(coche1);
        System.out.println(coche2);
        System.out.println(coche3);
        System.out.println(coche4);



    }

    }
