package com.reyxa.backend.controller;
import com.reyxa.backend.service.Service;
import java.io.IOException;
import java.io.InputStream;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping
public class Utilidades {
    private static String comando;
private static Service service = new Service();
 
   

    @GetMapping("/papelera")
    public static void vaciarPapelera() {
        /*  rd /s /q c:\$Recycle.bin para el disco local
         * Cada comando borra los archivos que esten en la papelera de 
         * cada disco siempre que ese disco exista
        */
        comando = "rd /s /q a:\\$Recycle.bin ";
        service.ejecutarCmd(comando);

        comando="rd /s /q b:\\$Recycle.bin";
        service.ejecutarCmd(comando);
        
          comando="rd /s /q c:\\$Recycle.bin";
          service.ejecutarCmd(comando);

        comando="rd /s /q d:\\$Recycle.bin";
        service.ejecutarCmd(comando);

        comando="rd /s /q e:\\$Recycle.bin";
        service.ejecutarCmd(comando);

        comando="rd /s /q f:\\$Recycle.bin";
        service.ejecutarCmd(comando);

        comando="rd /s /q g:\\$Recycle.bin";
        service.ejecutarCmd(comando);

        comando="rd /s /q h:\\$Recycle.bin";
        service.ejecutarCmd(comando);

        comando="rd /s /q i:\\$Recycle.bin";
        service.ejecutarCmd(comando);
        comando="rd /s /q j:\\$Recycle.bin";
        service.ejecutarCmd(comando);

        comando="rd /s /q k:\\$Recycle.bin";
        service.ejecutarCmd(comando);

        comando="rd /s /q l:\\$Recycle.bin";
        service.ejecutarCmd(comando);

        comando="rd /s /q m:\\$Recycle.bin";
        service.ejecutarCmd(comando);

        comando="rd /s /q n:\\$Recycle.bin";
        service.ejecutarCmd(comando);

        comando="rd /s /q o:\\$Recycle.bin";
        service.ejecutarCmd(comando);

        comando="rd /s /q p:\\$Recycle.bin";
        service.ejecutarCmd(comando);

        comando="rd /s /q q:\\$Recycle.bin";
        service.ejecutarCmd(comando);

        comando="rd /s /q r:\\$Recycle.bin";
        service.ejecutarCmd(comando);
        
        comando="rd /s /q s:\\$Recycle.bin";
        service.ejecutarCmd(comando);

        comando="rd /s /q t:\\$Recycle.bin";
        service.ejecutarCmd(comando);

        comando="rd /s /q u:\\$Recycle.bin";
        service.ejecutarCmd(comando);

        comando="rd /s /q v:\\$Recycle.bin";
        service.ejecutarCmd(comando);

        comando="rd /s /q w:\\$Recycle.bin";
        service.ejecutarCmd(comando);

        comando="rd /s /q x:\\$Recycle.bin";
        service.ejecutarCmd(comando);

        comando="rd /s /q y:\\$Recycle.bin";
        service.ejecutarCmd(comando);

        comando="rd /s /q z:\\$Recycle.bin";
        service.ejecutarCmd(comando);

    }

    @GetMapping("/antivirus")
    public static void realizarAnalisis() {
        comando = "start-MpScan";
        service.ejecutarPowerShell(comando);
    }

    @GetMapping("/programarapagado")
    public static void programarApagado(@RequestParam(value = "tiempo") int tiempo) {
        // shutdown -s -t (tiempo en segundos sin los parentesis)

        // Recibe el tiempo deseado para el apagado
        comando = "shutdown -s -t " + tiempo;
        service.ejecutarCmd(comando);

    }   
    @GetMapping("/cancelarapagado")
    public static void cancelarApagado() {


    
        comando = "shutdown /a " ;
        service.ejecutarCmd(comando);

    }

    @GetMapping("/wupdate")
    public static void abrirWupdate() {
      

        comando = "start ms-settings:windowsupdate";
        service.ejecutarCmd(comando);

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
