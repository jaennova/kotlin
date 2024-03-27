# Uso de la palabra clave "break" y "continue" para romper y continuar bucles

En Kotlin, la palabra clave "break" se utiliza para romper un bucle. Cuando se encuentra en un bucle, se detiene la ejecución del bucle y se continúa con la siguiente instrucción después del bucle. Por ejemplo, si tiene un bucle "for" y desea salir de él después de que se cumpla cierta condición, puede utilizar "break" para hacerlo.

La palabra clave "continue" se utiliza para saltear una iteración en un bucle. Cuando se encuentra en un bucle, se salta la iteración actual y se continúa con la siguiente iteración. Por ejemplo, si tiene un bucle "for" y desea saltear una iteración si se cumple cierta condición, puede utilizar "continue" para hacerlo.

Es importante tener en cuenta que tanto "break" como "continue" solo afectan a la iteración más cercana del bucle, no afecta a bucles anidados.

Aquí tienes un ejemplo de cómo utilizar "break" y "continue" en un bucle "for":

```kotlin
for (i in 1..10) {
    if (i == 5) {
        break // sale del bucle cuando i es igual a 5
    }
    println(i)
}
```

Este código imprimirá los números del 1 al 4, y luego saldrá del bucle.

Aquí tienes otro ejemplo de cómo utilizar "continue" en un bucle "for":

```kotlin
for (i in 1..10) {
    if (i % 2 == 0) {
        continue // salta la iteración actual si i es un número par
    }
    println(i)
}
```

Este código imprimirá solo los números impares del 1 al 10, saltando las iteraciones en las que i es un número par.