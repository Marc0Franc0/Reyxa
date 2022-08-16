package com.reyxa.backend;

import java.io.IOException;
import java.io.InputStream;

import com.reyxa.backend.service.comandos.ComandoService;
import com.reyxa.backend.service.comandos.ComandoSistemaService;
import com.reyxa.backend.service.comandos.ComandoUtilidadService;
import com.reyxa.backend.service.comandos.ComandoWebService;
import com.reyxa.backend.service.opiniones.OpinionService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
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
    public ComandoSistemaService comandoSistemaService;
    @Autowired
    public ComandoUtilidadService comandoUtilidadService;
    @Autowired
    public ComandoWebService comandoWebService;
  
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
    public String obtenerComandoSistema (String nombreComando){
        idComando = comandoService.findBynombre(nombreComando);
        return comandoService.getcomandoSist(idComando).getId_descripcion().getDescripcion();
    }
    public String obtenerComandoWeb (String nombreComando){
        idComando = comandoService.findBynombre(nombreComando);
        return comandoService.getcomandoWeb(idComando).getId_descripcion().getDescripcion();
    }public String obtenerComandoUti (String nombreComando){
        idComando = comandoService.findBynombre(nombreComando);
        return comandoService.getcomandoUti(idComando).getId_descripcion().getDescripcion();
    }
}

