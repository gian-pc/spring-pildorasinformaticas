package es.pildoras.DI;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsoEmpleados {
    public static void main(String[] args) {


// --------------------------  Con DI  ---------------------------------

        // 1 Paso: Crear el contexto; nos permite cargar el archivo xml
        ClassPathXmlApplicationContext contexto = new ClassPathXmlApplicationContext("applicationContext.xml");

        // 2 Paso: Pedir el bean
        Empleados Gian = contexto.getBean("miEmpleado2", Empleados.class);

        // 3 Paso: Utilizar este objeto(Bean)
        System.out.println();
        System.out.println(Gian.getTareas());
        System.out.println(Gian.getInforme());

        // 4 Paso: Cerrar el XML
        contexto.close();




    }
}
