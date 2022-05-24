package com.reyxa.backend.controller;

import java.io.IOException;
import java.io.InputStream;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Utilidades {
    private static String comando;

    public static void ejecutarComando(String comando) {
        Runtime runtime = Runtime.getRuntime();
        InputStream in = null;
        try {
            Process exec = runtime.exec("cmd.exe /c " + comando); // Ejecutar el comando

            in = exec.getInputStream(); // Obtener el resultado de la ejecución

        } catch (IOException e) {
            e.printStackTrace();

        }
    }

    @GetMapping("Papelera")
    public static void vaciarPapelera() {

        // rd /s /q c:\$Recycle.bin

        comando = "rd /s /q c:\\$Recycle.bin";
        ejecutarComando(comando);

    }

    /* Posibles implementaciones:
        - Actualizar pc (Buscar Actualizaciones)
        - Realizar un análisis con Windows Defender
        - Borrar Temporales
        - Abrir panel de control
    */


}
