package com.reyxa.backend.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AtajosSistema extends Asistente{
     
     //private static String programa;
     
     @GetMapping("/explorer")
     public static void abrirExplorador() {
          // abrir explorador de Windows
         programa = "explorer";
         ejecutarCmd("start "+programa);

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
          ejecutarCmd("start "+programa);


     }

     @GetMapping("/Wconfig")
     public static void abrirConfig() {
          // abrir configuración de Windows
          programa = "ms-settings:";
          ejecutarCmd("start "+programa);


     }

     @GetMapping("/mstore")
     public static void abrirTienda() {
          // abrir Microsoft Store
          programa = "ms-windows-store:";
          ejecutarCmd("start "+programa);

     }



     @GetMapping("/paint")
     public static void abrirPaint() {
          // abrir paint
          programa = "mspaint";
          ejecutarCmd("start "+programa);

     }

     @GetMapping("/calculadora")
     public static void abrirCalculadora() {
          // abrir calculadora
          programa = "calc";
          ejecutarCmd("start "+programa);


     }

     @GetMapping("/panelControl")
     public static void abrirPanelControl() {
          // abrir panel de control
          programa = "control";
          ejecutarCmd("start "+programa);

     }
}
