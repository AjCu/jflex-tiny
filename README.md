Alberto Cristancho C.I V-24.782.650

San Cristóbal, Abril 2024.

**REPOSITORIO CON EL CÓDIGO FUENTE**:

<https://github.com/AjCu/jflex-tiny>

Explicación:

Se crea el archivo .flex

Este incluye:

- Especificaciones de la clase a generar
- Las expresiones regulares a detectar
- Las acciones a aejecutar dependiendo del match de una expresion
- Puede incluir código necesario previo

Se crea un archivo para analizar el flex con JFLEX y generar la clase

Este archivo simplemente evalua el archivo tiny.flex que creamos y crea a traves de JFlex generate la clase autogenerada que vamos a usar.


Si no hay errores de compilacion se crea Tiny.Java exitosamente



Se crea un archivo de prueba para probar nuestra clase autogenerada por JFlex, va a tener el siguiente contenido



Finalmente creamos una clase App que use esa clase Tiny que generamos, en este caso como el archivo flex lo determinamos para retornar un objeto de tipo Symbol, declaramos una variable que lea el match y lo guarde en el Symbol, e iteramos el contenido, el token numerico y en que tipo caeria.



Para efectos practicos solo creamos los tokens tiny de RESERVADA, NUMERO Y OTRO.

Al ejecutar obtenemos esta salida: 
