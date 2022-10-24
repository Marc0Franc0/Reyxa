# Paso a seguir para  utilizar Reyxa en tu computadora localmente

IMPORTANTE: Mencionar que el procedimiento aplica en computadoras con el sistema operativo Windows 10 y Windows 11.


1) Descargar un IDE o en caso de tener uno instalado utilizar el mismo. 
Si no cuenta un IDE se recomiendo el uso de Visual Studio Code
Link de descarga: https://code.visualstudio.com/download

2)Utilizar JDK siempre y cuando sea la version 11.0 como mínimo ya que es la que utiliza dentro del código 
En caso de no contar con lo indicado usar los siguientes links para su instalación:
a)Link de descarga JDK: https://www.oracle.com/java/technologies/downloads/
b)TUTORIAL DE INSTALACIÓN DEL JDK: https://www.youtube.com/watch?v=oAin-q1oTDw

3) Descargar Angular si es que no se cuenta ocn el mismo. 
La versión utilizada en el proyecto es la 13.3.6
Link Angular 13.3.6: https://www.npmjs.com/package/@angular/common/v/13.3.6
TUTORIAL DE INSTALACIÓN DE ANGULAR: https://www.youtube.com/watch?v=6741ceWzsKQ


4)Descargar XAMPP en su ultima versión , tener en cuenta que se utilizo para desarrollarlo la versión 8.1.6
Link de descarga: https://www.apachefriends.org/es/download_success.html

5) Descargar el proyecto (Reyxa) desde Github
Link: https://github.com/Marc0Franc0/Reyxa

6) Una vez tengamos todos lo necesario descargado e instalado, procederemos a abrir el IDE. Se debe abrir la carpeta donde se encuentre la carpeta del proyecto y realizar los siguientes pasos:
                    a)Iniciar MySQL desde XAMPP presionando el boton start.
                    b)Dirigirse dentro del directorio del proyecto y dentro de backend buscar un archivo llamado Main.java. El cual se encuentra en backend\src\main\java\com\reyxa\backend\Main.java , una vez alli presionar F5.
                    c)Luego abrir la consola del IDE y escribir lo que esta entre comillas y presionar enter: " cd frontend ", posteriormente escribir nuevamente alli y presionar enter " ng s ".
                    d)Por ultimo dirigirse a la siguiente Url: http://localhost:4200/
