/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;
import model.producto;
import model.categoria;
import service.calculadordeprecio;
import java.util.List;
/**
 *
 * @author Juan Raul Cahuec Toj
 */
public class gestordeinventario {
   private List<producto> productos;
    private List<categoria> categorías;

    public gestordeinventario(List<producto> productos, List<categoria> categorías) {
        this.productos = productos;
        this.categorías = categorías;
    }

    public double calcularpreciototal(calculadordeprecio calculador) {
        return calculador.calcularPrecioTotal(productos);
    }

    public double calcularpreciototalporcategoría(categoria categoría, calculadordeprecio calculador) {
        return calculador.calcularPrecioTotal(categoria.getProductos());
    } 
}
