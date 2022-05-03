package servicios.implementaciones.folder;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.Producto;
import servicios.interfaces.IFileService;
import vista.SubirArchivo;

public class FileServicioImpl implements IFileService {

    List<Producto> listaProductos = new ArrayList<>();
    ProductoServiceImpl productoService = new ProductoServiceImpl(listaProductos);
    private String rutaArchivo;
            
    public FileServicioImpl(List<Producto> listaProductos, ProductoServiceImpl productoService) {
        this.listaProductos = listaProductos;
        this.productoService = productoService;
    }

    @Override
    public List<Producto> datos(File archivo) {
        if (archivo != null) {
            String linea = null;
            BufferedReader lector;
            FileReader archivoLectura = null;
            try {
                archivoLectura = new FileReader(archivo.getAbsolutePath());
            } catch (FileNotFoundException ex) {
                Logger.getLogger(FileServicioImpl.class.getName()).log(Level.SEVERE, null, ex);
            }

            lector = new BufferedReader(archivoLectura);

            try {
                while ((linea = lector.readLine()) != null) {
                    String[] productoString = linea.split(";");
                    BigInteger codigo_producto = new BigInteger(productoString[0]);
                    String nombre_producto = productoString[1];
                    String marca_producto = productoString[2];
                    Double precio_producto = Double.parseDouble(productoString[3]);

                    Producto producto = new Producto(codigo_producto, nombre_producto, marca_producto, precio_producto);
                    listaProductos = productoService.crear(producto);
                }
                return listaProductos;
            } catch (Exception e) {
                System.out.println("Error: " + e);
            }
            return null;
        }
        return null;
    }

    @Override
    public void reescribir(String rutaArchivo) {
        if (rutaArchivo != null) {
            try {
                FileWriter archivoEscritura = new FileWriter(rutaArchivo);
                for (Producto producto : listaProductos) {
                    archivoEscritura.write(producto.getId()+";"+producto.getNombre()+";"+producto.getMarca()+";"+producto.getPrecio()+"\n");
                }
                archivoEscritura.close();
            } catch (IOException ex) {
                Logger.getLogger(FileServicioImpl.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
    } /* Mejorar el tema de la ruta del archivo a reescribir: todavia no esta implementado
      Hay que llevar la variabl 'ruta' hasta el repositorio*/
    

}
