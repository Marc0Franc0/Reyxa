package com.reyxa.backend.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/*Marca la clase como un controlador donde cada método devuelve 
un objeto de dominio en lugar de una vista. */
@RestController

public class AtajosWeb extends Atajos {
    //private static String url;

    @GetMapping("/clima")
    public static void verClima() {
        // start https://www.smn.gob.ar/
        url = "https://www.smn.gob.ar/";

        ejecutarCmd(url);
    }

    @GetMapping("/noticias")
    public static void verNoticias() {
        // start https://news.google.com/topstories?hl=es-419&gl=US&ceid=US:es-419
        url = "https://news.google.com/topstories?hl=es-419&gl=US&ceid=US:es-419";

        ejecutarCmd(url);

    }

    @GetMapping("/youtube")
    public static void abrirYT() {

        // start https://www.youtube.com/
        url = "https://www.youtube.com/";

        ejecutarCmd(url);

    }

    @GetMapping("/twitch")
    public static void abrirTwitch() {

        // start https://www.twitch.tv/
        url = "https://www.twitch.tv/";

        ejecutarCmd(url);

    }

    @GetMapping("/ig")
    public static void abrirIg() {

        // start https://www.instagram.com/?theme=dark
        url = "https://www.instagram.com/?theme=dark     ";

        ejecutarCmd(url);

    }

    @GetMapping("/wsp")
    public static void abrirWsp() {

        // start https://web.whatsapp.com/
        url = "https://web.whatsapp.com/";

        ejecutarCmd(url);

    }

    @GetMapping("/gmail")
    public static void abrirGmail() {

        // start https://www.google.com/
        url = "https://www.google.com/";

        ejecutarCmd(url);

    }

    @GetMapping("/netflix")
    public static void abrirNetflix() {

        // start https://www.netflix.com/ar/Login
        url = "https://www.netflix.com/ar/Login";

        ejecutarCmd(url);

    }

    @GetMapping("/spotify")
    public static void abrirSpotifyweb() {

        // start https://open.spotify.com/
        url = "https://open.spotify.com/";

        ejecutarCmd(url);

    }

     /* Queda ver si implementar o no estos atajos:
     
     * public static void abrirBrowser() {
     * // start https://www.google.com/
     * url = "https://www.google.com/";
     * 
     * ejecutarComando(url);
     * 
     * }
     */

    /*
     * public static void abrirTraductor() {
     * // start https://translate.google.com.ar/?hl=es
     * url = "https://translate.google.com.ar/?hl=es";
     * 
     * ejecutarComando(url);
     * 
     * }
     */

}
