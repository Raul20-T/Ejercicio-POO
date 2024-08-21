/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Juan Raul Cahuec Toj
 */
public class proveedor {
    private String nombre;
    private List<producto> productos;

    public proveedor(String nombre) {
        this.nombre = nombre;
        this.productos = new ArrayList<>();
    }

    public void agregarProducto(producto producto) {
        productos.add(producto);
    }

    public List<producto> getProductos() {
        return productos;
    }

    public String getNombre() {
        return nombre;
    }
}
