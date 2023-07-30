package es.pildoras.pruebaannotations;

import org.springframework.stereotype.Component;

@Component("ComercialExperimentado")
public class ComercialExperimentado implements Empleados{
    @Override
    public String getTareas() {
        return "Vender, vender y vender más!";
    }

    @Override
    public String getInforme() {
        return "Informe generado por el comercial";
    }
}
