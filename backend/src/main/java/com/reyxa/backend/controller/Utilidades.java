package com.reyxa.backend.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;




@RestController
public class Utilidades extends Asistente {
    @GetMapping("/papelera")
    public  void vaciarPapelera() {
        /* 
         * Cada comando borra los archivos que esten en la papelera de 
         * cada disco siempre que ese disco exista
        */
     for(int i=5; i< 30;i++){
String descripcion = comandoUtilidadService.getcomando(i).getId_descripcion().getDescripcion();
ejecutarCmd(descripcion);
     }
      
    }
    @GetMapping("/antivirus")
    public void realizarAnalisis() {
   String descripcion = comandoUtilidadService.getcomando(3).getId_descripcion().getDescripcion();
   ejecutarPowerShell(descripcion);
    }
/* 
    @GetMapping("/antivirus")
    public static void realizarAnalisis() {
        comando = "start-MpScan";
        ejecutarPowerShell(comando);
    }*/
    @GetMapping("/programarapagado")
    public void programarApagado(@RequestParam(value = "tiempo") int tiempo) {
   String descripcion = comandoUtilidadService.getcomando(1).getId_descripcion().getDescripcion();
    ejecutarCmd(descripcion+tiempo);
    }
/* 
    @GetMapping("/programarapagado")
    public static void programarApagado(@RequestParam(value = "tiempo") int tiempo) {
        // shutdown -s -t (tiempo en segundos sin los parentesis)

        // Recibe el tiempo deseado para el apagado
        comando = "shutdown -s -t " + tiempo;
        ejecutarCmd(comando);

    }   */
    @GetMapping("/cancelarapagado")
    public void cancelarApagado() {
   String descripcion = comandoUtilidadService.getcomando(2).getId_descripcion().getDescripcion();
    ejecutarCmd(descripcion);
    }/* 
    @GetMapping("/cancelarapagado")
    public static void cancelarApagado() {

        comando = "shutdown /a " ;
        ejecutarCmd(comando);

    }*/


    @GetMapping("/wupdate")
    public void abrirWupdate() {
   String descripcion = comandoUtilidadService.getcomando(4).getId_descripcion().getDescripcion();
    ejecutarCmd(descripcion);
    }
/* 
    @GetMapping("/wupdate")
    public static void abrirWupdate() {
      

        comando = "start ms-settings:windowsupdate";
        ejecutarCmd(comando);

    }*/
    
   
}
