package es.pildoras.IoC;


import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsoEmpleados {
    public static void main(String[] args) {

// --------------------------  Sin IoC  ---------------------------------

        // Creación de objetos de tipo empleado
        JefeEmpleado jefeEmpleado = new JefeEmpleado(); // sin interfaces

        Empleados jefeEmpleado2 = new JefeEmpleado(); // con interfaces
        Empleados secretarioEmpleado = new SecretarioEmpleado(); // con interfaces
        Empleados directorEmpleado = new DirectorEmpleado(); // con interfaces

        // Uso de los objetos creados
        System.out.println(jefeEmpleado.getTareas());
        System.out.println(jefeEmpleado2.getTareas());
        System.out.println(secretarioEmpleado.getTareas());
        System.out.println(directorEmpleado.getTareas());



// --------------------------  Con IoC  ---------------------------------

        // 1 Paso: Crear el contexto; nos permite cargar el archivo xml
        ClassPathXmlApplicationContext contexto = new ClassPathXmlApplicationContext("applicationContext.xml");

        // 2 Paso: Pedir el bean
        Empleados Gian = contexto.getBean("miEmpleado",Empleados.class);

        // 3 Paso: Utilizar este objeto(Bean)
        System.out.println();
        System.out.println(Gian.getTareas());

        // 4 Paso: Cerrar el XML
        contexto.close();




    }
}
