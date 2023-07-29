package es.pildoras.DI;


public class SecretarioEmpleado implements Empleados {


    @Override
    public String getTareas() {
        return "Gestiono la agenda de los jefes";
    }

    @Override
    public String getInforme() {
        return null;
    }
}
