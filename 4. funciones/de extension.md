# Funciones de extensión

En Kotlin, las funciones de extensión permiten agregar nuevas funcionalidades a una clase existente sin tener que heredar de ella o utilizar patrones de diseño como el patrón de diseño Decorator. Las funciones de extensión son declaradas fuera de cualquier clase y utilizan la sintaxis "fun nombreDeLaClase.nombreDeLaFuncion".

Por ejemplo, si queremos agregar una función llamada "duplicar" a la clase Int para duplicar un valor entero, podríamos escribir:

```kotlin
fun Int.duplicar(): Int {
    return this * 2
}
```

Esta función de extensión está añadiendo una nueva función "duplicar" a la clase Int, y puede ser utilizada de la siguiente manera:

```kotlin
val num = 5
val resultado = num.duplicar()
```

Además de las funciones regulares, también se pueden crear funciones de extensión para las clases y las interfaces existentes, estas son particularmente útiles para añadir funcionalidades específicas a una clase existente sin tener que modificar su código fuente. Sin embargo, es importante tener en cuenta que el uso excesivo de funciones de extensión puede hacer que el código sea menos legible y más difícil de entender. Por lo tanto, es importante utilizarlas con moderación y siempre asegurarse de que el código siga siendo legible y fácil de entender.
