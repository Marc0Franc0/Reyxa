package com.reyxa.backend.controller;

import java.io.IOException;
import java.io.InputStream;

public class Asistente {

    //Atributos para la clase Atajos
    public static String programa;
    public static String url;

    //Atributos para la clase utilidades
    public static String comando;

    //Métodos utlizados en la clase AtajosSistema, AtajosWeb y Utilidades

    public static void ejecutarCmd(String comando) {
        Runtime runtime = Runtime.getRuntime();
        InputStream in = null;
        try {
            Process exec = runtime.exec("cmd.exe /c " + comando); // Ejecutar el comando

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

    //Instancias de clases utilizadas dentro del package
  // static Service service = new Service();



}
