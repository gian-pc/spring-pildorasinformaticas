package es.pildoras.pruebaannotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsoAnnotations {
    public static void main(String[] args) {

        // 1 Paso: Leer el XML de configuración después de agregar @Component

        ClassPathXmlApplicationContext contexto = new ClassPathXmlApplicationContext("applicationContext.xml");

        // 2 Paso: Pedir un bean al contenedor
        Empleados Antonio = contexto.getBean("ComercialExperimentado", Empleados.class);

        // 3 Paso: Usar el bean
        System.out.println(Antonio.getInforme());
        System.out.println(Antonio.getTareas());

        // 4 Paso: Cerrar el contexto
        contexto.close();


    }
}
