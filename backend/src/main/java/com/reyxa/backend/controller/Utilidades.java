package com.reyxa.backend.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class Utilidades extends Asistente {


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

    @GetMapping("/programarapagado")
    public static void programarApagado(@RequestParam(value = "tiempo") int tiempo) {
        // shutdown -s -t (tiempo en segundos sin los parentesis)

        // Recibe el tiempo deseado para el apagado
        comando = "shutdown -s -t " + tiempo;
        ejecutarCmd(comando);

    }   
    @GetMapping("/cancelarapagado")
    public static void cancelarApagado() {

        comando = "shutdown /a " ;
        ejecutarCmd(comando);

    }

    @GetMapping("/wupdate")
    public static void abrirWupdate() {
      

        comando = "start ms-settings:windowsupdate";
        ejecutarCmd(comando);

    }
    
   
}
