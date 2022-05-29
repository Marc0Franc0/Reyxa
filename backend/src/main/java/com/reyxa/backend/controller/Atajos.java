package com.reyxa.backend.controller;

import java.io.IOException;
import java.io.InputStream;

//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RestController;

public class Atajos {

    public static String programa;
    public static String url;

    /* public static void seleccion() {
    }*/


    //Método para abir cmd y ejecutar los comandos
    public static void ejecutarCmd(String comando) {
        Runtime runtime = Runtime.getRuntime();
        InputStream in = null;
        try {
            Process exec = runtime.exec("cmd.exe /c " + "start " + comando); // Ejecutar el comando

            in = exec.getInputStream(); // Obtener el resultado de la ejecución
            exec.getOutputStream().close();// Se cierra la consola de segundo plano
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    /* IMPORTANTE:
     * Por medio de un switch, enlazado a la Interfaz Gráfica, vamos a pedirle al
     * usuario qué tipo de atajo quiere utilizar (De Sistema o Web). */

}
