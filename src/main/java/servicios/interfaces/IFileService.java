package servicios.interfaces;

import java.io.File;
import java.util.List;
import modelo.Producto;

public interface IFileService {

    //public Producto datos_db(MultipartFile file)
    //public String validacion(File archivo);
    //public String guardar(File archivo);
    List<Producto> datos(File archivo);
    void reescribir(String rutaArchivo);
    
}
