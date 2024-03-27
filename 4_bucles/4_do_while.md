# Bucle do while

Los bucles do-while en Kotlin son similares a los bucles while, con la diferencia de que el cuerpo del bucle se ejecuta al menos una vez antes de evaluar la condición. Es decir, el cuerpo del bucle se ejecuta al menos una vez antes de que se compruebe la condición.

La sintaxis general del bucle do-while en Kotlin es:

```kotlin
do {
    // código a ejecutar
} while (condición)
```

La condición se evalúa al final de cada iteración, por lo que si la condición es verdadera, el bucle se ejecutará de nuevo.

Por ejemplo, si queremos pedir al usuario que ingrese un número entero positivo y asegurarnos de que se cumpla esta condición, podemos utilizar un bucle do-while:

```kotlin
var numero: Int
do {
    numero = readLine()!!.toInt()
    if (numero <= 0) println("Ingrese un número entero positivo")
} while (numero <= 0)
```

En general, los bucles do-while son útiles cuando se necesita ejecutar el cuerpo del bucle al menos una vez, independientemente de si se cumple la condición o no. Sin embargo, es importante tener en cuenta que en algunos casos se puede usar una estructura if-else para lograr el mismo resultado.
