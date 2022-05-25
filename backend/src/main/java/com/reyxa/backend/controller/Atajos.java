package com.reyxa.backend.controller;

import java.io.IOException;
import java.io.InputStream;

//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RestController;

public class Atajos {

    public static String programa;
    public static String url;
    /*
     * public static void seleccion() {
     * 
     * }
     */

    public static void ejecutarComando(String comando) {
        Runtime runtime = Runtime.getRuntime();
        InputStream in = null;
        try {
            Process exec = runtime.exec("cmd.exe /c " + "start " + comando); // Ejecutar el comando

            in = exec.getInputStream(); // Obtener el resultado de la ejecución

        } catch (IOException e) {
            e.printStackTrace();

        }
    }

    /*
     * Por medio de un switch, enlazado a la Interfaz Gráfica, vamos a pedirle al
     * usuario
     * que tipo de atajo quiere utilizar (Sistema o Web).
     */

}
