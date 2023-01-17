# Bucles infinitos

Un bucle infinito es un bucle que se ejecuta de manera continua sin fin. En Kotlin, se pueden crear bucles infinitos utilizando la palabra clave "while" con una condición siempre verdadera, o la palabra clave "for" con un rango infinito.

Aquí tienes un ejemplo de un bucle infinito utilizando la palabra clave "while":

```kotlin
while (true) {
   // código que se ejecutará de manera continua
}
```

Este bucle se ejecutará de manera continua ya que la condición siempre es verdadera. Es importante tener en cuenta que si no se tiene una manera de salir del bucle, el código se ejecutará de manera continua y no terminará nunca.

Otro ejemplo de un bucle infinito con la palabra clave "for" es:

```kotlin
for (i in 1..Int.MAX_VALUE) {
    // código que se ejecutará de manera continua
}
```

En este caso el rango es Int.MAX_VALUE el cual es el valor máximo de un entero en kotlin, este bucle se ejecutará de manera continua ya que el rango es infinito.

Es importante tener en cuenta que los bucles infinitos pueden ser útiles en algunos casos, como cuando se desea ejecutar una tarea de manera continua mientras se espera una entrada del usuario o un evento. Sin embargo, en la mayoría de los casos, los bucles infinitos deben evitarse ya que pueden causar problemas de rendimiento o hacer que el programa no responda.

