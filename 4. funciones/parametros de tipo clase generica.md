# Funciones con parámetros de tipo clase genérica

En Kotlin, las funciones pueden tener parámetros de tipo genérico, lo que significa que pueden aceptar argumentos de cualquier tipo especificado. Los tipos genéricos se indican con una o más variables de tipo entre corchetes < >.

Por ejemplo, aquí está una función llamada "intercambiar" que intercambia dos valores de cualquier tipo:

```kotlin
fun <T> intercambiar(valor1: T, valor2: T) {
    val temporal = valor1
    valor1 = valor2
    valor2 = temporal
}
```

En este ejemplo, la función "intercambiar" tiene dos parámetros de tipo genérico "T", que pueden ser de cualquier tipo especificado al momento de llamar a la función.

En este caso, podemos llamar a esta función con dos argumentos de cualquier tipo, por ejemplo, si queremos intercambiar dos números enteros, podemos hacerlo de la siguiente manera:

```kotlin
var num1 = 10
var num2 = 20
intercambiar(num1, num2)
```

o si queremos intercambiar dos elementos de una clase creada por nosotros:

```kotlin
class Persona(var name: String, var age: Int)
var persona1 = Persona("Juan", 25)
var persona2 = Persona("Maria", 30)
intercambiar(persona1, persona2)
```

Además de las funciones regulares, también se pueden utilizar tipos genéricos en clases, interfaces y en otras funciones. Los tipos genéricos son una forma de escribir código más genérico y reutilizable. Sin embargo, es importante tener en cuenta que el uso excesivo de tipos genéricos puede hacer que el código sea menos legible y más difícil de entender. Por lo tanto, es importante utilizarlos con moderación y siempre asegurarse de que el código siga siendo legible y fácil de entender.
