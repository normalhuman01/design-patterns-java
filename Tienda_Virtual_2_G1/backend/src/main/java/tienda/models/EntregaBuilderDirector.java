package tienda.models;

import tienda.models.patterns.IEntregaBuilder;

public class EntregaBuilderDirector {
    private IEntregaBuilder entregaBuilder;

    public void setEntregaBuilder(IEntregaBuilder builder) {
       entregaBuilder = builder;
    }

    public EntregaBuilderDirector(IEntregaBuilder builder) {
        this.entregaBuilder = builder;
    }

    public Entrega buildEntregadHogar(String direccionEntrega, String fechaEntrega, String horario){
        //Se restauran los datos del builder
        entregaBuilder.withEntregaDomicilio(null,null,null).withRecojoEnTienda(null,null,null);
        return entregaBuilder.withEntregaDomicilio(direccionEntrega, fechaEntrega, horario).build();
    }

    public Entrega buildEntregaTienda(String fechaRecojo, String tiendaRecojo, String horario){
        //Se restauran los datos del builder
        entregaBuilder.withRecojoEnTienda(null, null, null).withEntregaDomicilio(null,null,null);
        return entregaBuilder.withRecojoEnTienda(tiendaRecojo, fechaRecojo, horario).build();
    }

}
