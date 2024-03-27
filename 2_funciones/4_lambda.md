# Funciones con expresiones lambda

Las funciones con expresiones lambda, también conocidas como funciones anónimas, son funciones que no tienen un nombre específico y se definen en una sola línea de código. Estas funciones son útiles para trabajar con funciones de alto nivel en Kotlin, como las funciones de orden superior y las expresiones lambda.

Por ejemplo, en lugar de crear una función con nombre para calcular el área de un círculo, podríamos crear una expresión lambda que haga lo mismo:

```kotlin
val calcularAreaCirculo = { radio: Double ->
    val pi = 3.14159265
    pi * radio * radio
}
```

En este ejemplo, se está creando una variable llamada "calcularAreaCirculo" que es una expresión lambda que toma un parámetro "radio" de tipo Double y devuelve el área del círculo.

Estas funciones pueden ser pasadas como argumentos a otras funciones, se pueden almacenar en variables, y se pueden usar como si fueran funciones regulares. Por ejemplo, podríamos llamar a la expresión lambda anterior de la siguiente manera:

```kotlin
val radio = 4.0
val area = calcularAreaCirculo(radio)
```

En general, las funciones lambda son una herramienta poderosa en Kotlin para trabajar con funciones de alto nivel, ya que permiten escribir código más conciso y fácil de entender. Sin embargo, debes tener en cuenta que las funciones lambda son menos legibles que las funciones con nombre y deben ser utilizadas con moderación.
