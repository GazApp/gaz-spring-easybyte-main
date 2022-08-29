package com.example.main;

import com.example.beans.Vehicle;
import com.example.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Example1 {

    public static void main(String[] args) {

        Vehicle vehicle = new Vehicle();
        vehicle.setName("Honda City");
         System.out.println("Vehicle name from non-spring context is: " + vehicle.getName());
        /*
        The var keyword was introduced in Java 10. Type inference is used in
        var keyword in which it detects automatically the datatype of a variable
        based on the surrounding context.
        * */
        //-mi objeto que creé con la ayuda de la anotación de @Bean  es consciente del Contenedor de Spring.
        var contexto = new AnnotationConfigApplicationContext(ProjectConfig.class);

        Vehicle veh = contexto.getBean(Vehicle.class);
        System.out.println("Vehicle name from Spring Context is: " + veh.getName());

        /*
         No necesitamos hacer ningún casting explícito mientras obtenemos un bean del contexto.
         Spring es lo suficientemente inteligente como para buscar un bean del tipo que solicitó en su contexto.
         Si tal Bean no existe, Spring lanzará una excepción.
        * */
        var hello = contexto.getBean(String.class);
        System.out.println("String value from Spring Context is: " + hello);
        Integer num = contexto.getBean(Integer.class);
        System.out.println("Integer value from Spring Context is: " + num);

    }
}
/* OUPUT:
Vehicle name from non-spring context is: Honda City
Vehicle name from Spring Context is: Audi 8
String value from Spring Context is: Hello World
Integer value from Spring Context is: 16
 */

/*            CONTEXTO DE LA CONFIGURACCION DE LA ANOTACION(S)
Cree un nuevo AnnotationConfigApplicationContext, busque componentes en los paquetes dados,
(EN SUS ARGUMENTOS DEL METODO) Y registra las definiciones de beans para esos componentes y
actualice automáticamente el contexto.

Parámetros:
basePackages: los paquetes para buscar clases de componentes


 */