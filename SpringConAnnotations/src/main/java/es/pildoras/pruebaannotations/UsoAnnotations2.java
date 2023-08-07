package es.pildoras.pruebaannotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsoAnnotations2 {
    public static void main(String[] args) {

        // 1 Paso: Leer el XML de configuración después de agregar @Component
        ClassPathXmlApplicationContext contexto = new ClassPathXmlApplicationContext("applicationContext.xml");

        // 2 Paso: Pedir un bean al contenedor
        Empleados Antonio = contexto.getBean("ComercialExperimentado", Empleados.class);
        Empleados Lucia = contexto.getBean("ComercialExperimentado", Empleados.class);

        // ¿Apuntan al mismo objeto en memoria
        if(Antonio==Lucia) {
            System.out.println("Apuntan al mismo lugar en memoria");
            System.out.println(Antonio + "\n" + Lucia);
        }else{
            System.out.println("No Apuntan al mismo lugar en memoria");
            System.out.println(Antonio + "\n" + Lucia);
        }

        // Cerrar el contexto
        contexto.close();

    }
}
