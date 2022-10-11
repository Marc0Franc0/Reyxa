package com.reyxa.backend.controller;


import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Configuration;
//import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;


//import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


import com.reyxa.backend.Main;

/* Marca la clase como un controlador donde cada método devuelve 
un objeto de dominio en lugar de una vista. */

@RestController
/*
 * Explicacion de las anotaciones de configuración :
 */
@Configuration
@EnableAutoConfiguration
//@AutoConfiguration(value = "/comandos")
//@RequestMapping("/comandos")

public class ComandoController extends Main {
    /*
     * 
     * Funcionan todos los mappings, ya han sido probados en postman
     */

    @GetMapping("/clima")
    public void verClima() {

        ejecutarCmd(obtenerComando("clima"));
    }



    @GetMapping("/noticias")
    public void verNoticias() {

        ejecutarCmd(obtenerComando("noticias"));
        ;
    }


    @GetMapping("/twitch")
    public void abrirTwitch() {

        ejecutarCmd(obtenerComando("twitch"));
    }

    @GetMapping("/instagram")
    public void abrirIg() {

        ejecutarCmd(obtenerComando("instagram"));
    }


    @GetMapping("/whatsapp")
    public void abrirWsp() {

        ejecutarCmd(obtenerComando("whatsapp"));
    }

  
    @GetMapping("/gmail")
    public void abrirGmail() {

        ejecutarCmd(obtenerComando("gmail"));
    }


    @GetMapping("/netflix")
    public void abrirNetflix() {

        ejecutarCmd(obtenerComando("netflix"));
    }

    @GetMapping("/spotify")
    public void abrirSpotifyweb() {

        ejecutarCmd(obtenerComando("spotify"));
    }

    @GetMapping("/youtube")
    public void abrirYT() {

        ejecutarCmd(obtenerComando("youtube"));
    }

    @GetMapping("/notepad")
    public void abrirNotepad() {
        // if(comandoSistemaService.existsBynombre("notepad")){
        ejecutarCmd(obtenerComando("notepad"));
        ;

    }

    @GetMapping("/explorer")
    public void abrirExplorer() {

        ejecutarCmd(obtenerComando("explorer"));
    }

    @GetMapping("/paint")
    public void abrirPaint() {
        ejecutarCmd(obtenerComando("paint"));
    }

    @GetMapping("/calculadora")
    public void abrirCalculadora() {

        ejecutarCmd(obtenerComando("calculadora"));
    }

    @GetMapping("/wconfig")
    public void abrirConfig() {
        ejecutarCmd(obtenerComando("wconfig"));
    }
   
    @GetMapping("/progapagado")
    public void programarApagado(@RequestParam(value = "tiempo") int tiempo) {
        ejecutarCmd(obtenerComando("progapagado ") + tiempo);
    }

    @GetMapping("/cancapagado")
    public void cancelarApagado() {

        ejecutarCmd(obtenerComando("cancapagado"));

    }

    @GetMapping("/antivirus")
    public void realizarAnalisis() {

        ejecutarCmd(obtenerComando("antivirus"));
    }

    @GetMapping("/wupdate")
    public void abrirWupdate() {

        ejecutarCmd(obtenerComando("wupdate"));
    }

    @GetMapping("/papelera")
    public void vaciarPapelera() {
        /*
         * Cada comando borra los archivos que esten en la papelera de
         * cada disco siempre que ese disco exista
         */

        for (int i = 1; i < 25; i++) {

            ejecutarCmd(obtenerComando("papelera" + i));

        }

    }
}