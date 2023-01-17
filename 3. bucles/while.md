# Bucle while

El bucle while en Kotlin es una estructura de control de bucle utilizada para ejecutar un bloque de código mientras se cumpla una condición dada. La sintaxis general para el bucle while en Kotlin es:

```kotlin
while (condition) {
    // código a ejecutar
}
```

Donde "condition" es una expresión booleana que se evalúa antes de cada iteración del bucle. Si la condición se evalúa como verdadera, se ejecuta el bloque de código dentro del bucle. Si la condición se evalúa como falsa, el bucle se detiene y el control se pasa a la siguiente línea de código después del bucle.

Por ejemplo, si quieres imprimir los números del 1 al 5, puedes usar un bucle while:

```kotlin
var i = 1
while (i <= 5) {
    println(i)
    i++
}
```

Es importante tener cuidado al utilizar bucles while ya que si la condición nunca se vuelve falsa, el bucle se ejecutará de forma infinita y causará un bucle infinito. Por eso es importante asegurarse de que la condición eventualmente se vuelva falsa dentro del bucle.

En resumen, el bucle while en Kotlin es una estructura de control de bucle que se utiliza para ejecutar un bloque de código mientras se cumpla una condición dada, es importante tener cuidado al utilizarlo para evitar bucles infinitos
