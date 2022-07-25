package com.reyxa.backend.controller;

import java.io.IOException;
import java.io.InputStream;

//import com.reyxa.backend.service.DescComandoService;
import com.reyxa.backend.service.ComandoSistemaService;
import com.reyxa.backend.service.ComandoUtilidadService;
import com.reyxa.backend.service.ComandoWebService;

import org.springframework.beans.factory.annotation.Autowired;

public class Asistente {

    //Atributos para las clase AtajosSistema y AtajosWeb
    public static String programa;
    public static String url;

    //Atributos para la clase utilidades
    public static String comando;

    //Métodos utlizados en la clase AtajosSistema, AtajosWeb y Utilidades
    public static void ejecutarCmd(Object object) {
        Runtime runtime = Runtime.getRuntime();
        InputStream in = null;
        try {
            Process exec = runtime.exec("cmd.exe /c " + object); // Ejecutar el comando

            in = exec.getInputStream(); // Obtener el resultado de la ejecución
            exec.getOutputStream().close(); // Cerrar la consola de segundo plano
        } catch (IOException e) {
            e.printStackTrace();

        }
    }
    public static void ejecutarPowerShell(String comando) {
        Runtime runtime = Runtime.getRuntime();
        InputStream in = null;
    
        try {
            Process exec = runtime.exec("powershell.exe " + comando); // Ejecutar el comando
            in = exec.getInputStream(); // Obtener el resultado de la ejecución
            exec.getOutputStream().close();// Cerrar la consola de segundo plano
        } catch (IOException e) {
            e.printStackTrace();
    
        }
    }

    //Instancias de servicios utilizadas dentro del package
  @Autowired
  public ComandoSistemaService comandoSistemaService;
  @Autowired
  public ComandoUtilidadService comandoUtilidadService;
  @Autowired
  public ComandoWebService comandoWebService;


}
