/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package discount;
import model.producto;

/**
 *
 * @author Juan Raul Cahuec Toj
 */
public class descuento {
     private double porcentaje;

    public descuento(double porcentaje) {
        this.porcentaje = porcentaje;
    }

    public double aplicarDescuento(producto producto) {
        return producto.getprecio() - (producto.getprecio() * porcentaje);
    }
}
