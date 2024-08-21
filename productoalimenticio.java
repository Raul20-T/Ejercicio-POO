/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.Date;
/**
 *
 * @author Juan Raul Cahuec Toj
 */
public class productoalimenticio {
    private Date fechaDeCaducidad;

    public productoalimenticio(String nombre, double precio, int cantidad, proveedor proveedor, Date fechaDeCaducidad) {
        super(nombre, precio, cantidad, proveedor);
        this.fechaDeCaducidad = fechaDeCaducidad;
    }

    
    public String getDetalles() {
        return nombre + " (Alimenticio) - Fecha de caducidad: " + fechaDeCaducidad.toString();
    }
}
