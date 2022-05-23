package com.reyxa.backend.controller;

import java.io.IOException;
import java.io.InputStream;

//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RestController;

public class Atajos {
    private int tipoAtajo;

    public static void seleccion() {

    }

   
    public static void ejecutarComando(String comando) {
        Runtime runtime = Runtime.getRuntime();
        InputStream in = null;
        try {
            Process exec = runtime.exec("cmd.exe /c " + "start " + comando); // ejecutar el comando

            in = exec.getInputStream(); // Obtener el resultado de la ejecución

        } catch (IOException e) {
            e.printStackTrace();

        }
    }

}
