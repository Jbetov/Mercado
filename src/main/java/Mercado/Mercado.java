package Mercado;

import Controlador.Controlador;
import java.util.ArrayList;
import java.util.List;
import modelo.Producto;
import servicios.implementaciones.folder.FileServicioImpl;
import servicios.implementaciones.folder.ProductoServiceImpl;
import vista.SubirArchivo;

public class Mercado {
    public static void main(String[] args) {
        
        List<Producto> listaProductos = new ArrayList<>();
        ProductoServiceImpl productoService = new ProductoServiceImpl(listaProductos);
        SubirArchivo subirArchivo = new SubirArchivo();
        subirArchivo.setVisible(true);
        FileServicioImpl fileService = new FileServicioImpl(listaProductos, productoService);
        Controlador ctrl = new Controlador(subirArchivo, fileService);                
        
    }
}
