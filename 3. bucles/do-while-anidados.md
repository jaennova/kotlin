# Bucles do while anidados

Los bucles do-while anidados son una técnica en la que se utiliza un bucle do-while dentro de otro bucle do-while. Al igual que con los bucles while y for anidados, esto permite realizar operaciones complejas mientras se cumplen varias condiciones al mismo tiempo.

Por ejemplo, si queremos encontrar un valor específico en una matriz bidimensional, podemos utilizar un bucle do-while para recorrer las filas de la matriz y dentro de ese bucle, utilizar otro bucle do-while para recorrer las columnas de la matriz y comparar cada elemento con el valor buscado.

```kotlin
val matriz = arrayOf(arrayOf(1, 2, 3), arrayOf(4, 5, 6), arrayOf(7, 8, 9))
var fila = 0
var columna = 0
val valorBuscado = 5
do {
    do {
        if (matriz[fila][columna] == valorBuscado) {
            println("El valor $valorBuscado se encuentra en la posición ($fila, $columna)")
            return
        }
        columna++
    } while (columna < matriz[fila].size)
    columna = 0
    fila++
} while (fila < matriz.size)
```

Al igual que con los bucles for y while anidados, es importante tener en cuenta que el uso excesivo de bucles do-while anidados puede dificultar la lectura y el mantenimiento del código. Es recomendable evaluar si es posible simplificar el código utilizando otras técnicas como forEach, map, flatMap, etc. y debes tener cuidado con las condiciones de salida de los bucles ya que si no están bien establecidos podrías entrar en un bucle infinito.
