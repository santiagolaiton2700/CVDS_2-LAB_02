# **MAVEN**

## Conociendo Maven 
> ### Su mayor utilidad
Permite gestionar y crear un proyecto software completo. 
> ### Fases de maven
1. **Validate:** Valida que el proyecto sea correcto.
2. **Compile:** Compila el código del proyecto.  
3. **Test:** Hace uso de las pruebas unitarias para probar el código compilado.
4. **Integration:** Empaqueta el código compilado.
5. **Verify:** Verifica criterios de calidad.
6. **Install:** Instala el paquete en el repositorio local.
7. **Deploy:** Comparte el paquete a un repositorio remoto.

> ### Ciclo de vida de la construcción
* **Default:** Gestiona la construcción y ejecución del proyecto.
* **Clean:** Limpia el directorio del proyecto de los archivos que dejo el ciclo anterior.
* **Site:** Gestiona la documentación del proyecto.

> ### ¿Para qué sirven los plugins? 
Es un fragmento de codigo que sirve para ampliar las funciones de un programa.


> ### ¿Qué es el repositorio central de maven? y ¿Para que sirve?
Es un repositorio remoto donde se encuentra la mayoría de librerías que se utilizan en los desarrollos de software, la misma herramienta las gestiona cuando sea necesario.   



## Creando un proyecto con Maven
> ### Para crear un proyecto maven con ayuda de arquetipos se usa el fragmento:
```
mvn archetype:generate -Dfilter=maven-archetype-quickstart 

```
> ### Se crea un proyecto interactivo "Patterns"

<img width="197" alt="Patterns" src="https://user-images.githubusercontent.com/59893804/90927334-86033200-e3ba-11ea-8afe-2aa33f92a365.png">

> ### Con los siguientes parametros: 

<img width="450" alt="Parametros" src="https://user-images.githubusercontent.com/59893804/90927956-9d8eea80-e3bb-11ea-981d-01c539eca8c2.png">

> ### Este fue el conjunto de archivos y directorios creados por el comando mvn:

<img width="347" alt="directorios" src="https://user-images.githubusercontent.com/59893804/90928232-1a21c900-e3bc-11ea-9da7-4a08d27ec581.png">


## Compilando y ejecutando
> ### Compilamos el archivo ejecutando el comando
```
$ mvn package
```
<img width="598" alt="compilando" src="https://user-images.githubusercontent.com/59893804/90928774-1d698480-e3bd-11ea-8832-4af1f77b01d6.png">

> ### Para ejecutar desde línea de comandos un proyecto maven ejecutamos el comando: 
```
$ mvn exec:java -Dexec.mainClass="edu.eci.cvds.patterns.App"
```
> ### Obtenemos la siguiente salida :

<img width="691" alt="salida" src="https://user-images.githubusercontent.com/59893804/90929228-f3649200-e3bd-11ea-8a61-dca852d90343.png">


> ### Realizamos un cambio en la clase App.java donde enviamos como parametro nuestros nombres y apellidos y obtenemos las salidas: 
<img width="667" alt="salida1" src="https://user-images.githubusercontent.com/59893804/90931401-3a548680-e3c2-11ea-91e3-bbea8bc61eff.png">
<img width="691" alt="salida2" src="https://user-images.githubusercontent.com/59893804/90931404-3aed1d00-e3c2-11ea-9ce9-d5216a560fcd.png">



## Haciendo un esqueleto de la aplicación 
> ### Creamos y organizamos el paquete "shapes" con todos sus subdirectorios y clases:

<img width="400" alt="concrete" src="https://user-images.githubusercontent.com/59893804/90931809-04fc6880-e3c3-11ea-9f5c-bea5137086e6.png">

> ### Despues de hacer todos los cambios ejecutamos mutliples veces la clase ShapeMain usando el plugin exec de maven con los siguientes parámetros:
* ###  _**Sin parámetros**_
Esta ejecución no funciona correctamente porque la clase ShapeMain requiere un parametro para ser ejecutada correctamente 

<img width="718" alt="sin parametro" src="https://user-images.githubusercontent.com/59893804/90932340-109c5f00-e3c4-11ea-87d2-8d36d5cc55ec.png">





* ###  _**Parámetro: qwerty**_
Esta ejecución no funciona correctamente porque "qwerty" no es una entrada valida,la clase ShapeMain requiere un parametro de una figura establecida en la clase

<img width="640" alt="qwerty" src="https://user-images.githubusercontent.com/59893804/90932591-a637ee80-e3c4-11ea-8f30-0ca2b516447a.png">




* ### _**Parámetro: pentagon**_
Esta ejecución no funciona correctamente porque aunque "pentagon" es una clase establecida , la sintaxis es incorrecta.

<img width="675" alt="pentagon" src="https://user-images.githubusercontent.com/59893804/90933654-894feb00-e3c5-11ea-917a-a49f59f05d62.png">

La clase correcta es Pentagon

<img width="658" alt="pentagonok" src="https://user-images.githubusercontent.com/59893804/90933656-89e88180-e3c5-11ea-9f8a-64430a22728e.png">




* ### _**Parámetro Hexagon**_

Esta ejecución es correcta ya que muestra el numero de lados correctos de la figura
<img width="648" alt="ultimo" src="https://user-images.githubusercontent.com/59893804/90933748-b8fef300-e3c5-11ea-9576-9f096cdf75b9.png">


## ¿Para que sirve GITIGNORE?

