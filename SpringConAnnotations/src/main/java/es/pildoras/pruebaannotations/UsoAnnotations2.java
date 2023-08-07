package es.pildoras.pruebaannotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsoAnnotations2 {
    public static void main(String[] args) {

        // 1 Paso: Leer el XML de configuración después de agregar @Component
        ClassPathXmlApplicationContext contexto = new ClassPathXmlApplicationContext("applicationContext.xml");

        // 2 Paso: Pedir un bean al contenedor
        Empleados Antonio = contexto.getBean("ComercialExperimentado", Empleados.class);
        Empleados Lucia = contexto.getBean("ComercialExperimentado", Empleados.class);

    }
}
