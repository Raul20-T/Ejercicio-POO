/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;
import model.Producto;
import model.Categoría;
import java.util.List;
/**
 *
 * @author Juan Raul Cahuec Toj
 */
public class calculadorprecioporcategoria implements calculadordeprecio{
    private categoria categoria;

    public calculadordeprecioporcategoria(Categoría categoría) {
        this.categoria = categoria;
    }

    
    public double calcularpreciototal(List<producto> productos) {
        List<producto> productosFiltrados = categoria.getProductos();
        return productosFiltrados.stream().mapToDouble(p -> p.getPrecio() * p.getCantidad()).sum();
    }
}
