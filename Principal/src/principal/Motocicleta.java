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
class Motocicleta extends Vehiculo implements Electrico{
    private String tipoMotor;
Scanner sc = new Scanner (System.in);

    public String getTipoMotor() {
        return tipoMotor;
    }

    public void setTipoMotor(String tipoMotor) {
        this.tipoMotor = tipoMotor;
    }

    public Scanner getSc() {
        return sc;
    }

    public void setSc(Scanner sc) {
        this.sc = sc;
    }


    public Motocicleta(){
    }

    void Motocicleta() {
    }

    @Override
    public String obtenerTipo() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public double calcularCostoAlquiler() {
        System.out.println("El precio por hora es de 20 soles");
        System.out.println("¿Cuantas horas manejo el vehiculo?");
        int horas = sc.nextInt();
        int hour = horas;
        int b = hour*20;
        return b;
    }

    @Override
    public int getAutonomia() {
        System.out.println("¿Cuanto recorrio?");
        double recorrido = sc.nextDouble();
        if (recorrido<200)System.out.println("Recorrido restante: "+(200-recorrido));
        int a = (int) (200-recorrido);
        return a;
    }

    @Override
    public void cargarBateria() {
        System.out.println("Cargando bateria");
    }

    @Override
    public double calcularCostoAlquiler(int horas) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
