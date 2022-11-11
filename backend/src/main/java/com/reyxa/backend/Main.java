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
    private ComandoService comandoService;

  
    //Métodos utlizados en la clase ComandoController
    /*Metodo que ejecuta comandos por medio del cmd en segundo plano*/
    public static void ejecutarCmd(Object object) {
      
        try {
            Process exec = runtime.exec("cmd.exe /c " + object); // Ejecutar el comando
/*Para la ejecución del comando se guarda de en un objeto de la clase Process la ejecución del comando, la cual
        es en segundo plano. Luego con un objeto de la clase InputStream se muestra en pantalla el resultado de la ejecución del comando.
         */
            in = exec.getInputStream(); // Obtener el resultado de la ejecución
      
        } catch (IOException e) {
            e.printStackTrace();

        }
    }

    /*Metodo que ejecuta comandos por medio de WindowsPowerShell en segundo plano*/
    public static void ejecutarPowerShell(Object object) {

        /*Para la ejecución del comando se guarda de en un objeto de la clase Process la ejecución del comando, la cual
        es en segundo plano. Luego con un objeto de la clase InputStream se muestra en pantalla el resultado de la ejecución del comando.
         */
        try {
            Process exec = runtime.exec("powershell.exe " + object); 
            in = exec.getInputStream(); // Obtener el resultado de la ejecución

        } catch (IOException e) {
            e.printStackTrace();
    
        }
    }
    
    /*Metodo que utilizado el nombre de un comando busca su id y lo guarda para luego buscar por medio
    de su id su sintaxis
    */

    public String obtenerComando (String nombreComando){
         int idComando;
        idComando = comandoService.obtenerId(nombreComando);
        return comandoService.getcomando(idComando).getSintaxis_comando().getSintaxis();
    }
}
