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

//Explicacion de las anotaciones de configuración : 
@Configuration


/* Se encarga de forma inteligente de intentar configurar Spring 
 * de forma automática . Es la anotación encargada de buscar en el 
 * Classpath todas las clases con @Entity y registrarlas con el 
 * proveedor de persistencia que tengamos.
 */
@EnableAutoConfiguration
// @RequestMapping("/comandos")

public class ComandoController extends Main {
    /*
     * 
     * -Funcionan todos los mappings, ya han sido probados en postman.
     * -Todas las peticiones dentro de esta clase son tipo Get, porque desde el
     * frontend solamente se pide la ejecución de uno de estos comandos
     * los cuales son obtenidos desde la base de datos.
     * -El nombre del path coincide con el nombre del comando almacenado en la base
     * de datos, el atributo es "nombre" y pertenece a la Entidad Comando.
     * -El metodo  "ejecutarComando es explicado en la clase Main"
     */

    // Mapping que ejecuta un comando para abrir una ventana en el navegador y asi
    // mostrar el clima
    @GetMapping("/clima")
    public void verClima() {

        ejecutarCmd(obtenerComando("clima"));
    }

    // Mapping que muestra las noticias abriendo una nueva ventana en el navegador
    @GetMapping("/noticias")
    public void verNoticias() {

        ejecutarCmd(obtenerComando("noticias"));
        ;
    }

    // Mapping que abre una nueva ventana del navegador con una plataforma de
    // streaming
    @GetMapping("/twitch")
    public void abrirTwitch() {

        ejecutarCmd(obtenerComando("twitch"));
    }

    // Este mapping sirve para ejecutar instagram web en una nueva ventana del
    // navegador
    @GetMapping("/instagram")
    public void abrirIg() {

        ejecutarCmd(obtenerComando("instagram"));
    }

    // Mapping que ejecuta WhatsApp Web en una nueva ventana del navegador
    @GetMapping("/whatsapp")
    public void abrirWsp() {

        ejecutarCmd(obtenerComando("whatsapp"));
    }

    // Mapping que muestra las noticias abriendo una nueva ventana
    @GetMapping("/gmail")
    public void abrirGmail() {

        ejecutarCmd(obtenerComando("gmail"));
    }

    // Mapping que abre una nueva ventana del navegador con Gmail 
    @GetMapping("/netflix")
    public void abrirNetflix() {

        ejecutarCmd(obtenerComando("netflix"));
    }

    // Este mapping ejecuta Spotify Web en una nueva ventana del navegador
    @GetMapping("/spotify")
    public void abrirSpotifyweb() {

        ejecutarCmd(obtenerComando("spotify"));
    }

    // Mapping que ejecuta en una nueva ventana del nacegador Youtube
    @GetMapping("/youtube")
    public void abrirYT() {

        ejecutarCmd(obtenerComando("youtube"));
    }

    // El siguiente mapping ejecuta el Bloc de notas de Windows
    @GetMapping("/notepad")
    public void abrirNotepad() {
        
        ejecutarCmd(obtenerComando("notepad"));
        ;

    }

    // Mapping que abre el Explorador de archivos de Windows
    @GetMapping("/explorer")
    public void abrirExplorer() {

        ejecutarCmd(obtenerComando("explorer"));
    }

    // El mapping siguiente abre paint
    @GetMapping("/paint")
    public void abrirPaint() {
        ejecutarCmd(obtenerComando("paint"));
    }

    // Mapping que abre la Calculadora de Windows
    @GetMapping("/calculadora")
    public void abrirCalculadora() {

        ejecutarCmd(obtenerComando("calculadora"));
    }

    // Este mapping muestra en pantalla la configuración de Windows
    @GetMapping("/wconfig")
    public void abrirConfig() {
        ejecutarCmd(obtenerComando("wconfig"));
    }

    // El mapping logra programar un apagado del pc con un tiempo determinado por el usuario, pero 
    @GetMapping("/progapagado")
    public void programarApagado(@RequestParam(value = "tiempo") int tiempo) {
        ejecutarCmd(obtenerComando("progapagado ") + tiempo);
    }

    // Mapping que cuando el usuario tenga un apagagado programado anteriormente puede cancelar
    @GetMapping("/cancapagado")
    public void cancelarApagado() {

        ejecutarCmd(obtenerComando("cancapagado"));

    }

    /* Realiza un escaneo con Windows Defender , el escaneo se va a ejecutar en segundo plano.
    Se probo varias veces su funcionalidad ejecutando el comando al mismo tiempo que se hacia la peticion Get y lanzaba un error la consola.
    El error es que ya habia un analisis ejecutandose por lo que estaba funcionando.
*/
    @GetMapping("/antivirus")
    public void realizarAnalisis() {

        ejecutarCmd(obtenerComando("antivirus"));
    }

    // Mapping que muestra en pantalla las actualizaciones disponibles de Windows

    @GetMapping("/wupdate")
    public void abrirWupdate() {

        ejecutarCmd(obtenerComando("wupdate"));
    }

    //  Mapping que vacia la papelera de Windows de cada disco que el usuario tenga
    @GetMapping("/papelera")
    public void vaciarPapelera() {
        /*
         * -Cada comando borra los archivos que esten en la papelera de
         * cada disco siempre que ese disco exista
         * -Ejecuta varias veces el mismo comando con un for pero cambiando la letra del disco, 
         * ya que el usuario puede tener mas de un disco y tambien puede tener cualquiera de las letras
         * que estan almacenadas en la base de datos.
         */

        for (int i = 1; i < 25; i++) {

            ejecutarCmd(obtenerComando("papelera" + i));

        }

    }
}