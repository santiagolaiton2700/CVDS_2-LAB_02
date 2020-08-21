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
Para crear un proyecto maven con ayuda de arquetipos se usa el fragmento:
```
mvn archetype:generate -Dfilter=maven-archetype-quickstart 

```
Se crea un proyecto interactivo "Patterns"

<img width="197" alt="Patterns" src="https://user-images.githubusercontent.com/59893804/90927334-86033200-e3ba-11ea-8afe-2aa33f92a365.png">

Con los siguientes parametros: 

<img width="322" alt="Parametros" src="https://user-images.githubusercontent.com/59893804/90927649-15a8e080-e3bb-11ea-9c43-2f99f8b5d9db.png">



## Ajustando algunas configuraciones en el proyecto
## Compilando y ejecutando






