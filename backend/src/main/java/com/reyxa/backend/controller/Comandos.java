package com.reyxa.backend.controller;

//import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;

//import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.reyxa.backend.Asistente;

/* Marca la clase como un controlador donde cada método devuelve 
un objeto de dominio en lugar de una vista. */

@RestController
// @RequestMapping("/atajosweb")
public class Comandos extends Asistente {
    /*
     * static ArrayList <String> opiniones = new ArrayList<>();
     * 
     * @PostMapping("/guardaropinion")
     * public static void guardarOpinion(@RequestParam(value = "opinion")String
     * opinion) {
     * opiniones.add(opinion);
     * }
     * 
     * @DeleteMapping("/eliminaropinion")
     * public static void eliminarSugerencia(@RequestParam(value = "opinion") String
     * opinion) {
     * opiniones.remove(opinion);
     * }
     * 
     */

    @GetMapping("/clima")
    public void verClima() {

        ejecutarCmd(obtenerComando("clima"));
    }

    /*
     * @GetMapping("/clima")
     * public static void verClima() {
     * // abrir página de clima
     * url = "https://www.smn.gob.ar/";
     * 
     * ejecutarCmd("start "+url);
     * }
     */

    @GetMapping("/noticias")
    public void verNoticias() {

        ejecutarCmd(obtenerComando("noticias"));
        ;
    }

    /*
     * @GetMapping("/noticias")
     * public static void verNoticias() {
     * // abrir página de noticias
     * url = "https://news.google.com/topstories?hl=es-419&gl=US&ceid=US:es-419";
     * 
     * ejecutarCmd("start "+url);
     * }
     */

    @GetMapping("/twitch")
    public void abrirTwitch() {

        ejecutarCmd(obtenerComando("twitch"));
    }

    /*
     * @GetMapping("/twitch")
     * public static void abrirTwitch() {
     * // abrir Twitch
     * url = "https://www.twitch.tv/";
     * 
     * ejecutarCmd("start "+url);
     * }
     */
    @GetMapping("/instagram")
    public void abrirIg() {

        ejecutarCmd(obtenerComando("instagram"));
    }

    /*
     * @GetMapping("/ig")
     * public static void abrirIg() {
     * // abrir Instagram Web
     * url = "https://www.instagram.com/?theme=dark     ";
     * 
     * ejecutarCmd("start "+url);
     * }
     */
    @GetMapping("/whatsapp")
    public void abrirWsp() {

        ejecutarCmd(obtenerComando("whatsapp"));
    }

    /*
     * @GetMapping("/wsp")
     * public static void abrirWsp() {
     * // abrir Whatsapp Web
     * url = "https://web.whatsapp.com/";
     * 
     * ejecutarCmd("start "+url);
     * }
     */
    @GetMapping("/gmail")
    public void abrirGmail() {

        ejecutarCmd(obtenerComando("gmail"));
    }

    /*
     * @GetMapping("/gmail")
     * public static void abrirGmail() {
     * // abrir Gmail
     * url = "https://mail.google.com/mail/u/0/#inbox";
     * 
     * ejecutarCmd("start "+url);
     * }
     */
    @GetMapping("/netflix")
    public void abrirNetflix() {

        ejecutarCmd(obtenerComando("netflix"));
    }
    /*
     * @GetMapping("/netflix")
     * public static void abrirNetflix() {
     * // abrir Netflix
     * url = "https://www.netflix.com/ar/Login";
     * 
     * ejecutarCmd("start "+url);
     * }
     */

    @GetMapping("/spotify")
    public void abrirSpotifyweb() {

        ejecutarCmd(obtenerComando("spotify"));
    }

    /*
     * @GetMapping("/spotify")
     * public static void abrirSpotifyweb() {
     * // abrir Spotify Web
     * url = "https://open.spotify.com/";
     * 
     * ejecutarCmd("start "+url);
     * }
     */
    @GetMapping("/youtube")
    public void abrirYT() {

        ejecutarCmd(obtenerComando("youtube"));
    }
    /*
     * @GetMapping("/youtube")
     * public static void abrirYT() {
     * // abrir Youtube
     * url = "https://www.youtube.com/";
     * 
     * ejecutarCmd("start "+url);
     * }
     */

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
    /*
     * @GetMapping("/explorer2")
     * public void abrirExplorador2() {
     * 
     * descripcionComando.setDescripcion("start explorer.exe");
     * ejecutarCmd(descripcionComando.getDescripcion());
     * }
     */

    /*
     * @GetMapping("/explorer")
     * public static void abrirExplorador() {
     * // abrir explorador de Windows
     * programa = "explorer";
     * ejecutarCmd("start " + programa);
     * 
     * }
     * 
     * @GetMapping("/explorerConsole")
     * public static String listar() {
     * // abrir explorador de Windows
     * 
     * return "Se abrio el explolorador de archivos";
     * }
     * 
     * @GetMapping("/notepad")
     * public static void abrirBnotas() {
     * // abrir block de notas
     * programa = "notepad";
     * ejecutarCmd("start " + programa);
     * 
     * }
     * 
     * @GetMapping("/Wconfig")
     * public static void abrirConfig() {
     * // abrir configuración de Windows
     * programa = "ms-settings:";
     * ejecutarCmd("start " + programa);
     * 
     * }
     * 
     * @GetMapping("/mstore")
     * public static void abrirTienda() {
     * // abrir Microsoft Store
     * programa = "ms-windows-store:";
     * ejecutarCmd("start " + programa);
     * 
     * }
     * 
     * @GetMapping("/paint")
     * public static void abrirPaint() {
     * // abrir paint
     * programa = "mspaint";
     * ejecutarCmd("start " + programa);
     * 
     * }
     * 
     * @GetMapping("/calculadora")
     * public static void abrirCalculadora() {
     * // abrir calculadora
     * programa = "calc";
     * ejecutarCmd("start " + programa);
     * 
     * }
     * 
     * @GetMapping("/panelControl")
     * public static void abrirPanelControl() {
     * // abrir panel de control
     * programa = "control";
     * ejecutarCmd("start " + programa);
     * 
     * }
     */
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