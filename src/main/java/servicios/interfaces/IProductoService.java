package servicios.interfaces;

import java.math.BigInteger;
import java.util.List;
import java.util.Optional;
import modelo.Producto;

public interface IProductoService {

    List<Producto> obtenerTodo();
    Producto obtenerPorId(BigInteger id);
    List<Producto> crear(Producto producto);
    List<Producto> modificar(Producto producto, BigInteger id);
    List<Producto> delete(BigInteger id);
    
}
