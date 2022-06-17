package com.reyxa.backend.service;

import java.io.IOException;
import java.io.InputStream;

public class Service {
     /* Metodo para poder ejecutar comandos de la consola CMD */
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

 /* Metodo para poder ejecutar comandos de la consola PowerShell */
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

}