# [ DOO ] PRÁCTICA 1

## ÍNDICE
- [INTRODUCCIÓN](#introducción)




***
***

## INTRODUCCIÓN
En esta práctica se evaluarán vuestros conocimientos en programación orientada a objetos. Leed bien el enunciado ya que debéis crear las clases y las funciones con los nombres que se indican en este
documento. La práctica consiste en crear una aplicación de gestión de una colección de filatelia y numismática.
A través de un menú interactivo por la consola, podremos interactuar con la aplicación. Las opciones que se
mostrarán al usuario son las siguientes:

> 1. Añadir una nueva moneda

> 2. Añadir un nuevo sello

> 3. Mostrar todas las monedas

> 4. Mostrar todos los sellos

> 5. Mostrar el precio total de la colección

> 6. Mostrar la rareza media de la colección

> 0. Salir

***

## CLASES DE LA APLICACIÓN
Las clases que componen la aplicación se agruparán dentro de paquetes. Se debe crear la estructura de paquetes adecuada.

### Clase ElementoColeccionable
La clase ElementoColeccionable tiene los siguientes atributos:
> * pais

> * autoridadGobernante

> * annus

> * valor

> * unidadMonetaria

> * rareza (el índice de rareza debe estar entre 1 y 100. Si se introducen valores fuera de este rango
debe lanzarse una Excepción que debe ser controlada)

> * precio

No pueden existir instancias de la clase ElementoColeccionable.
