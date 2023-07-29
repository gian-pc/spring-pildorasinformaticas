package es.pildoras.DI;


public class SecretarioEmpleado implements Empleados {

    private CreacionInformes informeNuevo;

    // Método encargado de crear la inyección de dependencias - Mediante un SETTER
    public void setInformeNuevo(CreacionInformes informeNuevo) {
        this.informeNuevo = informeNuevo;
    }

    @Override
    public String getTareas() {
        return "Gestiono la agenda de los jefes";
    }

    @Override
    public String getInforme() {
        return "Informe generado por el secretario: " + informeNuevo.getInforme();
    }
}
