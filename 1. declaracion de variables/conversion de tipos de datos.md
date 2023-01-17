# Conversion de tipos de datos en Kotlin

En Kotlin, se pueden convertir diferentes tipos de datos utilizando funciones específicas, como `toInt()`, `toDouble()`, etc. Estas funciones son métodos de extensión que se pueden llamar en un objeto de un tipo específico para convertirlo a otro tipo.

Por ejemplo, si se tiene una variable de tipo String y se desea convertirla en un entero, se puede utilizar la función `toInt()`:

```kotlin
val myString = "123"
val myInt = myString.toInt()
```

En este caso, la variable myString se convierte en un entero y se almacena en la variable myInt.

Otro ejemplo es convertir una variable de tipo Double a una variable de tipo Float.

```kotlin
val myDouble = 3.14
val myFloat = myDouble.toFloat()
```

En este caso, la variable myDouble se convierte a una variable de tipo Float y se almacena en la variable myFloat.

Es importante tener en cuenta que si el valor no es convertible, la función generará una NumberFormatException

```kotlin
val myString = "abc"
val myInt = myString.toInt() // NumberFormatException
```

Para evitar NumberFormatExceptions al convertir tipos de datos, se pueden utilizar varias técnicas:

1. Comprobar si el valor es convertible antes de intentar convertirlo. Por ejemplo, se puede utilizar el método isDigit() en una cadena para verificar si contiene solo dígitos antes de intentar convertirla a un número.

```kotlin
val myString = "abc"
if (myString.isDigits()) {
    val myInt = myString.toInt()
} else {
    println("La cadena no contiene solo números")
}
```

2. Utilizar el método toIntOrNull() o alguna otra función similar, que devuelve null si el valor no es convertible.

```kotlin
val myString = "abc"
val myInt = myString.toIntOrNull()
if (myInt == null) {
    println("La cadena no contiene solo números")
}
```

3. Utilizar un try-catch bloque para manejar la excepción.

```kotlin
val myString = "abc"
try {
    val myInt = myString.toInt()
} catch (e: NumberFormatException) {
    println("La cadena no contiene solo números")
}
```

> En general es recomendable siempre verificar el formato de los datos antes de intentar convertirlos, ya que puede haber casos en los que no se sabe si los datos son los esperados o no.

También existen funciones como toByte(), toShort(), toLong() entre otras, para convertir una variable a diferentes tipos numéricos.