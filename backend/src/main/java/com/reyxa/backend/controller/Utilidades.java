package com.reyxa.backend.controller;

import java.io.IOException;
import java.io.InputStream;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Utilidades {
    private static String comando;

    /*
     * No se utiliza el mismo metodo que el de atajos, es similar pero
     * no  igual en cuanto al contenido del comando ("start"), ya que los atajos utilizan todos
     * el comando "start" y las utilidades no
     */
    public static void ejecutarCmd(String comando) {
        Runtime runtime = Runtime.getRuntime();
        InputStream in = null;
        try {
            Process exec = runtime.exec("cmd.exe /c " + comando); // Ejecutar el comando

            in = exec.getInputStream(); // Obtener el resultado de la ejecución
            exec.getOutputStream().close();//Se cierra la consola de segundo plano
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
            exec.getOutputStream().close();//Se cierra la consola de segundo plano
        } catch (IOException e) {
            e.printStackTrace();

        }
    }


    @GetMapping("papelera")
    public static void vaciarPapelera() {

        // rd /s /q c:\$Recycle.bin para el disco local

        comando = "rd /s /q c:\\$Recycle.bin";
        ejecutarCmd(comando);

    }


    @GetMapping("antivirus")
    public static void realizarAnalisis() {
        
        comando = "start-MpScan";
        ejecutarPowerShell(comando);

    }

    @GetMapping("actualizaciones")
    public static void buscarActualizaciones() {

        //

        comando = "";
        ejecutarCmd(comando);

    }

    @GetMapping("apagado")
    public static void programarApagado() {
        // shutdown -s -t (tiempo en segundos sin los parentesis)

        // Recibe el tiempo deseado para el apagado
        int tiempo = 0;

        comando = "shutdown -s -t " + tiempo;
        ejecutarCmd(comando);

    }

    /*
     * Posibles implementaciones:
     * - Actualizar pc (Buscar Actualizaciones)->
     * - Realizar un análisis con Windows Defender->Implementado:funciona, es un analisis rápido.
     * - Borrar Temporales
     * - Abrir panel de control
     * -Liberar ram
     * -programar apagado->Implementado:funciona, solo queda ver la conversion del tiempo.
     * -bajar o subir brillo
     * -Vaciar Papelera->Implementado:Funciona, solo para el disco local del sistema.
     * -
     */

}
