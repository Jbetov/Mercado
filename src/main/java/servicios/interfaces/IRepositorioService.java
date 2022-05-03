package servicios.interfaces;

import java.math.BigInteger;
import java.util.List;
import modelo.Producto;

public interface IRepositorioService {
    
    List<Producto> buscarTodo();
    Producto buscarPorId(BigInteger id);
    List<Producto> guardar(Producto producto);
    List<Producto> modificar(Producto producto);
    List<Producto> eliminar(BigInteger id);
    
}
