# Ejercicios Semana 8

## [Ejercicio 1](src/com/ejercicios/Ejercicio1.java)
Crea un método que permita al usuario insertar datos en un array y otro que
muestre los datos que contiene el array y sus índices (posiciones) hasta que el
usuario decida parar (bucle). Los array se pueden pasar como parámetros a
las funciones o devolverlos igual que el resto de variables.

## [Ejercicio 2](src/com/ejercicios/Azar.java)
Crea una clase llamada “Azar”. En ella, crea un método que reciba por
parámetro un máximo y un mínimo y devuelva un entero con un número al
azar entre el máximo y el mínimo.
> Pista: Math.random()
> 
## [Ejercicio 3](src/com/ejercicios/Ejercicio3.java)
Crea un método que dado una cantidad de datos X y un rango de estos,
genere un array con X cantidad de datos generados al azar en el rango
pedido y muestralos por pantalla.
> Pista: Math.random()...

## [Ejercicio 4](src/com/ejercicios/E_S.java)
Crea una clase llamada “E_S” (de entrada/salida). Crea tres métodos:
1. Debe recibir una cadena de caracteres y devolver una cadena de
   caracteres, solicitando al usuario dicha cadena.
2. Debe recibir una cadena de caracteres y devolver un valor entero,
   solicitando al usuario dicho valor entero.
3. Debe recibir una cadena de caracteres y mostrar por pantalla esa
   misma cadena.

## [Ejercicio 5](src/com/ejercicios/Juego.java)
Crea una clase “Juego” con un método que, dado un número al azar y un
número dado por el usuario, compruebe si son iguales. Si no lo son, dará una
pista de si el número al azar es mayor o menor que el del usuario.

```mermaid
graph TD
   A(Inicio) --> B[/Entrada de datos/]
   B --> C{A > B}
   C -->|Si| D>Respuesta]
   C -->|No| E{A < B}
   E -->|Si| F>Respuesta]
   E -->|No| G>Respuesta]
   D --> H(Fin)
   F --> H
   G --> H
```

## [Ejercicio 6](src/com/ejercicios/Ejercicio6.java)
En el método main que aune los métodos necesarios para generar un
pequeño juego: el ordenador genera un número al azar (entre el 1 y el 100,
por ejemplo) y el usuario tendrá 5 intentos para adivinarlo.

```mermaid
graph TD
   A(Inicio) --> B[Numero Aleatorio]
   B --> C[/Introduce numero/]
   C --> D[Función Juego]
   D --> E{Acierto}
   E -->|Si| F>Respuesta]
   E -->|No| G{5 intentos}
   G --> |Si| H>Respuesta]
   G --> |No| C
   H --> I(Fin)
   F --> I
```