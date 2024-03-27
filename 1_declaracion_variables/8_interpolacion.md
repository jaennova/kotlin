# Interpolacion de cadenas

En Kotlin, la interpolación de cadenas es una forma de insertar valores de variables dentro de una cadena. Se puede realizar utilizando el símbolo "$" o las llaves "{}".

Cuando se utiliza el símbolo "$" seguido del nombre de una variable, se sustituye el nombre de la variable por su valor correspondiente en la cadena. Por ejemplo:

```kotlin
val nombre = "Juan"
val saludo = "Hola, mi nombre es $nombre"
```

En este caso, el valor de "saludo" sería "Hola, mi nombre es Juan".

Por otro lado, cuando se utilizan las llaves "{}", se pueden insertar expresiones dentro de una cadena. Por ejemplo:

```kotlin
val numero = 5
val resultado = "El número es: ${numero + 2}"
```

En este caso, el valor de "resultado" sería "El número es: 7".

La interpolación de cadenas es una forma eficiente de crear cadenas dinámicas, ya que permite insertar valores de variables de forma sencilla y legible.