# Funciones con nombre

Las funciones con nombre son aquellas funciones que tienen un nombre específico asignado a ellas. Estas funciones se utilizan para proporcionar un nombre significativo a un conjunto de instrucciones que realizan una tarea específica. Esto hace que el código sea más legible y fácil de entender.

Por ejemplo, si queremos crear una función para calcular el área de un círculo, podemos crear una función llamada "calcularAreaCirculo" y pasarle como parámetro el radio del círculo. La función usaría esta información para calcular el área y devolver el resultado:

```kotlin
fun calcularAreaCirculo(radio: Double): Double {
    val pi = 3.14159265
    return pi * radio * radio
}
```

De esta manera, en cualquier parte del código donde necesitemos calcular el área de un círculo, podemos simplemente llamar a esta función pasándole el radio y el valor retornado será el área del círculo. Esto hace que el código sea más fácil de entender y mantener, ya que se puede ver claramente qué hace esta función y cómo se usa.

En general, las funciones con nombre se utilizan para organizar el código y hacerlo más legible, y también para reutilizar código mediante la creación de funciones que pueden ser llamadas en varios puntos del código.