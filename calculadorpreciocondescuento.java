/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;
import model.Producto;
import java.util.List;
/**
 *
 * @author Juan Raul Cahuec Toj
 */
public class calculadorpreciocondescuento implements calculadordeprecio {
   private double descuento;

    public CalculadorDePrecioConDescuento(double descuento) {
        this.descuento = descuento;
    }

    public double calcularPrecioTotal(List<producto> productos) {
        double total = productos.stream().mapToDouble(p -> p.getPrecio() * p.getCantidad()).sum();
        return total - (total * descuento);
    }  
}
