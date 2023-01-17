# Bucles while anidados

Los bucles while anidados son una técnica en la que se utiliza un bucle while dentro de otro bucle while. Esto permite realizar operaciones complejas mientras se cumplen varias condiciones al mismo tiempo.

Por ejemplo, si queremos encontrar un valor específico en una matriz bidimensional, podemos utilizar un bucle while para recorrer las filas de la matriz y dentro de ese bucle while, utilizar otro bucle while para recorrer las columnas de la matriz y comparar cada elemento con el valor buscado.

```kotlin
val matriz = arrayOf(arrayOf(1, 2, 3), arrayOf(4, 5, 6), arrayOf(7, 8, 9))
var fila = 0
var columna = 0
val valorBuscado = 5
while (fila < matriz.size) {
    while (columna < matriz[fila].size) {
        if (matriz[fila][columna] == valorBuscado) {
            println("El valor $valorBuscado se encuentra en la posición ($fila, $columna)")
            return
        }
        columna++
    }
    columna = 0
    fila++
}
```

Al igual que con los bucles for anidados, es importante tener en cuenta que el uso excesivo de bucles while anidados puede dificultar la lectura y el mantenimiento del código. 
Es recomendable evaluar si es posible simplificar el código utilizando otras técnicas como forEach, map, flatMap, etc.
además debes tener cuidado con las condiciones de salida de los bucles ya que si no están bien establecidos podrías entrar en un bucle infinito.
