/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package principal;

/**
 *
 * @author LAB-USR-HUAN-A0304
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Automovil a = new Automovil();
    Motocicleta m = new Motocicleta();
    Bicicleta b = new Bicicleta();
    a.calcularCostoAlquiler();
    a.cargarBateria();
    m.calcularCostoAlquiler();
    m.getAutonomia();
    m.cargarBateria();
    b.calcularCostoAlquiler();
    
    
    
    }
    
}
