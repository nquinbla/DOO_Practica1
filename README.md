# [ DOO ] PRÁCTICA 1

## ÍNDICE
- [INTRODUCCIÓN](#introducción)
- [CLASES DE LA APLICACIÓN](#clases-de-la-aplicación)
  - [CLASE MONEDA](#clase-moneda)
  - [CLASE SELLO](#clase-sello)
  - [CLASE COLECCIÓN](#clase-colección)
  - [CLASE MAIN](#clase-main)
- [REQUISITOS DE ENTREGA](#requisitos-de-entrega)
- [CRITERIOS DE EVALUACIÓN](#criterios-de-evaluación)
  




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

***

## CLASE MONEDA
Tiene los mismos atributos que ElementoColeccionable y además tiene los siguientes atributos:
> * composición
> * peso
> * diametro
> * grosor
> * estadoConversación (los valores son G, VG, F, VF, XF, AU, UNC) Emplear un enum definido en un archivo separado

***

## CLASE SELLO
Tiene los mismos atributos que ElementoColeccionable y además tiene los siguientes atributos:
> * altura
> * anchura
> * imagen
> * estadoConservacion (los valores posibles son U, NSG, NF, N) Emplear un enum definido en archivo
separado.

***

## CLASE COLECCIÓN 
En esta clase, se almacenarán todos los elementos de la colección dentro del mismo ArrayList. Se implementarán los métodos que nos permitan realizar las siguientes acciones:
> * Añadir una moneda a la colección
> * Añadir un sello a la colección
> *  Mostrar las monedas de la colección
> * Mostrar los sellos de la colección
> * Obtener el precio total de la colección
> * Obtener la rareza media de la colección

***

### CLASE MAIN
En la clase Main se mostrará el menú interactivo por la consola, mediante el cual podremos interactuar con
la aplicación. Las opciones que se mostrarán al usuario son las siguientes:
> 1. Añadir una nueva moneda
> 2. Añadir un nuevo sello
> 3. Mostrar todas las monedas
> 4. Mostrar todos los sellos
> 5. Mostrar el precio total de la colección
> 6. Mostrar la rareza media de la colección
> 0. Salir

***
***

## REQUISITOS DE ENTREGA
* FECHA DE ENTREGA: 06/11/2024 a las 23:59
* Debe entregarse en formato ZIP.
* El nombre del fichero .zip a entregar debe tener el siguiente formato: `Nombre1Apellidos1DOOPractica1.zip`
* Deberá entregarse únicamente la carpeta src comprimida con todo el código en su interior.
* No incluir otras carpetas ni archivos

## CRITERIOS DE EVALUACIÓN
Todos los programas deben realizarse en el lenguaje de java.
Se aconseja poner comentarios para su mejor comprensión. Estos comentarios explicarán la funcionalidad
del código.
Si se detecta la entrega copiada, ya sea de una fuente externa o con un contenido idéntico al de otro
alumno/a, serán evaluadas ambas copias, con una calificación de 0

