/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;
import model.producto;
import java.util.List;
/**
 *
 * @author Juan Raul Cahuec Toj
 */
public class calculadordepreciosindescuento implements calculadordeprecio{
    public double calcularPrecioTotal(List<producto> productos) {
        return productos.stream().mapToDouble(p -> p.getprecio() * p.getcantidad()).sum();
    }   
}
