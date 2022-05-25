package com.reyxa.backend.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AtajosSistema extends Atajos {
     //private static String programa;

     @GetMapping("/explorer")
     public static void abrirExplorador() {
          // start explorer
          programa = "explorer";
          ejecutarComando(programa);

     }

     @GetMapping("/notepad")
     public static void abrirBnotas() {
          // start notepad

          programa = "notepad";
          ejecutarComando(programa);

     }

     @GetMapping("/Wconfig")
     public static void abrirConfig() {

          programa = "ms-settings:";
          ejecutarComando(programa);

     }

     @GetMapping("/paint")
     public static void abrirPaint() {
          // start mspaint

          programa = "mspaint";
          ejecutarComando(programa);

     }

     @GetMapping("/calculadora")
     public static void abrirCalculadora() {
          // start calc

          programa = "calc";
          ejecutarComando(programa);

     }

     /*@GetMapping("/recorder")
     public static void abrirRecorder() {
          // start psr

          programa = "psr";
          ejecutarComando(programa);

     }*/
}
