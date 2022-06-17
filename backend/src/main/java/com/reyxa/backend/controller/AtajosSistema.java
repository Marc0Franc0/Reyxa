package com.reyxa.backend.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AtajosSistema extends Atajos {
     
     //private static String programa;
     @GetMapping("/explorer")
     public static void abrirExplorador() {
          // abrir explorador de Windows
          programa = "explorer";
          service.ejecutarCmd("start "+programa);

     }
     @GetMapping("/explorerConsole")
     public static String listar() {
          // abrir explorador de Windows
       
return "Se abrio el explolorador de archivos";
     }

     @GetMapping("/notepad")
     public static void abrirBnotas() {
          // abrir block de notas
          programa = "notepad";
          service.ejecutarCmd("start "+programa);

     }

     @GetMapping("/Wconfig")
     public static void abrirConfig() {
          // abrir configuración de Windows
          programa = "ms-settings:";
          service.ejecutarCmd("start "+programa);

     }

     @GetMapping("/mstore")
     public static void abrirTienda() {
          // abrir Microsoft Store
          programa = "ms-windows-store:";
          service.ejecutarCmd("start "+programa);
     }

     @GetMapping("/word")
     public static void abrirWord() {
          // abrir Microsoft Store
          programa = "winword";
          service.ejecutarCmd("start "+programa);

     }
  

     /*@GetMapping("Wdefender")
     public static void abrirWdefender() {
         // abrir Windows Defender
         programa = "ms-settings:windowsdefender";
         ejecutarCmd(programa);
     }*/

     @GetMapping("desfragmentar")
     public static void abrirDesfrag() {
         // abrir Desfragmentar y Optimizar Unidades
         programa = "dfrgui.exe";
         service.ejecutarCmd("start "+programa);
     }

     @GetMapping("/paint")
     public static void abrirPaint() {
          // abrir paint
          programa = "mspaint";
          service.ejecutarCmd("start "+programa);

     }

     @GetMapping("/calculadora")
     public static void abrirCalculadora() {
          // abrir calculadora
          programa = "calc";
          service.ejecutarCmd("start "+programa);

     }

     @GetMapping("/panelControl")
     public static void abrirPanelControl() {
          // abrir panel de control
          programa = "control";
          service.ejecutarCmd("start "+programa);
     }
}
