package segurosxy.modelos.patrones;


import segurosxy.modelos.patrones.beneficiarios.Beneficiario;

public class BajaCommand implements ICommand {

    @Override
    public void ejecutar(Beneficiario beneficiario) {
        System.out.println("[BajaCommand] usando beneficiario");
        beneficiario.darDeBaja();
    }
}
