package es.pildoras.pruebaannotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

// Gracias a esta anotación @Component esta clase ComercialExperimentado queda registrado en el contenedor de Spring
// y gracias a esto Spring es capaz de darnos un bean con un objeto perteneciente a esta clase
@Component("ComercialExperimentado") // Este código me permite registrar un bean. Esto reemplaza la configuración XML
@Scope("prototype")
public class ComercialExperimentado implements Empleados{

    @Autowired
    @Qualifier("informeFinancieroTrim4") // bean Id que debe utilizar
    private CreacionInformeFinanciero nuevoInforme;

    // Lo que hace Spring es buscar en el proyecto a alguna clase que implemente tu interface CreacionInformeFinanciero
    // Y si la encuentra es de esa clase de donde obtiene la inyección de dependencia.

    /**
    @Autowired
    public ComercialExperimentado(CreacionInformeFinanciero nuevoInforme) {
        this.nuevoInforme = nuevoInforme;
    }


    @Autowired
    public void setNuevoInforme(CreacionInformeFinanciero nuevoInforme) {
        this.nuevoInforme = nuevoInforme;
    }*/

    @Override
    public String getTareas() {
        return "Vender, vender y vender más!";
    }

    @Override
    public String getInforme() {
        //return "Informe generado por el comercial";
        return nuevoInforme.getInformeFinanciero(); // Se realiza la inyección de dependencia
    }
}
