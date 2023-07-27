package es.pildoras.IoC;


public class UsoEmpleados {
    public static void main(String[] args) {

        // Creación de objetos de tipo empleado

        JefeEmpleado Empleado1 = new JefeEmpleado(); // sin interfaces
        Empleados Empleado2 = new JefeEmpleado(); // con interfaces
        Empleados Empleado3 = new SecretarioEmpleado(); // con interfaces
        Empleados Empleado4 = new DirectorEmpleado(); // con interfaces

        // Uso de los objetos creados

        System.out.println(Empleado1.getTareas());
        System.out.println(Empleado2.getTareas());
        System.out.println(Empleado3.getTareas());
        System.out.println(Empleado4.getTareas());



    }
}
