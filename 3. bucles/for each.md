# For each

El bucle for each en Kotlin se utiliza con el método "forEach" en una colección de datos. El método "forEach" se aplica a una colección y toma una función lambda como parámetro. La función lambda se ejecuta para cada elemento en la colección.

La sintaxis general para el bucle for each en Kotlin es:

```kotlin
collection.forEach {
    // hacer algo con el elemento
}
```

Donde "collection" es la colección de datos que está siendo iterada y el elemento es pasado a la función lambda.

Por ejemplo, si tienes una lista de números y quieres imprimirlos todos, puedes usar el bucle for each para hacerlo:

```kotlin
val numbers = listOf(1, 2, 3, 4, 5)
numbers.forEach {
    println(it)
}
```

También puedes utilizar una variable temporal para referirse al elemento actual en cada iteración:

```kotlin
val numbers = listOf(1, 2, 3, 4, 5)
numbers.forEach { number ->
    println(number)
}
```

Es importante mencionar que el forEach no proporciona acceso al índice del elemento, si necesitas acceso al índice puedes utilizar el método "forEachIndexed"

```kotlin
val numbers = listOf(1, 2, 3, 4, 5)
numbers.forEachIndexed { index, number ->
    println("Element at $index is $number")
}
```
En resumen, el bucle for each en Kotlin es una forma sencilla de iterar a través de elementos en una colección de datos, utilizando el método "forEach" y una función lambda.