package es.pildoras.cicloBeans;

import es.pildoras.DI.Empleados;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsoCicloVidaBean {
    public static void main(String[] args) {
        // Cargar el XML de configuración
        ClassPathXmlApplicationContext contexto = new ClassPathXmlApplicationContext("applicationContext3.xml");

        // Obtención del bean
        Empleados Juan = contexto.getBean("miEmpleado", Empleados.class);

        System.out.println();
        System.out.println(Juan.getInforme());
        System.out.println();

        // Cerrar el contexto
        contexto.close();

    }
}
