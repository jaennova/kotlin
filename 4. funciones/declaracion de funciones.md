# Declaracion de funciones

En Kotlin, las funciones se declaran utilizando la palabra clave "fun". Una función típica se ve así:

```kotlin
fun functionName(parameterName: parameterType): returnType {
    // cuerpo de la función
    return valorARetornar
}
```

También puede haber funciones que no tienen parámetros ni valores de retorno. Por ejemplo, aquí está una función que imprime "Hola, mundo!" en la consola:

```kotlin
fun saludar() {
    println("Hola, mundo!")
}
```
Otra cosa importante en Kotlin es la posibilidad de declarar funciones de una sola línea, estas son conocidas como funciones lambda, estas se ven asi:

```kotlin
val sumaLambda: (Int, Int) -> Int = { num1, num2 -> num1 + num2 }
```

En este ejemplo se esta declarando una variable llamada sumaLambda de tipo (Int, Int) -> Int que es una función que recibe dos parametros de tipo Int y retorna un Int, lo que hace es la suma de los dos parametros recibidos.

En resumen, las funciones en Kotlin se declaran con la palabra clave "fun" seguida del nombre de la función, los parámetros y el tipo de retorno. Pueden tener parámetros y/o valores de retorno, o no tener ninguno de ellos. También se pueden utilizar funciones lambda, las cuales son funciones de una sola línea de código. Estas son útiles para trabajar con funciones de alto nivel en Kotlin, como las funciones de orden superior y las expresiones lambda.
