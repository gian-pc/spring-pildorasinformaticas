package es.pildoras.pruebaannotations;

import org.springframework.stereotype.Component;

@Component
public class InformeFinancieroTrim1 implements CreacionInformeFinanciero{

    @Override
    public String getInformeFinanciero() {
        return "Presentación de informe financiero del trimestre 1";
    }
}