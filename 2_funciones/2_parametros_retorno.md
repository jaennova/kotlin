# Parametros y valores de retorno

Los parámetros son las variables que se pasan a una función al momento de llamarla. Los parámetros tienen un nombre y un tipo especificado en la declaración de la función.

Por ejemplo, en la función "suma":

```kotlin
fun suma(num1: Int, num2: Int): Int {
    val resultado = num1 + num2
    return resultado
}
```
Los parámetros son "num1" y "num2", ambos son de tipo Int.

En cuanto a los valores de retorno, son los valores que una función devuelve al momento de ser llamada, el tipo de retorno se especifica después de los parámetros.
En la función "suma" mencionada anteriormente, el tipo de retorno es Int.

En caso de no tener un valor de retorno se puede especificar la palabra clave "Unit" o simplemente no especificar ningun tipo de retorno.

```kotlin
fun saludar(): Unit {
    println("Hola, mundo!")
}
```

En este caso la funcion no retorna nada y se especifica "Unit"

```kotlin
fun saludar() {
    println("Hola, mundo!")
}
```

En este caso la funcion no retorna nada y no se especifica ningun tipo de retorno

Es importante tener en cuenta que las funciones deben tener un valor de retorno especificado, a menos que sean del tipo "Unit" o no especificar ningun tipo de retorno.
