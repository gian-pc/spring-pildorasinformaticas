package es.pildoras.DI;


public class SecretarioEmpleado implements Empleados {

    private CreacionInformes informeNuevo;
    private String email;
    private String nombreEmpresa;

    // Método encargado de crear la inyección de dependencias - Mediante un SETTER
    public void setInformeNuevo(CreacionInformes informeNuevo) {
        this.informeNuevo = informeNuevo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNombreEmpresa() {
        return nombreEmpresa;
    }

    public void setNombreEmpresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
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
