package Controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.List;
import modelo.Producto;
import servicios.implementaciones.folder.FileServicioImpl;
import vista.SubirArchivo;

public class Controlador implements ActionListener {

    SubirArchivo subirArchivo;
    FileServicioImpl fileService;
    List<Producto> listaProductos;
    File archivo;

    public Controlador(SubirArchivo subirArchivo, FileServicioImpl fileService) {
        this.subirArchivo = subirArchivo;
        this.fileService = fileService;
        this.subirArchivo.btnSubirArchivo.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == subirArchivo.btnSubirArchivo) {
            archivo = subirArchivo.establecerArchivo();
            listaProductos = fileService.datos(archivo);
            if (listaProductos != null) {
                for (Producto producto : listaProductos) {
                    System.out.println(producto.toString());
                }
            } else {
                System.out.println("Lista vacia");
            }
        }
    }

}
