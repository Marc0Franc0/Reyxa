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
          ejecutarCmd(programa);

     }
     @GetMapping("/hola")
     public static String listar() {
          // abrir explorador de Windows
       
return "hola";
     }

     @GetMapping("/notepad")
     public static void abrirBnotas() {
          // abrir block de notas
          programa = "notepad";
          ejecutarCmd(programa);

     }

     @GetMapping("/Wconfig")
     public static void abrirConfig() {
          // abrir configuración de Windows
          programa = "ms-settings:";
          ejecutarCmd(programa);

     }

     @GetMapping("/Mstore")
     public static void abrirTienda() {
          // abrir Microsoft Store
          programa = "ms-windows-store:";
          ejecutarCmd(programa);

     }

     @GetMapping("actualizaciones")
     public static void buscarActualizaciones() {
         // abrir Windows Update
         programa = "ms-settings:windowsupdate";
         ejecutarCmd(programa);
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
         ejecutarCmd(programa);
     }

     @GetMapping("/paint")
     public static void abrirPaint() {
          // abrir paint
          programa = "mspaint";
          ejecutarCmd(programa);

     }

     @GetMapping("/calculadora")
     public static void abrirCalculadora() {
          // abrir calculadora
          programa = "calc";
          ejecutarCmd(programa);

     }

     @GetMapping("/panelControl")
     public static void abrirPanelControl() {
          // abrir panel de control
          programa = "control";
          ejecutarCmd(programa);

     }
}
