package com.reyxa.backend.controller;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;


// Anotación encargada de definir que la clase es una clase de configuración para el framework
@Configuration

// Importa las configuraciones de MVC
@EnableWebMvc

/*
 * Esta clase es necesaria para las restricciones del CORS 
 * (intercambio de recursos de origen cruzado). En palabras simples 
 * el backend percibe los requests del frontend como proviniendo de otro dominio. 
 * Permite que una página web solicite recursos adicionales en el navegador 
 * desde otros dominios. Ayuda a servir contenido web 
 * de múltiples dominios en navegadores que generalmente tienen la 
 * misma política de seguridad de origen. 
 */
public class WebConfiguration implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry registry) {
registry.addMapping("/**").allowedMethods("*");
    }

}
