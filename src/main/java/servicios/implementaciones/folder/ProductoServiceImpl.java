package servicios.implementaciones.folder;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import modelo.Producto;
import servicios.interfaces.IProductoService;

public class ProductoServiceImpl implements IProductoService{

    private List<Producto> listaProductos = new ArrayList<>();
    private String rutaArchivo = null;

    public ProductoServiceImpl(List<Producto> listaProductos) {
        this.listaProductos = listaProductos;
    }
    
    RepositorioServiceImpl productoRepositorio = new RepositorioServiceImpl(listaProductos);
    
    @Override
    public List<Producto> obtenerTodo() {
        return productoRepositorio.buscarTodo();
    }

    @Override
    public Producto obtenerPorId(BigInteger id) {
        return productoRepositorio.buscarPorId(id);
    }

    @Override
    public List<Producto> crear(Producto producto) {
        listaProductos = productoRepositorio.guardar(producto);        
        return listaProductos;
    }

    @Override
    public List<Producto> modificar(Producto producto, BigInteger id) {
        Producto actualProducto = productoRepositorio.buscarPorId(id);
        actualProducto.setNombre(producto.getNombre());
        actualProducto.setMarca(producto.getMarca());
        actualProducto.setPrecio(producto.getPrecio());        
        return productoRepositorio.modificar(producto);
    }

    @Override
    public List<Producto> delete(BigInteger id) {
        return productoRepositorio.eliminar(id);
    }

}
