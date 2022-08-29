package com.example.config;

import com.example.beans.Vehicle;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/*

* */
@Configuration
public class ProjectConfig {

    @Bean
    Vehicle vehicle() {
        var veh = new Vehicle();
        veh.setName("Audi 8");
        return veh;
    }

    @Bean
    Car car() {
        var carro = new Car();
        carro.setName("AUDI A6");
        return carro;
    }

    @Bean
    String hello() {
        return "Hello World";
    }

    @Bean
    Integer number() {
        return 16;
    }


}
/*
- La anotación Spring @Configuration es parte del marco Spring Core.
La anotación Spring Configuration indica que la clase tiene una definición de métodos @Bean
Entonces Spring container puede procesar la clase y generar Spring Beans
para ser utilizado en la aplicación.

-    @Bean anotación, que le permite a Spring saber que necesita llamar
     este método cuando inicializa su contexto y agrega el devuelto
     valor al contexto.

- si menciona una anotación de @Bean encima del método, cualquier objeto escrito
por ese métodose convertirá en un @Bean será mantenido por Spring.

-  La palabra clave var se introdujo en Java 10. La inferencia de tipo se usa en
   palabra clave var en la que detecta automáticamente el tipo de datos de una variable
    en función del contexto circundante.

-  La palabra clave var se introdujo en Java 10. La inferencia de tipo se usa en
   palabra clave var en la que detecta automáticamente el tipo de datos de una variable
    en función del contexto circundante.

- La palabra clave var se introdujo en Java 10. La inferencia de tipo se usa en
   palabra clave var en la que detecta automáticamente el tipo de datos de una variable
    en función del contexto circundante.

- Los nombres de los métodos suelen seguir la notación de verbos. Pero para los métodos
     que utilizaremos para crear beans, puede usar sustantivos como nombres.
     Esta será una buena práctica, ya que los nombres de los métodos se volverán
     nombres de Beans también en el contexto

- Entonces, de esta manera, podemos crear cualquier cantidad de @Beans y cualquier tipo de @Bean
 con la ayuda de agregar el @Bean anotacion sobre un método Java.

 - Cada frijol tendrá su propio nombre. Usando ese nombre de frijol podemos
  referirnos en todos los demás lugares donde queramos aprovechar ese frijol dentro

  - Cada frijol tendrá su propio nombre. Usando ese nombre de frijol podemos referirnos en
   todos los demás lugares donde queramos aprovechar ese frijol dentro nuestra lógica de negocio.
 */

