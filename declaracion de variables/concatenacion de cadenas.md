# Concatenacion de cadenas

Puedes encontrar mas informacion sobre el tema [aqui.](https://www.techiedelight.com/es/concatenate-two-strings-kotlin/)


En Kotlin, la concatenación de cadenas se puede realizar utilizando el operador "+" o el símbolo "$".

Cuando se utiliza el operador "+", se concatenan dos o más cadenas y se devuelve una nueva cadena como resultado. Por ejemplo:

```kotlin
val cadena1 = "Hola"
val cadena2 = " mundo"
val resultado = cadena1 + cadena2
```

En este caso, el valor de "resultado" sería "Hola mundo".

Por otro lado, cuando se utiliza el símbolo "$" en una cadena, se pueden insertar valores de variables dentro de la cadena. Por ejemplo:

```kotlin
val nombre = "Juan"
val saludo = "Hola, mi nombre es $nombre"
```

En este caso, el valor de "saludo" sería "Hola, mi nombre es Juan".

Además de esto, también se pueden utilizar las llaves {} para insertar expresiones dentro de una cadena. Por ejemplo:

```kotlin
val numero = 5
val resultado = "El número es: ${numero + 2}"
```

En este caso, el valor de "resultado" sería "El número es: 7".