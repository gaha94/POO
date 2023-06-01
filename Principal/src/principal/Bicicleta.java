/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package principal;

import java.util.Scanner;

/**
 *
 * @author LAB-USR-HUAN-A0304
 */
class Bicicleta extends Vehiculo{
    Scanner sc = new Scanner (System.in);

    public Bicicleta(){
    }


    public String obtenerTipo() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public double calcularCostoAlquiler() {
        System.out.println("El precio por hora es de 10 soles");
        System.out.println("¿Cuantas horas manejo el vehiculo?");
        int hour = sc.nextInt();
        int b = hour*10;
        return b;
    }

    @Override
    public double calcularCostoAlquiler(int horas) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
