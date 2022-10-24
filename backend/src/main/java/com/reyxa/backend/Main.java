package com.reyxa.backend;

import java.io.IOException;
import java.io.InputStream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.reyxa.backend.service.ComandoService;
import com.reyxa.backend.service.UsuarioService;

/* Anotación que indica a Spring que es una aplicación de SpringBoot */
@SpringBootApplication
/*
 * Clase principal que brinda el metodo main y demas metodos y objetos utilizados en las demas clases
 * 
 */
public class Main {

    public static void main(String[] args) {
		SpringApplication.run(Main.class, args);
	}
  
    private static Runtime runtime = Runtime.getRuntime();
    
    private static InputStream in = null;

    //Instancia de servicio utilizada dentro de la clase usuarioController
    @Autowired
    public UsuarioService usuarioService;

//Se utiliza dentro de esta clase
    @Autowired
    public ComandoService comandoService;

  
    //Métodos utlizados en la clase ComandoController
    /*Metodo que ejecuta comandos por medio del cmd en segundo plano*/
    public static void ejecutarCmd(Object object) {
      
        try {
            Process exec = runtime.exec("cmd.exe /c " + object); // Ejecutar el comando

            in = exec.getInputStream(); // Obtener el resultado de la ejecución
          exec.getOutputStream().close(); // Cerrar la consola de segundo plano
        } catch (IOException e) {
            e.printStackTrace();

        }
    }

    /*Metodo que ejecuta comandos por medio de WindowsPowerShell en segundo plano*/
    public static void ejecutarPowerShell(Object object) {

        try {
            Process exec = runtime.exec("powershell.exe " + object); // Ejecutar el comando
            in = exec.getInputStream(); // Obtener el resultado de la ejecución
            exec.getOutputStream().close();// Cerrar la consola de segundo plano
        } catch (IOException e) {
            e.printStackTrace();
    
        }
    }
    
    /*Metodo utilizado en el package controller para obtener la descripcion de los comandos dentro
    de la clase ComandoController
    */

    public String obtenerComando (String nombreComando){
         int idComando;
        idComando = comandoService.obtenerId(nombreComando);
        return comandoService.getcomando(idComando).getSintaxis_comando().getSintaxis();
    }
}
