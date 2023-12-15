package segurosxy.modelos.patrones.mediator;

import segurosxy.cliente.model.PersonaObserver;
import segurosxy.modelos.email.EmailUtil;

public class CorreoMediator implements ICorredorMediator {

    private String servidorSMTP;

    @Override
    public void setServidorCorreoSMTP(String servidorIP) {

        this.servidorSMTP = servidorIP;
    }

    private String preparaMensaje(String nombre)  {

        return "[CorreoMediator] Enviando mensaje por Correo, servidor IP: " + servidorSMTP +
            "\n[CorreoMediator]                                  Persona : " + nombre;
    }

    @Override
    public void enviaCorreoSMTP(PersonaObserver cliente) {
        // enviando correo...
        System.out.println( preparaMensaje(cliente.getNombre()) );

        try {
            EmailUtil.send(servidorSMTP, "eduardo.lanasca@unmsm.edu.pe", "",
                "edujlac@gmail.com", "hello", preparaMensaje(cliente.getNombre()));
        }catch (Exception e){
            System.out.println("[CorreoMediator][Error] "+ e.toString());
        }
    }

}
