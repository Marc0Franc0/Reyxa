package com.reyxa.backend.controller;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/* Marca la clase como un controlador donde cada método devuelve 
un objeto de dominio en lugar de una vista. */


@RestController
public class AtajosWeb extends Asistente {
static ArrayList  <String> opiniones = new ArrayList<>();

@PostMapping("/guardaropinion")
public  static void guardarOpinion(@RequestParam(value = "opinion")String opinion) {
    opiniones.add(opinion);
}

@DeleteMapping("/eliminaropinion")
public  static void eliminarSugerencia(@RequestParam(value = "opinion") String opinion) {
    opiniones.remove(opinion);
}

    @GetMapping("/clima")
    public static void verClima() {
        // abrir página de clima
        url = "https://www.smn.gob.ar/";

        ejecutarCmd("start "+url);
    }

    @GetMapping("/noticias")
    public static void verNoticias() {
        // abrir página de noticias
        url = "https://news.google.com/topstories?hl=es-419&gl=US&ceid=US:es-419";

        ejecutarCmd("start "+url);
    }

    @GetMapping("/youtube")
    public static void abrirYT() {
        // abrir Youtube
        url = "https://www.youtube.com/";

        ejecutarCmd("start "+url);
    }

    @GetMapping("/twitch")
    public static void abrirTwitch() {
        // abrir Twitch
        url = "https://www.twitch.tv/";

        ejecutarCmd("start "+url);
    }

    @GetMapping("/ig")
    public static void abrirIg() {
        // abrir Instagram Web
        url = "https://www.instagram.com/?theme=dark     ";

        ejecutarCmd("start "+url);
    }

    @GetMapping("/wsp")
    public static void abrirWsp() {
        // abrir Whatsapp Web
        url = "https://web.whatsapp.com/";

        ejecutarCmd("start "+url);
    }

    @GetMapping("/gmail")
    public static void abrirGmail() {
        // abrir Gmail
        url = "https://mail.google.com/mail/u/0/#inbox";

        ejecutarCmd("start "+url);
    }

    @GetMapping("/netflix")
    public static void abrirNetflix() {
        // abrir Netflix
        url = "https://www.netflix.com/ar/Login";

        ejecutarCmd("start "+url);
    }


 
    @GetMapping("/spotify")
    public static void abrirSpotifyweb() {
        // abrir Spotify Web
        url = "https://open.spotify.com/";

        ejecutarCmd("start "+url);
    }


    
}
