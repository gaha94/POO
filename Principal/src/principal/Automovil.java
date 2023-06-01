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
class Automovil extends Vehiculo implements Electrico{

    static void main(Object object) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    private int numAsientos;
    private double consumoCombustible;
    Scanner sc = new Scanner (System.in);

    public int getNumAsientos() {
        return numAsientos;
    }

    public void setNumAsientos(int numAsientos) {
        this.numAsientos = numAsientos;
    }

    public double getConsumoCombustible() {
        return consumoCombustible;
    }

    public void setConsumoCombustible(double consumoCombustible) {
        this.consumoCombustible = consumoCombustible;
    }

    public Scanner getSc() {
        return sc;
    }

    public void setSc(Scanner sc) {
        this.sc = sc;
    }

    
    public Automovil(int id) {
        super(id);
    }



    @Override
    public String obtenerTipo() {
        return this.obtenerTipo();
    }

    @Override
    public double calcularCostoAlquiler(int horas) {
        System.out.println("El precio por hora es de 30 soles");
        System.out.println("¿Cuantas horas manejo el vehiculo?");
        int hour = sc.nextInt();
        int b = hour*30;
        return b;
    }

    @Override
    public int getAutonomia() {
        System.out.println("¿Cuanto recorrio?");
        double recorrido = sc.nextDouble();
        if (recorrido<200)System.out.println("Recorrido restante: "+(200-recorrido));
        else System.out.println("Bateria acabada");
        int a = (int) (200-recorrido);
        return a;
    }

    @Override
    public void cargarBateria() {
        System.out.println("Cargando bateria");
    }
   
    }
