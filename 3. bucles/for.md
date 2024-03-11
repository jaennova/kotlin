# Bucle for

El bucle for en Kotlin es utilizado para iterar sobre un rango de valores o una colección de elementos. Se puede utilizar para recorrer arreglos, listas, cadenas, etc.

La sintaxis básica del bucle for en Kotlin es la siguiente:

```kotlin
for (elemento in coleccion) {
    // código a ejecutar
}
```

En donde "colección" puede ser un rango de números, un arreglo, una lista, etc. y "elemento" es una variable que toma cada valor de la colección en cada iteración.

Por ejemplo, para recorrer un rango de números podemos usar el siguiente código:

```kotlin
for (i in 1..10) {
    println(i)
}
```

También se puede utilizar el bucle for con índice, para tener acceso al índice de cada elemento:

```kotlin
val list = listOf("apple", "banana", "orange")
for (i in list.indices) {
    println("item at $i is ${list[i]}")
}
```

Además se pueden usar con conjunto, mapas, etc.

```kotlin
val map = mapOf("a" to 1, "b" to 2, "c" to 3)
for ((key, value) in map) {
    println("$key -> $value")
}
```

El bucle for en Kotlin es una herramienta muy versátil para iterar sobre diferentes tipos de colecciones y tener acceso tanto al elemento como al índice en cada iteración.
