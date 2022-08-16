package com.reyxa.backend.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.reyxa.backend.Asistente;




@RestController
public class Utilidades extends Asistente {
    @GetMapping("/papelera")
    public  void vaciarPapelera() {
        /* 
         * Cada comando borra los archivos que esten en la papelera de 
         * cada disco siempre que ese disco exista
        */

     for(int i=5; i< 30;i++){
//String descripcion = comandoUtilidadService.getcomando(i).getId_descripcion().getDescripcion();
obtenerComandoSistema("papelera");
ejecutarCmd(descripcionComando);

     }
      
    }
    @GetMapping("/antivirus")
    public void realizarAnalisis() {
        obtenerComandoSistema("Wconfig");
        ejecutarCmd(descripcionComando);
    }
/* 
    @GetMapping("/antivirus")
    public static void realizarAnalisis() {
        comando = "start-MpScan";
        ejecutarPowerShell(comando);
    }*/
    @GetMapping("/programarapagado")
    public void programarApagado(@RequestParam(value = "tiempo") int tiempo) {
   
        obtenerComandoSistema("Wconfig");
        ejecutarCmd(descripcionComando);
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

        obtenerComandoSistema("Wconfig");
        ejecutarCmd(descripcionComando);
    }/* 
    @GetMapping("/cancelarapagado")
    public static void cancelarApagado() {

        comando = "shutdown /a " ;
        ejecutarCmd(comando);

    }*/


    @GetMapping("/wupdate")
    public void abrirWupdate() {
  
        obtenerComandoSistema("Wconfig");
        ejecutarCmd(descripcionComando);
    }
/* 
    @GetMapping("/wupdate")
    public static void abrirWupdate() {
      

        comando = "start ms-settings:windowsupdate";
        ejecutarCmd(comando);

    }*/
    
   
}
