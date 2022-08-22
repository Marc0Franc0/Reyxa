package com.reyxa.backend;

import java.io.IOException;
import java.io.InputStream;

import com.reyxa.backend.service.comandos.ComandoService;
import com.reyxa.backend.service.opiniones.OpinionService;

import org.springframework.beans.factory.annotation.Autowired;

public class Asistente {

    private static Runtime runtime = Runtime.getRuntime();
    private static InputStream in = null;

    //Atributos para las clase AtajosSistema y AtajosWeb
    
    public int idComando;
    public String descripcionComando;
    //Atributos para la clase utilidades
    public static String comando;

    //Instancias de servicios utilizadas dentro del package
    @Autowired
    public OpinionService opinionService;
    @Autowired
    public ComandoService comandoService;
  
    //Métodos utlizados en la clase AtajosSistema, AtajosWeb y Utilidades
    public static void ejecutarCmd(Object object) {
      
        try {
            Process exec = runtime.exec("cmd.exe /c " + object); // Ejecutar el comando

            in = exec.getInputStream(); // Obtener el resultado de la ejecución
          exec.getOutputStream().close(); // Cerrar la consola de segundo plano
        } catch (IOException e) {
            e.printStackTrace();

        }
    }
    public static void ejecutarPowerShell(Object object) {
        //Runtime runtime = Runtime.getRuntime();
        //InputStream in = null;
    
        try {
            Process exec = runtime.exec("powershell.exe " + object); // Ejecutar el comando
            in = exec.getInputStream(); // Obtener el resultado de la ejecución
            exec.getOutputStream().close();// Cerrar la consola de segundo plano
        } catch (IOException e) {
            e.printStackTrace();
    
        }
    }
    
    //Metodos utilizados en el package controller para obtener la descripcion de los comandos

    public String obtenerComando (String nombreComando){
        idComando = comandoService.findBynombre(nombreComando);
        return comandoService.getcomando(idComando).getId_descripcion().getDescripcion();
    }
}

