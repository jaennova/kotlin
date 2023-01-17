# Bucle for

El bucle "for" en Kotlin se utiliza para iterar a través de un rango de valores, un arreglo o una colección. La sintaxis básica para un bucle for es:

```kotlin
for (variable in rango) {
   // código a ejecutar
}
```

Por ejemplo, si quieres imprimir los números del 1 al 10, podrías usar el siguiente código:

```kotlin
for (i in 1..10) {
   println(i)
}
```

También se puede utilizar con arreglos o colecciones:

```kotlin
val lista = listOf("a", "b", "c")
for (s in lista) {
    println(s)
}
```

La variable "i" en el primer ejemplo y "s" en el segundo son variables iteradores, que tomarán cada valor en el rango o colección durante cada iteración del bucle.

En resumen, el bucle "for" en Kotlin es una herramienta útil para iterar a través de un rango de valores, un arreglo o una colección. Puede ser utilizado con la sintaxis básica "for (variable in rango) { }" para recorrer un rango de números o caracteres. También se puede utilizar con arreglos o colecciones, donde la variable iteradora tomará cada valor en el rango o colección durante cada iteración del bucle.