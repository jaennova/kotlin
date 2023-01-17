# Bucle for each anidados

Los bucles for each anidados son una técnica en la que se utiliza el método "forEach" dentro de otro método "forEach". Esto permite iterar sobre varias dimensiones de una colección de datos.

Por ejemplo, si queremos imprimir todos los elementos de una matriz bidimensional, podemos utilizar un bucle forEach para recorrer las filas de la matriz y dentro de ese bucle forEach, utilizar otro bucle forEach para recorrer las columnas de la matriz e imprimir cada elemento.

```kotlin
val matriz = arrayOf(arrayOf(1, 2, 3), arrayOf(4, 5, 6), arrayOf(7, 8, 9))
matriz.forEach { fila ->
    fila.forEach { element ->
        println(element)
    }
}
```

Al igual que con los bucles for anidados, es importante tener en cuenta que el uso excesivo de bucles forEach anidados puede dificultar la lectura y el mantenimiento del código. Es recomendable evaluar si es posible simplificar el código utilizando otras técnicas como map, flatMap u otras funciones de alto nivel de Kotlin.