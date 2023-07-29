package es.pildoras.DI;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsoEmpleados {
    public static void main(String[] args) {


// --------------------------  Con DI  ---------------------------------

        // 1 Paso: Crear el contexto; nos permite cargar el archivo xml
        ClassPathXmlApplicationContext contexto = new ClassPathXmlApplicationContext("applicationContext.xml");

        // 2 Paso: Pedir el bean
        Empleados Gian = contexto.getBean("miEmpleado2", Empleados.class);
        Empleados Maria = contexto.getBean("miSecretarioEmpleado", Empleados.class);

        // 3 Paso: Utilizar este objeto(Bean)
        System.out.println("------ Mediante un CONSTRUCTOR -------");
        System.out.println(Gian.getTareas());
        System.out.println(Gian.getInforme());
        System.out.println();

        System.out.println("------ Mediante un SETTER -------");
        System.out.println(Maria.getTareas());
        System.out.println(Maria.getInforme());

        // 4 Paso: Cerrar el XML
        contexto.close();




    }
}
