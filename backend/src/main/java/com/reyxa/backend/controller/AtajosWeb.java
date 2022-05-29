package com.reyxa.backend.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/* Marca la clase como un controlador donde cada método devuelve 
un objeto de dominio en lugar de una vista. */
@RestController

public class AtajosWeb extends Atajos {
    //private static String url;

    @GetMapping("/clima")
    public static void verClima() {
        // abrir página de clima
        url = "https://www.smn.gob.ar/";

        ejecutarCmd(url);
    }

    @GetMapping("/noticias")
    public static void verNoticias() {
        // abrir página de noticias
        url = "https://news.google.com/topstories?hl=es-419&gl=US&ceid=US:es-419";

        ejecutarCmd(url);
    }

    @GetMapping("/youtube")
    public static void abrirYT() {
        // abrir Youtube
        url = "https://www.youtube.com/";

        ejecutarCmd(url);
    }

    @GetMapping("/twitch")
    public static void abrirTwitch() {
        // abrir Twitch
        url = "https://www.twitch.tv/";

        ejecutarCmd(url);
    }

    @GetMapping("/ig")
    public static void abrirIg() {
        // abrir Instagram Web
        url = "https://www.instagram.com/?theme=dark     ";

        ejecutarCmd(url);
    }

    @GetMapping("/wsp")
    public static void abrirWsp() {
        // abrir Whatsapp Web
        url = "https://web.whatsapp.com/";

        ejecutarCmd(url);
    }

    @GetMapping("/gmail")
    public static void abrirGmail() {
        // abrir Gmail
        url = "https://www.google.com/";

        ejecutarCmd(url);
    }

    @GetMapping("/netflix")
    public static void abrirNetflix() {
        // abrir Netflix
        url = "https://www.netflix.com/ar/Login";

        ejecutarCmd(url);
    }

    @GetMapping("/spotify")
    public static void abrirSpotifyweb() {
        // abrir Spotify Web
        url = "https://open.spotify.com/";

        ejecutarCmd(url);
    }


     /* Implementaciones a Incorporar:
     
    - Añadir un link de una playlist con música lofi

     --> ABRIR GOOGLE
      public static void abrirBrowser() {
        // abrir Google
        url = "https://www.google.com/";
    
        ejecutarComando(url); 
    }
     
    --> ABRIR TRADUCTOR
    public static void abrirTraductor() {
        // abrir Google Traductor
        url = "https://translate.google.com.ar/?hl=es";

      ejecutarComando(url); 
    }
    */
}
