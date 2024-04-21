#CompiladoresUNET2024Marzo

## Explicación:

# Se crea el archivo .flex

Este incluye:

- Especificaciones de la clase a generar
- Las expresiones regulares a detectar
- Las acciones a aejecutar dependiendo del match de una expresion
- Puede incluir código necesario previo

 ![image](https://github.com/AjCu/jflex-tiny/assets/33881631/4315614e-eefd-412c-83ac-b807dc29531b)



# Se crea un archivo para analizar el flex con JFLEX y generar la clase

Este archivo simplemente evalua el archivo tiny.flex que creamos y crea a traves de JFlex generate la clase autogenerada que vamos a usar.

![image](https://github.com/AjCu/jflex-tiny/assets/33881631/45d2330d-9fae-43ab-a40f-809c7577248f)


Si no hay errores de compilacion se crea Tiny.Java exitosamente

![image](https://github.com/AjCu/jflex-tiny/assets/33881631/916becbe-cd8b-4c21-89f4-244918c9a80c)


# Se crea un archivo de prueba para probar nuestra clase autogenerada por JFlex, va a tener el siguiente contenido

![image](https://github.com/AjCu/jflex-tiny/assets/33881631/3acb6b9a-c730-498c-ae31-dee05ac5553d)


Finalmente creamos una clase App que use esa clase Tiny que generamos, en este caso como el archivo flex lo determinamos para retornar un objeto de tipo Symbol, declaramos una variable que lea el match y lo guarde en el Symbol, e iteramos el contenido, el token numerico y en que tipo caeria.

![image](https://github.com/AjCu/jflex-tiny/assets/33881631/eb956f66-64af-4719-bc81-55fb1afb7a6c)



Para efectos practicos solo creamos los tokens tiny de RESERVADA, NUMERO Y OTRO.

# Al ejecutar obtenemos esta salida: 

![image](https://github.com/AjCu/jflex-tiny/assets/33881631/3feeaea8-05ec-48a3-ab3e-3eac22a4a1ac)



Alberto Cristancho C.I V-24.782.650

San Cristóbal, Abril 2024.

