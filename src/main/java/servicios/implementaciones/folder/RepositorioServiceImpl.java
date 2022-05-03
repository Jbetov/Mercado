package servicios.implementaciones.folder;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import modelo.Producto;
import servicios.interfaces.IRepositorioService;

public class RepositorioServiceImpl implements IRepositorioService {

    private List<Producto> listaProductos = new ArrayList<>();
    //ProductoServiceImpl productoService = new ProductoServiceImpl(listaProductos);
    //private FileServicioImpl fileService = new FileServicioImpl(listaProductos, productoService);

    public RepositorioServiceImpl(List<Producto> listaProductos) {
        this.listaProductos = listaProductos;
    }    
    
    @Override
    public List<Producto> buscarTodo() {
        return listaProductos;
    }

    @Override
    public Producto buscarPorId(BigInteger id) {
        for (Producto product : listaProductos) {
            if (product.getId() == id) {
                return product;
            }
        }        
        return null;
    }

    @Override
    public List<Producto> guardar(Producto producto) {
        listaProductos.add(producto);
        //fileService.reescribir();
        return listaProductos;
    }

    @Override
    public List<Producto> modificar(Producto producto) {
        Producto productoActual = buscarPorId(producto.getId());
        if (productoActual != null) {
            int posicion = listaProductos.indexOf(productoActual);
            listaProductos.set(posicion, producto);
        }
        return listaProductos;
    }

    @Override
    public List<Producto> eliminar(BigInteger id) {
        listaProductos.remove(buscarPorId(id));
        return listaProductos;
    }
    
}
