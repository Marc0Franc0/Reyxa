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

        service.ejecutarCmd("start "+url);
    }

    @GetMapping("/noticias")
    public static void verNoticias() {
        // abrir página de noticias
        url = "https://news.google.com/topstories?hl=es-419&gl=US&ceid=US:es-419";

        service.ejecutarCmd("start "+url);
    }

    @GetMapping("/youtube")
    public static void abrirYT() {
        // abrir Youtube
        url = "https://www.youtube.com/";

        service.ejecutarCmd("start "+url);
    }

    @GetMapping("/twitch")
    public static void abrirTwitch() {
        // abrir Twitch
        url = "https://www.twitch.tv/";

        service.ejecutarCmd("start "+url);
    }

    @GetMapping("/ig")
    public static void abrirIg() {
        // abrir Instagram Web
        url = "https://www.instagram.com/?theme=dark     ";

        service.ejecutarCmd("start "+url);
    }

    @GetMapping("/wsp")
    public static void abrirWsp() {
        // abrir Whatsapp Web
        url = "https://web.whatsapp.com/";

        service.ejecutarCmd("start "+url);
    }

    @GetMapping("/gmail")
    public static void abrirGmail() {
        // abrir Gmail
        url = "https://mail.google.com/mail/u/0/#inbox";

        service.ejecutarCmd("start "+url);
    }

    @GetMapping("/netflix")
    public static void abrirNetflix() {
        // abrir Netflix
        url = "https://www.netflix.com/ar/Login";

        service.ejecutarCmd("start "+url);
    }

    @GetMapping("/spotify")
    public static void abrirSpotifyweb() {
        // abrir Spotify Web
        url = "https://open.spotify.com/";

        service.ejecutarCmd("start "+url);
    }


    
}
