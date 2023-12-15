package segurosxy.seguro.vehiculo.model;


import segurosxy.cliente.model.PersonaObserver;
import segurosxy.modelos.Vehiculo;
import segurosxy.modelos.interfaces.ICobertura;
import segurosxy.modelos.interfaces.INivelRiesgo;
import segurosxy.seguro.Seguro;

public abstract class SeguroVehicular extends Seguro implements INivelRiesgo {

    protected ICobertura cobertura;
    protected Vehiculo vehiculo;

    public SeguroVehicular() {
    }

    public SeguroVehicular(String marca, String modelo) {
        super();
        this.vehiculo = new Vehiculo(marca, modelo);
    }

    public SeguroVehicular(Vehiculo vehiculo) {
        super();
        this.vehiculo = vehiculo;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    public ICobertura getCobertura() {
        return cobertura;
    }

    public void setCobertura(ICobertura cobertura) {
        this.cobertura = cobertura;
    }

    public static SeguroVehicular getSeguroVehicular(String tipo) {
        switch (tipo.toLowerCase()) {
            case "choque":
                return new SeguroChoque();
            case "robo":
                return new SeguroRobo();
            case "soat":
                return new SeguroSOAT();
            default:
                return new SeguroTodoRiesgo();
        }
    }

    public void calcularCobeturaVehicular( ICobertura cobertura )  {

        cobertura.calculaCobertura();

        System.out.println();
    }

    @Override
    public String infoSeguroCsv() {
        return String.join(",", super.infoSeguroCsv(), "cobertura", "marca", "modelo") + "\n" +
            String.join(",",
                certificado == null ? "" : certificado.detalleCertificado(),
                poliza == null ? "" : poliza.detallePoliza(),
                nivelRiesgo,
                cobertura.calculaCobertura().replace('\n',' '),
                vehiculo.getMarca(),
                vehiculo.getModelo());
    }

    public void validarSeguro(String coberturaBuscada){
        //coberturas que tiene el seguro
        //System.out.println(this.cobertura.calculaCobertura());

        String coberturas = cobertura.calculaCobertura();
        if (coberturas.contains(coberturaBuscada)){
            System.out.println("Si cumple con " + coberturaBuscada);
            System.out.println("Nontificando...");
            for( PersonaObserver a : this.contratantes) a.notifica();
        } else {
            System.out.println("No cumple con "+coberturaBuscada);
        }
    }

    public abstract String detalleSeguro();
    public abstract void calcularRiesgo();

}
