package segurosxy.seguro.vehiculo.model;

import segurosxy.modelos.Vehiculo;
import segurosxy.modelos.patrones.cobertura.CoberturaPorChoqueDecorator;

public class SeguroChoque extends SeguroVehicular {

  {
    super.cobertura = new CoberturaPorChoqueDecorator(super.cobertura);
  }

  public SeguroChoque() {
  }

  public SeguroChoque(String marca, String modelo) {
    super(marca, modelo);
  }

  public SeguroChoque(Vehiculo vehiculo) {
    super(vehiculo);
  }


  @Override
  public String detalleSeguro() {
    return "Seguro por Choque: \nCertificado: " + this.certificado.detalleCertificado() +
        " para vehiculo con modelo " + this.getVehiculo().getModelo() +
        " y marca " + this.getVehiculo().getMarca();
  }

  @Override
  public void calcularRiesgo() {
    if (this.vehiculo.getMarca().equals("Toyota") && this.vehiculo.getModelo().equals("Yaris")) {
      this.nivelRiesgo = "ALTO";
    } else {
      this.nivelRiesgo = "BAJO";
    }
  }
}
