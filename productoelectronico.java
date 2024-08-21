/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Juan Raul Cahuec Toj
 */
public class productoelectronico {
        private int garantia; // En meses

    public productoelectronico(String nombre, double precio, int cantidad, proveedor proveedor, int garantia) {
        super(nombre, precio, cantidad, proveedor);
        this.garantia = garantia;
    }

   
    public String getDetalles() {
        return nombre + " (Electrónico) - Garantía: " + garantia + " meses";
    }
}
