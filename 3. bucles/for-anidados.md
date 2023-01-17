# Bucles for anidados

Los bucles for anidados son una técnica en la que se utiliza un bucle for dentro de otro bucle for. Esto permite iterar sobre varias dimensiones de una colección de datos.

Por ejemplo, si queremos imprimir una tabla de multiplicar, podemos utilizar un bucle for para recorrer los números del 1 al 10, y dentro de ese bucle for, utilizar otro bucle for para recorrer los números del 1 al 10 y multiplicarlos.

```kotlin
for (i in 1..10) {
    for (j in 1..10) {
        println("$i * $j = ${i * j}")
    }
}
```

Los bucles anidados también se pueden utilizar para recorrer matrices bidimensionales o múltiples dimensiones, o para buscar un valor en una matriz bidimensional.

En general, los bucles anidados son una herramienta poderosa para trabajar con estructuras de datos complejas y realizar operaciones complejas en varias dimensiones. Sin embargo, es importante tener en cuenta que el uso excesivo de bucles anidados puede dificultar la lectura y el mantenimiento del código.