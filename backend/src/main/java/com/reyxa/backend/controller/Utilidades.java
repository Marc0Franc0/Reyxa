package com.reyxa.backend.controller;

import java.io.IOException;
import java.io.InputStream;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Utilidades {
    private static String comando;

    /* No se utiliza el mismo metodo que el de atajos, es similar pero
    no igual en cuanto al contenido del comando ("start"), ya que los atajos
    utilizan todos el comando "start" y las utilidades no. */

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


    @GetMapping("/papelera")
    public static void vaciarPapelera() {
        /*  rd /s /q c:\$Recycle.bin para el disco local
         * Cada comando borra los archivos que esten en la papelera de 
         * cada disco siempre que ese disco exista
        */
        comando = "rd /s /q a:\\$Recycle.bin ";
        ejecutarCmd(comando);

        comando="rd /s /q b:\\$Recycle.bin";
        ejecutarCmd(comando);
        
          comando="rd /s /q c:\\$Recycle.bin";
        ejecutarCmd(comando);

        comando="rd /s /q d:\\$Recycle.bin";
        ejecutarCmd(comando);

        comando="rd /s /q e:\\$Recycle.bin";
        ejecutarCmd(comando);

        comando="rd /s /q f:\\$Recycle.bin";
        ejecutarCmd(comando);

        comando="rd /s /q g:\\$Recycle.bin";
        ejecutarCmd(comando);

        comando="rd /s /q h:\\$Recycle.bin";
        ejecutarCmd(comando);

        comando="rd /s /q i:\\$Recycle.bin";
        ejecutarCmd(comando);

        comando="rd /s /q j:\\$Recycle.bin";
        ejecutarCmd(comando);

        comando="rd /s /q k:\\$Recycle.bin";
        ejecutarCmd(comando);

        comando="rd /s /q l:\\$Recycle.bin";
        ejecutarCmd(comando);

        comando="rd /s /q m:\\$Recycle.bin";
        ejecutarCmd(comando);

        comando="rd /s /q n:\\$Recycle.bin";
        ejecutarCmd(comando);

        comando="rd /s /q o:\\$Recycle.bin";
        ejecutarCmd(comando);

        comando="rd /s /q p:\\$Recycle.bin";
        ejecutarCmd(comando);

        comando="rd /s /q q:\\$Recycle.bin";
        ejecutarCmd(comando);

        comando="rd /s /q r:\\$Recycle.bin";
        ejecutarCmd(comando);
        
        comando="rd /s /q s:\\$Recycle.bin";
        ejecutarCmd(comando);

        comando="rd /s /q t:\\$Recycle.bin";
        ejecutarCmd(comando);

        comando="rd /s /q u:\\$Recycle.bin";
        ejecutarCmd(comando);

        comando="rd /s /q v:\\$Recycle.bin";
        ejecutarCmd(comando);

        comando="rd /s /q w:\\$Recycle.bin";
        ejecutarCmd(comando);

        comando="rd /s /q x:\\$Recycle.bin";
        ejecutarCmd(comando);

        comando="rd /s /q y:\\$Recycle.bin";
        ejecutarCmd(comando);

        comando="rd /s /q z:\\$Recycle.bin";
        ejecutarCmd(comando);

    }

    @GetMapping("/antivirus")
    public static void realizarAnalisis() {
        comando = "start-MpScan";
        ejecutarPowerShell(comando);
    }

    @GetMapping("/apagado")
    public static void programarApagado() {
        // shutdown -s -t (tiempo en segundos sin los parentesis)

        // Recibe el tiempo deseado para el apagado
        int tiempo = 3600;

        comando = "shutdown -s -t " + tiempo;
        ejecutarCmd(comando);

    }

    @GetMapping("/wupdate")
    public static void abrirWupdate() {
        // shutdown -s -t (tiempo en segundos sin los parentesis)

        comando = "start ms-settings:windowsupdate";
        ejecutarCmd(comando);

    }
    
   
    /*
     * Posibles Implementaciones:
        - Actualizar pc (Buscar Actualizaciones) -> Funciona, es un acceso para luego que la busque el usuario
        - Realizar un análisis con Windows Defender->Implementado:funciona, es un analisis rápido.
        - Abrir panel de control -> Listo
        - Programar apagado-> Implementado:funciona, solo queda ver la conversion del tiempo.
        - Vaciar Papelera->Implementado:Funciona, solo para el disco local del sistema.

        
        - Borrar Temporales
        - Liberar ram
        - Bajar o subir brillo
     */
}
