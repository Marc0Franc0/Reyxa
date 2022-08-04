package com.reyxa.backend.controller;



import org.springframework.web.bind.annotation.GetMapping;


//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.reyxa.backend.Asistente;
import com.reyxa.backend.model.comandos.ComandoSistema;
import com.reyxa.backend.model.comandos.DescripcionComando;



@RestController
public class AtajosSistema extends Asistente {
    DescripcionComando descripcionComando = new DescripcionComando();
    ComandoSistema Comando = new ComandoSistema();


    //List<Comando> comandos = ComandoService.listaComandos();

   //List<DescripcionComando> DescripcionComandos =  DescComandoService.listadescripcion();

    
    /*@GetMapping("/explorer")
    public void abrirExploradorid() {
   String descripcion = DescComandoService.busDescripcionComandos(0).getDescripcion();
    ejecutarCmd(descripcion);
    }*/
    
    @GetMapping("/notepad")
    public void abrirNotepad() {
      
   String descripcion = comandoSistemaService.getcomando(1).getId_descripcion().getDescripcion();
    ejecutarCmd(descripcion);
    
    }
    @GetMapping("/explorer")
    public void abrirExplorer() {
   String descripcion = comandoSistemaService.getcomando(2).getId_descripcion().getDescripcion();
    ejecutarCmd(descripcion);
    }


    @GetMapping("/paint")
    public void abrirPaint() {
   String descripcion = comandoSistemaService.getcomando(3).getId_descripcion().getDescripcion();
    ejecutarCmd(descripcion);
    }
   

    @GetMapping("/calculadora")
    public void abrirCalculadora() {
   String descripcion = comandoSistemaService.getcomando(4).getId_descripcion().getDescripcion();
    ejecutarCmd(descripcion);
    }


    @GetMapping("/Wconfig")
    public void abrirConfig() {
   String descripcion = comandoSistemaService.getcomando(5).getId_descripcion().getDescripcion();
    ejecutarCmd(descripcion);
    }
    /*@GetMapping("/explorer2")
    public void abrirExplorador2() {

        descripcionComando.setDescripcion("start explorer.exe");
   ejecutarCmd(descripcionComando.getDescripcion());
    }*/

   /*  @GetMapping("/explorer")
    public static void abrirExplorador() {
        // abrir explorador de Windows
        programa = "explorer";
        ejecutarCmd("start " + programa);

    }

    @GetMapping("/explorerConsole")
    public static String listar() {
        // abrir explorador de Windows

        return "Se abrio el explolorador de archivos";
    }

    /*@GetMapping("/notepad")
    public static void abrirBnotas() {
        // abrir block de notas
        programa = "notepad";
        ejecutarCmd("start " + programa);

    }

    @GetMapping("/Wconfig")
    public static void abrirConfig() {
        // abrir configuración de Windows
        programa = "ms-settings:";
        ejecutarCmd("start " + programa);

    }

    @GetMapping("/mstore")
    public static void abrirTienda() {
        // abrir Microsoft Store
        programa = "ms-windows-store:";
        ejecutarCmd("start " + programa);

    }

    @GetMapping("/paint")
    public static void abrirPaint() {
        // abrir paint
        programa = "mspaint";
        ejecutarCmd("start " + programa);

    }

    @GetMapping("/calculadora")
    public static void abrirCalculadora() {
        // abrir calculadora
        programa = "calc";
        ejecutarCmd("start " + programa);

    }

    @GetMapping("/panelControl")
    public static void abrirPanelControl() {
        // abrir panel de control
        programa = "control";
        ejecutarCmd("start " + programa);

    }*/
}
