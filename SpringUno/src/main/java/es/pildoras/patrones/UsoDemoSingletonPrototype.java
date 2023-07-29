package es.pildoras.patrones;

import es.pildoras.DI.SecretarioEmpleado;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsoDemoSingletonPrototype {

    public static void main(String[] args) {
        // Carga de XML de configuración
        ClassPathXmlApplicationContext contexto = new ClassPathXmlApplicationContext("applicationContext2.xml");

        // Petición de beans al contenedor Spring
        SecretarioEmpleado Maria = contexto.getBean("miSecretarioEmpleado", SecretarioEmpleado.class);
        SecretarioEmpleado Pedro = contexto.getBean("miSecretarioEmpleado", SecretarioEmpleado.class);

        // Imprimiendo Beans según el patron SINGLETON
        System.out.println(Maria);
        System.out.println(Pedro);

        if(Maria==Pedro){
            System.out.println("SINGLETON: Apuntan al mismo objeto");
        }else {
            System.out.println("\nPROTOTYPE: No se trata del mismo objeto");
        }
    }
}

