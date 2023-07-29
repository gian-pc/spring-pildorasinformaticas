package es.pildoras.cicloBeans;

import es.pildoras.DI.CreacionInformes;
import es.pildoras.DI.Empleados;

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

    // Método INIT: Ejecuta tareas antes de que el bean este disponible
    public void metodoInicial(){
        System.out.println("Dentro del método INIT, aquí irián las tareas a ejecutar antes de que el bean esté listo");
    }

    // Método DESTROY: Ejecuta tareas después de que el bean haya sido utilizado
    public void metodoFinal(){
        System.out.println("Dentro del método DESTROY, aquí irián las tareas a ejecutar después de utilizar el bean");
    }
}

