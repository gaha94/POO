/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package principal;

/**
 *
 * @author LAB-USR-HUAN-A0304
 */
public abstract class Vehiculo implements Alquilable{
    protected int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Vehiculo(int id) {
        this.id = id;
    }
    abstract public String obtenerTipo();
}
