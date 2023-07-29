package es.pildoras.DI;

public class DirectorEmpleado implements Empleados {

    private CreacionInformes informeNuevo;

    // Paso 2: Creación del constructor que inyecta la dependencia
    public DirectorEmpleado(CreacionInformes informeNuevo) {
        this.informeNuevo = informeNuevo;
    }

    @Override
    public String getTareas() {
        return "Gestionar la planilla de la empresa";
    }

    @Override
    public String getInforme() {
        return "Informe creado por el Director: " + informeNuevo.getInforme();
    }
}

