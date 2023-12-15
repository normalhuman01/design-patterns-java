package tienda.models.patterns;

import tienda.models.*;

public class GamaAltaFactory implements IProductoFactory {

    @Override
    public LineaProducto getLineaProducto() {
        
        return new LineaGamaAlta();
    }

    @Override
    public MantenimientoProducto getMantenimiento() {
        
        return new MantenimientoPremium();
    }

    @Override
    public BateriaProducto getBateria() {
        return new BateriaDuracionAlta();
    }

    @Override
    public CamaraProducto getCamaraProducto() {
        return new CamaraResolucionAlta();
    }


}