# Funciones con parámetros variables

En Kotlin, las funciones pueden tener parámetros variables, lo que significa que pueden aceptar un número variable de argumentos. Los parámetros variables se indican con el caracter "*" antes del nombre del parámetro.

Existen dos maneras de declarar funciones con parámetros variables, la primera es usando el "vararg" keyword.

```kotlin
fun imprimirNumeros(vararg numeros: Int) {
    for (numero in numeros) {
        println(numero)
    }
}
```

En este ejemplo, la función "imprimirNumeros" tiene un parámetro variable llamado "numeros" que es un arreglo de números enteros. La función recorre el arreglo y los imprime uno por uno.

La otra forma es usando el spread operator "*"

```kotlin
fun imprimirNumeros(var numeros: IntArray) {
    for (numero in numeros) {
        println(numero)
    }
}
```

En este ejemplo, la función "imprimirNumeros" tiene un parámetro "numeros" que es un arreglo de números enteros. Al llamar a esta función, se puede pasar una lista de números separados por comas y precedidos por el operador "*", el cual convierte automáticamente la lista en un arreglo y lo pasa como parámetro.

```kotlin
val numeros = intArrayOf(1, 2, 3, 4, 5)
imprimirNumeros(*numeros)
```

En ambos casos, las funciones con parámetros variables son útiles para trabajar con conjuntos de datos de tamaño desconocido o variable. Sin embargo, es importante tener en cuenta que el uso excesivo de parámetros variables puede hacer que el código sea menos legible y más difícil de entender. Por lo tanto, es importante utilizarlos con moderación y siempre asegurarse de que el código siga siendo legible y fácil de entender.